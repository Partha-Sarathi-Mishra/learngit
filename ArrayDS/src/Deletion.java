import java.util.Scanner;

public class Deletion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of the array:");
		int size = sc.nextInt();
		System.out.println("Please enter the elements in to the array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter the localtion to delete");
		int location = sc.nextInt();
		for(int i=location;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}
		
	}
}
