package tw.com.scope;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestRequestScore {
	private String name;

	
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "TestRequestScore [name=" + name + "]";
	}
	
	
}
