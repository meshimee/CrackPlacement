import java.util.ArrayList;
import java.util.List;

class Prblm_1389{
          public static void main(String[] args) {
                    int[] nums = {0,1,2,3,4};
                    int[] index = {0,1,2,2,1};

                    int[] ans = new int[nums.length];

                    ans = createTargetArray(nums,index);
                    ans = solveTargetArray(nums,index);

                    for(int i = 0; i<ans.length ; i++)
                    System.out.print(ans[i]+" ");
          }

          private static int[] solveTargetArray(int[] nums, int[] index) {
                    int[] target = new int[index.length];
                    for(int i = 0; i<index.length ; i++){
                              for(int j = target.length - 1 ; j > index[i] ; j--){
                                        target[j] = target[j-1];

                              }
                              target[index[i]] = nums[i];
                    }
                    return target;
          }

          private static int[] createTargetArray(int[] nums, int[] index) {
                    List<Integer> list = new ArrayList<>();

                    for(int i = 0; i<nums.length ; i++)
                    list.add(index[i],nums[i]);

                    int[] arr = new int[nums.length];

                    for(int i = 0; i<list.size(); i++)
                    arr[i] = list.get(i);
                    return arr;
          }
}