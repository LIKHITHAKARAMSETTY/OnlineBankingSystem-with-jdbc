package OnlineBankingSystem;
import java.sql.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:c://sqlite//Bank.db");
        Statement stm=con.createStatement();
        String query="CREATE table Acc(ACCOUNTNUMBER  INTEGER  primary key not null unique,Name TEXT not null,Balance INTEGER not null)" ;
        String str="SELECT name FROM Bank.db WHERE type='table' AND name='{Acc}'";
        int rs=stm.executeUpdate(str);
        if(rs==0)
        {
             rs=stm.executeUpdate(query);
        }
        else
         System.out.println("Table Created");
    }
}
    