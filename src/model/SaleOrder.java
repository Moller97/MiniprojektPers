package model;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SaleOrder {

	private int customerNo;
	private int invoiceNo;
	private int orderId;
	private String deliveryStatus;
	private String deliveryDate;
	//private ArrayList<Product> products
	public SaleOrder(int customerNo, int invoiceNo, int orderId, String deliveryStatus, String deliveryDate) {
	this.customerNo = customerNo;
	this.invoiceNo = invoiceNo;
	this.orderId = orderId;
	this.deliveryStatus = deliveryStatus;
	this.deliveryDate = deliveryDate;
	
	}
	
	Calendar c = new GregorianCalendar();
	Date date = c.getTime();
	
//	public int getID(){
//		return iD;
//	}


		

	public int getCustomerNo(){
		return customerNo;
	}
	
	public int getInvoiceNo(){
		return invoiceNo;	
	}
	
	public Date getDate(){
		return date;
	}
	
	public String getDeliveryStatus(){
		return deliveryStatus;
	}
	
	public String getDeliveryDate(){
		return deliveryDate;
	}
	
	public int getOrderId() {
		return orderId;
		
	}

}
	

