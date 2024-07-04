import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MeetServer {
    public static void main(String[] args) {
        try{
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] msgRecieve = new byte[65000];
        DatagramPacket dp = null; 
        while (true) {
            dp = new DatagramPacket(msgRecieve, msgRecieve.length);
            ds.receive(dp);

            if (dataPack(msgRecieve).toString().equals("end")) {
                System.out.println("Exiting server");

                break;
            }            
            msgRecieve = new byte[65000];
        }
    } catch(Exception e) {
        System.out.println("Exception");
    }
    }

    public static StringBuilder dataPack(byte[] s) {
        System.out.println("Received: ");
        if(s == null) {
            return null;
        }
        StringBuilder msg = new StringBuilder();
        int i = 0;
        while(s[i] != 0) {   //NOT ENDING
            msg.append((char)s[i]);  //CASTING BYTE TO CHAR
            i++;
        }
        return msg;
    }
}
