class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> val=new Stack<>();
     
      for(String c: tokens)
      {
        if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"))
        {
           int val1=val.pop();
           int val2=val.pop();
           
           if(c.equals("+"))
           {
            val.push(val1+val2);
           }
            else if(c.equals("-"))
           {
            val.push(val2-val1);
           }
            else if(c.equals("*"))
           {
            val.push(val1*val2);
           }
           else if(c.equals("/"))
           {
            val.push(val2/val1);
           }
        }
        else
        {
            val.push(Integer.parseInt(c));
        }
      }
      

      return val.pop();
    }
}
