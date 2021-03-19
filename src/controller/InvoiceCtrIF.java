package controller;

import java.util.List;

import db.DataAccessException;
import model.Invoice;

public interface InvoiceCtrIF {

	List<Invoice> findAll() throws DataAccessException;

	Invoice findByInvoiceNo(int no) throws DataAccessException;

}