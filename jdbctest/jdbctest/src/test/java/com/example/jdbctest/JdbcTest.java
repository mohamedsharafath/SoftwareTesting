// package com.example.jdbctest;

// import static org.junit.jupiter.api.Assertions.*;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class JdbcTest {
//     private Connection con;

//     @BeforeEach
//     public void setup() throws ClassNotFoundException, SQLException
//     {
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","momo");
//         assertNotNull(con,"Connection not established");
//     }
//     @Test
//     public void insertData() throws SQLException,ClassNotFoundException
//     {
        
//         int id=1;
//         String name="momo";

//         String insert="insert into csdjdbc value(?,?)";

//         try(PreparedStatement ps = con.prepareStatement(insert))
//         {
//                 ps.setInt(1, id);
//                 ps.setString(2, name);
//                 int ra=ps.executeUpdate();
//                 assertEquals(1, ra,"One row should be affected");
//         }
//     }
//     @Test
//     public void select() throws SQLException
//     {
//         String sqlsel="Select * from tjdbc where id=?";
//         try (PreparedStatement ps=con.prepareStatement(sqlsel)){
//             ps.setInt(1, 3);
//             try(ResultSet rs=ps.executeQuery())
//             {
//                 assertTrue(rs.next(), "There should be one value for the specific id");
//                 assertEquals("person3", rs.getString("name"),"The name is not equal");
//             }
//         };
//     }
//     @AfterEach
//     public void close() throws SQLException
//     {
//         if(con!=null && !con.isClosed())
//         {
//             con.close();
//         }
//     }
// }
