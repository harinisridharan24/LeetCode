/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

/**
 *
 * @author harini kumar
 */
public class MainClass {
     public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.i);
    }
}
    class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
        System.out.println("i1:" +i);
    }
 
    {
        i = i++ + ++i;
        System.out.println("i2:" +i);
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
        System.out.println("i3:" +i);
    }
 
    {
        i = ++i + i++;
        System.out.println("i4:" +i);
    }
}
 
