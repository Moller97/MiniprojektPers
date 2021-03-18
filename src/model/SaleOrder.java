package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SaleOrder {

	private int customerNo;
	private int invoiceNo;
	private int iD;
	private String deliveryStatus;
	private String deliveryDate;
	private ArrayList<Product> products;
	
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
	
	public Calendar getDate(){
		return date;
	}
	
	public String getDeliveryStatus(){
		return deliveryStatus;
	}
	
	public String getDeliveryDate(){
		return deliveryDate;
	}
	
	public void order(int iD) {
		products = new ArrayList<>();
		setID();
		
	}

	
	
}
