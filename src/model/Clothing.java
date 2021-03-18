package model;

public class Clothing extends Product {
private String size;
private String colour;

public Clothing(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockStorage, int productNo, int stockAmount, String storageName, String size, String colour) {
super(productName, purchasePrice, salesPrice, rentPrice, countryOfOrigin, stockStorage, productNo, stockAmount, storageName);
this.size = size;
this.colour = colour;

}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public String printProductClothing() {
	return "\nProdukt navn: " + getProductName() + "\nKøbspris " + getPurchasePrice() + "\nSlagspris " + getSalesPrice() + "\nLejepris" + getRentPrice() + "\nOprindelsesland: " + getCountryOfOrigin() + "\nAntal tøj på dette lager: " + getStorageName() + getStockStorage() + "\nProduktNummer: " + getProductNo() + "\nAntal af tøj i alt: " + getStockAmount() + "\nStørrelse: " + getSize() + "\nFarve: " + getColour();

}

}
