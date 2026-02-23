class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len = s.length();
      //no. of possible substrings possible is calculated using 2^k
        int possSubstrings = (int) Math.pow(2,k);
      //if the length is small then directly eliminating the code execution
        if (len - k + 1 < possSubstrings) {
            return false;
        }
      //using sets to eleminate reoccurance of same substring
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i <= len - k; i++) {
            String currentSubstring = s.substring(i, i + k);
            substrings.add(currentSubstring);
        }
        return substrings.size() == possSubstrings;
    }
}
