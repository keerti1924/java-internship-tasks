package in.adit.p.maven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import in.adit.beans.Student;
import in.adit.context.ConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 //        System.out.println( "Connected" );
    	try {
    	ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
        JdbcTemplate jT= (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
           System.out.println("connected");
    
      // create database
   
//		   String query = "create database userdb";
//		   jT.update(query);
//		   System.out.println("database created");
//		    }catch(Exception e) {
//		    	  System.out.println(e);
//		    }
        
        
        
        // create table
        
//        String query = "create table student(name varchar(100 ), mail varchar(100), age varchar(50))";
//        jT.update(query);
//        System.out.println("table created");        
        
        
        //Data Insert
           
//        String query = "insert into student values(?,?,?)";
//        jT.update(query, "Sushmitha", "sushmitha@gmail.com","20");
//        System.out.println("Data Inserted");

        
        
        
        // delete data where age >=20

//    String name = "Anshi";
//    String mail = "twenty@gmail.com";
//    String age = "20";
//
//     String query ="delete from student where age >=?";
//     jT.update(query,age);
//     System.out.println("Deleted");
     
  
     
     //update method
             
	 String name = "Sushmitha";
	 String mail = "sushmitha@gmail.com";
	 String age = "20";
	
	  String query ="update student set mail=? where name =?";
	  jT.update(query,"sush@gmail.com",name);
	  System.out.println("Updated");
	     
    	}catch(Exception e) {
        	  System.out.println(e);     
       	  
    	}
    }
}