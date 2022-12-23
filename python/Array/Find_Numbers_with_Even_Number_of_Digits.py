from typing import List

# Given an array nums of integers, return how many of them contain an even number of digits.
# 주어진 배열 nums의 intergers에서 짝수인 숫자의 개수를 구하시오. 
# O(n)
# beat 90%, memory 13, code speed is 30ms
class Solution:
    def findNumber(self, nums: List[int]) -> int:
        return sum(len(str(n)) % 2 == 0 for n in nums)
    

# beat 30% and memory 14, code speed is 100ms
class MySolution:
    def myNumber(self, nums: List[int]) -> int:
        count = 0
        for i in range(len(nums)):
            if (len(str(nums[i])) % 2 == 0):
                count += 1
            else:
                continue
        return count
                

nums = [12,345,2,6,7896]
running = Solution()
myclass = MySolution()
print('solution : %d' % running.findNumber(nums))
print('mysolution : %d' % myclass.myNumber(nums))
