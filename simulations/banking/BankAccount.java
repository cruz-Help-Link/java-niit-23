public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Create and start two threads for deposit and withdrawal
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(1000);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(500);
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            // the join method is used to ensure that the main thread (the one running the
            // main method) waits for the depositThread and withdrawThread to finish their
            // execution before proceeding.
            // The join method helps to coordinate the execution of threads and ensures that
            // the main thread can safely access the updated account balance when the other
            // threads have finished their work
            // It effectively blocks the main thread until these threads finish their
            // execution. This is essential to get the final and accurate account balance.
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final account balance
        System.out.println("Final account balance: " + account.getBalance());
    }
}
