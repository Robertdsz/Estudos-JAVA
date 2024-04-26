package entities;

public class employee {
	private Integer Id;
	private String Name;
	private Double Salary;
	
	
	public employee() {
		
	}
	
	public employee(Integer id, String name, Double salary) {
		Id = id;
		this.Name = name;
		Salary = salary;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		Salary += Salary *percentage/100;
	}
	
	public String toString() {
		return Id + ", " + Name + ", $" + String.format("%.2f",Salary);
	}
}