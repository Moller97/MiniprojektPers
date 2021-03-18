package model;

public class Customer {
private int customerId;
private String name;
private String address;
private int zipcode;
private String city;
private int phoneNo;

public Customer(int customerId, String name, String address, int zipcode, String city, int phoneNo) {
this.customerId = customerId;
this.name = name;
this.address = address;
this.zipcode = zipcode;
this.city = city;
this.phoneNo = phoneNo;

}
public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
    this.customerId = customerId;	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getZipCode() {
	return zipcode;
}

public void setZipCode(int zipcode) {
	this.zipcode = zipcode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
public String printCustomer() {
	return "\nKundens navn: " + getName() + "\nKundens addresse: " + getAddress() + "\nKundens postkode: " + getZipCode() + "\nKundens by: " + getCity() + "\nKundens telefonnummer: " + getPhoneNo() + "\nKundens id: " + getCustomerId();
}

}
