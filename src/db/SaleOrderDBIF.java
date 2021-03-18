package db;

import java.util.List;

import model.SaleOrder;

public interface SaleOrderDBIF {
	List<SaleOrder> findAll() throws DataAccessException;
	SaleOrder findByOrderId(int id) throws DataAccessException;
}