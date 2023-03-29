package HomeTask_Loops_Arrays;

public class checkMaxMirrorElement {
	public static int maxMirror(int[] arr){
        int i,j,temp,max,count;
        i=j=temp=max=count=0;
        while(i < arr.length-1){
            count=0;
            temp=i;
            j=arr.length-1;
            while(j >= temp){
                if(arr[temp] == arr[j]){
                     count++;
                     if(temp==j) count++;
                     temp++;
                }
                else if(count > 0) break;                
                if(max < count) max=count;
                j--;
            }
            i++;
        }
        return max;
 }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,6,4,3,2,1};
		System.out.println(checkMaxMirrorElement.maxMirror(arr));
	}

}
