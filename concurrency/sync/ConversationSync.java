

    static class Participant implements Runnable {
        private String name;
        private boolean isParticipant1;
        private static final Object lock = new Object();
        private static boolean participant1Speaking = true; // Participant 1 starts speaking

        public Participant(String name, boolean isParticipant1) {
            this.name = name;
            this.isParticipant1 = isParticipant1;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (isParticipant1 != participant1Speaking) {
                        try {
                            lock.wait(); // Wait for your turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(name + ": Hi!");
                    participant1Speaking = !participant1Speaking;
                    lock.notifyAll(); // Notify the other participant to speak
                }
            }
        }
    }
    public class ConversationSync {
        public static void main(String[] args) {
            Thread participant1 = new Thread(new Participant("Participant 1", true));
            Thread participant2 = new Thread(new Participant("Participant 2", false));
    
            participant1.start();
            participant2.start();
        }
}
