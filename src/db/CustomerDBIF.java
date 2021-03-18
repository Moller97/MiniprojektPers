package db;

import java.util.List;

import model.Customer;


public interface CustomerDBIF {
	List<Customer> findAll() throws DataAccessException;
	Customer findByCustomerId(int id) throws DataAccessException;
}