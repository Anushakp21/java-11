package nestedcontrol;

public class Outer {
	private static String msg="Hello Outer";
	
	static class Inner{
		void printMessage()
		{
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
//		Outer obj=new Outer();
//		Inner inner=obj.new Inner();
//		inner.printMessage();
		Inner obj=new Inner();
		obj.printMessage();
		String html = """
		        <html>
		        <body>
		        <h1>Hello, Java 17!</h1>
		        </body>
		        </html>
		        """;
		System.out.println(html);


	}

}
