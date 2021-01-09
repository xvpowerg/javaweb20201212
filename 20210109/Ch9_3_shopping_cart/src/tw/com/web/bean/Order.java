package tw.com.web.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Collection;

public class Order {
	private int coupon;
	private String addr;
	private List<Item> itemList = new ArrayList<Item>();
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void  foreachItemList(Consumer<Item> dataConcumer) {
		
		for(Item i :itemList) {
			dataConcumer.accept(i);
		}
		
	}
	public void addItem(Item item) {
		 itemList.add(item);
	}
	
	public void addAllItem(Collection<Item> itemCollection) {
		itemList.addAll(itemCollection);
	}
	
	public int getTotal() {
		int total = 0;
		for (Item it : itemList) {
			total += it.getPrice();
		}
		total -= this.coupon;
		return total; 
	}
	
	
}
