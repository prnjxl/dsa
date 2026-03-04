class Solution {
    public int numSpecial(int[][] mat) {
        int arrRow[]=new int[mat.length];
        int arrCol[]=new int[mat[0].length];
        for(int i=0; i<mat.length; i++){
            int count=0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    count++;
                    arrCol[j]++;
                }
            }
            arrRow[i]=count;
        }
        int ans=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1 && arrRow[i]==1 && arrCol[j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
