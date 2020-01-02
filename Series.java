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
public class Series {
    public static void main(String[] args) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    int i,s1=0,t=0;
    String s;
    System.out.println("Enter a number:");
    s=br.readLine();
    int N=Integer.valueOf(s);
    System.out.println("Sum series of factorial:");
    for(i=1;i<=N;i++){
        if(i==N){ 
        System.out.print(f(i)+" = ");}else{
    System.out.print(f(i)+" + ");}
    s1=t+f(i);
    t=s1;
    
    }
  
    System.out.print(s1);
    System.out.println();
    }
    
    static int f(int Z){
    int f=1;
        while(Z>1){
    f=Z*f;
    Z--;}
    return f;
       
    }
    
}
