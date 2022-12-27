import java.util.Arrays;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// 배열에 연속되는 숫자 1의 개수만 찾기
// TC(Time Complexity) 시간 복잡도 : O(n)
// SC(Space Complexity) 공간 복잡도 : O(1)
class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++ ){
            if( nums[i] % 2 != 0) {
                count += 1;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    //향상된 For문으로 이용하는 방법
    public int myFindMaxConsecutiveOnes(int[] nums){

        int count = 0;
        int maxCount = 0;

        for(int n : nums){
            if (n == 1){
                count += 1;
                maxCount = Math.max(count, maxCount);
            } else { 
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1};
        Solution1 solution = new Solution1();
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}    

/* 주의!
 * 
 * 항상 주어진 문제를 잘 이해하고 생각해서 코딩해야한다.
 * 
 */