import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
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


        String upd = "delete from jdbc where id=? ";
        try{
            PreparedStatement view = con.prepareStatement(upd);
            
            int id=sc.nextInt();
            view.setInt(1, id);
            view.executeUpdate();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}