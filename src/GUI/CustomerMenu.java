package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CustomerMenu extends JFrame {

     JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu window = new CustomerMenu();
					window.frame2.setVisible(true);
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
		frame2 = new JFrame();
		frame2.setTitle("KundeMenu");
		frame2.setBounds(100, 100, 630, 410);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
