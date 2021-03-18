package controller;

import java.util.List;

import db.DataAccessException;
import model.Customer;

public interface CustomerCtrIF {

	List<Customer> findAll() throws DataAccessException;

	Customer findById(int id) throws DataAccessException;

}