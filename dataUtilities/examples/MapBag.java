import java.util.Base64;
// It is commonly used in computer systems to transmit data over channels that can handle only text, such as email or HTTP
import java.util.UUID;

public class MapBag {
    public static void main(String[] args) {
        String password = "theMan@34rd";
       
        String encodedString = Base64.getEncoder().encodeToString(password.getBytes());
                System.out.println(encodedString);

        byte[] decoded = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decoded);
                System.out.println(decodedString);

        String encodedWithout = Base64.getEncoder().withoutPadding().encodeToString(password.getBytes());
        System.out.println(encodedWithout);


        String oUrl = "";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(oUrl.getBytes());
        System.out.println(encodedUrl);
        
    // MIME Encoding
        StringBuilder buffer = getMimeBuffer();
        byte[] encodedAsBytes = buffer.toString().getBytes(); // converting StringBuildeer to byte
        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes); // getMimeEncoder
        System.out.println(encodedMime);
    }
    private static StringBuilder getMimeBuffer() {
    StringBuilder buffer = new StringBuilder();
    for (int count = 0; count < 10; ++count) {
        buffer.append(UUID.randomUUID().toString()); //creat unique identifier
    }
    return buffer;
}
}
