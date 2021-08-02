package arrays;

import java.util.Scanner;

public class Arrays_Main {

	public static void main(String[] args) {

		Arrays arr1 = new Arrays(5);
		
		arr1.insert(2);
		arr1.printArray();
		arr1.insert(3);
		arr1.insert(5);
		arr1.insert(4);
		arr1.insert(27);
		arr1.printArray();
		arr1.insert(34);
		arr1.insert(56);
		arr1.insert(-96);
		arr1.insert(9087);
		arr1.insert(99);
		arr1.printArray();
		arr1.remove(4);
		arr1.printArray();	
		//System.out.println(arr1.indexof(34));
		//System.out.println(arr1.indexof(9000));
		//arr1.printArray();
		//int arr2[]= {34};
		//System.out.println("intersect ="+ java.util.Arrays.toString(arr1.intersect(arr2)));
		arr1.reverse();
		arr1.printArray();
		arr1.insert(1,33 );
		arr1.printArray();
	}



}

