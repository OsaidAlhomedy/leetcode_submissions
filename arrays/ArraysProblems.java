package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraysProblems {
    // https://leetcode.com/problems/majority-element/
    public static int majorityElement(int[] nums) {
        
        int mid = nums.length/2;

        Map<Integer,Integer> countMap = new HashMap<>();

        for(int item : nums){
            if(countMap.containsKey(item)){
                int counter = countMap.get(item);
                counter++;
                countMap.put(item,counter);
            }else{
                countMap.put(item,1);
            }
        }

        for(var item : countMap.entrySet()){
            if(item.getValue() > mid){
                return item.getKey();
            }
        }
        return -1;
        
    }

    // https://leetcode.com/problems/single-number/
    public static int singleNumber(int[] nums) {
        int answer = 0;
        for(int i = 0;i<nums.length ; i++){
            answer = answer ^ nums[i];
        }
        return answer;
        
    }

    // https://leetcode.com/problems/two-sum/
    public static int[] twoSum(int[] nums, int target) {
	    
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
                
            }
        }
        return answer;
    }

    //https://leetcode.com/problems/plus-one/
    public int[] plusOne(int[] digits) {
        boolean verfier = false;
        
        for(int i = 0 ; i < digits.length ; i++){
            if(digits[i] != 9){
                verfier = true;
            }
        }
        
        if(verfier){
            
        for(int i = digits.length-1 ; i>= 0 ; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
            }
         }
            return digits;
        }else{
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
              for(int i = 1 ; i < digits.length ; i++){
                newDigits[i] = 0;
        }   
            return newDigits;
            }
        
    }



}
