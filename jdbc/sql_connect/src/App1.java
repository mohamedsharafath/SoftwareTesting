import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        Connection c = null;
        
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root", "momo");

        }
        catch(SQLException e){
            e.printStackTrace();
        }

        if(c!=null){
            System.out.println("Database is connected successfully");
        }
        else{
            System.out.println("Database is not yet connected");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id : ");
        int id = sc.nextInt();
        System.out.println("Enter the name : ");
        String name = sc.next();
        System.out.println("Enter the occupation : ");
        String occupation  = sc.next();
        sc.nextLine();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter the salary : ");
        int salary = sc.nextInt();
        String sql = "insert into jdbc value(?,?,?,?,?)";

        try{
            PreparedStatement p  = c.prepareStatement(sql);
            p.setInt(1, id);
            p.setString(2, name);
            p.setString(3, occupation);
            p.setInt(4, age);
            p.setInt(5, salary);
            p.executeUpdate();
            System.out.println("----------------value inserted succesfully---------------------");
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
}