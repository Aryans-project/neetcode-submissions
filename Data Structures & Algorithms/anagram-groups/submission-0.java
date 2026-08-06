class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      ArrayList<List<String>> ans=new ArrayList<>();
      HashMap<String,ArrayList<String>> map=new HashMap<>();      
      for(int i=0;i<strs.length;i++)
      { 
        char[] arr=strs[i].toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);
        if(map.containsKey(s))
        {
           map.get(s).add(strs[i]); 
        }
        else
        {

          ArrayList ss=new ArrayList<>();
          ss.add(strs[i]);
          map.put(s,ss);
        }
      }

  

        for(ArrayList<String> val : map.values())
        {
          ans.add(val);
        }
    
      return ans; 

    }
}
