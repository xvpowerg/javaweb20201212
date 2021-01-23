package tw.com.cdi;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;

public class MyProduces {
			
	@Produces
	public List<String> getNameList(){
		List<String> list = new ArrayList<>();	
		list.add("Ken");
		list.add("Vivin");
		list.add("Lindy");
		list.add("Joy");
		list.add("Lucy");
		return list;
	}
		
}
