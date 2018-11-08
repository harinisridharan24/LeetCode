/*
 * Copyright 2018 Harini
 * and open the template in the editor.
 */

package leetcode_questions;

/**
 * @author harini kumar
 */
public class Sample {
    void methodOfTest(int i)
    {
        System.out.println(1);
    }
 
    void methodOfTest(Integer I)
    {
        System.out.println(2);
    }
 
    void methodOfTest(Object o)
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        Sample t = new Sample();
 
        t.methodOfTest(10);
 
        t.methodOfTest(10.25);
 
        t.methodOfTest(new Double("25.25"));
    }
}
