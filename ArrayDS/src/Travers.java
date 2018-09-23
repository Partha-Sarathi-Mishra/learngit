import java.util.Scanner;

public class Travers {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the size of the array:");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Please enter the elements of the array:");
	for(int i=0;i< arr.length;i++){
		arr[i] = sc.nextInt();
	}
	System.out.println("Displaying the elements of the array:");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
}
}
