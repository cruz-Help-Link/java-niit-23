//There are two communication protocols that we can use for socket programming: User Datagram Protocol (UDP) and Transfer Control Protocol (TCP).

//The main difference between the two is that UDP is connection-less, meaning there’s no session between the client and the server, while TCP is connection-oriented, meaning an exclusive connection must first be established between the client and server for communication to take place.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HTTPQuestPonse {
    public static void main(String[] args) {
        try { 
            // Create a HttpClient 
            HttpClient httpClient = HttpClient.newHttpClient(); 
  
            // create a HttpRequest object with the URL 
            HttpRequest httpRequest = HttpRequest 
                      .newBuilder() 
                      .uri(new URI("https://en.wikipedia.org/wiki/Public_Services_International")) 
                      .GET() 
                      .build(); 
            // Synchronous send() method 
            // to process the HTTP request. 
            // HttpResponse.BodyHandler.asString() handles 
            // the body of the response as a String. 
        
            HttpResponse<String> httpResponse 
                = httpClient.send( 
                    httpRequest, 
                    HttpResponse.BodyHandlers.ofString()); 
  
            // statusCode() returns the status code 
            // for this response. 
            System.out.println( 
                "Status of operation performed:"
                + httpResponse.statusCode()); 
        } 
        catch (Exception e) { 
            System.out.println("Exception" + e); 
        } 
    }
}
