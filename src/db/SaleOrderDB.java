package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SaleOrder;

public class SaleOrderDB implements SaleOrderDBIF {
	private static final String selectAllQ = 
			"select date, deliveryStatus, deliveryDate, orderId, customerNo, invoiceNo, orderLineId from groups";
	private static final String selectByIDQ = 
			selectAllQ + " where id = ?";
	private PreparedStatement selectAll; 
	private PreparedStatement selectByID;
	
	public SaleOrderDB() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		selectByID = DBConnection.getInstance().getConnection()
				.prepareStatement(selectByIDQ);
	}
	
	@Override
	public List<SaleOrder> findAll() throws DataAccessException  {
		try {
			ResultSet rs = selectAll.executeQuery();
			List<SaleOrder> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException(e, "Could not find all");
			throw he;
		}
	}

	@Override
	public SaleOrder findByOrderId(int id) throws DataAccessException {
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			SaleOrder so = null;
			if(rs.next()) {
				so = buildObject(rs);
			}
			return so;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not find by id = " + id);
		}
	}

	private SaleOrder buildObject(ResultSet rs) throws SQLException {
		SaleOrder so = new SaleOrder(
				rs.getInt("customerNo"),
				rs.getInt("invoiceNo"),
				rs.getInt("orderId"),
				rs.getString("deliveryStatus"),
				rs.getString("deliveryDate")
				);
				return so;
	}

	private List<SaleOrder> buildObjects(ResultSet rs) throws SQLException {
		List<SaleOrder> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}

}


