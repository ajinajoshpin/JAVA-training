public class UppTriMat {
    public static void main(String[] args) {
        int[][] ut = {{1,7,9},{0,3,11},{0,0,5}};
        int flag = 0;

        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j< i; j++)
            {
                if(ut[i][j]!=0)
                {
                    flag =1;
                    break;
                }

            }
            if(flag == 1)
            break;

        }
        if(flag ==1)
        {
            System.out.println("The matrix is not a upper triangular matrix");

        }
        else
        System.out.println("the matrix is an upper triangular matrix");
    }
    
}
