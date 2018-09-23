
public class BubbleSort {
	public static void main(String args[]) {
		int a[] = {33,442,21,3,34,0,145,32,455};
		int size = a.length;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<size-1;j++){
				if(a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			size--;
			
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ,");
		}
		
	}
}