package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Invoice;
import model.SaleOrder;

public class InvoiceDB implements InvoiceDBIF {
	private static final String selectAllQ = 
			"select invoiceNo, paymentDate, amount description from groups";
	private static final String selectByIDQ = 
			selectAllQ + " where id = ?";
	private PreparedStatement selectAll; 
	private PreparedStatement selectByID;
	
	public InvoiceDB() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		selectByID = DBConnection.getInstance().getConnection()
				.prepareStatement(selectByIDQ);
	}
	
	@Override
	public List<Invoice> findAll() throws DataAccessException  {
		try {
			ResultSet rs = selectAll.executeQuery();
			List<Invoice> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException(e, "Could not find all");
			throw he;
		}
	}

	@Override
	public Invoice findByInvoiceNo(int no) throws DataAccessException {
		try {
			selectByID.setInt(1, no);
			ResultSet rs = selectByID.executeQuery();
			Invoice i = null;
			if(rs.next()) {
				i = buildObject(rs);
			}
			return i;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not find by id = " + no);
		}
	}

	private Invoice buildObject(ResultSet rs) throws SQLException {
		Invoice i = new Invoice(
				rs.getString("invoiceNo"),
				rs.getInt("amount"),
				((SaleOrder) rs)
				
				);
		return i;
	}

	private List<Invoice> buildObjects(ResultSet rs) throws SQLException {
		List<Invoice> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}

}


