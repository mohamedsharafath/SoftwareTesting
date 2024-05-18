import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) throws Exception {
        
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


        String select = "select * from jdbc";
        try{
            PreparedStatement view = con.prepareStatement(select);
            ResultSet rs = view.executeQuery();
            while(rs.next()){
                System.out.println("ID : "+rs.getInt("id"));
                System.out.println("Name : "+rs.getString("name"));
                System.out.println("Occupation : "+rs.getString("occupation"));
                System.out.println("Age : "+rs.getInt("age"));
                System.out.println("Salary : "+rs.getInt("salary"));
            }
            System.out.println("----------All the data have been printed.----------");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}