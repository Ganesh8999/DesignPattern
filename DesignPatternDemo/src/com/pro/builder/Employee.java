package com.pro.builder;

public class Employee {

	// All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	// All getter, and NO setter to provide immutability

	public Employee(EmployeeBuilder employeeBuilder) {

		this.firstName = employeeBuilder.firstName;
		this.lastName = employeeBuilder.lastName;
		this.age = employeeBuilder.age;
		this.phone = employeeBuilder.phone;
		this.address = employeeBuilder.address;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	int getAge() {
		return age;
	}

	String getPhone() {
		return phone;
	}

	String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class EmployeeBuilder {

		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		public EmployeeBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeBuilder address(String address) {
			this.address = address;
			return this;
		}

		// Return the finally consrcuted User object
		public Employee build() {

			Employee employee = new Employee(this);
			checkEmployee(employee);
			return employee;
		}

		private void checkEmployee(Employee employee) {
			// Do some basic validations to check
			// if user object does not break any assumption of system

		}
	}

}
