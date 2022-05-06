
import java.util.HashMap;

import java.util.Map;

//1. Two Sum
public class Prblm_1 {
          public static int[] twoSum_Naive(int[] nums, int target) {
                    int[] a = new int[2];
                    for(int i=0;i<nums.length;i++){
                               for(int j=i+1;j<nums.length;j++){
                               int ans = nums[i]+nums[j];
                    if(ans == target)
                    {
                        a[0]=i;
                        a[1]=j;
                        break;
                    }
            }
        }
        return a;
        
    }
    public int[] twoSum(int[] nums, int target) {
          int[] result = new int[2];
          Map<Integer,Integer> map = new HashMap<Integer,Integer>();
          
          for(int i =0 ; i<nums.length ; i++){
              if(map.containsKey(target-nums[i])){
                  result[1] = i;
                  result[0] = map.get(target-nums[i]);
                  
                  return result;
              }
              map.put(nums[i],i);
          }
              return result;
      }

          public static void main(String[] args) {
               int[] nums = {3,2,4};
                int target = 6;
                int[] arr = twoSum_Naive(nums, target);
                for(int i : arr)
                System.out.print(i+" ");

          }
}
