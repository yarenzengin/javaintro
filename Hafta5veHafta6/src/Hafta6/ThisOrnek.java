/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

/**
 *
 * @author Yaren
 */
public class ThisOrnek {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x+ " "+a.y);
    }
}
class A{
    int x;
    int y;
    
    
    public A(){
        this(5);
        System.out.println("1.cons.");
        
    }
    public A(int x){
        this (x,10);
        System.out.println("2.cons.");
    }

    public A(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("3.cons.");
    }
    
    
}