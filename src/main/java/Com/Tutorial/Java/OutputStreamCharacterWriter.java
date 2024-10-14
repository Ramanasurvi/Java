package Com.Tutorial.Java;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStream; 
import java.io.OutputStreamWriter;

public class OutputStreamCharacterWriter {

	public static void main(String[] args) throws IOException {
		
/*
 * Writer is used to write character streams
 * OutputStream is used to write byte streams	
 * OutputStreamWriter is used to convert convert character stream to byte stream (encoding) to write to files or storage.
 * FileWriter is used to write character stream data to file
 * BufferedWriter is used to write character streams in buffered manner to files efficiently
 */
	
		//OutputStreams writes Byte Streams
//		OutputStream os = System.out;
//		os.write(99); // prints character code of 99
//		os.write(10);
		
		
		// converting character stream to byte stream (encoding) and write to console (System.out)
//		try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//			
//			osw.write("hello world");
//			osw.write(97); // prints character code of 97 that is a
//			osw.write(10); // prints character code of 10 that is a new line
//			osw.write('a'); // prints character as character
//			osw.write('\n');
//			osw.write('A'); // print character as character
//			osw.write('\n'); // prints character code of \n that is a space
//			char[] c="hello world".toCharArray();
//			osw.write(c);
//		}
//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		// write data to a file note.txt using FileWriter. Filewriter used to write text (characters) to files
//		try(FileWriter osw = new FileWriter("src/main/resources/note.txt",true)){
//			
//			osw.write(", this is appended");
//			System.out.println("written data to file");
//			
//		}
//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/note.txt",false))){
			
			bw.write("ah nannagaru");
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
