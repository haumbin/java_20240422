package question06;

public class Song풀이 {
	//필드는 보통 프라이빗 메소드는 보통 퍼블릭
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song풀이() {
		
	}
	
//	source> generate constructor using fields
		
				
	public Song풀이(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	
	 
	public  void show(){
	System.out.print(year+"년 ");
	System.out.print(country+"국적의 ");
	System.out.print(artist+"가 부른 ");
	System.out.print(title);
	}
	
	 public static void main(String[] args) {
		Song풀이 myFavorite = new Song풀이( "Dancing Queen", "ABBA",  1978, "스웨덴");
		myFavorite.show();
	}
}
