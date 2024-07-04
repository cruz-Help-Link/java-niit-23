
// This program registers the folder for three types of events: file creation, file deletion, and file modification. When one of these events occurs, it will print a message with the event type and the affected file name.

import java.io.IOException;
import java.nio.file.*;

public class Watcher {
    public static void main(String[] args) {
        try {
            // Create a Watchservice
            WatchService Watcher = FileSystems.getDefault().newWatchService();

            // Define the folder to watch
            Path folderToWatch = Paths.get("C:\\Java");

            // Register the folder with the Watcher for specific events
            folderToWatch.register(Watcher, 
                StandardWatchEventKinds.ENTRY_CREATE, 
                StandardWatchEventKinds.ENTRY_DELETE, 
                StandardWatchEventKinds.ENTRY_MODIFY
            );

            System.out.println("Watching folder: " + folderToWatch);

            while (true) {
                WatchKey key;
                try {
                    key = Watcher.take(); // Wait for events
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> pathEvent = (WatchEvent<Path>) event;
                    Path fileName = pathEvent.context(); 

                    System.out.println("Event kind: " + kind + ", File affected: " + fileName);
                }

                key.reset(); // Reset the key to continue watching for more events
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

