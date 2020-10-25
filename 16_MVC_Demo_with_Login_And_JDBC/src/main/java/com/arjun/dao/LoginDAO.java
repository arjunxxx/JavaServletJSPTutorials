package com.arjun.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean loginDbCheck(String userName, String password) throws SQLException, ClassNotFoundException {

		String sql = "select * from login where username=? and password=?";
		PreparedStatement st = getResult(sql);
		st.setString(1, userName);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if (rs.next()) {
			return false;
		}else {
			return true;
		}
	}

	public PreparedStatement getResult(String sql) throws ClassNotFoundException, SQLException {

		final String url = "jdbc:mysql://localhost:3306/myschema";
		final String userNameDB = "root";
		final String passwordDB = "root";
		Class.forName("com.mysql.jdbc.Driver");
		final Connection con = DriverManager.getConnection(url, userNameDB, passwordDB);
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		return prepareStatement;
	}
}
