package question08;

public class Student풀이 {
	public String name="";
	public int number =0;
	public String department=""; // alt shift s getters and setter
	
	@Override
	public String toString() {
		return "이름:"+name+"\n학번:"+number+"\n소속:"+department;
	}
		public void setName(String name) {
			this.name =name;
		}
	public String getName() {
		return this.name;
	}
	public void setDepartment(String department) {
		this.department =department;
	}
	
	public String getdepartment() {
		return this.department;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number =number;
	}
	
		
	}


