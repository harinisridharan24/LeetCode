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
public class Node {
    Node next;
    int data;                           //Can be any datatype
    
    public Node(int newData) {
        data = newData;
        next = null;
    }
    
    public Node(int newData, Node newNode) {
        data = newData;
        next = newNode;
    }
    
    //Getters and setters
    
    public int getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setData(int newData) {
        data = newData;
    }
    
    public void setNext(Node newNode) {
        next = newNode;
    }
}
