package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("datei.txt"));
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

}
