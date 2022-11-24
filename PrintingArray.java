package day3Problems;

import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter a elelemt : ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Array Elemets are :");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
