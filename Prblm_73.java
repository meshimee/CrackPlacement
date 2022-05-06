import java.util.Arrays;

//73. Set Matrix Zeroes
public class Prblm_73 {
          public static void setZeroes(int [][] matrix) {   //optimised approch
                    int rows = matrix.length, cols = matrix[0].length;
                    int dummy1[]=new int[rows];
                    int dummy2[]=new int[cols];
                    Arrays.fill(dummy1,-1);
                    Arrays.fill(dummy2,-1);
                    for (int i = 0; i < rows; i++) {
                      for (int j = 0; j < cols; j++) {
                        if (matrix[i][j] == 0) {
                          dummy1[i] = 0;
                          dummy2[j] = 0;
                        }
                      }
                  
                    }
                    for (int i = 0; i < rows; i++) {
                      for (int j = 0; j < cols; j++) {
                        if (dummy1[i] == 0 || dummy2[j]==0) {
                          matrix[i][j] = 0;
                        }
                      }
                    }
          }
          public static void setZeroes_Optimised(int[][] matrix) {    //more optimised
                    int col0 = 1, rows = matrix.length, cols = matrix[0].length;
            
                    for (int i = 0; i < rows; i++) {
                        if (matrix[i][0] == 0) col0 = 0;
                        for (int j = 1; j < cols; j++)
                            if (matrix[i][j] == 0)
                                matrix[i][0] = matrix[0][j] = 0;
                    }
            
                    for (int i = rows - 1; i >= 0; i--) {
                        for (int j = cols - 1; j >= 1; j--)
                            if (matrix[i][0] == 0 || matrix[0][j] == 0)
                                matrix[i][j] = 0;
                        if (col0 == 0) matrix[i][0] = 0;
                    }
                }
          public static void setZeroes_BruteForce(int[][] matrix) {   //Brute force approch   
                int rows = matrix.length, cols = matrix[0].length;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (matrix[i][j] == 0) {
        
                            int ind = i - 1;
                            while (ind >= 0) {
                                if (matrix[ind][j] != 0) {
                                    matrix[ind][j] = -1;
                                }
                                ind--;
                            }
                            ind = i + 1;
                            while (ind < rows) {
                                if (matrix[ind][j] != 0) {
                                    matrix[ind][j] = -1;
                                }
                                ind++;
                            }
                            ind = j - 1;
                            while (ind >= 0) {
                                if (matrix[i][ind] != 0) {
                                    matrix[i][ind] = -1;
        
                                }
                                ind--;
                            }
                            ind = j + 1;
                            while (ind < cols) {
                                if (matrix[i][ind] != 0) {
                                    matrix[i][ind] = -1;
        
                                }
                                ind++;
                            }
                        }
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (matrix[i][j] <= 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }
        
            }
          
         public static void main(String[] args) {
                int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};  
                setZeroes(matrix); 
         } 
}
