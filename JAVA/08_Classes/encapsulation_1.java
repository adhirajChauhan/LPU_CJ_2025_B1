//Encapsulation = Data hiding (private) + Controlled access (getters and setter)
//It refers to bundling of data members(variables) and member functions(functions) into a single unit (class) while restricting the direct access to some of the object's components\

class BankAccount{
    private String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //Getter method for accountHolderName
    String getAccountHolderName(){
        return accountHolderName;
    }

    //Setter method for accountHolderName
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    //getter for balance
    double getBalance(){
        return balance;
    }

    //setter for balance
    void setBalance(double balance){

        if(balance >= 0) this.balance = balance;
        else System.out.println("Invalid balance amount, cannot be negative");
    }

    //deposite method
    void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else{
            System.out.println("Deposite amount must be greater than 0");
        } 
    }

    //withdraw mwthod
    void withdraw(double amount){

        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }
        else{
            System.out.println("Invalid withdraw amount");
        }
    }
}


public class encapsulation_1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Marry", 0);

        System.out.println("Account holder : " + b1.getAccountHolderName());
        System.out.println("Balance : " + b1.getBalance());

        b1.deposite(100);
        System.out.println("Updated Balance : " + b1.getBalance());

        b1.withdraw(-50);
        System.out.println("Updated Balance : " + b1.getBalance());

    }
}




// Create a class Employee with name, employeeId, and salary as private fields.
// Implement getter methods to display name, employeeId, and salary.
// Implement setter validation (salary cannot be negative).
// Provide a method increaseSalary(double amount).