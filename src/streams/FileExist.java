package streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileExist {

	public static void main(String[] args) throws IOException {

	/*	File file = new File("C:\\Users\\User\\Desktop\\test2.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("Die Datei existiert.");
		}else {
			System.out.println("Die Datei existiert nicht.");
		}
	*/	
		
		File file2 = new File("C:\\Users\\User\\Desktop\\RandomFolder");
		
		for(int i = 0; i <=10; i++) {
			File file3 = new File("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			file3.createNewFile();
			
		}
		
	/*	  //erstellt 10 Dateien mit 0 bis 10 untereinander jenach datei
		for(int i =0; i <=10; i++) {
			FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			for(int j =0; j <=i; j++) {
				writer.write(""+j+"\n");
			
			}
			writer.close();
		}
	*/	
		
		for(int i =0; i <=10; i++) {
			FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			for(int j =0; j <=i; j++) {
				writer.write(""+j+"\n");
			
			}
			writer.close();
		}
		
	/*	for(int i =0; i <=10; i++) {
			FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\RandomFolder\\file"+ i + ".txt");
			for(int j =0; j <=i; j++) {
			char[] c = new char[10];
				reader.read(c);
				System.out.println(c);
			}
			reader.close();
		}
	*/
		
		
	


		        int sum = 0; // Variable zur Speicherung der Summe
		        
		        try (FileReader fileReader = new FileReader("C:\\Users\\User\\Desktop\\RandomFolder\\file0.txt")) {
		            StringBuilder numberStr = new StringBuilder();
		            int character;
		            
		            while ((character = fileReader.read()) != -1) {
		                if (character == '\n') {
		                    sum += processNumber(numberStr.toString().trim());
		                    numberStr.setLength(0);
		                } else {
		                    numberStr.append((char) character);
		                }
		            }
		            
		            // Falls die Datei nicht mit einer neuen Zeile endet
		            if (numberStr.length() > 0) {
		                sum += processNumber(numberStr.toString().trim());
		            }
		            
		        } catch (IOException e) {
		            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		        }
		        
		        System.out.println("Die Gesamtsumme aller Zahlen ist: " + sum);
		    }

		    private static int processNumber(String numberStr) {
		        try {
		            return Integer.parseInt(numberStr);
		        } catch (NumberFormatException e) {
		            System.out.println("Ungültige Zahl gefunden: " + numberStr);
		            return 0;
		        }
		    }
		

		
	/*	File file4 = new File("C:\\Users\\User\\Desktop\\RandomFolder");
		file4.delete();
		
	*/	
		
		
	}


