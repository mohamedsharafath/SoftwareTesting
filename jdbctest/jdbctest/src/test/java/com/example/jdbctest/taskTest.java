package com.example.jdbctest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class taskTest {
    private Connection con;

    @BeforeEach
    public void setup() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","momo");
        assertNotNull(con,"Connection not established");
    }
    // @Test
    // public void insertData() throws SQLException,ClassNotFoundException
    // {
        
    //     int id=3;
    //     String name="shara";
    //     int age=20;
    //     int salary=25000;
    //     String occupation="Developer";

    //     String insert="insert into csdtask value(?,?,?,?,?)";

    //     try(PreparedStatement ps = con.prepareStatement(insert))
    //     {
    //             ps.setInt(1, id);
    //             ps.setString(2, name);
    //             ps.setInt(3,age );
    //             ps.setInt(4,salary);
    //             ps.setString(5,occupation);
    //             int ra=ps.executeUpdate();
    //             assertEquals(1, ra,"One row should be affected");
    //     }
    // }
    // @Test
    // public void select() throws SQLException
    // {
    //     String sqlsel="Select * from csdtask where name=?";
    //     try (PreparedStatement ps1=con.prepareStatement(sqlsel)){
    //         ps1.setString(1, "momo");
    //         try(ResultSet rs=ps1.executeQuery())
    //         {
    //             assertTrue(rs.next(), "There should be one value for the specific id");
    //             assertEquals("Tester", rs.getString("occupation"),"The name is not equal");
    //             assertEquals("20", rs.getString("age"),"The name is not equal");
    //         }
    //     };
    // }
    // @Test
    // public void update() throws SQLException {
    //     int id = 3;
    //     String newval = "sharafath";
    //     String upd = "UPDATE csdtask SET name = ? WHERE id = ?";

    //     try (PreparedStatement ps = con.prepareStatement(upd)) {
    //         ps.setString(1, newval);
    //         ps.setInt(2, id);
    //         int rowaffected = ps.executeUpdate();
    //         assertEquals(1, rowaffected, "One row should be updated");
    //     }
    // }

    @Test
    public void delete() throws SQLException {
        int id = 2;
        String delquery = "DELETE FROM csdtask WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(delquery)) {
            ps.setInt(1, id);
            int rowaffected = ps.executeUpdate();
            assertEquals(1, rowaffected, "One row should be deleted");
        }
    }
    @AfterEach
    public void close() throws SQLException
    {
        if(con!=null && !con.isClosed())
        {
            con.close();
        }
    }
}
