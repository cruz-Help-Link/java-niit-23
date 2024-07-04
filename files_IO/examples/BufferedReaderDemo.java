import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.Charset;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		Path path = Paths.get("write.txt");
		Charset cs = Charset.forName("US-ASCII");

		try (BufferedReader reader = Files.newBufferedReader(path, cs)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
