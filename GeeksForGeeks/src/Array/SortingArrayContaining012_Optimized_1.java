package Array;

import java.util.Scanner;

public class SortingArrayContaining012_Optimized_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int arraySize=sc.nextInt();
		int[] intArray=new int[arraySize];
		System.out.println("Enter the Elements of Array :");
		for(int i=0;i<arraySize;i++) {
			intArray[i]=sc.nextInt();
		}
         sortingArray(intArray,arraySize);
         System.out.println("Sorted Array is as Below :");
         for(int i=0;i<arraySize;i++) {
        	 System.out.print(intArray[i]+" ");
         }
	}
 public static int[] sortingArray(int[]intArray,int arraySize) {
	 int occurence_0=0,occurence_1=0,occurence_2=0;
	    int index=0;
	    for(int i =0;i<arraySize;i++) {
	    	 if(intArray[i]==0) {
	    		 occurence_0++;
	    	 } else if (intArray[i]==1) {
	    		 occurence_1++;
			}else {
				occurence_2++;
			}
	
	    }
	    int[] occurenceArray=new int[3];
	    occurenceArray[0]=occurence_0;
	    occurenceArray[1]=occurence_1;
	    occurenceArray[2]=occurence_2;
	    for(int j=0;j< occurenceArray.length;j++) {
	    	  for(int occurence=0;occurence<occurenceArray[j];occurence++) {
	    		  intArray[index]=j;
	    		  index++;
	    	  }
	    }
	      return intArray;
 }
}
