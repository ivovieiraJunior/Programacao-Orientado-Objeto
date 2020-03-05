package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamExemplo {
	public static void main(String[] args) {
	
	List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
	//myList.stream()
		//.filter(s -> s.startsWith("c"))
		//.map(String::toUpperCase)
		//.sorted()
		//.forEach(System.out::println);
	
		for(String m: myList) {
			if(m.contains("c")) {
				System.out.println(m.toUpperCase());
			}
		}
		Collections.sort(myList);
		System.out.println(myList);
	
	}
}
