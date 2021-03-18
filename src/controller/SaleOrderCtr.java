package controller;

import java.sql.SQLException;
import java.util.List;

import db.SaleOrderDB;
import db.SaleOrderDBIF;
import db.DataAccessException;
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

}
