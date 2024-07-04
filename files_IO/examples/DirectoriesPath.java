import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class DirectoriesPath {
    // public static void main(String[] args) {
    //     Path path = Paths.get("C:\\Java\\get\\your\\own");
    //     try {
    //         Files.createDirectories(path);
    //     } catch (IOException e) {
    //         // TODO: handle exception
    //         System.out.println(e);
    //     }  
    // }
    public static void main(String[] args) {
        Path source = Paths.get("C:\\Java\\ClassFile\\Vehicle.java");
        Path target=Paths.get("C:\\Java\\Class12\\Vehicle.java");
        try{
            Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES); //copy
            Files.move(target, source, REPLACE_EXISTING, COPY_ATTRIBUTES); //move
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
