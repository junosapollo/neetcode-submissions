class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }


        String str = sb.toString();
        return str;

    }
// 3#cat4#code
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0,j = 0;

        while (i<str.length()){
            if(str.charAt(j) == '#'){
                int len = Integer.parseInt(str.substring(i,j));
                String w = str.substring(j+1,j+len+1);
                res.add(w);
                j = j + len + 1;
                i = j;

            }
            else{
                j++;
            }
        }
        return res;

    }
}
