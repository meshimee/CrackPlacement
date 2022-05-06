//75. Sort Colors

public class Prblm_75 {
          private static void swap(int[] nums, int p1 , int p2){   
                    int tmp = nums[p1];
                    nums[p1] = nums[p2];
                    nums[p2] = tmp;
                }
          public static void sortColors(int[] nums){
                    int mid = 0 , low = 0 , high = nums.length - 1;
                    while(low <= high){
                        if(nums[low] == 0)
                            swap(nums, mid++, low++);
                        
                        else if(nums[low] == 2)
                            swap(nums, low , high--);
                        
                        else low++;
                    }
                    for(int k =  0; k<nums.length ; k++){
                              System.out.println(nums[k]);
                    }
                   }
                    
              
                
          public static void main(String[] args) {
                   int[] nums = {2,0,2,1,1,0};  
                   sortColors(nums); 
          }
}
