

	abstract class Foo { // Line 1
		String s = "hey";

		void m() {
		System.out.println(s);
		}
		}

		public class Test1 {
		static String s = "bye";

		public static void main(String[] args) {
		Foo foo = new Foo() {}; // Line 2
		foo.m(); // Line 3
		}
		}

