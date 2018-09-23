import java.util.Scanner;

public class Insertion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements:");
		int size = sc.nextInt();
		int[] arr = new int[size + 1];
		System.out.println("Please enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int value = 4;
		int loc = 2;
		int i = size-1;
		
		while (i >= loc - 1) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[loc-1] = value;
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
