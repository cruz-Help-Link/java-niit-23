import java.util.Base64;

public class BaseLine {
    public static void main(String[] args) {
        String str  = "The End of the Journey";
        String encoded = Base64.getEncoder().withoutPadding().encodeToString(str.getBytes());
        System.out.println(encoded); //VGhlIEVuZCBvZiB0aGUgSm91cm5leQ==
    //
        // String water = "Mr V";
        // byte [] waterByte = water.getBytes(); //converting string to byte
        // for (byte b : waterByte) {
        //     System.out.println(b);
        // }

        String password = "theMan@23rd";
        System.out.println(password);

        String enPassword = Base64.getEncoder().withoutPadding().encodeToString(password.getBytes()); // to remove the padding (==)
        System.out.println(password);
        System.out.println(enPassword);


    //DECODING BASE64
        byte[] decodePassword = Base64.getDecoder().decode(enPassword);
        System.out.println(decodePassword); // will give the byte
        //convert to String
        String myPassword = new String(decodePassword); //convert from byte to String
        System.out.println(myPassword);


    //URL ENCODING
        String url = "https://my.clevelandclinic.org/health/body/23242-pulmonary-veins";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());




    }
}
