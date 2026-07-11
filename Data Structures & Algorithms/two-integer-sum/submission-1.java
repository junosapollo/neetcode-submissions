class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if(map.containsKey(dif) && map.get(dif)!=i){
                
                result[0] = i;
                result[1] = map.get(dif);
            }
            else{
                continue;
            }

        }
        Arrays.sort(result);
        return result;

    
        
    }
}
