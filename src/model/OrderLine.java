package model;

public class OrderLine {

	private Product p;
	private int amount;
	private String productNo;
	private String saleOrderId;

	public OrderLine(Product p, int amount, String productNo, String saleOrderId) {
		this.p = p;
		this.amount = amount;
		this.productNo = productNo;
		this.saleOrderId = saleOrderId;
		
	}

	public Product getProduct() {
		return p;
	}

	public int getCount() {
		return amount;
	}
	public String getproductNo() {
		return productNo;
	}
public String getSaleOrderId() {
	return saleOrderId;
}
}
