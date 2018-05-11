package com.rekik.pascalstrianglejbc2018;

/*A console app for testing purposes*/
public class PascalstriangleConsole {

    public static void main(String[] args) {
        int row = 10;
        int column = 10;
        int[][] array = new int[row][column];
        int sum =0;
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){

               if(i==j){
                   array[i][j]=1;
                   System.out.println(array[i][j]+" ");
               }
               else if(j==0) {
                   array[i][j] = 1;
                   System.out.print(array[i][j] + " ");
               }
                else if(i>=2 && j>=1){
                   sum= array[i-1][j-1]+array[i-1][j];
                   array[i][j]=sum;
                   System.out.print(array[i][j]+" ");
                }

            }

        }
    }
}
