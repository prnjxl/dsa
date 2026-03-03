class Solution {
    public char findKthBit(int n, int k) {
        String s="0";
        while(n>1){
            //calculation
            StringBuilder sb=new StringBuilder();
            //inverting and reversing
            for(int j=s.length()-1; j>=0; j--){
                sb.append(s.charAt(j)=='0'?'1':'0');
            }
            s+="1"+sb.toString();
            n--;
        }
        return s.charAt(k-1);
    }
}
