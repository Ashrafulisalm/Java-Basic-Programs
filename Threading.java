/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package classobjmethod1;
class A extends Thread{
public void run(){
    System.out.println("Stsrting thread A.......");
for (int i=1;i<7;i=i+2){
System.out.println("Thread in A: "+i);
try{
sleep(1000);
}catch (Exception e){ } 
if(i==3){
    stop();}
}
System.out.println("Exit Thread A.");
}

}

class B extends Thread{
public void run(){
    System.out.println("Stsrting thread B.......");
for (int i=1;i<7;i=i+2){
System.out.println("Thread in B: "+i);
try{
sleep(1000);
}catch (Exception e){ } 

}
System.out.println("Exit Thread B.");
}

}
/**
 *
 * @author asus
 */
public class Threading {
    public static void main(String[] args){
    A th=new A();
    B th1=new B();
    th1.setPriority(1);
    th.start();
    th1.start();
    
    
    }
}
