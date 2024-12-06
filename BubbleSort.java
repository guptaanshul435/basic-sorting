//bubble sort
class BubbleSort{
  public static void bubbleSort(int[] nums){
     int n=nums.length;
     for(int i=0 ;i<n ;i++){
	   for(int j=0;j<n-1 ;j++){
	     if(nums[j]>nums[j+1]){
		    swap(j,j+1,nums);
		 }
	   }
	 }
  }
  public static void swap(int f,int s,int[] nums){
    int temp=nums[f];
	nums[f]=nums[s];
	nums[s]=temp;
  
  }
  
  public static void main(String[] args){
     int[] nums={10,2,3,5,12,23,14};
	 bubbleSort(nums);
	 for(int val:nums){
	   System.out.println(val);
	 }
  }
}