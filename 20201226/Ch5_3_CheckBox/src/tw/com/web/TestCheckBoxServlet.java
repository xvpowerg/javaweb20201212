package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.RequestTools;
@WebServlet("/testCheckBox")
public class TestCheckBoxServlet extends HttpServlet {
   
	private String[] habitsName = {"音樂" ,"閱讀","運動"};
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		//可顯示中文
		resp.setContentType("text/html;charset=UTF-8");
		String habit = req.getParameter("habit");		
		PrintWriter out =  resp.getWriter();
		//第一種作法
//		Map<String,String[]> paramaterMap =  req.getParameterMap();
//		if (paramaterMap.containsKey("habit")) {
//			  String[] habits=  paramaterMap.get("habit");
//		     Stream.of(habits).forEach(out::println);
//		}
		//第二種作法 比較推薦
//		String[] habits2 =  req.getParameterValues("habit");
//		Optional.ofNullable(habits2).
//		ifPresent(v->Stream.of(v).forEach(out::println));
		
		String[] habits2 = RequestTools.getParamaters(req,"habit");
		RequestTools.getParamater(req, "habit","未填寫");
//		Optional.ofNullable(habits2).ifPresent(hbs->Stream.of(hbs).map(
//				id->{return habitsName[ Integer.parseInt(id)];}).
//				forEach(out::println));
		
		Optional.ofNullable(habits2).ifPresent(hbs->Stream.of(hbs).
				mapToInt(Integer::parseInt).
				mapToObj(id->habitsName[id]).
				forEach(out::println));
		
//		if(habits2!=null) {
//			for (String v : habits2) {
//				out.println(v);
//			}
//		}
		
		
		out.println("testCheckBox doPost!!!"+habit);
		
	}

}
