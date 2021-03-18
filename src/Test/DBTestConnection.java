package Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import db.ProductDB;
import db.DataAccessException;
import model.Product;

public class DBTestConnection {

	@BeforeEach
	public void setUp() throws Exception {
		DBAddProduct.cleanDB();
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAll() {
		
		try {
			List<Product> gs = new ProductDB().findAll();
			assertEquals(2, gs.size());
		} catch (DataAccessException | SQLException e) {
			fail("Couldn't do findAll on Groups");
			e.printStackTrace();
		}
	}

}
