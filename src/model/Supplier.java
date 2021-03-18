package model;

public class Supplier {
	private String name;
	private String address;
	private String country;
	private String phoneNo;
	private String Email;
	private String SupplierId;
	
	public Supplier(String name, String address, String country, 
			String phoneNo, String Email, String SupplierId) {
	
		this.name = name;
		this.address = address;
		this.country = country;
		this.phoneNo = phoneNo;
		this.Email = Email;
		this.SupplierId = SupplierId;
	}		
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCountry() {
		return country;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmail() {
		return Email;
	}
	public String getSupplierId() {
		return SupplierId;
	}
}
