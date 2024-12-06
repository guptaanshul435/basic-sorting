//selection sort
class SelectionSort{
	
	public static void selectionSort(int[] nums){
		int n=nums.length;
		int min;
		for(int i=0; i<n ;i++){
			min=i;
			for(int j=i;j<n;j++){
				if(nums[min]>nums[j]){
					min=j;
				}
			}
			swap(min,i,nums);
		}	
	}
	public static void swap(int f,int s,int[] nums){
		int temp=nums[f];
		nums[f]=nums[s];
		nums[s]=temp;
	}
	public static void main(String[] args){
		int[] nums={10,5,3,14,12,20};
		selectionSort(nums);
		for(int val:nums){
			System.out.println(val);
		}
		
	}
	
}