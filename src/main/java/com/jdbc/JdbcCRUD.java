package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCRUD {
	public static void main(String[] args) throws SQLException {
		//insert("w", 12);
		insert("��", 12);
	}
	
	private static void  insert(String name,int age) throws SQLException{
		Connection connection = null;  //����
		Statement createStatement = null; 
			try {
				Class.forName("com.mysql.jdbc.Driver");
			    connection = DriverManager.getConnection("jdbc:mysql://192.168.130.139:3306/spark?characterEncoding=UTF-8","root","root");
			    createStatement=connection.createStatement();
				
				String sql = "insert into test(name,age) values('"+name+"','"+age+"')";
				
				 int line = createStatement.executeUpdate(sql);
				 System.out.println("SQLӰ��"+line+"��");
				 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
 				  if(createStatement!=null){
					  createStatement.close();
				  }
				  if(connection!=null){
					  connection.close();
				  }
			}             
			
			
		
		
	}

}
