/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.lang.Math;


/**
 *
 * @author asus
 */
public class Numbersystemfull {

    public static void main(String[] args) throws IOException{
    int ntc,base,index=0,index1=0,nxt,mbase,cdnum1=0;
     int num[]=new int[10];
    int cdnum[]=new int[64];
    char base16[]={'0','1','2','3','4','5', '6','7','8','9','A','B','C','D','E','F'};
    String s1,s2,mb;
    System.out.print("Enter a number to be convert:");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    s1=br.readLine();
    ntc=Integer.parseInt(s1);
     loop1:
    for(;;){
    System.out.print("Enter Main Base(2/8/10):");
    mb=br.readLine();
    mbase=Integer.parseInt(mb);
     if(mbase!=2&&mbase!=8&&mbase!=10)
           continue loop1;
       else break loop1;}
    //System.out.print(") b"+mbase);
    
    if(mbase==10){
    loop:
    for(;;){
    System.out.println("Enter the base you want to convert(2/8/16):");
    s2=br.readLine();
    base=Integer.parseInt(s2);
       if(base!=2&&base!=8&&base!=16)
           continue loop;
       else break loop;}
    
    
       while(ntc!=0){
           cdnum[index]=ntc%base;
       ++index;
           ntc=ntc/base;
       }
       
       
    index=index-1;
    System.out.print("Converted number with base "+base+" is:");
    while(index>=0){
        nxt=cdnum[index];
        System.out.print(base16[nxt]);
        --index;
        }
    
    System.out.println();}
    
    
    else if(mbase==2||mbase==8)
    { while(ntc!=0){
                    num[index1]=ntc%10;
                    num[index1]=(int) (num[index1]* Math.pow(mbase,index1));
                    index1++;
                    ntc=ntc/10;
                
                }
                index1=index1-1;
                while(index1>=0){
                cdnum1=cdnum1+num[index1];
                index1--;
                }
                
                System.out.println("Converted number from base "+mbase+ " to Decimal:"+cdnum1);
    }
    else
        System.out.println("Problem in somewhwre...");
    }
}


