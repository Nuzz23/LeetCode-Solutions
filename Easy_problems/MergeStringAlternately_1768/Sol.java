class Sol {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char [] w1 = word1.toCharArray(), w2 = word2.toCharArray(); 
        
        for (int i = 0; i < word1.length() && i < word2.length(); i++) 
            sb.append(w1[i]).append(w2[i]);
        
        if(word1.length() > word2.length())
            sb.append(word1.subSequence(w2.length, w1.length));
        else
            sb.append(word2.subSequence(w1.length, w2.length));

        return sb.toString();
    }

}