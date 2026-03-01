class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char ch: n.toCharArray()){
            //ASCII value of 0-9 is 48-57
            int curr=ch-48;
            max=Math.max(max, curr);
        }
        return max;
    }
}
