package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.Product;

public class ProductTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	private List<Product> data = new ArrayList<>();
	private static final String[] NAMES = {"Name", "Købpris", "Slagspris", "Lejepris", "Oprindelsesland", "Lager1", "Antal", "Lager 2", "Antal", "produkt nr", "Leverandør-ID"};
	
	public ProductTableModel() {
		data = new ArrayList<>();
	}
	
	public void setData(List<Product> products) {
		this.data = products;
		super.fireTableDataChanged();
	}
	
	@Override
	public String getColumnName(int col) {
		return NAMES[col];
	}
	
	@Override
	public int getRowCount() { 
		System.out.println(data);
		return (data == null ? 0 :  data.size());
	}
 	
	@Override
	public int getColumnCount() {
		return NAMES.length;
	}
	
	public String getValueAt(int row, int col) {
		Product currP = data.get(row);
		switch(col) {
			case 0: return currP.getProductName();
			case 1: return "" + currP.getPurchasePrice();
			case 2: return "" + currP.getSalesPrice();
			case 3: return "" + currP.getRentPrice();
			case 4: return "" + currP.getCountryOfOrigin();
			case 5: return "" + currP.getStorageName();
			case 6: return "" + currP.getStockCar();
			case 7: return "" + currP.getStorageName();
			case 8: return "" + currP.getStockStore();
			case 9: return "" + currP.getProductNo();
			case 10: return "" + "555";
			
			
			default: return "FOO-BAR";
		}
	}

	public Product getProduct(int row) {
		return data.get(row);
	}
}
