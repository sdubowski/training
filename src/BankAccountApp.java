public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("66667", 1000);
        BankAccount acc2 = new BankAccount("66668", 2000);
        BankAccount acc3 = new BankAccount("66669", 3000);


        acc1.setName("Wacek");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);

    }
}

class BankAccount {
    private String accountNumber;                 //ID + random 2-digit + first 2 of SSN
    private static final String routingNumber = "006969666";
    private String name;
    private String SSN;
    private double balance;
    private static int ID = 1000;                //Internal ID

    //Constructor
    public BankAccount(String SSN, double initDeposit) {
        balance = initDeposit;
        this.SSN = SSN;
        ID++;
        setAccountNumber();
    }

    public void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = ID + "" + random + SSN.substring(0, 1);
        System.out.println("Your Account Number: " + accountNumber);
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        showBalance();
    }

    public void makeDeposit(double amount) {
        balance = balance + amount;
        showBalance();
    }

    public void showBalance(){
        System.out.println("Balance: " + balance);
    }

    public void accrueInterest(){

    }
}
