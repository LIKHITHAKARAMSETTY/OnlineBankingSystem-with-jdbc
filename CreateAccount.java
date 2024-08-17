package OnlineBankingSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class CreateAccount 
{
    CreateAccount() throws Exception
    {
       Scanner sc=new Scanner(System.in);
       Random r=new Random();
       System.out.println("Enter name:");
       String name=sc.next();
       sc.close();
       int AccNo=r.nextInt(10000, 99999);
       System.out.println(AccNo);
       Class.forName("org.sqlite.JDBC");
       Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//Bank.db");
       Statement stm=con.createStatement();
       String str="INSERT INTO Acc values(Accno,name,0)";
       int rs=stm.executeUpdate(str);
       if(rs==1)
       {
        System.out.println("Account Created,Your account number is:"+AccNo);
       }
       else
       System.out.println("Threre is some error in creating account try again");
       Menu m=new Menu();

    

    }
}
