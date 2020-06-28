import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOTest {

	public static void main(String[] args) {
		//try(BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))){             String line = null;             while( (line = bfr.readLine()) != null){                 System.out.println(line);             }         }catch(NoSuchFileException|IOException|AccessDeniedException e){             e.printStackTrace();         }

		/*
		 * Stream.of(0, 1, 2, 3) .forEach(i -> { if (i % 2 == 0) System.out.print(i);
		 * 
		 * }) .peek(i -> { if (i % 2 != 0) System.out.print(i); });
		 */
		
		/*
		 * Path path1 = Path.of("/a/d"); Path path2 = Path.of("");
		 * System.out.println(path1.resolve(path2));
		 */
		
		List<Integer> input = List.of(1);
		List<Integer> list = new ArrayList<>(input);
		list.stream().forEach(i -> list.add(i + 1));
		System.out.println(list);
	}

}
