package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Student;

public class StudentDAO {
	DataSource ds = null;
	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	public Connection connection() throws Exception{

		if(ds == null){
			ds = (DataSource)(new InitialContext()).lookup("java:comp/env/jdbc/MySQL");
		}
		con = (Connection) ds.getConnection();
		return con;

	}

	public void close() throws Exception{

		if(rs != null){
			rs.close();
		}
		if(stmt != null){
			stmt.close();
		}
		if(con != null){
			con.close();
		}
	}

	public Student getStudent(int stu_id, String stu_password){

		//System.out.println(stu_id);
		//System.out.println(stu_password);

		Student student = new Student();

		try{
			connection();
			String sql ="SELECT stu_id FROM student WHERE stu_id = ? AND stu_password = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, stu_id);
			stmt.setString(2, stu_password);
			rs = stmt.executeQuery();

			rs.next();
			student.setStu_id(rs.getInt("stu_id"));

		}catch(Exception e){
			System.out.println(e);
			student = null;
		}finally{
			try{
				close();
			}catch(Exception e){

			}
		}
		return student;
	}
}
