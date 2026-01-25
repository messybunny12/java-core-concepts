import  java.util.Scanner;

public  class BankAccount {
        private String name;
        private double balance;
        void  setName(String name)
        {
            this.name = name;

        }
        void setBalance(double balance) {
            this.balance = balance;
        }
    void checkBalance()
    {
            System.out.println( name +" your balance is " + balance);
    }
    void  deposit(double amount)
    {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance = balance + amount;
        System.out.println(name +" Your Balance is " + balance);
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println(name+" Your Balance after withdrawal: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public static void  main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name of the account");
        bankAccount.setName(sc.nextLine());
        System.out.println("Enter the balance of the account");
       bankAccount.setBalance(sc.nextDouble());
        System.out.println("Enter the Action you want to Perform");
        System.out.println("Enter 1 for Deposit");
        System.out.println("Enter 2 for withdraw");
        System.out.println("Enter 3 for checkBalance");
        switch(sc.nextInt())
        {
            case 1:System.out.println("Enter the amount you want to deposit");
            bankAccount.deposit(sc.nextDouble());
            break;
            case 2:System.out.println("Enter the amount you want to withdraw");
            bankAccount.withdraw(sc.nextDouble());
            break;
            case 3: bankAccount.checkBalance();
                break;
           default:System.out.println("Invalid input");
           break;
        }
        sc.close();
    }
}
