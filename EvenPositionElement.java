package day3Problems;

public class EvenPositionElement {

	public static void main(String[] args) {
		int[] array= {1,4,5,5,7,8,9,10};
		System.out.println("Even position element in array : ");
		for(int i=1;i<array.length;i = i+ 2) {
			System.out.print(array[i]+", ");
		}

	}

}
