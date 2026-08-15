class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] s2Count = new int[26];
        int[] s1Count = new int[26];

        char[] arrayCharS2 = s2.toCharArray();

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            s2Count[arrayCharS2[i] - 'a']++;
        }

        if(Arrays.equals(s1Count, s2Count)) return true;

        for (int i = 1; i <= s2.length() - s1.length(); i++) {
            // remove outgoing char: s2.charAt(i - 1)
            s2Count[arrayCharS2[i - 1] - 'a']--;
            // add incoming char: s2.charAt(i + s1.length() - 1)
            s2Count[arrayCharS2[i + s1.length() - 1] - 'a']++;

            // compare arrays
        if(Arrays.equals(s1Count, s2Count)) return true;
        }
        return false;
    }
}
