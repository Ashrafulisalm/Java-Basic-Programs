/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolveProblem;
import java.io.*;

/**
 *
 * @author asus
 */
public class MatrixAdd {
    public static void main(String[] args) throws IOException{
    String s[][]=new String[2][2];
    int mat[][]=new int[2][2];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter matrix value:");
    int i,j;
    
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
        s[i][j]=br.readLine();
        mat[i][j]=Integer.valueOf(s[i][j]);
        
        }
    }
    System.out.println("Matrix is: ");
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
      System.out.print(mat[i][j]+" ");
        
        }
        System.out.println();
        
    }    
    
    int sum=0;
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
           sum=sum+mat[i][j]; 
            
        }
    }
    System.out.println("Sum of matrix is:" +sum);
    
    
    } 
    
}
