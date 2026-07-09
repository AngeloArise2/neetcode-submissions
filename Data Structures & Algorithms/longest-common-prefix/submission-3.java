class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String baseline = strs[0];
        for (int j = 0; j < baseline.length(); j++) {
            char c = baseline.charAt(j);   
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return baseline.substring(0, j);
                }
            }
        }
        return baseline;
    }
}