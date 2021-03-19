package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SupplierMenu {

	JFrame frame3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierMenu window = new SupplierMenu();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SupplierMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setTitle("Leverand\u00F8rMenu");
		frame3.setBounds(100, 100, 656, 429);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
	}

}
