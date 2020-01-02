/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;
import java.io.*;
/**
 *
 * @author asus
 */
public class Prime {
    public static void main(String[] args){
    String s;
    int i,j;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("Enter the range of prime number:");
    try{
        s=br.readLine();
        int N=Integer.valueOf(s);
        for(i=2;i<N;i++){
            for(j=2;j<=i;j++){
                if(i%j==0)
                    break;
                }
                if(i==j)
                    System.out.print(i+" ");
            }
        
        } catch(Exception e){ }
    }
}
