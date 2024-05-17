package chapter07;
//T=TV, M=String
public class Product<T, M> {
	//T=TV, M=String
	//3.new TV()
	private T kind;
	//3.String model = "스마트 TV"
	private M model;
	//T=TV가 메소드의 리턴 타입
	public T getKind() {
		return kind;
	}
	//T=TV가 매개변수의 타입
	//1. Tv kind = new Tv()
	public void setKind(T kind) {
		this.kind = kind; //2. new TV()
	}
	// M=String이 메소드의 리턴타입
	public M getModel() {
		return model;
	}
	//M=String이 매개변수의 타입
	//1.String model = "스마트 TV"
	public void setModel(M model) {
		this.model = model; // 2. String model = "스마트 TV"
	}
	
	}

