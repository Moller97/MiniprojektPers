package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDB implements CustomerDBIF {
	private static final String selectAllQ = 
			"select customerNo, phone, name, address, city, email, zcode from groups";
	private static final String selectByIDQ = 
			selectAllQ + " where id = ?";
	private PreparedStatement selectAll; 
	private PreparedStatement selectByID;
	
	public CustomerDB() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		selectByID = DBConnection.getInstance().getConnection()
				.prepareStatement(selectByIDQ);
	}
	
	@Override
	public List<Customer> findAll() throws DataAccessException  {
		try {
			ResultSet rs = selectAll.executeQuery();
			List<Customer> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException(e, "Could not find all");
			throw he;
		}
	}

	@Override
	public Customer findByCustomerId(int id) throws DataAccessException {
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			Customer c = null;
			if(rs.next()) {
				c = buildObject(rs);
			}
			return c;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not find by id = " + id);
		}
	}

	private Customer buildObject(ResultSet rs) throws SQLException {
		Customer c = new Customer(
				rs.getInt("customerId"),
				rs.getString("name"),
				rs.getString("address"),
				rs.getInt("zipcode"),
				rs.getString("city"),
				rs.getInt("phoneNo")
				
				);
				
		return c;
	}

	private List<Customer> buildObjects(ResultSet rs) throws SQLException {
		List<Customer> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}

}


