package GeneratingRandomNumber;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Generate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		   Stream s=Stream.generate(Math::random).limit(4);
			s.forEach(System.out::println);
					

		}

	}

 
