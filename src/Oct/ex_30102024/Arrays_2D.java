package Oct.ex_30102024;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        a[0][0]=12;
        a[0][1]=20;
        a[0][2]=21;
        a[1][0]=1;
        a[1][1]=20;
        a[1][2]=23;
        a[2][0]=22;
        a[2][1]=40;
        a[2][2]=1;
        int[][] m={{1,2,3},{0,6,5},{4,5,7},{12,9,87}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
