package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		Item monitor = new Item("Monitor", 249.99);
		Item maus = new Item("Maus", 50.00);
		Item tasse = new Item("Tasse" , 4.99);

		Item[] itemArray = {monitor, tasse, maus};
		
//		Item[] itemArray = new Item[3];
//		itemArray[0] = i1;
//		itemArray[1] = i2;
//		itemArray[2] = i3;
		
		Arrays.sort(itemArray);
		
		//-1
		maus.compareTo(monitor);
		
		//+1
		monitor.compareTo(tasse);
		
		//0
		maus.compareTo(maus);
		
	}

}
