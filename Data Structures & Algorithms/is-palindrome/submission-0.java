class Solution {
    public boolean isPalindrome(String s)
    {
        StringBuilder sr=new StringBuilder();

        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                sr.append(Character.toLowerCase(c));
            }
        }

        return sr.toString().equals(sr.reverse().toString());
         


    }
}
