package Day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ReadingTxtFile {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("C:\\Users\\wasim\\Desktop\\Documents\\Text123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("welcome to the course of java");
		bw.newLine();
		bw.write("this is advance level course");
		
		bw.close();
		System.out.println("Finished!!!!");
	}

}
