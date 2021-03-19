package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class OrderMenu extends JFrame {

	JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderMenu window = new OrderMenu();
					window.frame1.setVisible(true);
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
		frame1 = new JFrame();
		frame1.setTitle("OrdreMenu");
		frame1.setBounds(100, 100, 511, 353);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
