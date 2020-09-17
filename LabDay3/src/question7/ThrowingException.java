package question7;

import java.io.IOException;
import java.util.Random;

public class ThrowingException {
	
	public void throwException() throws IOException,InputException {
		Random rand=new Random();
		int i=rand.nextInt(2);
		if(i==0)
		{
			throw new InputException(6);
		}
		
		else{
			throw new IOException();
		}
	}

}
