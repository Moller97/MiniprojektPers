package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Supplier;

public class SupplierDB implements SupplierDBIF {
	private static final String selectAllQ = 
			"select id, phone,name, address, country, email description from groups";
	private static final String selectByIDQ = 
			selectAllQ + " where id = ?";
	private PreparedStatement selectAll; 
	private PreparedStatement selectByID;
	
	public SupplierDB() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		selectByID = DBConnection.getInstance().getConnection()
				.prepareStatement(selectByIDQ);
	}
	
	@Override
	public List<Supplier> findAll() throws DataAccessException  {
		try {
			ResultSet rs = selectAll.executeQuery();
			List<Supplier> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException(e, "Could not find all");
			throw he;
		}
	}

	@Override
	public Supplier findBySupplierId(int id) throws DataAccessException {
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			Supplier s = null;
			if(rs.next()) {
				s = buildObject(rs);
			}
			return s;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not find by id = " + id);
		}
	}

	private Supplier buildObject(ResultSet rs) throws SQLException {
		Supplier s = new Supplier(
				rs.getString("id"),
				rs.getString("phone"),
				rs.getString("name"),
				rs.getString("address"),
				rs.getString("country"),
				rs.getString("email")
				
				);
		return s;
	}

	private List<Supplier> buildObjects(ResultSet rs) throws SQLException {
		List<Supplier> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}

}

}
