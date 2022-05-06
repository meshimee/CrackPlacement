import java.util.Arrays;

public class Prblm_976 {
          public static void main(String[] args) {
               int[] arr = {25,6,9,11,8,12,10,3,2};
               int ans = largestPerimeter(arr);
               System.out.println(ans);     
          }

          // private static int largestPerimeter(int[] arr) {
          //           int perimeter = 0;
          //           int i;
          //           Arrays.sort(arr);
          //           for(i=arr.length-1;i>= 2; i--){
                              
          //                     if(arr[i] < arr[i-1] + arr[i-2])
          //                     perimeter = arr[i] + arr[i-1] + arr[i - 2];
          //                     break;
          //           }
                    
          //           return perimeter;
          // }
//}
public static int largestPerimeter(int[] nums) {
          Arrays.sort(nums);
             int perimeter = 0;
             for(int i = nums.length-1; i>=2 ; i--){
                 if(nums[i] <  nums[i-1] + nums[i-2] ){
                     perimeter = nums[i]+nums[i-1]+nums[i-2];
                     break;
                 }
                
             }
            return perimeter;
         }
     }