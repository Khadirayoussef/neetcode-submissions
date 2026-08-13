class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> noDupilicate = new HashSet();
        for (int num : nums) {
            noDupilicate.add(num);
        }
        int longest = 0;
        int currentNum =0;
        int currentStreak = 0;
        for (int num : noDupilicate) {
            if (!noDupilicate.contains(num - 1)) {
                currentNum = num;
                currentStreak = 1;
            }
            while (noDupilicate.contains(currentNum + 1)) {
                currentStreak += 1;
                currentNum += 1;
            }
            longest = Math.max(currentStreak, longest);
        }
        return longest;
    }
}
