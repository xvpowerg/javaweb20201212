package tw.com.web.http;

import java.util.HashMap;
import java.util.Map;

public class WebApplication {
   private static Map<String,MySession> sessionMap = new HashMap<>();
   
    static void addMySession(String key) {
	   MySession session = new MySession();
	   sessionMap.put(key, session);
   }
   
    static MySession getMySession(String key) {	  
	   return getMySession( key,true);
   }
   
    static MySession getMySession(String key,boolean newSession) {
	   if (newSession && !sessionMap.containsKey(key)) {
		   addMySession(key);
	   }	   
	   return sessionMap.get(key);
   }
}
