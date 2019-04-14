package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortingArrayContaining012_Optimized_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array : ");
		int arraySize=Integer.parseInt(br.readLine());
		int[] intArray=new int[arraySize];
		System.out.println("Enter the Elements of Array :");
		for(int i=0;i<arraySize;i++) {
			intArray[i]=Integer.parseInt(br.readLine());
		}
		
         sortingArray(intArray,arraySize);
         System.out.println("Sorted Array is as Below :");
         StringBuffer sb=new StringBuffer();
         for(int i=0;i<arraySize;i++) {
        	 sb.append(intArray[i]+" ");
         }
         System.out.print(sb);
		}catch (Exception e) {
			// TODO: handle exception
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
