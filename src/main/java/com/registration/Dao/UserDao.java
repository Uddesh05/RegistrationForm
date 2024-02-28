package com.registration.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.registration.Entity.User;

public class UserDao {

	public String insertUser(User user ) throws ClassNotFoundException, SQLException {
		
		//String query="insert into user" +"(Id,name,lastname,username,password,contact) VALUES " + "(?,?,?,?,?,?);";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","root");
		
		//PreparedStatement ps = con.prepareStatement(query);
		PreparedStatement ps = con.prepareStatement("insert into user (name,lastname,username,password,contact) values(?,?,?,?,?)");
		
        
		ps.setString(1,user.getName());
		ps.setString(2, user.getLastname());
		ps.setString(3,user.getUsername());
		ps.setString(4,user.getPassword());
		ps.setString(5,user.getContact());
		
		System.out.println(ps.executeUpdate());
		
		return "User registred";
		
		
		
		
		
	}
}
