class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int [] ans=new int[l];
        int [] prefix=new int[l];
        int [] sufix=new  int[l];
        prefix[0]=nums[0];
        sufix[l-1]=nums[l-1];
         for(int i=1;i<l;i++)
         {
            prefix[i]=prefix[i-1]*nums[i];
            sufix[l-i-1]=sufix[l-i]*nums[l-i-1];
            
         }
         for(int i=1;i<nums.length-1;i++)
         {
            ans[i]=prefix[i-1]*sufix[i+1];
         }
         ans[l-1]=prefix[l-2];
         ans[0]=sufix[1];
   
      return ans;
    }
}  
