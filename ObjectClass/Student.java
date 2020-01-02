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
public class Student {
  int roll;
  String name,s1,s2;
  float marks;
  //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  
  public void getdata() throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a Roll:");
    s1=br.readLine();
    roll=Integer.valueOf(s1);
    System.out.println("Enter a Name:");
    name=br.readLine();
    System.out.println("Enter Marks:");
    s2=br.readLine();
    marks=Float.valueOf(s2);
    }
   public void display(){
    System.out.println("Roll: "+roll);
    System.out.println("Name: "+name);
    System.out.println("Marks: "+marks);
    }
   //int x=30,y=20;
   public int sum(int a,int b){
   return a+b;
   }
  
}
