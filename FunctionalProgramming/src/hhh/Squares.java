package hhh;

import java.util.stream.Stream;

public class Squares {
	public static void printSquares(int num) {
		Stream k=Stream.iterate(1,s->s+2).map(s->s*s).limit(num);
		k.forEach(System.out::print);
				
	}
	
	public static void Main(String[]args) {
		printSquares(5);
	}
	
}
