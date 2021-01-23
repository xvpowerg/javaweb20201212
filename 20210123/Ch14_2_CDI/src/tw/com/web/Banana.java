package tw.com.web;

import javax.inject.Named;

@Named("banana")
public class Banana  implements Fruit {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Banana";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}

	public String  toString() {
		return this.getName()+":"+this.getPrice();
	}
}
