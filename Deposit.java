package OnlineBankingSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Deposit {
    Deposit() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account number and Amount");
        int Acno=sc.nextInt();
        int amt=sc.nextInt();
        String str="select Balance from Acc where ACCOUNTNUMBER="+Acno;
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//Bank.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(str);
        int bal=rs.getInt(1)+amt;
        String s1="Update Balance="+bal+" from Acc where ACCOUNTNUMBER="+Acno;
        System.out.println("Deposited");
        Menu m=new Menu();
    }
    
}
