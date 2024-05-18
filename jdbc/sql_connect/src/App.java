import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {
        //step 1:load the driver to// myapp
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        //for make connection i need mysql details
        //strep 2: establish the connection
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","momo");
        }catch(SQLException e){
            e.printStackTrace();//connnection make agutha ilaya.
        }
        if(con!=null)
        {
            System.out.println("Database already connection with java");
        }
        else{
            System.out.println("Database not connected yet.");
        }
    }
}