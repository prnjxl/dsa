//brute force approach
class Solution {
    public String addBinary(String a, String b) {
        int carry=0; // outside loop
        String c="";

        // Make lengths equal
        while (a.length() < b.length()) {
            a = "0" + a;
        }
        while (b.length() < a.length()) {
            b = "0" + b;
        }

        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)!=b.charAt(i)){
                if(carry>0){
                    //add 0
                    c="0"+c;
                    carry=1;
                }
                else{
                    //add 1
                    c="1"+c;
                }
            }
            else{
                if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                    if(carry>0){
                        //add 1
                        c="1"+c;
                        carry=0;
                    }
                    else{    
                        //add 0
                        c="0"+c;
                    }
                }
                else{
                    if(carry>0){
                        //add 1
                        c="1"+c;
                        carry=1;
                    }
                    else{    
                        //add 0
                        c="0"+c;
                        carry=1;
                    }
                }
            }
        }
        if(carry!=0){
            //add 1
            c="1"+c;
        }
        return c;
    }
}
