package OnlineBankingSystem;

import java.util.Scanner;

public class Menu {
    Menu() throws Exception
    {
        System.out.println("Enter choice");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Create Account");
        System.out.println("2.Check Balance");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Deposit Money");
        System.out.println("5.Delete Account");
        System.out.println("6.Exit");
        int choice=sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                CreateAccount c=new CreateAccount();       
            case 2:
                CheckBalance cb=new CheckBalance();           
            case 3:
                Withdraw w=new Withdraw();           
            case 4:
                Deposit d=new Deposit();           
            case 5:
                DeleteAccount da=new DeleteAccount();           
            case 6:
                Exit e=new Exit();         
            default:
                System.out.println("Enter valid choice");
                Menu m=new Menu();
        }

    }
}


    
