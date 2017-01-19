package com.sei.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
/**
 * Real time would write some description about this class - what it does
 * @author Roshan_Mundada
 *
 */
public class SeiCollectionUtil {
/**
 * 
 * @param inputArray int[]
 * @return int[]
 */
	public static int[] getUniqueArrayUsingSet(int[] inputArray){
		int[] uniqueArray = null;
		if(null!=inputArray){
			Integer[] intObj = new Integer[inputArray.length];
			for(int i=0;i<inputArray.length;i++){
				intObj[i]= new Integer(inputArray[i]);
			}
			Set<Integer> integerSet = new LinkedHashSet<Integer>(Arrays.asList(intObj));
			uniqueArray = ArrayUtils.toPrimitive(Collections.list(Collections.enumeration(integerSet)).toArray(new Integer[0]));
		}
		return uniqueArray;
	}
	
	/**
	 * 
	 * @param inputArray int[]
	 * @return int[]
	 */
	public static int[] getUniqueArrayUsingList(int[] inputArray){
		int[] uniqueArray = null;
		if(null!=inputArray){
			List<Integer> integerList = new ArrayList<Integer>(inputArray.length);
			integerList.add(new Integer(inputArray[0]));
			for(int i=1;i<inputArray.length;i++){
				if(!integerList.contains(new Integer(inputArray[i]))){
					integerList.add(new Integer(inputArray[i]));
				}
			}
			uniqueArray = ArrayUtils.toPrimitive(integerList.toArray(new Integer[0]));
		}
		return uniqueArray;
	}
	
	/**
	 * 
	 * @param inputArray int[]
	 * @return int[]
	 * In real application we will have logger statement before and after.
	 */
	public static int[] getUniqueArray(int[] inputArray){
		int[] uniqueArray = null;
		if(null!=inputArray){
			//List<Integer> integerList = new ArrayList<Integer>(inputArray.length);
			uniqueArray = new int[inputArray.length];
			int count = 0;
			boolean duplicate = false;
			uniqueArray[count] = inputArray[count];
			count++;
			for(int i=1;i<inputArray.length;i++){
				duplicate = false;
				for(int j=0;j<uniqueArray.length;j++){
					if(uniqueArray[j]== inputArray[i]){
						duplicate = true;
					}
				}
				if(!duplicate){
					uniqueArray[count] = inputArray[i];
					count++;
				}
			}
		}
		return uniqueArray;
	}
}
