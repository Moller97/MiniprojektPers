package model;
import java.util.ArrayList;
import java.util.Calendar;

public class SaleOrder {

	private int customerNo;
	private int invoiceNo;
	private int iD;
	private String date;
	private String deliveryStatus;
	private String deliveryDate;
	private ArrayList<Product> products;
	
	
	
//	public int getID(){
//		return iD;
//	}

	public int getCustomerNo(){
		return customerNo;
	}
	
	public int setInvoiceNo(){
		return invoiceNo;	
	}
	
	public void setDate(){
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH);

        String date = day + "/" + month;

        this.date = date;
	}
	
	public String setDeliveryStatus(){
		return deliveryStatus;
	}
	
	public String setDeliveryDate(){
		return deliveryDate;
	}
	
	public void order(int iD) {
		products = new ArrayList<>();
		setID();
		
	}

	
	
}
