class Solution:
    def reverse(self, x: int) -> int:
        sign:int = -1 if x < 0 else 1
        x:int = x*sign
        y:int = 0
        
        while x >= 1:
            y = y * 10 + x % 10
            x = x // 10
        
        return 0 if y > 2**31-1 else y*sign