package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/testjdbc")
public class TestJdbcServlt  extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3306/db20210130?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
			String user = "root";
			String password = "123456";
			try(Connection conn =
					DriverManager.getConnection(url, user, password);){				
			}catch(SQLException ex) {
				System.out.println(ex);
			}
			
			
		}
}
