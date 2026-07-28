class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : nums){
            map.put(x,(map.getOrDefault(x,0))+1);
        }

        List<Integer>[] buck = new List[nums.length + 1];

        for (int x : map.keySet()){
            if (buck[map.get(x)] == null){
                buck[map.get(x)] = new ArrayList<>();
            }
            buck[map.get(x)].add(x);
        }

        int[] result = new int[k];
        int idx = 0;

        for (int i = buck.length - 1; i > 0; i--){
            if (buck[i]!=null){
                for (int num : buck[i]){
                    result[idx] = num;
                    idx++;
                }
                if (idx == k){
                    return result;
                }
            }
        } 

        
        
        return result;    
        

        
    }
}


