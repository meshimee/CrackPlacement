//287. Find the Duplicate Number
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prblm_287 {
      public static void main(String[] args) {
            int[] arr = { 3, 1, 3, 4, 2 };
            // int ans = BruteForce(arr); //using two for loops TC : 0(n*n) SC : O(1)
            // int ans = findDuplicate_USingSorting(arr); //sorting the array then linearly
            // treversing the array TC : 0(nlogn) SC : O(1)
            // int ans = findDuplicate_UsingCount(arr); //Count the frequency of the num in the array.
                  //With extra O(n) space, without modifying the input.
            //int ans = findDuplicate_UsingHashing(arr); //Using a HashSet to record the occurrence of each number.
                 //With extra O(n) space, without modifying the input
            int ans = findDuplicate_UsingFastSlow(arr);

            System.out.println(ans);

      }

      private static int BruteForce(int[] ans) {
            for (int i = 0; i < ans.length; i++) {
                  for (int j = i + 1; j < ans.length; j++) {
                        if (ans[i] == ans[j])
                              return ans[i];
                  }
            }
            return ans.length;
      }

      private static int findDuplicate_UsingSorting(int[] arr) {

            Arrays.sort(arr);
            for (int i = 1; i < arr.length - 1; i++) {
                  if (arr[i] == arr[i - 1]) {
                        return arr[i];

                  }
            }
            return arr.length;

      }

      private static int findDuplicate_UsingCount(int[] arr) {
            int[] count = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                  count[arr[i]]++;
                  if (count[arr[i]] > 1)
                        return arr[i];
            }
            return arr.length;
      }

      private static int findDuplicate_UsingHashing(int[] arr) {
            Set<Integer> set = new HashSet<>();
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                  if (!set.add(arr[i])) {
                        return arr[i];
                  }
            }

            return len;
            
      }
      private static int findDuplicate_UsingFastSlow(int[] arr) {
            int slow = 0;
            int fast = 0;
            do {
                slow = arr[slow];
                fast = arr[arr[fast]];
            } while (slow != fast);
    
            slow = 0;
            while (slow != fast) {
                slow = arr[slow];
                fast = arr[fast];
            }
            
            return slow;
        }
      

}
