/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package classobjmethod1;
class Student2{
int roll;
String name=new String();
void getdata(){
roll=101;
name="Keya";
}
void display(){
System.out.println("Name is: "+name);
System.out.println("Roll is: "+roll);
}
}

//@nd class
//Result1 class Inherite Student2 class 
class Result1 extends Student2{
    float res;
    void getdata(){
    super.getdata();
        res=87;
    }
    void display(){
    super.display();
        System.out.println("Result is: "+res);
    }
    
    } 

/**
 *
 * @author asus
 */
//Creating object of Result1 class in main method
public class Javainheritance {
    public static void main(String[] args){
    Result1 r=new Result1();
    r.getdata();
    r.display();
    
    }
}
