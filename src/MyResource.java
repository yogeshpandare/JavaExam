import java.io.IOException;

public class MyResource implements AutoCloseable{
	
		void open() {
		System.out.println("Resource opened");
		}

		String read() throws IOException {
		throw new IOException();
		}

		public void close() {
		System.out.println("Resource closed");
		}

	public static void main(String[] args) {
		try (MyResource resource = new MyResource()) {
			resource.open();
			resource.read();
			resource.close();
			} catch (Exception e) {
			System.out.println("Exception caught");
			}

	}

}
