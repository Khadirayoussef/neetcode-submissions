class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> isExist = new HashMap<>();
        char[] charString = s.toCharArray();
        int top = 0;
        int currentStreak = 0;
        int start = 0;

        for (int i = 0; i < charString.length; i++) {
            if (isExist.containsKey(charString[i]) && isExist.get(charString[i]) >= start) {
                start = isExist.get(charString[i]) + 1;
            }
            isExist.put(charString[i], i);
            currentStreak = i - start + 1;

            if (top < currentStreak)
                top = currentStreak;
        }

        return top;
    }
}