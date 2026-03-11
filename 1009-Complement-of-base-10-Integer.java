class Solution {
    public int bitwiseComplement(int n) {
        //check the bits
        StringBuilder s=new StringBuilder();
        if(n==0){
            return 1;
        }
        while(n>0){
            int temp=n%2;
            if(temp==1){
                s.append("0");
            }
            else{
                s.append("1");
            }
            n/=2; //can be done using shift operations
        }
        //then use the 2 to the power sum to calculate to remove leading zero problem
        String str=s.reverse().toString();
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            int temp=Character.getNumericValue(s.charAt(i)); //xor with mask can do this
            sum+=(int) (temp*Math.pow(2,s.length()-1-i));
        }
        return sum;
    }
}
