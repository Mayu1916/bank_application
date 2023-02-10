import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name , balance and password");
        String name = sc.next();
        int balance = sc.nextInt();
        String password = sc.next();
        SBIAccout acc = new SBIAccout(name,balance,password);
        System.out.println("account no. is = " + acc.getAccountNo());
        System.out.println("balance is = " + acc.getBalance());
        int amount = sc.nextInt();
        String pass = sc.next();
        System.out.println(acc.withdraw(500,pass));
    }
}