//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String test = "A man a plan a canal Panama";
        System.out.println(palindrome(test));
    }

    public static boolean palindrome(String s) {
        // Change the letters in string to lowercase
        String cleanedStr = s.toLowerCase();

        // Remove any whitespace
        cleanedStr = cleanedStr.replaceAll("\\s", "");

        // Reverse the string
        StringBuilder reversedBuilder = new StringBuilder(cleanedStr);
        String reversedStr = reversedBuilder.reverse().toString();

        // check if the original string and the reversedString are equal
        // If equal return true, else return false
        return cleanedStr.equals(reversedStr);
    }
}

