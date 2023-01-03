package atmproject;

import java.util.Scanner;

public class Atm {
    public static void process(Account account) {
        Login login = new Login();
        int tryLogin=3;


        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to us our bank!!! ");
        System.out.println("*******************************");
        System.out.println("Login user...");
        System.out.println("*******************************");

        while (true) {
            if (Login.login(account)) {
                System.out.println(" Login successful");
                break;
        }
            else{   tryLogin--;
                    System.out.println("login failed you have chance to try : " + tryLogin);
            }
            if (tryLogin==0) {
                System.out.println("Your try ran out");
                return;
                
            }
        }
        System.out.println("************************");
        System.out.println("Press to 1 for view your balance,\nPress to 2 deposite money\nPress to 3 for withdraw money\nPress to 4 for exit");
        int press;
        press=scanner.nextInt();
        switch (press) {
            case 1:
                System.out.println("Your balance is : "+account.getAccBalance());
                break;
            case 2:
                System.out.print("How much do want to deposite money? : ");
                int getmoney=scanner.nextInt();
                account.deposit(getmoney);
                System.out.println("Your new balance is : "+ account.getAccBalance());
                break;
            case 3:
                System.out.print("How much do want to withdraw money? : ");
                int withdraw=scanner.nextInt();
                account.withdrawMoney(withdraw);
                break;
            case 4:
                System.out.println("Thanks...");
                break;
            default:
                break;
        }

        
    }
    
}
