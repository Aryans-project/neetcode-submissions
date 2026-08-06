class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char arr[]=s.toCharArray();

        for(char c:arr)
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char val=stack.pop();
                if(val=='(' && c!=')' || val=='{' && c!='}'|| val=='[' && c!=']' )
                {
                    
                    return false;
                }

            }
        }

            return stack.isEmpty();
        
    }
}
