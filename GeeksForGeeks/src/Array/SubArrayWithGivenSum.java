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
				int[] intArray = new int[arraySize];
				System.out.println("Enter the Element of ArraySize :");
				for (int i = 0; i < arraySize; i++) {
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
			for (int i = 0; i < arraySize; i++) {
				sum=0;
				//System.out.println(" Sum= "+ sum);
				for (int j = 0; j < arraySize; j++) {
					if(j>=i) {
					sum = sum + intArray[j];
					startIndex=i;
					endIndex=j;
					if(requiredSum == sum) {
						System.out.println(" StartIndex= "+startIndex + "EndIndex= "+endIndex);
						find= true;
					}
				}
				}
			}
			if(find !=true) {
				System.out.println("-1");
			}
		}
}
