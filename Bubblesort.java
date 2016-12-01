import java.util.Arrays;


public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Initialization
		int arr[] = {5,2,15,9,10,1};
		bubblesort(arr);
	}
		public static void bubblesort(int [] arr){
			System.out.println("Element before sorting:" +Arrays.toString(arr));
			//cal the array length
		int n = arr.length;
		for(int i=0; i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j-1] > arr[j]){
				int temp;
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j]= temp;
				}
			}
				
	
		}
		System.out.println("Element after sorting iteration:" +Arrays.toString(arr));
		}
}
