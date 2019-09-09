package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArrayWithGivenSum_Optimmized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Enter the Number of TestCases :");
			int testCases = Integer.parseInt(br.readLine());
			while(testCases>0){
			System.out.println("Enter the ArraySize and RequiredSum :");
			     String strArray[]=br.readLine().split("\\s");
			int arraySize = Integer.parseInt(strArray[0]);
			int requiredSum = Integer.parseInt(strArray[1]);
			int[] intArray = new int[arraySize+1];
			System.out.println("Enter the Elements of Array :");
			 String strArrayElement[]=br.readLine().split("\\s");
			for (int i = 1; i <= strArrayElement.length; i++) {
				intArray[i] = Integer.parseInt(strArrayElement[i-1]);
			}
			findSubArray(intArray, requiredSum, arraySize);
			testCases--;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
   public static boolean findSubArray(int[] intArray,int requiredSum,int arraySize) {
	   int current_sum=intArray[1];
	   int startIndex=1;
	   
	   for(int i=2;i<=arraySize;i++) {
		     while(current_sum>requiredSum && startIndex <i-1) {
		    	 current_sum=current_sum - intArray[startIndex];
		    	 startIndex++;
		     }
		     if(requiredSum==current_sum) {
		    	 int endIndex=i-1;
		    	 System.out.println(" Required Array is between StartIndex "+startIndex+" & endIndex "+endIndex);
		    	 return true;
		     }
		     if(i<arraySize)
		    	 current_sum=current_sum+intArray[i];
	   }
	   return false;
   }
}
