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
public class Reverse {
    public static void main(String[] args) throws IOException{
    int i;
    String s;
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.print("Enter a number: ");
    s=br.readLine();
    i=Integer.valueOf(s);
    int temp;
    System.out.print("Reverse number is: ");
    while(i!=0){
        temp=i%10;
        System.out.print(temp);
        i=i/10;
        }
    System.out.println();
    }
}
