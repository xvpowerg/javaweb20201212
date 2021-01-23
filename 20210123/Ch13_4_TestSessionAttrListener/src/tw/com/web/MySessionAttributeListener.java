package tw.com.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class MySessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		String value = event.getValue().toString();
		System.out.println("attributeAdded value:"+value);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		String value = event.getValue().toString();
		System.out.println("attributeRemoved value:"+value+":"+name);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		String newValue = (String)event.getSession().getAttribute(name);				
		String oldValue = event.getValue().toString();
		System.out.println("attributeReplaced value:"+oldValue+":"+newValue);
	} 
	
}
