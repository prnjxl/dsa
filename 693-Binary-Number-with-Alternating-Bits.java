class Solution {
    public boolean hasAlternatingBits(int n) {
        int precount=n%2;
        n/=2;
        int count=-1;
        while(n>0){
            int temp=n%2;
            if(precount!=temp){
                precount=temp;
                n/=2;
            }
            else{
                count=0;
                break;
            }
        }
        return count==0? false : true;    
    }
}
