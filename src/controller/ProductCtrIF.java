package controller;

import java.util.List;

import db.DataAccessException;
import model.Product;

public interface ProductCtrIF {

	List<Product> findAll() throws DataAccessException;

	Product findByProductNo(String no) throws DataAccessException;

}