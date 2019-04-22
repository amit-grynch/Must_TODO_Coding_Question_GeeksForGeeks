package Array;

import java.util.*;
import java.lang.*;
import java.io.*;
	class FirstSubArrayWithGivenSub
	 {
		public static void main (String[] args)
		 {
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
			 public static void findSubArray(int[] intArray, int requiredSum, int arraySize) {
				int startIndex = 0, endIndex = 0;
				boolean find=false;
				int sum ;
				StringBuffer sb=new StringBuffer();
				for (int i = 1; i <= arraySize; i++) {
					sum=0;
					 sb=new StringBuffer();
					//System.out.println(" Sum= "+ sum);
					for (int j = 1; j <= arraySize; j++) {
						if(j>=i) {
						sum = sum + intArray[j];
						startIndex=i;
						endIndex=j;
						if(requiredSum == sum) {
						sb.append(startIndex+" ");
						sb.append(endIndex);
						System.out.println(sb);
							find= true;
                           break;
						}
					 }
					}
					if(find)
					break;
					else {
						continue;
					}
				}
				if(find !=true) {
					System.out.println("-1");
				}
			}
}