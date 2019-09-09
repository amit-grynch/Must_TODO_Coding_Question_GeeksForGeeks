package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				  System.out.println(" Enter the Size of array ");
				int arraySize =Integer.parseInt(br.readLine());
				System.out.println(" Enter the Required  Sum ");
				int requiredSum = Integer.parseInt(br.readLine());
				int[] intArray = new int[arraySize+1];
				System.out.println("Enter the Element of ArraySize :");
				for (int i = 1; i <= arraySize; i++) {
					intArray[i] = Integer.parseInt(br.readLine());
				}
				findSubArray(intArray, requiredSum, arraySize);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 }
		 public static void findSubArray(int[] intArray, int requiredSum, int arraySize) {
			int startIndex = 0, endIndex = 0;
			boolean find=false;
			int sum ;
			for (int i = 1; i <= arraySize; i++) {
				sum=0;
				for (int j = i; j <= arraySize; j++) {
					sum = sum + intArray[j];
					if(requiredSum == sum && i !=j) {
						startIndex=i;
						endIndex=j;
						System.out.println(" StartIndex= "+startIndex + "EndIndex= "+endIndex);
						find= true;
		               break;
					}
					/*if(find) {
						break;
					}*/
				}
				}
			if(find !=true) {
				System.out.println("-1");
			}
		}
}
