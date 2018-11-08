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
public class hanoiPuzzle {
    public static void main(String[] args) {
        towerOfHanoi tower = new towerOfHanoi();
        tower.movingDisks(3, 'A', 'B', 'C');
    }
    
}


class towerOfHanoi {
    public void movingDisks(int n, char from, char middle, char to) {
        if(n == 1) {
            System.out.println("Move the disk 1 from " + from + " to " + to);
            return;
        }
        movingDisks(n-1, from, middle, to);
        System.out.println("Move the disk " + n + " from " + from + " to " + to);
        movingDisks(n-1, middle, to, from);
    }
}