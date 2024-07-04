import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class DirectoryListFiles {
    public static void main(String[] args) {
        String directoryPath = "C:\\Java";

        try {
            // Path object for the directory
            Path dir = Paths.get(directoryPath);

            // DirectoryStream to list the files in the directory
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                for (Path file : stream) {
                    System.out.println(file.getFileName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
