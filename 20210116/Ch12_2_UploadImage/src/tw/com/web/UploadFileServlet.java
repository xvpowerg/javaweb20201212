package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;


@MultipartConfig
@WebServlet("/upload")
public class UploadFileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String imageFolder =  getServletContext().getInitParameter("image_folder");			
		 Part part =  req.getPart("photo");
		 //可取得檔案名稱
		 String fileName = part.getSubmittedFileName();
		Path  target =  Paths.get(imageFolder,fileName);		
		Files.copy(part.getInputStream(), target,
				StandardCopyOption.REPLACE_EXISTING);		
		resp.getWriter().println("Complete!!!");
		
	}
}
