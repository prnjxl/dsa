class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s = s + s;

        int flip1 = 0, flip2 = 0;
        int res = Integer.MAX_VALUE;

        int i = 0;

        for (int j = 0; j < 2 * n; j++) {
            //using extra strings is causing Time Limit Exceeded Error
            char exp1 = (j % 2 == 0) ? '0' : '1';
            char exp2 = (j % 2 == 0) ? '1' : '0';

            if (s.charAt(j) != exp1) flip1++;
            if (s.charAt(j) != exp2) flip2++;

            if (j - i + 1 > n) {

                char leftExp1 = (i % 2 == 0) ? '0' : '1';
                char leftExp2 = (i % 2 == 0) ? '1' : '0';

                if (s.charAt(i) != leftExp1) flip1--;
                if (s.charAt(i) != leftExp2) flip2--;

                i++;
            }

            if (j - i + 1 == n)
                res = Math.min(res, Math.min(flip1, flip2));
        }

        return res;
    }
}
