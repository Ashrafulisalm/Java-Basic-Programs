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
public class factorial {
    public static void main(String[] args){
    int i,j;
    for(i=7;i>=1;i--){
        for(j=i;j>=1;j--){
            System.out.print("p("+i+","+j+")= ");
            System.out.print(p(i,j)+"   ");
            }
        System.out.println();
    }}
     
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
