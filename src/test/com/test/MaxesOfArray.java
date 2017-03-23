package test.com.test;

import java.util.Set;
import java.util.TreeSet;

public class MaxesOfArray {

	public static void main(String[] args) {
		int[] nums = {2,3,4,5};
		int[] maxs = {2,4};
		Integer[] result = getMaxesOfArray(nums, maxs);
		for(Integer val: result){
			System.out.print(val);
		}
	}

	static Integer[] getMaxesOfArray(int[] nums, int[] maxs){
		Set<Integer> set = new TreeSet<>();
		for(int i=0; i<maxs.length; i++){
			for(int j=0; j<nums.length; j++){
				if(maxs[i] >= nums[j]){
					//System.out.print(nums[j]);
					set.add(Integer.valueOf(nums[j]));
				}
			}
		}
		Integer[] result = set.toArray(new Integer[set.size()]);
		return result;
	}
	
}
