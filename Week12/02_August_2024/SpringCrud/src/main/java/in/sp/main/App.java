package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = cxt.getBean(JdbcTemplate.class);

		// ---------Insert Operation-------------------------------------
//		int std_rollno = 108;
//		String std_name = "Keerti Sharma";
//		float std_marks = 95.36f;
//
//		String insert_sql_theory = "insert into student values(?,?,?)";
//		int count = jdbcTemplate.update(insert_sql_theory, std_rollno, std_name, std_marks);
//		if (count > 0) {
//			System.out.println("Insertion Successful");
//		} else {
//			System.out.println("Insertion Failed");
//		}

		// -----------Update Operation------------------------------------
//		float marks = 98.45f;
//		int rollno = 104;
//		
//		String update_sql_theory = "update student set marks=? where rollno =?";
//		int count = jdbcTemplate.update(update_sql_theory, marks, rollno);
//		if (count > 0) {
//			System.out.println("Updation Successful");
//		} else {
//			System.out.println("Updation Failed");
//		}

		// ------------Delete Operation------------------------------------------------
//		int rollno = 103;
//		
//		String delete_sql_query = "delete from student where rollno=?";
//		int count = jdbcTemplate.update(delete_sql_query, rollno);
//		if (count > 0) {
//			System.out.println("Deletion Successful");
//		} else {
//			System.out.println("Deletion Failed");
//		}

		// ------------Select Operation :1 ------------------------------------------
		String select_sql_query = "select * from student";
		List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
		for (Student std : std_list) {
			System.out.println("Rollno : " + std.getRollno()+", Name : " + std.getName()+", Marks : " + std.getMarks());
			System.out.println("----------------------------------------------");
		}

		// ------------Select Operation :2 ------------------------------------------
//		int rollno = 105;
//		
//		String select_sql_query = "select * from student where rollno = ?";
//		List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper(), rollno);
//		for (Student std : std_list) {
//			System.out.println("Rollno : " + std.getRollno());
//			System.out.println("Name : " + std.getName());
//			System.out.println("Marks : " + std.getMarks());
//			System.out.println("--------------------------");
//		}

	}
}
