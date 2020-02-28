package streamConcat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StringConcat {
	
	//Returns a list of those strings which belong to just one of the two lists
	//using concat
	public static List<String> elementsInJustOne(List<String> list1, List<String> list2) {
		//implement
		

		Stream<String> s1 = list1.stream().filter(e->!list2.contains(e));
		Stream<String> s2 = list2.stream().filter(e->!list1.contains(e));
		List<String> res = Stream.concat(s1, s2).collect(Collectors.toList());
	    return res;
	}
	
	
	

	//test methods
	public static void main(String[] args) {
		testFirstMethod();
	}
	private static void testFirstMethod() {
		List<String> list1 = Arrays.asList(new String[]{"friend", "tree", "bike", "bat"});
		List<String> list2 = Arrays.asList(new String[]{"tree", "strong", "bike", "weak"});
		System.out.println("Strings occurring in just one of the two lists: " + elementsInJustOne(list1, list2));
	} }
	