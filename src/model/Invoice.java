package model;


import java.util.*;

public class Invoice {

	private String invoiceNo;

	private int amount;
	
	private Date paymentDate;
	
	private SaleOrder saleOrder;
	
	public Invoice(int invoiceNo, int amount, SaleOrder saleOrder ) {
		this.invoiceNo = invoiceNo;
		this.amount = amount;
		this.saleOrder = saleOrder;
		
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		Date paymentDate = cal.getTime();
	}
		public String getinvoiceNo() {
			return invoiceNo;
		}
		public int getAmount() {
			return amount;
		}
		
		public Date getPaymentDate() {
			return paymentDate;
		}

//	public static void main(String[] args) {
//	
//	Date s = Invoice.getPaymentDate();
//		
//		
//		System.out.println(s);
//	} 
		
	
}
 	