package atmproject;

import java.util.Scanner;

public class Login {
    
    public static boolean login(Account account){
         String accName;
        String password;
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Account name : ");
        accName=scanner.nextLine();
        System.out.println("**************************************");
        System.out.print("Password : ");
        password=scanner.nextLine();

        if ((Account.getName().equals(accName)) && (Account.getPassword().equals(password))) {
            return true;
        } else {
            return false;
        }


    }
    
}
