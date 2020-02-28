package infinteStream;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		
	Stream<Integer> myIntStream = Stream.of(12,3,56,24,34,98,7);
	int max=myIntStream.max(Integer::compare).get();
	  System.out.println("Max is"+" "+max);
//	  int min=myIntStream.min(Integer::compare).get();
//	  System.out.println("Min is"+" "+min);
	
  
	}

}
;