class NumArray {
   int[] printArray;
    public  NumArray(int[] nums) {
        int n=nums.length;
         int []printArray=new int[n+1];
        for(int i=0;i<n;i++){
            printArray[i+1]= printArray[i]+nums[i];
        }
       
        this.printArray=printArray;
    }
    
    public int sumRange(int i, int j) {
       return printArray[j+1]-printArray[i];
    }
}
