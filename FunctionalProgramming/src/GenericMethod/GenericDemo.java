package GenericMethod;

import java.util.stream.Stream;

public class GenericDemo<S,U> {
	public void dispalay(S name,U address) {
		System.out.print("name"+" "+name+" "+"address"+" "+address);
	}
	//count occurence and Generics
	
	public static <T> int countOccurrences(T[] arr, T target)
	{
	return (int)Stream.of(arr)
	.filter(x -> {
	if(target == null) return (x == null);
	return target.equals(x); })
	.count();

}}
