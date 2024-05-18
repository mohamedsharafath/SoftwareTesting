import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        //Load the driver to my app
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        //Establish the connection
        Connection con  = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root", "momo");
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        if(con != null){
            System.out.println("Database has been connected with java.");
        }
        else{
            System.out.println("Database has not been connected.");
        }


        String upd = "update jdbc set name=? where id=? ;";
        try{
            PreparedStatement view = con.prepareStatement(upd);
            String name=sc.nextLine();
            view.setString(1, name);
            int id=sc.nextInt();
            view.setInt(2, id);
            view.executeUpdate();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}