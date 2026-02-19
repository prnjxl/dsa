class Solution {
    public static int countBinarySubstrings(String s) {
        int ans = 0;
        int prev = 0;
        int curr = 1;

        for (int i = 0; i + 1 < s.length(); ++i){
            if (s.charAt(i) == s.charAt(i + 1))
                ++curr;
            else {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        return ans + Math.min(prev, curr);
  }
}
