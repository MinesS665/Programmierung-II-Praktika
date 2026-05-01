package PizzaBestellung;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JCheckBox;

public class PizzaApp {

	private JFrame frame;
	private JTextField enterName;
	JCheckBox chckbxCheese;
	JCheckBox chckbxSalami;
	JCheckBox chckbxPilze;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaApp window = new PizzaApp();
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
	public PizzaApp() {
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
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.NORTH);
		
		JLabel lblName = new JLabel("Name:");
		splitPane.setLeftComponent(lblName);
		
		enterName = new JTextField();
		splitPane.setRightComponent(enterName);
		enterName.setColumns(10);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.5);
		frame.getContentPane().add(splitPane_1, BorderLayout.SOUTH);
		
		JButton btnCancel = new JButton("Zurücksetzten");
		splitPane_1.setRightComponent(btnCancel);
		
		JButton btnOrder = new JButton("Bestellen");
		splitPane_1.setLeftComponent(btnOrder);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3,1));
		
		chckbxCheese = new JCheckBox("Extra Käse");
		panel.add(chckbxCheese);
		
		chckbxSalami = new JCheckBox("Salami");
		panel.add(chckbxSalami);
		
		chckbxPilze = new JCheckBox("Pilze");
		panel.add(chckbxPilze);
		
		btnOrder.addActionListener(e -> completeOrder());
		btnCancel.addActionListener(e -> cancelOrder());
	}
	
	void completeOrder() {
		
		String order = new String(enterName.getText() + " bestellt eine Pizza ");
		
		if (!chckbxCheese.isSelected() && !chckbxSalami.isSelected() && !chckbxPilze.isSelected()) order += "ohne Extras.";
		else {
			if (chckbxCheese.isSelected()) order += "mit Extra Käse ";
			if (chckbxSalami.isSelected()) order += "mit Salami ";
			if (chckbxPilze.isSelected()) order += "mit Pilzen." ;
		}
		
		JOptionPane.showMessageDialog(frame, order, "Bestätigung", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	void cancelOrder() {
		enterName.setText(null);
		chckbxCheese.setSelected(false);
		chckbxSalami.setSelected(false);
		chckbxPilze.setSelected(false);
	}

}
