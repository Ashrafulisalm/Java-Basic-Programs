/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package classobjmethod1;

/**
 *
 * @author asus
 */
public class Febonacci {
  private int fibo,f0,f1;
  Febonacci(){
  f0=0;
  f1=1;
  fibo=f0+f1;
  }
  
  void inc(){
  f0=f1;
  f1=fibo;
  }
  
  void display(){
 
  System.out.print(fibo+"  ");
  fibo=f0+f1;
  }
  
}
