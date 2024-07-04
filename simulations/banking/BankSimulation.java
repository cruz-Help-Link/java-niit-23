import java.util.concurrent.*;

public class BankSimulation {
    public static void main(String[] args) {
        // Create a shared bank account
        BankAccount account = new BankAccount(1000);

        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks for deposit and withdrawal
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                account.deposit(100);
                printTransaction("Deposit", 100, account);
            });

            executor.submit(() -> {
                account.withdraw(50);
                printTransaction("Withdrawal", 50, account);
            });
        }

        // Shutdown the executor when all tasks are done
        executor.shutdown();

        // Wait for all tasks to complete
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final account balance
        System.out.println("Final account balance: " + account.getBalance());
    }

    static void printTransaction(String transactionType, double amount, BankAccount account) {
        System.out.println(transactionType + ": $" + amount + ", Balance: $" + account.getBalance());
    }
}

class BankAccount {
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
        }
    }

    public double getBalance() {
        return balance;
    }
}
