import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNetwork {

    // initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // constructor with port
    public ServerNetwork(int port)
	{

		// starts server and waits for a connection
		try {
            System.out.println("Attempting to start Server");

			server = new ServerSocket(port);  //5000

			System.out.println("Server Started Successfully");

			System.out.println("Waiting for a client ...");

			socket = server.accept(); 

			System.out.println("Client accepted");

			// takes input from the client socket
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			String msg = "";

			// reads message from client until "End" is sent
			while (!msg.equals("End")) {

				try {

					msg = in.readUTF();

					System.out.println(msg);
				}

				catch (IOException i) {

					System.out.println(i);
				}
			}

			System.out.println("Closing connection");

			// close connection
			socket.close();

			in.close();
		}

		catch (IOException i) {

			System.out.println(i);
		}
	}

    public static void main(String[] args) {

        ServerNetwork server = new ServerNetwork(5000);
    }
}
