import java.util.LinkedHashSet;

//26. Remove Duplicates from Sorted Array
public class Prblm_26 {
          public static int removeDuplicatesUsingHashSet(int[] nums) {
                    LinkedHashSet<Integer> set = new LinkedHashSet<>();
                    for (int i : nums) {
                              set.add(i);
                    }
                    int i = 0;
                    for (int num : set) {
                              nums[i] = num;
                              i++;
                    }
                    return i;
          }
          public static int removeDuplicates(int[] nums) {
                    if (nums.length == 0)
                              return 0;

                    int i = 0;
                    for (int j = 0; j < nums.length; j++) {
                              if (nums[j] != nums[i]) {
                                        i++;
                                        nums[i] = nums[j];
                              }
                    }
                    return i + 1;
          }

          public static void main(String[] args) {
                    int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
                    int ans = removeDuplicatesUsingHashSet(arr);
                    System.out.println(ans);

          }
}
