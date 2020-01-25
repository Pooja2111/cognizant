package Employee;

public class WageEmployee extends Employee {
	int hours;
	@Override
	public String toString() {
		return "WageEmployee [hours=" + hours + ", numbers=" + numbers + ", address=" + address + ", empId=" + empId
				+ ", empSalary=" + empSalary + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}
	int numbers;
	Address address;
	
		
	public WageEmployee(int empId, int empSalary, String empName, String empLocation,Address address,int hours,int numbers) {
		super(empId, empSalary, empName, empLocation,address);
		// TODO Auto-generated constructor stub
		this.numbers=numbers;
		this.hours=hours;
	}
    public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getNumbers() {
		return numbers;
	}
    public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
   int calculate()
   {
	   return empSalary*hours*numbers;
   }
}
