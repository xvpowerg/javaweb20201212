package tw.com.dbtools;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class DBInfo {
	private String  url;
	private String  password;
	private String  account;
	private SqlType  sqlType;
	private static DBInfo dbInfo;
	
	public enum SqlType{
		MYSQL,
		MSSQL,
		ORACLE
	}
	
	private DBInfo(String  url,String password,
			String account,SqlType  sqlType) {
		this.url = url;
		this.password = password;
		this.account = account;
		this.sqlType = sqlType;
	}
	public static void initDBInfo(String  url,String password,
			String account,String  sqlType) {
		SqlType sqlTypeEnum= SqlType.valueOf(sqlType);
		dbInfo = new  DBInfo(url, password,
						account, sqlTypeEnum);
	}
	public static DBInfo getDBInfo() {
		if (dbInfo == null) throw new NullPointerException("dbInfo¥¼ªì©l¤Æ"); 
		return dbInfo;
	}
	
	public SqlType getSqlType() {
		return sqlType;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, account, password);
	}

	
	
	
	
}

