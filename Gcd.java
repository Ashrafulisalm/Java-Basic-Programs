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
public class Gcd {
    public static void main(String[] args) throws IOException{
    int n1=0,n2=0,gcd=0;
    String s,s1;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("Enter two number:");
    s=br.readLine();
    s1=br.readLine();
    n1=Integer.valueOf(s);
    n2=Integer.valueOf(s1);
    while(n2!=0){
        gcd=n1%n2;
        n1=n2;
        n2=gcd;
        }
    System.out.println("GCD is:"+n1);
    
    }
}
