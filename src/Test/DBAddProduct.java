package Test;

import java.sql.SQLException;

import db.DBConnection;

public class DBAddProduct {
	public static void main(String[] args) throws SQLException {
		cleanDB(); 
		System.out.println("din nye data er tilføjet");
	}
	public static void cleanDB() throws SQLException {
		e("drop table Product");
			for(int i = 0 ; i < script.length; i++) {
			e(script[i]);
		}
	}

	private static void e(String sql) throws SQLException {
		DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
	}
	
	private static final String[] script = {
			"create table Product (Pname varchar(255), purchasePRice int, salesPrice int, rentPrice int, countryOfOrigin text, stockAmount int, stockStore int, stockCar int, productNo text)",
			
			"insert into Product values('Cowboyvest', 500, 700, 100, 'Texas', 1, 3, 5, '12345');",
			"insert into Product values('Cowboyhat', 500, 700, 100, 'Texas', 1, 3, 5, '12346');"
	};
}
