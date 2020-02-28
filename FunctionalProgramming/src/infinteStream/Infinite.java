package infinteStream;

import java.util.stream.IntStream;




public class Infinite { 
  
    // Main method 
    public static void main(String[] args) 
    { 
    	printSquares(5);
    }
  
    public static void printSquares(int num) {
      IntStream 
  
            // Iterate the IntStream with i 
            // by incrementing the value with 1 
            .iterate(1, i -> i+1) 
            .map(s->s*s)
            //we can use map to change data that is already into the stream.
            .limit(num)
            //sets the remit
  
            // Print the IntStream 
            // using forEach() method. 
            .forEach(System.out::println); 
    } }
