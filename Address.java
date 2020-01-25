package Employee;

public class Address {
	int houseNumber, pinCode;
	String Street;

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", pinCode=" + pinCode + ", Street=" + Street + "]";
	}

	public Address(int houseNumber, int pinCode, String street) {
		super();
		this.houseNumber = houseNumber;
		this.pinCode = pinCode;
		Street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

}
