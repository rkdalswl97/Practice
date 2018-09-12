
public class Student {
	private String name; // 이름
	private String dept; //학과
	private String no; // 학번
	private double grade; //학점
	
	public Student(String name, String dept, String no, double grade) {
		this.name = name;
		this.dept = dept;
		this.no= no;
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}
	public String getdept(){
		return dept;
	}
	public void setno(String no) {
		this.no = no;
	}
	public String getno(){
		return no;
	}
	public void setgrade(double grade) {
		this.grade = grade;
	}
	public double getgrade(){
		return grade;
	}

}
