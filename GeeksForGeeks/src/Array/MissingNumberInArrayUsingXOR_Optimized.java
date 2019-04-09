package Array;

import java.util.Scanner;

/**
 * @author amitg
 * Using XOR for finding the misisng number,XOR wont throw integer overflow exception
 */
public class MissingNumberInArrayUsingXOR_Optimized {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int arraySize=sc.nextInt();
		System.out.println(" ");
		int[] intArray=new int[arraySize];
		System.out.print(" Enter the Elements of Array :");
		for(int i=0;i<arraySize-1;i++) {
			intArray[i]=sc.nextInt();
		}
		int missingNumber=findMissingNumber(intArray,arraySize);
		System.out.println("Missing Number from Array is : "+ missingNumber);
	}
  /**
 * @param intArray
 * @param arraySize
 * @return
 */
public static int findMissingNumber(int[] intArray, int arraySize) {
	  int x1=intArray[0];
	  int x2=1;
	  // XORING all array element 
	  for(int i=1;i<arraySize;i++) {
		  x1=x1 ^ intArray[i];
	  }
	  for(int j=2;j<arraySize+1;j++ ) {
		  x2=x2 ^ j;
	  }
	  int missingNumber=x1 ^ x2;
	  return missingNumber;
  }
}
