class Solution {
    public int binaryGap(int n) {
        int newcount=0;
        int prevcount=100;
        int ans=0;
        while(n>0){
            if(n%2==1){
                ans=Math.max(ans, newcount-prevcount);
                prevcount=newcount;
            }
            newcount++;
            n>>=1; //right shift operator
        }
        return ans;
    }
}
