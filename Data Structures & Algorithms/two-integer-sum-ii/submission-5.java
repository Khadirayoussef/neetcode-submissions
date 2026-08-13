class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Found it — return 1-indexed positions
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                // Sum too small -> move left pointer right to increase the sum
                left++;
            } else {
                // Sum too big -> move right pointer left to decrease the sum
                right--;
            }
        }
                return new int[]{-1, -1};
    }
}
