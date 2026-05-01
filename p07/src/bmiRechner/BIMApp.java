package bmiRechner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;

public class BIMApp {

	private JFrame frame;
	private JTextField enterMass;
	private JTextField enterSize;
	private JLabel lbRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BIMApp window = new BIMApp();
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
	public BIMApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel title = new JLabel("BMI Rechner");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3,2));
		
		JLabel lbMass = new JLabel("Gewicht (kg):");
		lbMass.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lbMass);
		
		enterMass = new JTextField();
		panel.add(enterMass);
		enterMass.setColumns(10);
		
		JLabel lbSize = new JLabel("Größe (cm):");
		panel.add(lbSize);
		
		enterSize = new JTextField();
		panel.add(enterSize);
		enterSize.setColumns(10);
		
		JLabel lbBmi = new JLabel("BMI:");
		panel.add(lbBmi);
		
		lbRes = new JLabel("");
		lbRes.setForeground(new Color(56, 56, 56));
		panel.add(lbRes);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.setForeground(UIManager.getColor("Button.foreground"));
		btnBerechnen.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(btnBerechnen, BorderLayout.SOUTH);
		
		btnBerechnen.addActionListener(e -> calc());
		
		
	}
	
	public void calc() {
		double mass = Double.parseDouble(enterMass.getText());
		double size = Double.parseDouble(enterSize.getText()) / 100;
		
		double res = mass / (size * size);
		
		if (res < 18 | res > 25.5) lbRes.setForeground(Color.RED);
		else if (res > 19 && res < 24.5) lbRes.setForeground(Color.GREEN);
		else lbRes.setForeground(Color.YELLOW);
		
		lbRes.setText(String.valueOf(res));
	
	}

}

