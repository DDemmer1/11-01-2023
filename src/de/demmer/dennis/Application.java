package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		Hund hund1 = new Hund();
		Hund hund2 = new Hund();
		Hund hund3 = new Hund();
		Hund hund4 = new Hund();

		Hund[] hundArray = { hund1, hund2, hund3, hund4 };

//		Arrays.sort(hundArray);
		
		hund1.compareTo(hund2);
		
		
		
		int[] intArr = {5,7,8,1,9};
		
		Arrays.sort(intArr);
		
		System.out.println(Arrays.toString(intArr));
		
		
		
	}

}
