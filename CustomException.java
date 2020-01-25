package com;

class InvalidAge extends Exception {
	InvalidAge(String s) {
		super(s);
	}
}

public class CustomException {
	static void check(int age) throws InvalidAge {
		if (age < 18)
			throw new InvalidAge("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check(20);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);

		}

	}

}
