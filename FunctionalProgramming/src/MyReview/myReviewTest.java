package MyReview;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class myReviewTest {
//	public static void main(String[] args) {
//		System.out.print(
//		IntStream.range(1, 20)
//		.skip(10)
//		.sum());
//		
	
	public static void main(String[] args) {
//		IntStream ones = IntStream.generate(() -> 1).distinct();
//		IntStream zeroToNinetyNine =
//				IntStream.range(0, 100);
		Stream<Double> randoms =
				Stream.generate(Math::random).limit(100)
				.skip(99);


		randoms.forEach(System.out::println);	
}

	}


