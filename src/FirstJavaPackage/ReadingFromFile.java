package FirstJavaPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String args[]) throws IOException {
		
		FileReader fr = new FileReader("D:\\Kiran\\Personal Docs\\SKK_Cover_Letter_Contents.txt");
		
		/*
		 * BufferedReader br = new BufferedReader(fr); String str; while((str =
		 * br.readLine())!=null) { System.out.println(str); }
		 */
		
		// or File fr = new File("D:\\Kiran\\Personal Docs\\SKK_Cover_Letter_Contents.txt");
		Scanner sc = new Scanner(fr);
		
		/*
		 * while(sc.hasNextLine()) { System.out.println(sc.nextLine());
		 * 
		 * }
		 */
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}
}
