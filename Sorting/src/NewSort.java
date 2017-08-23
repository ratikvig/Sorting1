import java.util.Scanner;


public class NewSort {
	
	public static int[] sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min = i;
			for(int j=min+1;j<arr.length;j++){
				if(arr[min] > arr[j]){
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element "+(i+1)+": ");
			arr[i] = input.nextInt();
		}
		arr=sort(arr);
		System.out.println("Sorted array");
		for(int i=0;i<size;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}
