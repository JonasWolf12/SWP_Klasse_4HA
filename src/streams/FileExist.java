package streams;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileExist {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\User\\Desktop\\test2.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("Die Datei existiert.");
		}else {
			System.out.println("Die Datei existiert nicht.");
		}
		
		
		//File file2 = new File("C:\\Users\\User\\Desktop\\RandomFolder");
		
		for(int i = 0; i <=10; i++) {
			File file3 = new File("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			file3.createNewFile();
			
		}
		
		//erstellt 10 Dateien mit 0 bis 10 untereinander jenach datei
		for(int i =0; i <=10; i++) {
			FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			for(int j =0; j <=i; j++) {
				writer.write(""+j+"\n");
			
			}
			writer.close();
		}
		
		
		
		File file4 = new File("C:\\Users\\User\\Desktop\\RandomFolder");
		file4.delete();
		
		
		
		
	}

}
