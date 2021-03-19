package Test;

import java.sql.SQLException;

import db.DBConnection;

public class TestDataSaleOrder {
	public static void main(String[] args) throws SQLException {
		cleanDB(); 
		System.out.println("din nye data er tilføjet");
	}
	public static void cleanDB() throws SQLException {
		e("drop table Customer1");
			for(int i = 0 ; i < script.length; i++) {
			e(script[i]);
		}
	}

	private static void e(String sql) throws SQLException {
		DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
	}
	
	private static final String[] script = {
			//"create table SaleOrder (Cname varchar(255), date text, deliveryStatus text, deliveryDate text, orderId text, customerNo text, invoiceNo text, orderLineId text)",
			//"create table Customer1 (CustomerId text,name text, address text, zipcode text, city text, phonenumber text);",
			
			"instert into Customer1 values('CustomerId', 'name', 'address', 'zipcode', 'city', 'phonenumber');"
			
	};
}
