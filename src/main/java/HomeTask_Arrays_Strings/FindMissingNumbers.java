package HomeTask_Arrays_Strings;

public class FindMissingNumbers {

	public static int findMissingNumber(int [] arr) {
		
		int sum1 = 0,sum2 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
		}
		System.out.println(arr.length);
		System.out.println(sum1);
		
		for(int i=1;i<=arr.length+1;i++) {
			sum2+=i;
		}		
		System.out.println(sum2);
		return sum2-sum1;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
		System.out.println("Missing number is : "+FindMissingNumbers.findMissingNumber(arr));
		
		
		
	}

}
