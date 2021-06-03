package w1_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultiplierTestFile {
	public static void main(String[] args) {

		String className = "OptimizedMultiplierTest";
		if(args.length > 0) {
			className = args[0];
		}

		String fileName = "files/BigIntTestInputs.txt";
		File testFile = new File(fileName);

		if(testFile.exists()) {
			
			try {
				
				String fileHeader = "import static org.junit.Assert.*;\n" +
						"import org.junit.Test;\n\n" +
						"public class "+ className + " {\n\n";
				Scanner lineScanner = new Scanner(testFile);
				int count = 1;
				while(lineScanner.hasNextLine()) {
					String line = lineScanner.nextLine();
					//System.out.println(line);
					Scanner dataScanner = new Scanner(line);
					dataScanner.useDelimiter(",");
					String val1 = dataScanner.next();
					String val2 = dataScanner.next();
					
					System.out.println(val1 + "\t" + val2);
				
					String testCase = 	"@Test\n"+
						"public void test"+count+"() {\n"+
						"\tfail(\"Not yet implemented\");\n }\n\n}";

				System.out.println(testCase);
						count++;
				}
				
				lineScanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} else {
			System.out.println("Cannot find file " + fileName);
		}
	}

}
