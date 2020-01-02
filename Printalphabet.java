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
public class Printalphabet {
    public static void main(String[] args){
    
    int i;
    System.out.println("Alphabets are:");
    for(i=1;i<2;i++){
    char c='A';
        while(c>='A' && c<='Z'){
        System.out.print(c+"  ");
        c++;
        }
    System.out.println();
    }
}}
