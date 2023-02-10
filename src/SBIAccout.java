import java.util.Scanner;
import java.util.UUID;

public class SBIAccout implements bankInterface{

    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAccout(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        rateOfInterest = 6.6;
        accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance+=amount;
        return "Money Added"+balance;
    }

    @Override
    public String withdraw(int amount,String pass) {
//        Scanner sc = new Scanner(System.in);
//        String pass = sc.next();
        if(pass.equals(password)){
            if(balance<amount){
                return "insufficient amount";
            }else{
                balance-=amount;
                return "wihdraw succifully";
            }
        }else {
            return "Wrong pass";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*time*rateOfInterest)/100.0;
    }
}
