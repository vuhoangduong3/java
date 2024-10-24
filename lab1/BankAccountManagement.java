import java.util.Scanner;

class BankAccount {
    String accountHolder;
    double balance;
    double monthlyInterestRate;
    int withdrawalCount;
    String[] transactionHistory;
    int transactionIndex;

    public BankAccount(String accountHolder, double initialBalance, double monthlyInterestRate) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalCount = 0;
        this.transactionHistory = new String[100]; // Limit to 100 transactions
        this.transactionIndex = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
        System.out.println("da gui" + String.format("%,.0f", amount) + " VNĐ");
    }

    public void withdraw(double amount) {
        if (withdrawalCount < 3) {
            if (amount <= balance) {
                balance -= amount;
                withdrawalCount++;
                addTransaction("Withdraw", amount);
                System.out.println("da rut" + String.format("%,.0f", amount) + " VND");
            } else {
                System.out.println("rut" + String.format("%,.0f", amount) + " VND - Loi: so du khong du");
            }
        } else {
            System.out.println("rut" + String.format("%,.0f", amount) + " VND - loi: Ban da dat gioi han rut tien thang nay.");
        }
    }

    public void applyMonthlyInterest() {
        double interest = (monthlyInterestRate / 100) * balance; 
        balance += interest;
        addTransaction("Interest", interest);
        System.out.println("So du sau khi cong lai: " + String.format("%,.0f", balance) + " VNĐ");
    }

    public void printTransactionHistory() {
        System.out.println("lich su giao dich:");
        for (int i = 0; i < transactionIndex; i++) {
            System.out.println((i + 1) + ". " + transactionHistory[i]);
        }
    }

    public double getBalance() {
        return balance;
    }

    private void addTransaction(String type, double amount) {
        String transaction = type + " - " + String.format("%,.0f", amount) + " VNĐ";
        transactionHistory[transactionIndex++] = transaction;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new bank account
        BankAccount account = new BankAccount("Nguyen Van A", 5000000, 1.0); // 1% monthly interest
        System.out.println("Tạo tài khoản mới: " + account.accountHolder);
        System.out.println("Số dư ban đầu: " + String.format("%,.0f", account.getBalance()) + " VNĐ");

        // Perform transactions
        account.deposit(1000000); // Deposit 1 million VNĐ
        account.withdraw(500000);  // Withdraw 500 thousand VNĐ
        account.withdraw(500000);  // Attempt to withdraw again - should exceed limit

        // Print current balance
        System.out.println("so du: " + String.format("%,.0f", account.getBalance()) + " VNĐ");

        // Print transaction history
        account.printTransactionHistory();

        // Apply monthly interest
        account.applyMonthlyInterest();

        // Close the scanner
        scanner.close();
    }
}





