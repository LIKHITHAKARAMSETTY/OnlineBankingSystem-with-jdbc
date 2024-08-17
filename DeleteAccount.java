package OnlineBankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAccount {
    DeleteAccount() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account number");
        int Acno=sc.nextInt();
        sc.close();
        String str="Delete from  Acc where ACCOUNTNUMBER=="+Acno;
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//Bank.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(str);
        System.out.println("Account Deleted");
    }
    
}
