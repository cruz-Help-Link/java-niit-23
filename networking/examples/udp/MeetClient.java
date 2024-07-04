import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * MeetClient
 */
public class MeetClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte buff[] = null;

            while (true) {
                String input = sc.nextLine();
                buff = input.getBytes();
                DatagramPacket dpS = new DatagramPacket(buff, buff.length, ip, 1234);
                ds.send(dpS);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}