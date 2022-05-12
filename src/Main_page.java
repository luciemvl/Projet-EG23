import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Main_Page {

	private JFrame frmBienvenueSurLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page window = new Main_Page();
					window.frmBienvenueSurLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBienvenueSurLa = new JFrame();
		frmBienvenueSurLa.setTitle("Bienvenue sur la page d'accueil !");
		frmBienvenueSurLa.setForeground(new Color(0, 0, 102));
		frmBienvenueSurLa.getContentPane().setForeground(new Color(51, 0, 102));
		frmBienvenueSurLa.setBackground(new Color(0, 0, 153));
		frmBienvenueSurLa.setBounds(100, 100, 450, 300);
		frmBienvenueSurLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
