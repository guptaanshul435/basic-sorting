class InsertionSort{
    
	public static void insertSort(int[] nums){
	   int n=nums.length;
	   for(int i=0;i<n ;i++){
	    int j=i;
	    while(j> 0 && nums[j-1]>nums[j]){
		  swap(j,j-1,nums);
		  j--;
		}
	   }
	}
	public static void swap(int f, int s,int[] nums){
	  int temp=nums[f];
	  nums[f]=nums[s];
	  nums[s]=temp;
	}
	public static void main(String[] args){
	   int[] nums={10,5,12,15,25,20};
	   insertSort(nums);
	   
	   for(int val:nums){
		   System.out.println(val);
	   }
	}

}