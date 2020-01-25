package AbstractExample;

class Engine {
	int engNo, age;
	String fuelType;

	@Override
	public String toString() {
		return "Engine [engNo=" + engNo + ", age=" + age + ", fuelType=" + fuelType + "]";
	}

	public Engine(int engNo, int age, String fuelType) {
		super();
		this.engNo = engNo;
		this.age = age;
		this.fuelType = fuelType;
	}

	public int getEngNo() {
		return engNo;
	}

	public void setEngNo(int engNo) {
		this.engNo = engNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}

class Car {
	Engine e;

	@Override
	public String toString() {
		return "Car [e=" + e + ", carNo=" + carNo + ", carModel=" + carModel + "]";
	}

	int carNo;
	String carModel;

	public Car(Engine e, int carNo, String carModel) {
		super();
		this.e = e;
		this.carNo = carNo;
		this.carModel = carModel;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}

public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(new Engine(101, 100, "Petrol"), 1234, "Benzz");
		System.out.println(c);

	}

}
