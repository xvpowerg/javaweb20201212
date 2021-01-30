package tw.com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import tw.com.beans.MyUser;
import tw.com.dbtools.DBInfo;

public interface  UserDao {
	
	default int createUser(MyUser myuser) {
		int  count =-1;
		String sql = "INSERT INTO myuser (account,password) "+
		" VALUES('%s','%s')";
		try(Connection conn = DBInfo.getDBInfo().getConnection();
			Statement stem = conn.createStatement();){
			sql = String.format(sql, myuser.getAccount(),
									myuser.getPassword());
			System.out.println(sql);
			count = stem.executeUpdate(sql);						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return count;
	}
}
