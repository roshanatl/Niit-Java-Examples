package com.niit.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDBRead {
	public static void main( String args[] )
	{
		Account user= null;
		
		user=getAccountDeatils("roshan@gmail.com");
		System.out.println(user);
		
	}

	static public Account  getAccountDeatils(String email) {
		Account user= new Account();
		Connection c = null;
		Statement stmt = null;

		try {
			Class.forName("org.sqlite.JDBC");

			c = DriverManager.getConnection("jdbc:sqlite:AccountDB.db");
			c.setAutoCommit(false);
			stmt = c.createStatement();
			String sql = "SELECT * FROM ACCOUNT where EMAIL =" + "'" + email + "'";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				user.setPwd(rs.getString("PWD"));
				user.setIdNumber(rs.getString("ACCOUNTID"));
				user.setPhone(rs.getString("PHONE"));
				user.setName(rs.getString("NAME"));
				user.setEmail(user.getEmail());

			}
			stmt.close();
			c.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e);
			System.exit(0);
		}
		return user;
	}
}
