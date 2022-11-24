package day3Problems;

public class SmallestElement {

	public static void main(String[] args) {
		int array[]= {10,20,5,45,23};
		int min=array[0];
		System.out.println("Array element are : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Smallest element in array : "+min);

	}

}
