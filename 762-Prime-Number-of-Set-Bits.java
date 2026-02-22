class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int n=left;n<=right;n++){
            int temp=Integer.bitCount(n);
         
            if (temp==2 || temp==3 || temp==5 || temp==7 || temp==11 || temp==13 || temp==17 || temp==19){
                count++;
            }  
        }
        return count;
    }
}
