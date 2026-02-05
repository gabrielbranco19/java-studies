package entities;

public class Employee {
	
	// atributos (dados)
	public String name;
	public double GrossSalary;
	public double Tax;
	
	// métodos
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		 GrossSalary += GrossSalary * (percentage/100);
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
}
