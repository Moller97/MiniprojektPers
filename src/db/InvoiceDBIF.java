package db;

import java.util.List;

import model.Invoice;

public interface InvoiceDBIF {
	List<Invoice> findAll() throws DataAccessException;
	Invoice findByInvoiceNo(int no) throws DataAccessException;
}