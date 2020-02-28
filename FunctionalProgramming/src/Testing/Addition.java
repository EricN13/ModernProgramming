package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Addition {
	public int  add(int x,int y) {
		int z=x+y;
		return z;
		
	}
	
	@Test
	void test() {
    assertEquals(4, add(2,2));
	}

}
	


