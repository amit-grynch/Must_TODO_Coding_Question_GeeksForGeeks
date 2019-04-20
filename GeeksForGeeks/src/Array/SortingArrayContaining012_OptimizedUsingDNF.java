package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author amitg
 * Using Dutch National Flag Problem 
 */
public class SortingArrayContaining012_OptimizedUsingDNF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		System.out.print("Enter the Size of Array :");
		int arraySize=Integer.parseInt(br.readLine());
		int intArray[] =new int[arraySize];
       System.out.println(" Enter the element of arrays : ");
         for(int i=0;i<arraySize;i++) {
        	 intArray[i]=Integer.parseInt(br.readLine());
         }
         sortingArray(intArray,arraySize);
         System.out.println(" Printing the Array After The Sorting ");
         for(int j=0;j<arraySize;j++) {
        	 sb.append(intArray[j]);
         }
         System.out.println(sb);
		}catch (Exception e) {
		 System.out.println("Doing Something Wrong");
		}
	}
	
	public static void sortingArray(int[] intArray,int arraySize) {
		int startIndex=0,midIndex=0;
		int endIndex=arraySize-1;
		int pivotElement=1;
		while(midIndex<=endIndex) {
			if(intArray[midIndex] <pivotElement) {
				swapElement(intArray,startIndex,midIndex);
				++startIndex;
				++midIndex;	
			}else if( intArray[midIndex]>pivotElement) {
				swapElement(intArray,midIndex,endIndex);
				--endIndex;
			}
			else {
				++midIndex;
			}
		}
	}
  public static void swapElement(int[] intArray,int start,int end) {
	  int temp=intArray[start];
	  intArray[start]=intArray[end];
	  intArray[end]=temp;
  }
}
