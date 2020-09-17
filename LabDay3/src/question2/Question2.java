package question2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
	
	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=bf.readLine().toString();
			FileOutputStream fos=new FileOutputStream(new File("ques2.txt"));
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte b[]=str.getBytes();
			bos.write(b);
			System.out.println("Successfully Written to File ");
			bos.flush();
			bos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
