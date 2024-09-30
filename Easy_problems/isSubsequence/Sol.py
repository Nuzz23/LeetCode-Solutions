class Solution(object):
    def isSubsequence(self, s, t):
        j = 0
        
        if s == "":
            return True
        
        
        for i in range(0, len(t)):
            if t[i] == s[j]:
                j = j+1
                if j == len(s):
                    break
                
        return len(s) == j