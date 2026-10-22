class Solution {

    public int[] countBits(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            int temp=i;
           String res="";
           while(temp!=0)
           {
             
             int d=temp%2;
             res+=d;
             temp=temp/2;
           }
              int count=0;
           for(int k=0;k<res.length();k++)
           {
         
            if(res.charAt(k)=='1')
            {
                count++;
            }
            
           }
           al.add(count);
        }
           int a[]=new int[n+1];
           for(int j=0;j<al.size();j++)
           {
            a[j]=al.get(j);
           }
           return a;
        
    }
}