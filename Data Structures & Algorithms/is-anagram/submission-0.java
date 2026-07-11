class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        
        for (char ch : S){
            mapS.put(ch,(mapS.getOrDefault(ch,0))+1);
        }
        for (char ch : T){
            mapT.put(ch,(mapT.getOrDefault(ch,0))+1);
        }

        if (mapS.equals(mapT)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
