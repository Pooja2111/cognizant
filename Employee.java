package Employee;

public class Employee {
	int empId, empSalary;
	Address address;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary + ", address=" + address + ", empName=" + empName
				+ ", empLocation=" + empLocation + "]";
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	String empName, empLocation;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public Employee() {

	}

	public Employee(int empId, int empSalary, String empName, String empLocation, Address address) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.empLocation = empLocation;
		this.address = address;
	}
	/*
	 * public static void main(String args[]) { Employee e=new Employee();
	 * e.setEmpId(1 ); e.setEmpLocation(" Hyderabad");
	 * e.setEmpName(" PoojaPrakash"); e.setEmpSalary(338000); e.getEmpId();
	 * e.getEmpLocation(); e.getEmpName(); e.getEmpSalary();
	 * System.out.println(empId+""+" "+empSalary+""+empName+""+empLocation); }
	 */
}