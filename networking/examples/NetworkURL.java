import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

//ASSIGNMENT - Enable this program to accept url input from user.................................

public class NetworkURL {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://en.wikipedia.org/wiki/Public_Services_International");

        // to get and print the protocol of the URL
        String protocol = url.getProtocol();

        System.out.println("Protocol : " + protocol);

        // to get and print the hostName of the URL
        String host = url.getHost();

        System.out.println("HostName : " + host);

        // to get and print the file name of the URL
        String fileName = url.getFile();

        System.out.println("File Name : " + fileName);

        // to get and print the default port of the URL
        int defaultPort = url.getDefaultPort();

        System.out.println("Default Port : " + defaultPort);

        // to get and print the path of the URL
        String path = url.getPath();

        System.out.println("Path : " + path);
    }
}
