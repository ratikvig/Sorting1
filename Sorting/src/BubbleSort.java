import java.util.Scanner;
public class BubbleSort {
	
	public static int[] sort(int[] arr){
		int flag =1;
		while(flag!=arr.length){
			
			for(int i=0;i<arr.length-1;i++){
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				
				}
				
			}
			flag++;
		}
		
		return arr;
	}

	public static void main(String[] args) {
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
