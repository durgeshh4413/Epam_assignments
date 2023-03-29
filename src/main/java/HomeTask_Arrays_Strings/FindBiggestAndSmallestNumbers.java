package HomeTask_Arrays_Strings;

public class FindBiggestAndSmallestNumbers {
	
	public static void findBiggestAndSmallestNumberInArray(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(min<arr[i]) {
				min=arr[i];
			}
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximun number is : "+max+" Minimum number is : "+min);
		
	}
public static void main(String[] args) {
		
		int[] arr= {1,2,5,6,7};
		FindBiggestAndSmallestNumbers.findBiggestAndSmallestNumberInArray(arr);
		
	}
}
