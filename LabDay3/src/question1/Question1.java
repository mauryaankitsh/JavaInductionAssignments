package question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Question1 {
	
	public static void main(String[] args) {
		try {
			FileInputStream filestream=new FileInputStream(new File("data.txt"));
			int str;
			while((str=filestream.read())!=-1)
			{
				System.out.print((char)str);
			}
			
			System.out.println("-----------------");
			System.out.println("now rading in formatted stream");
			filestream.close();
			filestream=new FileInputStream(new File("data.txt"));
			PrintStream ps=new PrintStream(System.out);
			while((str=filestream.read())!=-1)
			{
				ps.print((char)str);
			}
			ps.flush();
			ps.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
