package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author amitg
 *
 */
public class CountTheTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			 System.out.println("Enter the number of TestCases :");
			int testCases = Integer.parseInt(br.readLine());
			while (testCases > 0) {
				 System.out.println("Enter the Size of Array");
				int arraySize = Integer.parseInt(br.readLine());
				 System.out.println("Enter the Element of Array ");
				String strArrayElement[] = br.readLine().split("\\s");
				int intArray[] = new int[arraySize];
				for (int i = 0; i < arraySize; i++) {
					intArray[i] = Integer.parseInt(strArrayElement[i]);
				}
				System.out.println("-----Finding the Triplet ---");
				findTripletSum(arraySize, intArray);
				testCases--;
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void findTripletSum(int arraySize, int[] intArray) {
		int tripletCount = 0;
		int tripletSum = 0;
		boolean tripletFound=false;
		for(int i=0;i<arraySize;i++) {
			 tripletSum=intArray[i];
			 for(int j=0;j<arraySize;j++) {
				for(int z=0;z<arraySize;z++) {
					if(j!=z && i!=z && tripletSum==intArray[j]+intArray[z]) {
						tripletCount++;
						System.out.println("intArray[j]"+intArray[j]+"intArray[z]"+intArray[z]);
						tripletFound=true;
						break;
					}
					else
						tripletFound=false;
				} 
				if(tripletFound)
					break;
			 }
		}
		if(tripletFound)
			System.out.println(tripletCount);
		else
			System.out.println("-1");
	}
}
