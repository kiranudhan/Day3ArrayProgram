package day3Problems;

public class LargestElement {

	public static void main(String[] args) {
		int array[]= {10,20,5,45,23};
		int max=array[0];
		System.out.println("Array element are : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Largest element in array : "+max);

	}

}
