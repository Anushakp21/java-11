package stringenhancement;

public class stringenhancement {
	public static void main(String[] args) {
		String str="Hello java";
		System.out.println(str.isBlank());// String empty and whitespaces also
		System.out.println("A\nB\nC".lines().count()); //returns streams of lines
		str=" hello";
		System.out.println(str.strip());
		System.out.println(str.repeat(2));
	}

}
