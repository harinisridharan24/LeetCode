/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;


import static leetcode_questions.HairColor.*;

/**
 *
 * @author harini kumar
 */
public class Person {
    HairColor hairColor = BLACK;
    
    public Person() {
        
    }
    public static void main(String[] args) {
        Person peterParker = new Person();              //Aliases
        Person spiderMan = peterParker;
        
        spiderMan.hairColor = PINK;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spider Man: " + spiderMan.hairColor);
    }
}
