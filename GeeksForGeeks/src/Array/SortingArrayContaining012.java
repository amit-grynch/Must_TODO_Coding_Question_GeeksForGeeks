package Array;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author amitg
 *
 */
public class SortingArrayContaining012 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int arraySize=sc.nextInt();
		int intArray[]=new int[arraySize];
		System.out.println(" Enter the Elements of Array : ");
		for(int i=0;i<arraySize;i++) {
			intArray[i]=sc.nextInt();
		}
		intArray=sortingArray(intArray,arraySize);
     System.out.println(" Sorted Array is as below  :");
       for(int i=0;i<arraySize;i++) {
    	   System.out.print(intArray[i]+ " ");
       }
	}
    /**
     * @param intArray
     * @param arraySize
     * @return
     */
    public static int[] sortingArray(int[]intArray, int arraySize) {
    	Map<Integer,Integer> map=new TreeMap<>();
    	int index=0;
    	for(int i=0;i<arraySize;i++) {
    		Integer occurence=map.get(intArray[i]);
    		if(occurence==null) {
    			map.put(intArray[i], 1);
    		}
    		else {
    			map.put(intArray[i],++occurence);
    		}
    	}
    	 Set<Entry<Integer,Integer>> setEntry= map.entrySet();
    	Iterator<Entry<Integer, Integer>> iterator=setEntry.iterator();
    	 while(iterator.hasNext()) {
    		 Entry<Integer,Integer> entry=iterator.next();
    		 Integer key=entry.getKey();
    		 Integer value=entry.getValue();
    		 System.out.println(" key="+key +"  "+" value="+value);
    		 for(int i=0;i<value;i++) {
    			 intArray[index]=key;
    			 index++;
    		 }
    	  }
    	 return intArray;
    }
}
