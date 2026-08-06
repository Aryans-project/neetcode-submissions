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
                char val=stack.peek();
                if(val=='(' && c==')')
                {
                     stack.pop();  
                }
                else if(val=='{' && c=='}')
                {
                    stack.pop();
                }
                else if(val=='[' && c==']')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }

            }
        }

        if(!stack.isEmpty())
        {
            return false;
        }

        return true;
    }
}
