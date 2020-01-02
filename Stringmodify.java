/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;
import java.io.*;
import java.lang.*;
/**
 *
 * @author asus
 */
public class Stringmodify {
    public static void main(String[] args) throws IOException{
    String s,s1,s2;
    String s3=new String(" How are You?");
    int l;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a line:");
    s=br.readLine();
    System.out.println("You entered:"+s);
    l=s.length();
    System.out.println("Length:"+l);
    char ch=s.charAt(4);
    System.out.println("Char at 4:"+ch);
    s1=s.toLowerCase();
    System.out.println("new String: "+s1);
    s2=s.toUpperCase();
    System.out.println("new String: "+s2);
    s=s.concat(s3);
     System.out.println("New String: "+s);
    }

  
}