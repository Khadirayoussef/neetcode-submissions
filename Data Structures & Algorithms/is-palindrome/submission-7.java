class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String first = s.substring(0, s.length() / 2);
        String second =
            s.substring(s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1, s.length());
        StringBuilder secondS = new StringBuilder(second);
        secondS = secondS.reverse();
        if (first.equals(secondS.toString()))
            return true;
        return false;
    }
}
