package atmproject;


public class Account {
    private static String name;
    private static String password;
    private static int accBalance;

    public Account(String name, String password, int accBalance) {
        this.name = name;
        this.password = password;
        this.accBalance = accBalance;
    }
    
    public static void deposit(int deposit){
        accBalance+=deposit;
        
    }
    public void withdrawMoney(int withdrawMoney){
        if(accBalance-withdrawMoney<0){
            System.out.println("There is no enough money in your account!!!");
        }
        else{
            accBalance-=withdrawMoney;
        }
        
    }

    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static int getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    
}
