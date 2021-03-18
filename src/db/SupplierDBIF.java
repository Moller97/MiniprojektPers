package db;

import java.util.List;

import model.Supplier;

public interface SupplierDBIF {
	List<Supplier> findAll() throws DataAccessException;
	Supplier findBySupplierId(int id) throws DataAccessException;
}