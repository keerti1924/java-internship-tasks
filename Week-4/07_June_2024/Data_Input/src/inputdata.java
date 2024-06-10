import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;

public class inputdata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputdata frame = new inputdata();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inputdata() {
		setTitle("Java Swing GUI Application for Data Input and Validation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 392);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(122, 99, 132, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(122, 166, 132, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnOK = new JButton("Submit");
		btnOK.setForeground(new Color(0, 128, 64));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String ageText = txtAge.getText();
				
				if(name.isEmpty() && ageText.isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Enter Valid Name and Age !!");
				} else if (name.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Name !!");
				} else if (ageText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Age !!");
				} else {
					try {
						int age = Integer.parseInt(ageText);
						if(age >= 18) {
							JOptionPane.showMessageDialog(null,name + ", You are eligible to Vote !!");
						} else {
							JOptionPane.showMessageDialog(null, name + ", You are not eligible to Vote !!");
						}
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Age !!");
					}
				}
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOK.setBounds(180, 237, 111, 45);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
			}
		});
		btnReset.setBounds(334, 237, 111, 45);
		contentPane.add(btnReset);
		
		txtName = new JTextField();
		txtName.setBounds(278, 99, 215, 23);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(278, 166, 215, 23);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Java Swing GUI Application for Data Input and Validation");
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(63, 21, 527, 35);
		contentPane.add(lblNewLabel_2);
	}
}
