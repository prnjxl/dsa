class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                else if(Integer.bitCount(arr[j])==Integer.bitCount(arr[j+1])){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return arr;
    }
}
