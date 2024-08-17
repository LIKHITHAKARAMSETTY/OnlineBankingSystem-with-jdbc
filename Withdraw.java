package OnlineBankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Withdraw {
    Withdraw() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account number and Amount");
        int Acno=sc.nextInt();
        int amt=sc.nextInt();
        String str="select Balance from Acc where ACCOUNTNUMBER=="+Acno;
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//Bank.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(str);
        if(rs.getInt(1)>amt)
        {
            int bal=rs.getInt(1)-amt;
            String q1="Update Balance="+bal+" from Acc where ACCOUNTNUMBER="+Acno;
            int r1=stm.executeUpdate(q1);
        }
        else
        System.out.println("Insufficient Balance");
        Menu m=new Menu();
        

    }
    
}
