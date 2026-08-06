class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;
        int r=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();

       while(r<s.length())
       {
          char val=s.charAt(r);
          if(!set.contains(val))
          {

             set.add(val);
             max=Math.max(max,r-l+1);
          } 
          else
          {
            while(set.contains(val))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(val);

          }
          r++;
       }
       return max;
    }
}
