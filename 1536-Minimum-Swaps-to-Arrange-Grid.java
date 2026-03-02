class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int[] endZero = new int[n];
        //counting the end zeros in each rows
        for(int i=0; i<n; i++){
            int j= n-1;
            int count = 0;
            while(j>=0 && grid[i][j]==0){
                count++;
                j--;
            }
            endZero[i]=count;
        }

        int step=0;
        //minimum steps required to make it a valid grid
        for(int i=0; i<n; i++){
            int need = n-i-1;
            int j=i;
            while(j<n && endZero[j]<need){
                j++;
            }

            if(j==n){
                return -1;
            }
            step+= j-i;
            //bubble sort to arrange the elements
            while(j>i){
                int temp=endZero[j];
                endZero[j]=endZero[j-1];
                endZero[j-1]=temp;
                j--;
            }
        }
        return step;
    }
}
