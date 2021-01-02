package tw.com.web.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySession {
   private static String MY_SESSION_ID="MYSESSIONID";
 
   private Map<String,Object> attrbute = new HashMap<>();
	
	public void setAttrbute(String key,Object value) {
		attrbute.put(key, value);
   }
   
   public Object getAttrbute(String key) {
	   return attrbute.get(key);
   }
	
	  MySession() {
		  
	  }
	  
	  public static MySession getMySession(HttpServletRequest req,
			  					HttpServletResponse resp) {		  
		  return  getMySession(req,resp, true);
	  }
     public static MySession getMySession(HttpServletRequest req,
		  HttpServletResponse resp,boolean newSession) {
	  	String key = null;
	    Cookie[] cookies =  req.getCookies();
	    if (cookies != null) {
	    	Optional<Cookie> opc= Stream.<Cookie>of(cookies).
	    	filter(c->c.getName().equals(MY_SESSION_ID)).findFirst();
	        if (opc.isPresent()) 
	    		   key = opc.get().getValue();	    	
	    }
	    
	    if (key == null){
	    	key = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE)+"";
	    	Cookie cookie = new Cookie(MY_SESSION_ID,key);
	    	resp.addCookie(cookie);	    	
	    }
	    	    
	  return WebApplication.getMySession(key, newSession);
  }
	  
 
}
