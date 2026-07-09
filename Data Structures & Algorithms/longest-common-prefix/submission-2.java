class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is empty, there is no prefix
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as our baseline reference
        String baseline = strs[0];
        
        // Iterate through each character position of the baseline string
        for (int j = 0; j < baseline.length(); j++) {
            char c = baseline.charAt(j);
            
            // Check this character position against all other strings
            for (int i = 1; i < strs.length; i++) {
                // If the current string is shorter than j, or the character doesn't match
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    // Everything up to index j is our longest common prefix
                    return baseline.substring(0, j);
                }
            }
        }
        
        // If we made it through without a mismatch, the entire baseline is the prefix
        return baseline;
    }
}