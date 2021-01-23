package tw.com.scope;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestApplicationScore {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestApplicationScore [name=" + name + "]";
	}
}
