package BiFunctional;

import java.util.function.BiFunction;

public class AS {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f =
				(x,y) -> 2 * x - y;
				System.out.println(f.apply(6, 3));

	}

}
