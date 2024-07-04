import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShortFile {

    public static void main(String[] args) {
        File startDir = new File("C:\\Java\\Class12");  // replace with your directory path
        List<File> filesList = new ArrayList<>();
        fetchFilesRecursively(startDir, filesList);

        for (File file : filesList) {
            System.out.println(file);
        }
    }

    public static void fetchFilesRecursively(File dir, List<File> allFiles) {
        File[] files = dir.listFiles();

        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                fetchFilesRecursively(file, allFiles);
            } else {
                allFiles.add(file);
            }
        }
        
    }
    // Path startDir = Paths.get("path_to_directory");  // replace with your directory path

    //     try {
    //         List<Path> filesList = Files.walk(startDir)
    //                                     .filter(Files::isRegularFile)
    //                                     .collect(Collectors.toList());

    //         filesList.forEach(System.out::println);

    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
}