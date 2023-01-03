package atmproject;

public class Main {
    public static void main(String[] args) {
        Account account=new Account("Ekrem", "123", 500);
        Atm.process(account);
        
    }
    
}
