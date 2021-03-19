package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

import controller.ProductCtr;
import db.DataAccessException;
import model.Product;
import java.util.List;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductMenu extends JFrame {

	JFrame frame;
	private JTextField textFieldSearch;
	private JTable table;
	private JScrollPane scrollPane;
	private ProductTableModel ptm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductMenu window = new ProductMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 * @throws DataAccessException 
	 */
	public ProductMenu() throws DataAccessException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws DataAccessException 
	 */
	private void initialize() throws DataAccessException {
		frame= new JFrame();
		frame.setTitle("ProduktMenu");
		frame.setBounds(100, 100, 991, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldSearch = new JTextField();
		textFieldSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		textFieldSearch.setBounds(787, 11, 138, 30);
		frame.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 955, 478);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		init();
	}
	
	private void init() throws DataAccessException {
		fillTable();
	}

	private void fillTable() throws DataAccessException {
		ptm = new ProductTableModel();
		this.table.setModel(ptm);
		List<Product> data = new ProductCtr().findAll();
		ptm.setData(data);
	}
}
