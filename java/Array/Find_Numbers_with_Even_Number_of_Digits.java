import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array nums of integers, return how many of them contain an even number of digits.
// 주어진 배열 nums의 intergers에서 짝수인 숫자의 개수를 구하시오. 

class Solution2 {
    public int findNumbers(int[] nums) {
       return Arrays.stream(nums).map(i -> 1 - Integer.toString(i).length() % 2).sum();
    }
    public static void main(String[] args) {
        int[] nums = {12,333,9,4445};
        Solution2 solution = new Solution2();
        System.out.println(solution.findNumbers(nums));
    }
}


/*
 * 해설
 * 
    Use Integer.toString() to get the string form of each number of the input array nums;
    Integer.toString()을 사용하여 배열 nums의 각 숫자를 문자열 형식으로 가져옴

    Use length() to get the number of the digits and use % 2 to check the parity: 0 for even number of digits and 1 for odd;
    length()를 사용하여 자릿수를 가져오고 % 2를 해서 나머지가 0, 1 를 확인하고 나머지가 0이면 짝수, 1이면 홀수

    Use 1 - the above 0 or 1 in order to count in even digits numbers and filter those odd.
    1 - 에 0과 1를 계산하여 짝수는 카운트하고 홀수는 카운트하지 않는다.
    만약 짝수 0이면 "1 - 0 = 1" 결과가 sum()에 1이 누적된다.
    만약 홀수 1이면 "1 - 1 = 0" 결과가 sum()에 0이 누적된다. 
 * 
 */