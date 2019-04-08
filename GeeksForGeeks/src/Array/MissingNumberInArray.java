package Array;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		int arraySize=sc.nextInt();
		int intArray[]=new int[arraySize];
		System.out.println(" Enter Element of Array ");
		for(int i=0;i<arraySize;i++) {
			intArray[i]=sc.nextInt();
		}
	  int actutalArraySize=arraySize+1;
      int expectedSum=(actutalArraySize)*(actutalArraySize+1)/2;
      int actualSum=calculateActualSum(intArray,arraySize);
      int missingNumber=expectedSum - actualSum;
      System.out.println(" Missing Number In Array is = "+missingNumber);
	}
   public static int calculateActualSum(int[] intArray,int arraySize) {
	   int actualSum=0;
	   for(int i=0;i<arraySize;i++) {
		   actualSum +=intArray[i];
	   }
	   return actualSum;
   }
}
