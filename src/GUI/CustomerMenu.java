package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CustomerMenu {

     JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu window = new CustomerMenu();
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
	public CustomerMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("KundeMenu");
		frame.setBounds(100, 100, 630, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
