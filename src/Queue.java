/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author harini kumar
 */
public class Queue {
    
    LinkedList queue;
    
    //Making a queue
    public Queue() {
        queue = new LinkedList();
    }
    
    //Is our queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    //Return the size of our queue
    public int size() {
        return queue.size();
    }
    
    //Enqueuing an item
    public void enqueue(String n) {
        queue.addLast(n);
    }
    
    //Dequeuing an item
    
    public String dequeue() {
        return (String) queue.remove(0);
    }
    
    //Peek at the first item
    
    public String peek() {
        return (String) queue.get(0);
    }
    
    public static void main(String[] args) {
        //String queue
//        Queue stringQueue = new Queue();
//        stringQueue.enqueue("hi");
//        stringQueue.enqueue("There");
//        System.out.println(stringQueue.dequeue() + ". ");
//        System.out.println(stringQueue.dequeue() + ". ");

        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("hi");
        System.out.println(stack.pop() + ". ");
        System.out.println(stack.pop() + ". ");
        
        
        //Number Queue
//        Queue numberQueue = new Queue();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(1);
//        System.out.println("First Out: " + numberQueue.dequeue());
//        System.out.println("Peek at the item: " + numberQueue.peek());
//        System.out.println("Second Out: " + numberQueue.dequeue());
//        System.out.println("Thirsd Out: " + numberQueue.dequeue());
    }
    
}
