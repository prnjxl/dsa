//remainder method 
class Solution {
    public int reverseBits(int n) {
        int arr[]=new int[32];
        int j=0;
        while(j<32){
            if(n%2==0){
                arr[j]=0;
            }
            else{
                arr[j]=1;
            }
            j++;
            n/=2;
        }
        int sum=0;
        for(int i=31;i>=0;i--){
            sum+=arr[i]*(int) Math.pow(2,31-i);
        }
      //could use shift operator for bit manipulation
        return sum;
    }
}
