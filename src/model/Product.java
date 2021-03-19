package model;

public class Product {
private String productName;
private int purchasePrice;
private int salesPrice;
private int rentPrice;
private String countryOfOrigin;
private int stockCar;
private int stockStore;
private String productNo;
private int stockAmount;
private String storageName;  

public Product(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockCar, int stockStore, String productNo, int stockAmount, String storageName) {
this.productName = productName;
this.purchasePrice = purchasePrice;
this.rentPrice = rentPrice;
this.countryOfOrigin = countryOfOrigin;
this.stockCar = stockCar;
this.stockStore = stockStore;
this.productNo = productNo;
this.stockAmount = stockAmount;
this.storageName = storageName;

}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getPurchasePrice() {
	return purchasePrice;
}

public void setPurchasePrice(int purchasePrice) {
	this.purchasePrice = purchasePrice;
}

public int getSalesPrice() {
	return salesPrice;
}

public void setSalesPrice(int salesPrice) {
	this.salesPrice = salesPrice;
}

public int getRentPrice() {
	return rentPrice;
}

public void setRentPrice(int rentPrice) {
	this.rentPrice = rentPrice;
}

public String getCountryOfOrigin() {
	return countryOfOrigin;
}

public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;

}

public int getStockCar() {
	return stockCar;
}

public void setStockCar(int stockCar) {
	this.stockCar = stockCar;
}

public int getStockStore() {
	return stockStore;
}

public void setStockStore(int stockStore) {
	this.stockStore = stockStore;
}

public String getProductNo() {
	return productNo;
}

public void setProductNo(String productNo) {
	this.productNo = productNo;
}

public int getStockAmount() {
	return stockAmount;
}

public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}

public String getStorageName() {
	return storageName;
}

public void setStorageName(String storageName) {
	this.storageName = storageName;
}

public String printProduct() {
	return "\nProdukt navn: " + getProductName() + "\nKøbspris " + getPurchasePrice() + "\nSlagspris " + getSalesPrice() + "\nLejepris" + getRentPrice() + "\nOprindelsesland: " + getCountryOfOrigin() + "\nAntal i bil: " + getStorageName() + getStockCar() + "\nAntal i butik: " + getStorageName() + getStockStore() + "\nProduktNummer: " + getProductNo() + "\nAntal i alt: " + getStockAmount();

}

}
