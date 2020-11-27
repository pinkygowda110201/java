package P4;
public class Matrix {
    static void printMatrix(int M[][], int row, int col){
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(M[i][j] + " ");
            }
        System.out.println();
    }
}
    static int [][] add(int a[][], int b[][], int size){
    int c[][]=new int[size][size];
    for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
            c[i][j]=a[i][j]+b[i][j];  
        }
    }
    return c;
}

    static int [][] multiply(int a[][], int b[][], int size){
    int d[][]=new int[size][size];
    for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
            d[i][j]=0;
            for(int k=0;k<3;k++)
            {
            d[i][j]+=a[i][k]+b[k][j];  
            }
        }
    }
    return d;
    }
public static void main(String[] args) {
    int a[][]={{1,3,4},{2,4,3},{3,4,5}};
    int b[][]={{1,3,4},{2,4,3},{1,2,4}};
    System.out.println("\nMatrix a: ");
    printMatrix(a,3,3);
    System.out.println("\nMatrix b: ");
    printMatrix(b,3,3);
    int c[][]=add(a,b,3);
    System.out.println("\nResultant addition matrix : ");
    printMatrix(c,3,3);
    int d[][]=multiply(a,b,3);
    System.out.println("\nResultant multiplication matrix : ");
    printMatrix(d,3,3);
    }
}

