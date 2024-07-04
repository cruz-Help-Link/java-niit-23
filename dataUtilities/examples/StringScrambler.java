import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringScrambler {
    public static String scrambleString(String input) {
        // Convert the input string to a list of characters
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        // Shuffle the list
        Collections.shuffle(characters);

        // Convert the list back to a string
        StringBuilder scrambled = new StringBuilder();
        for (char c : characters) {
            scrambled.append(c);
        }

        return scrambled.toString();
    }

    public static void main(String[] args) {
        String original = "HelloWorld";
        String scrambled = scrambleString(original);
        System.out.println("Original: " + original);
        System.out.println("Scrambled: " + scrambled);
    }
}




// import java.util.Base64;

// public class Base64Example {
//     public static void main(String[] args) {
//         String password = "mySecretPassword123";

//         // Encode the password
//         String encodedPassword = encodeBase64(password);
//         System.out.println("Encoded Password: " + encodedPassword);

//         // Decode the password
//         String decodedPassword = decodeBase64(encodedPassword);
//         System.out.println("Decoded Password: " + decodedPassword);
//     }

//     // Method to encode a string using Base64
//     public static String encodeBase64(String input) {
//         // Encode the input string to bytes and then to a Base64 string
//         return Base64.getEncoder().encodeToString(input.getBytes());
//     }

//     // Method to decode a Base64 encoded string
//     public static String decodeBase64(String input) {
//         // Decode the Base64 string to bytes and then to a regular string
//         byte[] decodedBytes = Base64.getDecoder().decode(input);
//         return new String(decodedBytes);
//     }
// }
