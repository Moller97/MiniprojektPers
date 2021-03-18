package controller;

import java.sql.SQLException;
import java.util.List;

import db.ProductDB;
import db.ProductDBIF;
import db.DataAccessException;
import model.Product;

public class ProductCtr implements ProductCtrIF {
	private ProductDBIF ProductDB;
	
	public ProductCtr() throws DataAccessException  {
		try {
			ProductDB = new ProductDB();
		} catch (SQLException e) {
			throw new DataAccessException(e, "Can't create ProductDB");
		}
	}
	
	@Override
	public List<Product> findAll() throws DataAccessException {
		return ProductDB.findAll();
	}
	
	@Override
	public Product findByProductNo(int no) throws DataAccessException {
		return ProductDB.findByProductNo(no);
	}

}
