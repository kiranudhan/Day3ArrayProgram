package day3Problems;

public class SortArray {

	public static void main(String[] args) {
		int[] array= {36,19,29,12,5,4};
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.print("Elements in ascending order : ");
        for(int i=0;i<array.length;i++) {
        	System.out.print(array[i]+" ");
        }
	}

}
