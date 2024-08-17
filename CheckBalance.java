package OnlineBankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CheckBalance {
    CheckBalance() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int Ano=sc.nextInt();
        sc.close();
        String str="select Balance from Account where ACCOUNTNUMBER=="+Ano;
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//Bank.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(str);
        System.out.println("Balance:"+rs.getInt(1));
        Menu m=new Menu();
}
    
}
