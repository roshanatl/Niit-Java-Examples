package com.niit.Jdbc;

import java.sql.*;

public class AccountDBCreate {

	public static void main(String args[]) {
		// createTable();
		Account acct = new Account("Roshan", "Rajendran");
		acct.setEmail("roshan@gmail.com");
		acct.setIdNumber("A1234");
		acct.setPhone("99337776662");
		acct.setPwd("Password");
		createAccount(acct);
	}

	public static void createTable() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:AccountDB.db");
			System.out.println("Opened database successfully");
			stmt = c.createStatement();
			String sql = "CREATE TABLE ACCOUNT " + "(ID INT PRIMARY KEY         NOT NULL,"
					+ " NAME           CHAR(50)        NOT NULL, " + " ACCOUNTID      CHAR(50)    NOT NULL, "
					+ " EMAIL      CHAR(50)    NOT NULL, " + " PHONE      CHAR(50)    NOT NULL, "
					+ " PWD      CHAR(50)    NOT NULL )";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}

	static public void createAccount(Account user) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");

			c = DriverManager.getConnection("jdbc:sqlite:AccountDB.db");
			c.setAutoCommit(false);
			// System.out.println("Opened database successfully");

			stmt = c.createStatement();
			int id = 1;
			String sqlGetID = "SELECT MAX(ID) FROM ACCOUNT";
			ResultSet rs = stmt.executeQuery(sqlGetID);
			while (rs.next()) {
				id = rs.getInt("MAX(ID)");
			}
			id++;
			String sql = "INSERT INTO ACCOUNT (ID,NAME,ACCOUNTID,EMAIL,PHONE,PWD) " + "VALUES ( " + id + "," + "'"
					+ user.getName() + "'" + "," + "'" + user.getIdNumber() + "'" + "," + "'" + user.getEmail() + "'"
					+ "," + "'" + user.getPhone() + "'" + "," + "'" + user.getPwd() + "'" + ")";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		System.out.println("Records created successfully");
	}
}
