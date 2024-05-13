package question07;



public class TwoDArray풀이 {
	public static void main(String[] args) {
		int[][] intArray = new int[4][4];
		
		//intArray.length:4
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				
			intArray[i][j] =	(int)(Math.random()*10+1);
			System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
			}
	}

}

//램덤대신 맵스 사용 난 맵스사용이 잘안떠오른다.
//정방형이라서 안틀렸지 intArray[i].length란 것을 기억할 것