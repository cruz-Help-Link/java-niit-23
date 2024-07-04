import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientNetwork {

    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    // constructor to put ip address and port
    public ClientNetwork(String address, int port)
	{

		// establish a connection
		try {
            System.out.println("Connection .....");

			socket = new Socket(address, port);

			System.out.println("Connected Successfully");

			// takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		}

		catch (UnknownHostException u) {

			System.out.println(u);
		}

		catch (IOException i) {

			System.out.println(i);
		}

		// string to read message from input
		String msg = "";

		// keep reading until "End" is input
		while (!msg.equals("End")) {

			try {

				msg = input.readLine();

				out.writeUTF(msg);
			}

			catch (IOException i) {

				System.out.println(i);
			}
		}

		// close the connection
		try {

			input.close();

			out.close();

			socket.close();
		}

		catch (IOException i) {

			System.out.println(i);
		}
	}

    public static void main(String[] args) {

        ClientNetwork client = new ClientNetwork("127.0.0.1", 5000);
    }
}
