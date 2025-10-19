package Grooming;

public class SensorArray {
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int left=(i>0)?arr[i-1]:0;
			int right=(i<arr.length-1)?arr[i+1]:0;
			result[i]=left+arr[i]+right;			
		}
		for(int val:result) {
			System.out.print(val+" ");
		}		
	}
}
