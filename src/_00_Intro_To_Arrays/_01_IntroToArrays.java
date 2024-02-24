package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] strings = new String[5];

		strings[0] = "a";
		strings[1] = "b";
		strings[2] = "c";
		strings[3] = "d";
		strings[4] = "e";

		// 2. print the third element in the array

		System.out.println(strings[3]);

		// 3. set the third element to a different value

		strings[3] = "abcdefg";

		// 4. print the third element again

		System.out.println(strings[3]);

		// 5. use a for loop to set all the elements in the array to a string
		//    of your choice

		for(int i = 0; i<strings.length; i++) {
			strings[i] = "abc";
		}

		// 6. use a for loop to print all the values in the array
		//    BE SURE TO USE THE ARRAY'S length VARIABLE

		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}

		// 7. make an array of 50 integers

		Integer[] ints = new Integer[50];

		// 8. use a for loop to make every value of the integer array a random
		//    number

		for(int i =0; i < ints.length; i++) {
			ints[i] = new Random().nextInt(100);
		}

		// 9. without printing the entire array, print only the smallest number
		//    on the array

		int smallestNumber = 100;
		for(Integer i : ints) {
			if(i<smallestNumber) {
				smallestNumber = i;
			}
		}
		System.out.println("Smallest Number: " + smallestNumber);

		// 10 print the entire array to see if step 8 was correct

		for(Integer i : ints) {
			System.out.println(i);
		}

		// 11. print the largest number in the array.
		int largestNumber = 0;
		for(Integer i: ints) {
			if(i>largestNumber) {
				largestNumber = i;
			}
		}

		System.out.println("Largest Number: " + largestNumber);
		
		// 12. print only the last element in the array

		System.out.println(ints[ints.length-1]);
		
	}
}
