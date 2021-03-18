package model;

public class Product {
private String category;
private String productName;
private int purchasePrice;
private int salesPrice;
private int rentPrice;
private String countryOfOrigin;
private int stockStorage;
private int productNo;
private int stockAmount;
private String storage;  

public Product(String category, String productName, int purchasePrice, int salesPrice, int rentPrice, String countryOfOrigin, int stockStorage, int productNo, int stockAmount, String storage) {
this.category = category;
this.productName = productName;
this.purchasePrice = purchasePrice;
this.rentPrice = rentPrice;
this.countryOfOrigin = countryOfOrigin;
this.stockStorage = stockStorage;
this.productNo = productNo;
this.stockAmount = stockAmount;
this.storage = storage;

}

}
