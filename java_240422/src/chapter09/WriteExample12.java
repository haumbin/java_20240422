package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample12 {
	public static void main(String[] args) throws Exception {
		
	Writer writer = new FileWriter("D:/output12.txt"); 
	char[] data = "홍길동2".toCharArray();
	
//	for (int i = 0; i < data.length; i++) {
//		writer.write(data[i]);
//	}
	
	writer.write(data);
	
	
	writer.close();
	} 
}