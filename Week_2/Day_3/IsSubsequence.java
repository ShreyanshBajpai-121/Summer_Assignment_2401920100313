class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < array.length && i < arr.length; j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == arr.length; 
    }
}
