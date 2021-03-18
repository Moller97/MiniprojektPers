package model;

public class Equipment extends Product {
private String type;
private String description;

public Equipment(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockStore, int productNo, int stockAmount, String storageName, String type, String description) {
super(productName, purchasePrice, salesPrice, rentPrice, countryOfOrigin, stockStore, productNo, stockAmount, stockAmount, storageName);
this.type = type;
this.description = description;
	
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String printProductEquipment() {
	return "\nProdukt navn: " + getProductName() + "\nKøbspris " + getPurchasePrice() + "\nSlagspris " + getSalesPrice() + "\nLejepris" + getRentPrice() + "\nOprindelsesland: " + getCountryOfOrigin() + "\nAntal tøj på dette lager: " + getStorageName() + getStockStore() + "\nProduktNummer: " + getProductNo() + "\nAntal af tøj i alt: " + getStockAmount() + "\nType: " + getType() + "\nBeskrivelse: " + getDescription();

}

}
