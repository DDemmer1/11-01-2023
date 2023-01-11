package de.demmer.dennis;

public class Item implements Comparable<Item>{
	
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
		
		
		
		return 0;
	}
	
	

}
