class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);

                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for (int count : map.values()) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;       
    }
}