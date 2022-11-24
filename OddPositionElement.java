package day3Problems;

public class OddPositionElement {

	public static void main(String[] args) {
		int[] array= {2,3,4,1,6,7,8};
		System.out.println("Odd position element are : ");
		for(int i=0;i<array.length;i=i+2) {
			System.out.print(array[i]+" ");
		}

	}

}
