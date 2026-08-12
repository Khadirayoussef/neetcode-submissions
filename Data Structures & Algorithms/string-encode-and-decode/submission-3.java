class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                sb.append((int) str.charAt(i)).append(" ");
            }
            result.append(sb.toString().trim());
            result.append(",");
        }

        return result.toString();
    }

public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    String[] parts = str.split(",", -1);

    for (int i = 0; i < parts.length - 1; i++) {
        String part = parts[i];
        StringBuilder original = new StringBuilder();

        if (!part.isEmpty()) {
            String[] codes = part.split(" ");
            for (String code : codes) {
                original.append((char) Integer.parseInt(code));
            }
        }

        result.add(original.toString());
    }

    return result;
}
}
