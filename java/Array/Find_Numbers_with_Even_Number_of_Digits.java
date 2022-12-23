import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Given an array nums of integers, return how many of them contain an even number of digits.
// 주어진 배열 nums의 intergers에서 짝수인 숫자의 개수를 구하시오. 

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        String numstr = Integer.toString(nums);
        for(int i = 0; i < numstr.length; i++){
            if( nums[i]. % 2 == 0){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Integer[] nums = {12,333,9,4445};
    }
}