package tw.com.scope;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class TestSessionScore implements Serializable {
		private String name;
			
		
		public void setName(String name) {
			this.name = name;
		}


		@Override
		public String toString() {
			return "TestSessionScore [name=" + name + "]";
		}
		
}
