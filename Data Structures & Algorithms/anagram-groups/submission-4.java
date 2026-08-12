class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] grouped = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (grouped[i]) {
                continue;
            }

            List<String> currentWork = new ArrayList();
            currentWork.add(strs[i]);
            grouped[i] = true;


            for (int j = i + 1; j < strs.length; j++) {
                if (grouped[j]) {
                    continue;
                }

                if (strs[i].length() != strs[j].length())
                    continue;

                int[] alphabetCounts = new int[26];
                for (int l = 0; l < strs[i].length(); l++) {
                    alphabetCounts[strs[i].charAt(l) - 'a']++; // Increment for str1
                    alphabetCounts[strs[j].charAt(l) - 'a']--; // Decrement for str2
                }
                boolean flag = true;
                for (int count : alphabetCounts) {
                    if (count != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    currentWork.add(strs[j]);
                    grouped[j] = true;
                }
            }
            result.add(currentWork);
        }
        return result;
    }
}