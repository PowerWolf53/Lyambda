package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Launcher {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		strings.add("Maxon");
		strings.add("Nikita");
		strings.add("Yana");
		strings.add("Sasa");

		strings.add("Vika");

		strings.stream().filter(s -> {
			if (s.length() == 4) {
				return true;
			} else {
				return false;
			}
		}).map(s->s.toUpperCase()).sorted((x,y)->x.compareTo(y))
		.forEach(System.out::println);

	}

}
