class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> appearance = new HashMap();
        for (int c : nums) {
            appearance.put(c, appearance.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> sorted =
            appearance.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toList());
        int[] result = new int[k];

        for(int i = 0 ; i<k;i++){
            result[i]=sorted.get(i).getKey();
        }

        return result;
    }
}
