class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
                HashMap<Integer,Integer>  hm=new LinkedHashMap<>();
                HashMap<Integer,Integer> hm1=new LinkedHashMap<>();
                for(int i=0;i<arr1.length;i++)
                {
                    hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
                }
             for(int i=0;i<arr2.length;i++)
             {
                hm1.put(arr2[i],hm1.getOrDefault(arr2[i],0)+1);
             }  
             ArrayList<Integer> al=new ArrayList<>();
             for(int key:hm1.keySet())
             {
                if(hm.containsKey(key))
                {
                    int k=hm.get(key);
                    for(int i=0;i<k;i++)
                    {
                        al.add(key);
                    }

                }
                
             } 
             for(int key:hm.keySet())
             {
                if(!hm1.containsKey(key))
                {
                 for(int i=0;i<hm.get(key);i++)
                 {
                    al.add(key);
                    }

                }
                }
             
             int c[]=new int[al.size()];
             int k=0;
             for(int i=0;i<c.length;i++)
             {
                c[k++]=al.get(i);
             }
             return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna