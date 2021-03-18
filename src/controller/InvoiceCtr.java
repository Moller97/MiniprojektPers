package controller;

import java.sql.SQLException;
import java.util.List;

import db.InvoiceDB;
import db.InvoiceDBIF;
import db.DataAccessException;
import model.Invoice;

public class InvoiceCtr implements InvoiceCtrIF {
	private InvoiceDBIF InvoiceDB;
	
	public InvoiceCtr() throws DataAccessException  {
		try {
			InvoiceDB = new InvoiceDB();
		} catch (SQLException e) {
			throw new DataAccessException(e, "Can't create InvoiceDB");
		}
	}
	
	@Override
	public List<Invoice> findAll() throws DataAccessException {
		return InvoiceDB.findAll();
	}
	
	@Override
	public Invoice findByProductNo(int no) throws DataAccessException {
		return InvoiceDB.findByInvoiceNo(no);
	}

}
