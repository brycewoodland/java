import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {

        // Create Transcript object and set audio URL
        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://drive.google.com/uc?export=download&id=1dnaJKUal3QS2Cwp07mKi1YnbrSrMXz7e");

        // Convert Transcript object to JSON
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(transcript);

        // Print the JSON string for debugging
        System.out.println("JSON Request: " + jsonRequest);

        // Create and send HTTP POST request
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", Config.getApiKey())
                .header("Content-Type", "application/json") // Make sure to set Content-Type as JSON
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))  // Use jsonRequest here
                .build();

        // Send the request and get the response
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        // Print the response body
        System.out.println("POST Response: " + postResponse.body());

        // Check if the response is valid JSON and parse it
        String postResponseBody = postResponse.body();
        if (postResponseBody.startsWith("{")) {
            // If it's valid JSON, parse it into a Transcript object
            transcript = gson.fromJson(postResponseBody, Transcript.class);
            System.out.println("Transcript ID: " + transcript.getId());
        } else {
            // Handle unexpected response (likely an error)
            System.err.println("Error or unexpected response: " + postResponseBody);
            return;  // Exit early as the response is not valid
        }

        // Create and send GET request to check the status of the transcription
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
                .header("Authorization", Config.getApiKey())
                .header("Content-Type", "application/json") // Make sure to set Content-Type as JSON
                .build();

        // Continuously check the transcription status until completed or error
        while (true) {
            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            String getResponseBody = getResponse.body();

            System.out.println("GET Response: " + getResponseBody);

            if (getResponseBody.startsWith("{")) {
                // Parse the JSON response to update the Transcript status
                transcript = gson.fromJson(getResponseBody, Transcript.class);
                System.out.println("Transcript Status: " + transcript.getStatus());
            } else {
                // Handle unexpected response (likely an error)
                System.err.println("Error or unexpected response: " + getResponseBody);
                break;
            }

            // Exit if transcription is completed or in error state
            if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
                break;
            }

            // Wait for a second before checking the status again
            Thread.sleep(1000);
        }

        // Final output after transcription is completed
        System.out.println("Transcription completed!");
        if ("completed".equals(transcript.getStatus())) {
            System.out.println("Transcription Text: " + transcript.getText());
        } else {
            System.err.println("Transcription failed with status: " + transcript.getStatus());
        }
    }
}
