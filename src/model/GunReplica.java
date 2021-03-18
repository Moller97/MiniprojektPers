package model;

public class GunReplica extends Product {
private String calibre;
private String material;
	
public GunReplica(String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockStorage, int productNo, int stockAmount, String storageName, String calibre, String material) {
super(productName, purchasePrice, salesPrice, rentPrice, countryOfOrigin, stockStorage, productNo, stockAmount, storageName);
this.calibre = calibre;
this.material = material;

}

public String getCalibre() {
	return calibre;
}

public void setCalibre(String calibre) {
	this.calibre = calibre;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public String printProductGunReplica() {
	return "\nProdukt navn: " + getProductName() + "\nKøbspris " + getPurchasePrice() + "\nSlagspris " + getSalesPrice() + "\nLejepris" + getRentPrice() + "\nOprindelsesland: " + getCountryOfOrigin() + "\nAntal tøj på dette lager: " + getStorageName() + getStockStorage() + "\nProduktNummer: " + getProductNo() + "\nAntal af tøj i alt: " + getStockAmount() + "\nKlaiber: " + getCalibre() + "\nMateriale: " + getMaterial();

}

}
