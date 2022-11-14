package FirstJavaPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:\\Kiran\\Personal Docs\\SeleniumSampleFile.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("This is a new line");
		bw.write("Selenium Practice");
		bw.write("For writing to new line");
		bw.write("Done.");
		bw.close();
		System.out.println("Finished!!!");
}
	}
