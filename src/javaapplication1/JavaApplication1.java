/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
 // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
 // Retrieving
        System.out.println(numbers.get(0));
  System.out.println("nIteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
           // Removing items (careful!)
            Integer remove = numbers.remove(numbers.size() - 1);
            // This is VERY slow
        numbers.remove(0);
 
        System.out.println("nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
                   // List interface ...
        List<String> values = new ArrayList<String>();
 
        }
        }
 
    }
}
