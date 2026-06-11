class Solution {
    public String reverseWords(String s) {
      String words[]=s.split(" ");
      StringBuilder s1= new StringBuilder();
      for(String str:words){
        String rev=new StringBuilder(str).reverse().toString();
        s1.append(rev).append(" ");
      }
      return s1.toString().trim();
    }
} 
