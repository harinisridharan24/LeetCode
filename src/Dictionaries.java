/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harini kumar
 */
public class Dictionaries {
    
    public static void main(String[] args) {
        //English to spanish Dictionary
        Map<String, String> engSapnDict = new HashMap<String, String>();
        //Inserting into dictionary
        engSapnDict.put("Monday", "Lunus");
        engSapnDict.put("Tuesday", "Martes");
        engSapnDict.put("Wednesday", "Miercoles");
        engSapnDict.put("Thursday", "Jueves");
        engSapnDict.put("Friday", "Vierners");
        engSapnDict.put("Saturday", "Sabado");
        engSapnDict.put("Sunday", "Domingo");
        //retrieving from dictionary
        System.out.println(engSapnDict.get("Monday"));
        System.out.println(engSapnDict.get("Tuesday"));
        System.out.println(engSapnDict.get("Wednesday"));
        System.out.println(engSapnDict.get("Thursday"));
        System.out.println(engSapnDict.get("Friday"));
        //Print all keys
        System.out.println(engSapnDict.keySet());
        //Print all values
        System.out.println(engSapnDict.values());
        //Print out size
        System.out.println("The size of the dictionary is:" + engSapnDict.size());
        
        System.out.println();
        System.out.println();
        
        
        //Shopping list
        
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        //Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        
        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        
        
       //Key-Value pair print out
       
        System.out.println(shoppingList.toString());
        
        System.out.println(shoppingList.isEmpty());
        //remove things
        shoppingList.remove("Eggs");
        //Replace values
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        //Clear out dictionary
        
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        
        //Is Empty?
        System.out.println(shoppingList.isEmpty());
        
        
    }
}
