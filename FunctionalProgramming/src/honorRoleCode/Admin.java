package honorRoleCode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		
	return list.stream()
	
			.filter(s->s.getGpa()>3.0).filter(s->s.getMajor().equals("Computer Science"))
			.collect(Collectors.toList());
					

	}
	
	

	
	}
	
