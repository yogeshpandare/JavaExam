import java.io.FileReader;
import java.io.FileWriter;

public class ClosingTest {

	public static void main(String[] args) throws Exception{
		 try(FileReader fr = new FileReader("c:\\temp\\license.txt");             FileWriter fw = new FileWriter("c:\\temp\\license2.txt") )         {             int x = -1;             while( (x = fr.read()) != -1){                 fw.write(x);             }         }

	}

}
