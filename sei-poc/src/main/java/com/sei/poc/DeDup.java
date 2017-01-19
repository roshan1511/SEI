package com.sei.poc;

import com.sei.util.SeiCollectionUtil;
/**
 * 
 * @author Roshan_Mundada
 *
 * During actual implementation we would have logger in each of the classes.
 * Would write Junit classes under src/test/java for all the methods of the SeiCollectionUtil class.
 * Would update POM to have Junit dependency and would use the plugin to trigger the Junit execution on build.
 * would update Pom file to generate jar file.
 */
public class DeDup {

	/**
	 * @param args
	 */
	
	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
									13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeDup obj = new DeDup();
		int[] outputIntegers = SeiCollectionUtil.getUniqueArray(obj.randomIntegers);
		//int[] outputIntegers1 = SeiCollectionUtil.getUniqueArrayUsingSet(obj.randomIntegers);
	}

}
