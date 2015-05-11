/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.util.stream.IntStream;
import javax.swing.text.Document;

/**
 *
 * @author rkhatchadourian
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 6;
        int[] numbers = new int[ARRAY_SIZE];
        
        numbers[0] = 20; //assigns 20 to the first element.
        
        //prints the first element.
        System.out.println("The first element is: " + numbers[0]);
        
        //assign the last element to be 30.
        numbers[ARRAY_SIZE - 1] = 30;
        
        //print all elements of the array using a for loop.
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(); //skip to the next line.
        
        //initialize an array of scores to 34,2,1,3.
        int[] scores = {34, 2, 1, 3};
        System.out.println("The score array is of length: " + scores.length);
       
        //print scores.
        System.out.print("The scores are: " );
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
        System.out.println();
        
        //same thing but with a for each loop.
        for (int aScore : scores) {
            System.out.print(aScore + ", ");
        }
        System.out.println();
        
        //same thing but with a stream and a lambda expression.
        IntStream.of(scores).forEach(s -> System.out.print(s + ", "));
        System.out.println();
        
        //almost the same thing but with a stream and a method reference.
        IntStream.of(scores).forEach(System.out::println);
        System.out.println();
    }
    
}
