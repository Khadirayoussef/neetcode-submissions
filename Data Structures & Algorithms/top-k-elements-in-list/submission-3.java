class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int num : nums) {
            if (result.containsKey(num))
                result.put(num, result.get(num) + 1);
            else
                result.put(num, 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(result.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        int[] finalResult = new int[k];
        for (int i = 0; i < k; i++) {
            finalResult[i] = entries.get(i).getKey();
        }
        return finalResult;
    }
}
