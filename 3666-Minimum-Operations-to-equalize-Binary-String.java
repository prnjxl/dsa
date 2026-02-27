class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        TreeSet<Integer>[] ts = new TreeSet[2];
        Arrays.setAll(ts, i -> new TreeSet<>());
        for (int i = 0; i <= n; i++) {
            ts[i % 2].add(i);
        }
        int cnt0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                cnt0++;
            }
        }
        ts[cnt0 % 2].remove(cnt0);
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(cnt0);
        int ans = 0;
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; --size) {
                int cur = q.poll();
                if (cur == 0) {
                    return ans;
                }
                int l = cur + k - 2 * Math.min(cur, k);
                int r = cur + k - 2 * Math.max(k - n + cur, 0);

                TreeSet<Integer> t = ts[l % 2];

                Integer next = t.ceiling(l);
                while (next != null && next <= r) {
                    q.offer(next);
                    t.remove(next);
                    next = t.ceiling(l);
                }
            }
            ans++;
        }
        return -1;
    }
}
/*
class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        
        int z = 0;

        for(char ch : s.toCharArray()) if(ch == '0') ++z;

        if(z == 0) return 0;
        if(k == n) return z == n ? 1 : -1;

        int ans = Integer.MAX_VALUE;

        // if m is even
        if(z % 2 == 0){
            int m = Math.max((z + k - 1) / k, (z + n - k - 1) / (n - k));
            ans = m % 2 == 0 ? m : m + 1;
        }

        // m is odd
        if(z % 2 == k % 2){
            int m = Math.max((z + k - 1) / k, (n - z + n - k - 1) / (n - k));
            m = (m % 2) != 0 ? m : m + 1;
            ans = Math.min(ans, m);
        } 


        if(ans == Integer.MAX_VALUE) return -1;

        return ans;
        
    }
} */
