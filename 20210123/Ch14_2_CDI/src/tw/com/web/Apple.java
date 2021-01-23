package tw.com.web;

import javax.inject.Named;

@Named("apple")
public class Apple implements Fruit {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "My Apple";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+":"+this.getPrice();
	}

	
	
}
