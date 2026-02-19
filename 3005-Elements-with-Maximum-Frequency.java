class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
      //finding frequency of each element
        for(int i:nums){
            arr[i]++;
        }
      //maximum frequency
        int temp=0;
        for(int j=1;j<arr.length;j++){
            if(temp<arr[j]){
                temp=arr[j];
            }
        }
      //adding elements having same max frequency
        int sum=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==temp){
                sum+=arr[k];
            }
        }
        return sum;
    }
}
