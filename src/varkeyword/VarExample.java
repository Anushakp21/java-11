package varkeyword;

import java.util.List;

public class VarExample {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.forEach((var name)-> System.out.println(name.toUpperCase()));
	}

}
