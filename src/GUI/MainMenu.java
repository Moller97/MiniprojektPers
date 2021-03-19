package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import db.DataAccessException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame Mainmenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.Mainmenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mainmenu = new JFrame();
		Mainmenu.setTitle("HovedMenu");
		Mainmenu.setBounds(100, 100, 750, 489);
		Mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainmenu.getContentPane().setLayout(null);
		
		JButton Product = new JButton("ProduktMenu");
		Product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductMenu productMenu = null;
				try {
					productMenu = new ProductMenu();
				} catch (DataAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    productMenu.frame.setVisible(true);
			    Mainmenu.dispose();
			}
		});
		Product.setBounds(227, 168, 134, 23);
		Mainmenu.getContentPane().add(Product);
		
		
		JButton Order = new JButton("OrdreMenu");
		Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderMenu orderMenu = new OrderMenu();
				orderMenu.frame1.setVisible(true);
				Mainmenu.dispose();
			}
		});
		Order.setBounds(371, 168, 134, 23);
		Mainmenu.getContentPane().add(Order);
		
		
		JButton Customer = new JButton("KundeMenu");
		Customer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerMenu customerMenu = new CustomerMenu();
				customerMenu.frame2.setVisible(true);
				Mainmenu.dispose();
			}
		});
		Customer.setBounds(227, 202, 134, 23);
		Mainmenu.getContentPane().add(Customer);
		
		JButton BTSupplierMenu = new JButton("Leverand\u00F8rMenu");
		BTSupplierMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SupplierMenu suppliermenu = new SupplierMenu();
				suppliermenu.frame3.setVisible(true);
				Mainmenu.dispose();
			}
		});
		BTSupplierMenu.setBounds(371, 202, 134, 23);
		Mainmenu.getContentPane().add(BTSupplierMenu);

}
}