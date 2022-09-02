import java.util.List;
import java.util.ArrayList;



public class SpiralMatrix {
    public static void main(String[] args) {
        int m = 3,n = 4;
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},          
                          {9,10,11,12}};

        List<Integer> answer = new ArrayList<>();
        answer = spiralOrder(matrix);

        System.out.print(answer);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        // number of rows --> m and number of columns --> n
        int m  =  matrix.length;
        int n  =  matrix[0].length;
        
        int minRow = 0,maxRow = m-1;
        int minCol = 0,maxCol = n-1;
        
        int size = m*n;
        int count = 0;
        
        // traversal follows the following sequence
        // right --> traversal on the top wall 
        // down --> traversal on the right wall
        // left --> traversal on the bottom wall
        // up --> traversal on the left wall
        
        while(count <= size)
        {
            if(count == size) break;
            
            // top wall or right traversal
             for(int i = minRow,j = minCol;j <= maxCol && count < size; j++)
             {
                 list.add(matrix[i][j]);
                 count++;
             }
            minRow++;
        
            // right wall or down traversal
            for(int i = minRow,j = maxCol;i <= maxRow && (count < size); i++)
            {
                 list.add(matrix[i][j]);
                count++;
            }
            maxCol--;
            
            // bottom wall or left traversal
            for(int i = maxCol,j = maxRow;j >= minCol && count < size; j--)
            {
                list.add(matrix[i][j]);
                count++;
            }
            maxRow--;
            
            // left wall or up traversal
            for(int i = maxRow, j = minCol;i >= minRow && count < size; i--)
            {
                list.add(matrix[i][j]);
                count++;
            }
            minCol++;
        }
        return list;
    }
}
