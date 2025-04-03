class Solution:
    def myAtoi(self, s: str) -> int:
        neg:bool = False
        first:bool = True
        num:int = 0
        
        for i in range(s.__len__()):
            if s[i] >= '0' and s[i] <= '9': num, first = num*10+int(s[i]), False
            elif s[i] == '-' and first: neg, first = True, False
            elif s[i] == ' ' and first: continue
            elif s[i] == '+' and first: first = False
            else: break
            
        if num >=  (exp:= 2**31): return -exp if neg else exp-1 
        else: return -num if neg else num