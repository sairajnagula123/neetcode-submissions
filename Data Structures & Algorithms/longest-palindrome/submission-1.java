class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int length = 0;
        boolean odd = false;

        for(int values : map.values()){
            if(values % 2 == 0){
                length = length + values;
            }
            else{
                length = length + values - 1;
                odd = true;
            }
        }

        if(odd){
            length++;
        }

        return length;
    }
}