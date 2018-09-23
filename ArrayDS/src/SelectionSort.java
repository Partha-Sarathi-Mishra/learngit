
public class SelectionSort {
	public static void main(String args[]) {
		int a[] = { 18, 23, 3, 3, 4, 1, 0, 98, 3, 44 };
		for (int i = 0; i < a.length-1; i++) {
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
				
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
	}
}
