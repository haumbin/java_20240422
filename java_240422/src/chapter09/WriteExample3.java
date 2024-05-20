package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
	OutputStream os = new FileOutputStream("d:/output3.txt"); // upcasting
	byte[] data ="DEF".getBytes();
//	os.write(data);
	os.write(data, 1, 2); //EF: 인덱스 1에서 2글자 D : 0 E:1 F:2
	os.flush(); //확인사살, 재전송, 인터넷이 불안정한 상태에서 네트워크 끊겼을 때 전송되지 못한 데이터를 보낸다.
	
	
	os.close();
	}
}
