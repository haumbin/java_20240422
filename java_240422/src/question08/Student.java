package question08;

public class Student {
	private String Name="";
	private int Number =0;
	private String Department="";
	
	public String getName() {
		return this.Name;
	}
	public String getDepartment() {
		return this.Department;
	}
	public int getNumber() {
		return this.Number;
	}
	public void setName(String Name) {
		this.Name =Name;
	}
	public void setNumber(int Number) {
		this.Number =Number;
	}
	public void setDepartment(String Department) {
		this.Department =Department;
	}
	
	@Override
	public String toString() {
		String a = " 이름:"+Name+"\n 학번:"+Number+"\n 소속:"+Department;
		return a;
		
	}

}
