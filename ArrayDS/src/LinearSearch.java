import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String searchAgain;
		System.out.println("Please enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Please enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		do {
			System.out.println("Please enter the element to be searched:");
			int key = sc.nextInt();
			System.out.println("Searching the element in the array....");
			boolean success = false;
			for (int i = 0; i < arr.length; i++) {
				if (key == arr[i]) {
					success = true;
					break;
				}
			}
			if (success == true) {
				System.out.println("Element found in the array : " + key);
			} else {

				System.out.println("Element not found in the array: " + key);
			}
			System.out.println("Do you want to search again(Y/N)");
			searchAgain = sc.next();

		} while (searchAgain.toUpperCase().equalsIgnoreCase("Y"));
	}
}
