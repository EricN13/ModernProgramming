package Apples;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;



public class AppleLambdaLibrary {
	
	/**
	 * Accepts list of Apples, a color string, and a weight double
	 * 
	 * Returns a list of Apples matching the color and heavier than the weight
	 */
	public static final TriFunction<List<Apple>, String, Double, List<Apple>> RED_SPECIALS 
	= (list, colorStr, weight) 
	    -> list.stream()
	      .filter(a -> (a.getColor()==colorStr ))
	       .filter(a -> (a.getWeight() > weight))
	       .collect(Collectors.toList());


}

