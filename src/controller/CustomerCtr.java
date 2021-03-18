package controller;

import java.sql.SQLException;
import java.util.List;

import db.CustomerDB;
import db.CustomerDBIF;
import db.DataAccessException;
import model.Customer;

public class CustomerCtr implements CustomerCtrIF {
	private CustomerDBIF CustomerDB;
	
	public CustomerCtr() throws DataAccessException  {
		try {
			CustomerDB = new CustomerDB();
		} catch (SQLException e) {
			throw new DataAccessException(e, "Can't create CustomerDB");
		}
	}
	
	@Override
	public List<Customer> findAll() throws DataAccessException {
		return CustomerDB.findAll();
	}
	
	@Override
	public Customer findById(int id) throws DataAccessException {
		return CustomerDB.findByCustomerId(id);
	}

}
