class Solution():
    def findClosestNumber(self, nums):
        current = 99999999
        
        for num in nums:
            if abs(num) < abs(current):
                current = num
            elif abs(num) == abs(current) and num > current:
                current = num 
            
            
        return current
        