public interface bankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount,String pass);
    double calculateInterest(int time);
}
