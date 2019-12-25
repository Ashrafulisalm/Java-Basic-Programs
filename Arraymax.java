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
public class Arraymax {
    public static void main(String[] args) throws IOException {
    int i,j;
    String s[]=new String[12];
    int ar[] =new int[12];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter array values: ");
        for (i=0;i<10;i++){
            s[i]=br.readLine();
            ar[i]=Integer.valueOf(s[i]);
            
        }
        System.out.println("The value of array is: ");
        int sum[]=new int[7];
        for (i=0;i<10;i++){
            System.out.print(ar[i]+"  ");
        }
        System.out.println();
        for(i=0;i<5;i++){
        sum[i]=0;
            for(j=0+i;j<5+i;j++){
            sum[i]=sum[i]+ar[j];
            }
             System.out.println("The sum of arrey sum[i]: " +sum[i]);
       // System.out println("The sum is sum[i] :" +sum[i] );
        }
       // int l=length(sum[]);
        int max = 0;
        for(i=0;i<6;i++){
        if(sum[i]>sum[i+1]){
         int temp=sum[i];
         sum[i]=sum[i+1];
         sum[i+1]=temp;
            max=sum[i+1];
        }}
          System.out.println("Maximum is:" +max);
        
        
    
    
    }

    
}
