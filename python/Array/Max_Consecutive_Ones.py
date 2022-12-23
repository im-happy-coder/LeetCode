from typing import List

# Given a binary array nums, return the maximum number of consecutive 1's in the array.
# 배열에 연속된 숫자 1의 개수만 찾기
# O(n)
class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = maxCount = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                maxCount = max(count, maxCount)
                count = 0
        return max(count, maxCount)

# class MySolution:
#     def myfindNumbers(self, nums: List[int]) -> int:
#         count = 0
#         for i in range(len(nums)):
#             for n in range(len(nums)):
#             if nums[i] == nums[n]:
#                 count += 1
#             else:
#                 count = 0
#         return count


solution = Solution()
# mysolution = MySolution()
nums = [1,1,0,1,1,1,0,1]
print(solution.findNumbers(nums))
# print(mysolution.myfindNumbers(nums))
