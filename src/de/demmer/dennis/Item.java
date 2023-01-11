package de.demmer.dennis;

public class Item implements Comparable<Item>{
	//POJO
	String name;
	double price;
	int id;
	
	private static int itemCount = 0;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		this.id = itemCount;
		itemCount++;
	}
	

	@Override
	public int compareTo(Item otherItem) {
		if(price > otherItem.price) {
			return 1;
		}
		
		if(price < otherItem.price) {
			return -1;
		}
		
		return 0;
	}


	public Item(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	
	
	
	
	


}
