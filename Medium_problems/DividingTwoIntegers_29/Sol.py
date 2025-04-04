class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        neg:bool = (dividend < 0) ^ (divisor < 0)
        dividend, divisor = abs(dividend), abs(divisor)
        i:int=dividend
        
        if divisor > 1:
            i:int = 0
            while dividend >= divisor: i, dividend = i+1, dividend-divisor
        
        return (-(exp+1) if neg else exp) if i >= (exp:=2**31-1) else (-i if neg else i)