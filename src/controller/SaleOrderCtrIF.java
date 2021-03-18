package controller;

import java.util.List;

import db.DataAccessException;
import model.SaleOrder;

public interface SaleOrderCtrIF {

	List<SaleOrder> findAll() throws DataAccessException;

	SaleOrder findById(int id) throws DataAccessException;

}