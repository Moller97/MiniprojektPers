package controller;

import java.util.List;
import java.sql.*;
import db.ProductDB;
import db.DBConnection;
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
	public Product findByProductNo(String no) throws DataAccessException {
		return ProductDB.findByProductNo(no);
	}
	
		
	//String query[] = {
			//"SELECT * FROM Product where ProductNo = 12345"
	

	}



