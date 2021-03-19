package controller;

import java.sql.SQLException;
import java.util.List;

import db.DBConnection;
import db.SaleOrderDB;
import db.SaleOrderDBIF;
import db.DataAccessException;
import model.Invoice;
import model.OrderLine;
import model.SaleOrder;

public class SaleOrderCtr implements SaleOrderCtrIF {
	private SaleOrderDBIF SaleOrderDB;
	
	public SaleOrderCtr() throws DataAccessException  {
		try {
			SaleOrderDB = new SaleOrderDB();
		} catch (SQLException e) {
			throw new DataAccessException(e, "Can't create SaleOrderDB");
		}
	}
	
	@Override
	public List<SaleOrder> findAll() throws DataAccessException {
		return SaleOrderDB.findAll();
	}
	
	@Override
	public SaleOrder findById(int id) throws DataAccessException {
		return SaleOrderDB.findByOrderId(id);
	}
	
		
	
	public static void AddSaleOrder(OrderLine ol) throws SQLException {
		e("drop table SaleOrder");
			for(int i = 0 ; i < script.length; i++) {
			e(script[i]);
		}
	}


	private static void e(String sql) throws SQLException {
		DBConnection.getInstance().getConnection().createStatement().executeUpdate(sql);
	}
	
	private static final String[] script = {
				
			"insert into SaleOrder(Product p, amount Int, productNo Text, saleOrderId Text);",
			
	};

			
}
	



