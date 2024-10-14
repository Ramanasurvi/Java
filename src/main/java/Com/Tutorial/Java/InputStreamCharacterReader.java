package Com.Tutorial.Java;

import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class InputStreamCharacterReader {

public static void main(String[] args) {
	
	
/*
 * class Streams used for reading bytestreams (InputStream). ex: InputStream is = System.in; is.read();
 * class Readers used for reading character Streams (Reader). ex: Reader re = new Reader();  re.read();
 * To convert from byte stream to character streams use InputStreamReader.
 * System.in is Input Byte Stream reading from keyboard.
 * System.out is Output Stream to print on console.
 * FileReader is used to read Files in character streams.
 * BufferedReader is used to read character streams in buffered way.
 * File represents a file or directory path is used to manipulate files to delete, create or other metadata operations.
 * read() method used to read character by character.
 * readLine() method used to read Line by Line.
 */
	
// ByteStreamtoCharacterStream

//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//        System.out.print("Enter letters: ");
//        int letters;
//        while((letters=isr.read())!=-1){
//            System.out.println((char)letters);
//        }
//        System.out.println();
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

// Read simple text File each character. FileReader used to read file as
// character stream
//        try(FileReader isr = new FileReader("src/main/resources/note.txt")){
//        int letters;
//        while((letters=isr.read())!=-1){
//            System.out.println((char)letters);
//        }
//        System.out.println();
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

// using BufferedReader read bytestream System.in (keyboard) but bufferedReader
// constructor takes character Stream as argument so we should pass
// InputStreamReader to convert bytestream to character stream
//        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
//        		System.out.print("customer please input: ");
//        		System.out.println("input line is: "+br.readLine());
//        }
//        catch(IOException e) {
//        	System.out.println(e.getMessage());
//        }

// using BufferdReader read File one line at a time

try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/note.txt"))) {
	while (br.ready()) {
		System.out.println("input line is: " + br.readLine());
	}
} catch (IOException e) {
	System.out.println(e.getMessage());
}

}

}
