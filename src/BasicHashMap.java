/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author harini kumar
 */
public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");
       
//        Single key value Retrieval
//-----------------------------------------------------------------------------------------
//        int key = 3;
//        String result = map.get(key);
//        System.out.println("Key: " + key + "  Value: " + result);

//        Using foreach loop
//-----------------------------------------------------------------------------------------
//        for(Integer keys : map.keySet()) {
//            System.out.println("Key: " + keys + "  Value: " + map.get(keys));
//        }

//        Using keyIterator and set
//-----------------------------------------------------------------------------------------
//        Set<Integer> keySet = map.keySet();
//        Iterator<Integer> keySetIterator = keySet.iterator();
//        while(keySetIterator.hasNext()) {
//            Integer key = keySetIterator.next();
//            System.out.println("Key: " + key + "  Value: " + map.get(key));
//        }
       
//        Using EntrySet
//-----------------------------------------------------------------------------------------
//        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//        for(Entry entry : entrySet) {
//            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
//        }

//        HashMapSize and clearing it
//---------------------------------------------------------------------------------------------------------
//        System.out.println("The size of the Map: " + map.size());
//        map.clear();
//        System.out.println("The size of the Map: " + map.size());
//    }

//    Checking if the map contains the key or value
//-----------------------------------------------------------------------------------------------------------
//        System.out.println("Does the map contains key of 1: " + map.containsKey(1));
//        System.out.println("Does the map contains key of 2: " + map.containsKey(1));
//        System.out.println("Does the map contains key of 3: " + map.containsKey(1));
//        System.out.println("Does the map contains Value of One: " + map.containsValue("One"));
//        System.out.println("Does the map contains Value  of two: " + map.containsValue("Two"));
//        System.out.println("Does the map contains Value of three: " + map.containsValue("Three"));
        
//        Checking if the Map is Empty
//----------------------------------------------------------------------------------------------
        boolean isEmpty = map.isEmpty();
        System.out.println("See if the map is empty: " + isEmpty);
        
//        Remove the key from the Map
//-------------------------------------------------------------------------------------------------
//        int key1 = 1;
//        int key2 = 2;
//        String value1 = "Two";
//        Object result1 = map.remove(key1);
//        Object result2 = map.remove(key2, value1);
//        System.out.println("The removed value is: " + result1);
//        System.out.println("The removed value is: " +result2);
//        System.out.println("Size: " +map.size());
        
//        Sort a Map
//------------------------------------------------------------------------------------------------
        System.out.println("Unsorted Map: " + map);
        
    }
}
