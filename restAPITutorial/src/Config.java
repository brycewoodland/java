import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties = new Properties();  // Corrected the class name

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/config.properties")) {
            properties.load(fileInputStream);  // Corrected the variable name
        } catch (IOException e) {  // Corrected exception name
            System.err.println("Could not load config.properties file");
        }
    }

    public static String getApiKey() {
        return properties.getProperty("API_KEY");
    }
}
