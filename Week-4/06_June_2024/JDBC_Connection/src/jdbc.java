import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;


public class jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");

//		Connection establish
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
        System.out.println("Connected "+ conn);
        
//      Show Databases

//	      ResultSet db = conn.createStatement().executeQuery("show databases");
//	      System.out.println("Databases :- " + db);
//	      System.out.println("\nAll Databases :- ");
//	
//	      while(rs.next()){
//	          System.out.println(rs.getString(1));
//	      }


//      Create Database

//      conn.createStatement().executeUpdate("CREATE DATABASE STUDENTS");
//      System.out.println("Database created");


//      Create Table

//        String table = "CREATE TABLE REGISTRATION(id INTEGER not NULL,name VARCHAR(255),email VARCHAR(255),age INTEGER,PRIMARY KEY ( id ))";
//        conn.createStatement().executeUpdate(table);
//        System.out.println("Created table in given database...");


//      Insert data into the table

//      String data = "INSERT INTO Registration VALUES (100, 'Zara', 'zara@gmail.com', 20), (101, 'Ajay', 'ajay@gmail.com', 18), (102, 'Keerti', 'keerti@gmail.com', 19), (103, 'Amit', 'amit@gmail.com', 25), (104, 'Radha', 'radha@gmail.com', 24)";
//      conn.createStatement().executeUpdate(data);
//      System.out.println("Inserted data in given table....");
        
        
//      Update data into the table

//      String sql = "UPDATE Registration SET name='Kirti', email='kirti@gmail.com' WHERE id = 102";
//      conn.createStatement().executeUpdate(sql);
//      System.out.println("Updated data in given table....");
        


//      Retrieve all data

      String sql = "SELECT * FROM REGISTRATION";
      ResultSet rs = conn.createStatement().executeQuery(sql);
      System.out.println("id\t\tname\t\temail\t\t\tage");

      while(rs.next()){
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String email = rs.getString("email");
          String age = rs.getString("age");
          System.out.println(id+"\t\t"+name+"\t\t"+email+"\t\t"+age);
      }
      
	}
}
