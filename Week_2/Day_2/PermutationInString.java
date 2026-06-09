class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int[]s1f=new int[26];
        int[]s2f=new int[26];
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            s1f[ch-'a']++;
        }
        int i=0;
        int j=0;
        while(j<m){
            s2f[s2.charAt(j)-'a']++;
            if(j-i+1>n){
            s2f[s2.charAt(i)-'a']--;
            i++;
            }
            if(Arrays.equals(s1f,s2f))return true;
            j++;
        }
        return false;
            }
}
