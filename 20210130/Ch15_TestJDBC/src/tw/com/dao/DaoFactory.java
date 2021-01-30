package tw.com.dao;

import tw.com.dao.mysql.MySqlUserDao;
import tw.com.dbtools.DBInfo;

public class DaoFactory {
		public  static UserDao createUserDao() {
			switch(DBInfo.getDBInfo().getSqlType()) {
			case MYSQL:
				return new MySqlUserDao();
			case ORACLE:
				return null;
			}
			return null;
		}
	
	
}
