package db;

import java.util.List;

import model.Product;


public interface ProductDBIF {
	List<Product> findAll() throws DataAccessException;
	Product findByProductNo(String no) throws DataAccessException;
	
}