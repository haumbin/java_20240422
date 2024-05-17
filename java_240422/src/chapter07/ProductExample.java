package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("스마트폰TV");
		
	TV tv =	product1.getKind();//new TV()
	System.out.println(tv); //chapter07.TV@1990a65e(패키지.클래스@해시코드)
	
	String tvModel = product1.getModel();
	System.out.println(tvModel );
	
	Product<Car, String> product2= new Product<>();
	product2.setKind(new Car());
	product2.setModel("디젤");
	
	Car car =product2.getKind();
	System.out.println(car);
	String carModel = product2.getModel();
	System.out.println(carModel);
	}

}
