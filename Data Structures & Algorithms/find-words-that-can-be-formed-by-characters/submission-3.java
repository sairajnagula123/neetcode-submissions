class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;

        for (String word : words) {

            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean possible = true;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (!temp.containsKey(ch) || temp.get(ch) == 0) {
                    possible = false;
                    break;
                }

                temp.put(ch, temp.get(ch) - 1);
            }

            if (possible) {
                ans += word.length();
            }
        }

        return ans;
    }
}