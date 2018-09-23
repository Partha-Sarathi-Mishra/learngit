public class BinarySearch {
	public static void main(String args[]) {
		//a java program for binary search
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int mid = arr.length/2-1;
		int key = 6;
		boolean success = false;
		int size = arr.length-1;
		/*for(int i=0;i<=size;i++){
			if(arr[mid] == key){
				success = true;
				break;
			}else if(key < arr[mid]){
				size = mid-1;
				mid = (i+size)/2;
			}else{
				i = mid+1;
				mid = (i+ size)/2;
			}
		}*/
		int lb = 0;
		int ub = size;
		while(lb<=ub){
			mid = (lb+ub)/2;
			if(arr[mid] == key){
				success = true;
				break;
			}
			else if(key < arr[mid]){
				ub = mid-1;
			}else{
				lb = mid +1;
			}
		}
		if(success == true){
			System.out.println("Found");
		}else{
			System.out.println("Not found");
		}
	}
}
