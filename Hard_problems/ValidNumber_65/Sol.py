class Solution:
    def isNumber(self, s: str) -> bool:
        sgn:bool = False
        dot:bool = False
        exp:bool = False
        dgtPreExp:bool = False
        dgtPostExp:bool = False
        
        for i in range(s.__len__()):
            if (s[i] == 'e' or s[i] == 'E') and not exp: exp, sgn, dot = True, False, False
            elif (s[i] == '+' or s[i] == '-') and ((not sgn and not dgtPreExp) or (exp and not dgtPostExp and not sgn)) and not dot: sgn = True
            elif s[i] == '.' and not dot and not exp: dot = True
            elif s[i] >= '0' and s[i] <='9' and not exp: dgtPreExp= True
            elif s[i] >= '0' and s[i] <= '9' and exp: dgtPostExp = True
            else: return False
            
        return (not exp and dgtPreExp) or (exp and dgtPostExp and dgtPreExp)
    
    
Solution().isNumber("-.7e+-0435")