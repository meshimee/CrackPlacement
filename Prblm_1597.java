import java.util.Arrays;

class Prblm_1597{
          public static void main(String[] args) {
                    int[] arr = {2,6,4,8,10,9,15};
                    int num = subarray(arr);
                    System.out.println(num);
          }

          private static int subarray(int[] arr) {
                    int[] tmp = new int [arr.length];
                    for(int i = 0; i<arr.length ; i++){
                              tmp[i] = arr[i];
                    }

                    Arrays.sort(tmp);
                    int start = 0;
                    int end = 0;

                    for(int i = 0 ; i < tmp.length ; i++){
                              if(arr[i] != tmp[i]){
                                        start = Math.min(start,i);
                                        end = Math.max(end,i);
                              }
                    }
                    return (end-start > 0 ? end - start + 1 : 0);

          }
}