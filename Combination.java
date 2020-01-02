/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;

/**
 *
 * @author asus
 */
public class Combination {
    public static void main(String[] args){
    int i,j;
    for(i=0;i<=8;i++){
        for(j=0;j<=i;j++){
            System.out.print("c("+i+","+j+")= ");
            System.out.print(c(i,j)+"   ");
          
            }
          System.out.println();
    }}
    
    static long c(int a,int b){
    return p(a,b)/f(b);
    }
     
    static long p(int x,int y){
    return f(x)/f(x-y);
    }
    
    static long f(int z){
    int f=1;
    while(z>1){
    f=f*z;
    z--;
    }
    return f; 
    } 
    
    

}
