import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        //load the database driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connection to database
        String url = "jdbc:mysql://localhost:3306/new";
        String username = "aati";
        String password = "aati";
         Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Datebase connected ! Ready to work....");
        '

        while(true){
        System.out.println("Hello, World!");
        System.out.println("Menu");
        System.out.println("-------------------");
        System.out.println("1: View all the Customers");
        System.out.println("2: Add new customers");
        System.out.println("3: update customers by id");
        System.out.println("4: Delete customers by id");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
            //fetch from table customers
            String query = "SELECT  * FROM Customers";
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
            System.out.println(rs.getString(columnLabel:"FirstName")+""+rs.getString(columnLabel:"CustomerID");
            }
            

            case 2:
            System.out.println("Add new  customers ");

            case 3:
            System.out.println("update customers by id");

            case 4:
            System.out.println("delete  customers by id");
 
         
            default:
            System.out.println("invalid choice!! please select ");
            
        }
    }


    }
}
