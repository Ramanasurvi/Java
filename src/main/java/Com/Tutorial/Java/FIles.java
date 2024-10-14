package Com.Tutorial.Java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class FIles {

	public static void main(String[] args) throws IOException {
		
/*
 * Files Handling is a concept in java.io to work with files
 * File class is used to manipulate metadata of files and manipulate files like create,delete,update
 */
		
		File f = new File("src/main/resources/newfile.txt");
		f.createNewFile();

		FileWriter fw = new FileWriter("src/main/resources/newfile.txt");
		fw.write("“उद्यमेन हि सिध्यन्ति कार्याणि न मनोरथैः।");
		fw.close();

		FileReader fr = new FileReader("src/main/resources/newfile.txt");
		while (fr.ready()) {
			System.out.print((char) fr.read());
		}
		System.out.println();
		fr.close();

		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/newfile.txt"));
		while (br.ready()) {
			System.out.print(br.readLine());
		}
		br.close();
		System.out.println();

		if (f.delete()) {
			System.out.println("deleted newfile.txt");
		}

	}

}
