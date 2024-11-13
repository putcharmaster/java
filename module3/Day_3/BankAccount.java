package module3.Day_3;



public class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    // @Override
    public String toString(){
        return "Account Balance: $" + balance;
    }
    

    public static void main(String[] args){
        BankAccount account = new BankAccount(200);
        account.deposit(150);
        System.out.println(account);
        account.withdraw(100);
        System.out.println(account);
    }
    
}

