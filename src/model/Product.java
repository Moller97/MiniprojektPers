package model;

public class Product {
private String productName;
private int purchasePrice;
private int salesPrice;
private int rentPrice;
private String countryOfOrigin;
private int stockStorage;
private int productNo;
private int stockAmount;
private String storageName;  

public Product(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockStorage, int productNo, int stockAmount, String storageName) {
this.productName = productName;
this.purchasePrice = purchasePrice;
this.rentPrice = rentPrice;
this.countryOfOrigin = countryOfOrigin;
this.stockStorage = stockStorage;
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

public int getStockStorage() {
	return stockStorage;
}

public void setStockStorage(int stockStorage) {
	this.stockStorage = stockStorage;
}

public int getProductNo() {
	return productNo;
}

public void setProductNo(int productNo) {
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
	return "\nProdukt navn: " + getProductName() + "\nKøbspris " + getPurchasePrice() + "\nSlagspris " + getSalesPrice() + "\nLejepris" + getRentPrice() + "\nOprindelsesland: " + getCountryOfOrigin() + "\nAntal tøj på dette lager: " + getStorageName() + getStockStorage() + "\nProduktNummer: " + getProductNo() + "\nAntal af tøj i alt: " + getStockAmount();

}

}
