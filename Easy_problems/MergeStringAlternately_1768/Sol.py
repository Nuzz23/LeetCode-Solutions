class Solution(object):
    def mergeAlternately(self, word1, word2):
        string = ""
        
        for i in range(0, min(len(word1), len(word2)), 1):
            string = string + word1[i] + word2[i]
        
        if len(word1) > len(word2):
            string = string + word1[len(word2)::]
        else:
            string = string + word2[len(word1)::]
        
        return string