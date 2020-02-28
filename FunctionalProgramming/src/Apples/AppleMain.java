package Apples;

import java.util.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AppleMain {

	public static void main(String[] args) {
		Apple a1;
		//List<Apple> inventory = Arrays.asList(new Apple("red",150.0),
		List<Apple> inventory = new ArrayList<>();
		a1 =		new Apple("green", 120.0);
		inventory.add(a1);
		a1 =		new Apple ("red", 90.0);
		inventory.add(a1);
		a1 =		new Apple( "green", 200.0);
		inventory.add(a1);
		a1 = new Apple ("red", 140.0);
		inventory.add(a1);		
		a1 = new Apple("red", 160.0);
		inventory.add(a1);
		a1 = new Apple("red", 170.0);
		inventory.add(a1);
		
//		for ( Apple a : inventory)
//			System.out.println("color = " + a.color );
//		
List<Apple> redSpecial = inventory.stream()
	    .filter(a -> (a.getColor()=="red" ))
        .filter(a -> (a.getWeight() > 135.0))
	    .collect(Collectors.toList());

		//sorted - ten heaviest
	
//		List<Apple> redSpecial = inventory.stream()
//			    .filter(a -> (a.getColor()=="red" ))
//		        .filter(a -> (a.getWeight() > 135.0))
//		        .sorted((Comparator.comparing(Apple::getWeight)).reversed()).limit(10)
//			    .collect(Collectors.toList());
//	
//		//List<Apple> redSpecial = AppleLambdaLibrary.RED_SPECIALS.apply(inventory, "red", 135.0);

	System.out.println("--redSpecials");
	for ( Apple a : redSpecial)
		System.out.println("color = " + a.color + "weight = "+ a.getWeight());
	

	}

}