class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return num("", digits);
    }

    public List<String> num(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < map[digit].length(); i++) {
            char ch = map[digit].charAt(i);
            list.addAll(num(p + ch, up.substring(1)));
        }

        return list;
    }
}