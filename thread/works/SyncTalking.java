
import java.io.*;
import java.util.*;

// A Class used to send a message
class Speaker {
    public void send(String talk) {
        System.out.println("Speaker 1:\t" + talk);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Speaker 2:\t" + talk + "Cómo estás?");
    }
}

// Class for send a message using Threads
class TheardSpeaking extends Thread {
    private String talk;
    Speaker speaker;

    // Receives a talk object and a string talk to be said
    TheardSpeaking(String m, Speaker obj) {
        talk = m;
        speaker = obj;
    }

    public void run() {
        // Only one thread can send a message
        // at a time.
        synchronized (speaker) {
            // synchronizing the send object
            speaker.send(talk);
        }
    }
}

// Driver class
class SyncTalking {
    public static void main(String args[]) {
        Speaker speak = new Speaker();
        TheardSpeaking S1 = new TheardSpeaking(" Hola ", speak);
        TheardSpeaking S2 = new TheardSpeaking(" Bueno ", speak);
        // Start two threads of TheardSpeaking type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
