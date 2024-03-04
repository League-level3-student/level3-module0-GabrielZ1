package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String [] strings = new String [5];
		strings[0] = "string0";
		strings[1] = "string1";
		strings[2] = "string2";
		strings[3] = "string3";
		strings[4] = "string4";

		stringPrintList(strings);
		System.out.println("");
		stringPrintListReverse(strings);
		System.out.println("");
		stringPrintEveryOther(strings);
		System.out.println("");
		stringPrintRandomOrder(strings);
	}

	//2. Write a method that takes an array of Strings and prints all the Strings in the array.

	public static void stringPrintList(String [] arr) {
		for(String i: arr) {
			System.out.print(i + " ");
		}
	}

	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.


	public static void stringPrintListReverse(String [] arr) {
		for(int i = arr.length-1; i>= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}


	//4. Write a method that takes an array of Strings and prints every other String in the array.

	public static void stringPrintEveryOther(String [] arr) {
		for(int i = 0; i< arr.length; i = i+2) {
			System.out.print(arr[i] + " ");
		}
	}

	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.

	public static void stringPrintRandomOrder(String [] arr) {
		//turns the array into a list which is passed into a new arraylist (line 61)
		//the arraylist is then shuffled and converted back to a newly randomized array (lines 62-64)
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
		Collections.shuffle(arrayList);
		String[] arrRandomized = new String[arrayList.size()];
		arrRandomized = arrayList.toArray(arrRandomized);

		for(String i: arrRandomized) {
			System.out.print(i + " ");
		}
	}

}