package exceptionTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

	public String readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("The file at path " + filePath + " does not exist.");
        }

        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
        }
        return content.toString().trim();
    }
	
}
