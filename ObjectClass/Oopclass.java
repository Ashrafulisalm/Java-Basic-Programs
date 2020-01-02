/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;
import java.io.*;
/**
 *^
 * @author asus101
 * 
 */
public class Oopclass {
    public static void main(String[] args) throws IOException{
    Student s=new Student();
    s.getdata();
    s.display();
    int z=s.sum(10,20);
    System.out.println("The sum Is: "+z);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a;
      String s1;
      System.out.println("Enter a number for factorial: ");
      s1=br.readLine();
      a=Integer.parseInt(s1);
    Classcreate c=new Classcreate();
        int fa = c.factorial(a);
    System.out.println("Factorial: "+fa);
   
    }
}
