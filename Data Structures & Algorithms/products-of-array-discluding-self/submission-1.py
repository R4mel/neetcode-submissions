class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)

        prefix = 1

        for i in range(len(nums)):
            result[i] = prefix # prefix 값을 해당 자리에 넣어줌. 
            prefix *= nums[i] # 해당 자리는 1이니까 곱해도 같은 수, 수 기준으로 왼쪽 값들 곱해줌

        suffix = 1

        for i in range(len(nums) - 1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]

        return result