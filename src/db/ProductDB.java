package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDB implements ProductDBIF {
	private static final String selectAllQ = 
			"select purchasePrice, salesPrice, rentPrice, countryOfOrigin, stockAmount, stockStore, stockCar, productNo from Product";
	private static final String selectByIDQ = 
			selectAllQ + " where no = ?";
	private PreparedStatement selectAll; 
	private PreparedStatement selectByID;
	
	public ProductDB() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		selectByID = DBConnection.getInstance().getConnection()
				.prepareStatement(selectByIDQ);
	}
	
	@Override
	public List<Product> findAll() throws DataAccessException  {
		try {
			ResultSet rs = selectAll.executeQuery();
			List<Product> res = buildObjects(rs);
			return res;
		} catch (SQLException e) {
			DataAccessException he = new DataAccessException(e, "Could not find all");
			throw he;
		}
	}

	@Override
	public Product findByProductNo(String no) throws DataAccessException {
		try {
			selectByID.setString(1, no);
			ResultSet rs = selectByID.executeQuery();
			Product p = null;
			if(rs.next()) {
				p = buildObject(rs);
			}
			return p;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not find by ProductNo = " + no);
		}
	}

	private Product buildObject(ResultSet rs) throws SQLException {
		Product p = new Product(
				rs.getString("productName"),
				rs.getInt("purchasePrice"),
				rs.getInt("salesPrice"),
				rs.getInt("rentPrice"),
				rs.getString("countryOfOrigin"),
				rs.getInt("stockCar"),
				rs.getInt("stockStore"),
				rs.getString("productNo"),
				rs.getInt("StockAmount"),
				rs.getString("storageName")
				
				);
				
		return p;
	}

	private List<Product> buildObjects(ResultSet rs) throws SQLException {
		List<Product> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}

}


