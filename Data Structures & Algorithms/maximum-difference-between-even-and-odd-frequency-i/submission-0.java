class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int count : map.values()) {
            if (count % 2 == 1)
                maxOdd = Math.max(maxOdd, count);
            else
                minEven = Math.min(minEven, count);
        }
        return maxOdd - minEven;
    }
}