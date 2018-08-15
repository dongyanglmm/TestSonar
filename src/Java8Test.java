import java.util.Arrays;

public class Java8Test {

	public static void main(String[] args) {
		Arrays.asList("a", "b", "c").forEach((String e) -> System.out.println(e));

		String separator = ",";
		Arrays.asList("a", "b", "c").forEach(
				(String e) -> System.out.print(e + separator)
		);
		
		Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));
		
	}

}
