package model;


import java.util.*;

public class Invoice {

	private String invoiceNo;

	private int amount;
	
	private SaleOrder saleOrder;
	
	public Invoice(String invoiceNo, int amount, SaleOrder saleOrder ) {
		this.invoiceNo = invoiceNo;
		this.amount = amount;
		this.saleOrder = saleOrder;
		
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		Date PaymentDate = cal.getTime();
	}
		public String getinvoiceNo() {
			return invoiceNo;
		}
		public int getAmount() {
			return amount;
		}
		
		public Date getPaymentDate() {
			return PaymentDate;
		}


}
 	