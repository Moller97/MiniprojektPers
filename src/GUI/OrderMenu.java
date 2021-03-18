package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class OrderMenu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderMenu window = new OrderMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OrderMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("OrdreMenu");
		frame.setBounds(100, 100, 511, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
