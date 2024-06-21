import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class student {

	private JFrame frmJavaCrudApp;
	private JTextField textID;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textAddress;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
					window.frmJavaCrudApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public student() {
		initialize();
		Connect();
		table_load();
	}
	
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
		}catch(ClassNotFoundException e){
			
		}catch(SQLException e){
			
		} 
	}
	
	
	public void table_load() {
		try {
			pst = conn.prepareStatement("SELECT * FROM student_data");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCrudApp = new JFrame();
		frmJavaCrudApp.getContentPane().setBackground(SystemColor.control);
		frmJavaCrudApp.setTitle("JAVA CRUD APP");
		frmJavaCrudApp.setBounds(100, 100, 1045, 583);
		frmJavaCrudApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCrudApp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(SystemColor.control);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(36, 129, 450, 73);
		frmJavaCrudApp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(27, 26, 116, 25);
		panel.add(lblNewLabel);
		
		textID = new JTextField();
		textID.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
				try {
                    
                    String id = textID.getText();
                        pst = conn.prepareStatement("SELECT name,phone,address from student_data where id = ?");
                        pst.setString(1, id);
                        ResultSet rs = pst.executeQuery();
                    if(rs.next()==true)
                    {
                      
                        String name = rs.getString(1);
                        String phone = rs.getString(2);
                        String address = rs.getString(3);
                        
                        textName.setText(name);
                        textPhone.setText(phone);
                        textAddress.setText(address);

                    }   
                    else
                    {
                    	textName.setText("");
                    	textPhone.setText("");
                    	textAddress.setText("");
                         
                    }
                } 
            
             catch (SQLException ex) {
                   
                }
				
			}
		});
		textID.setBounds(193, 27, 195, 24);
		panel.add(textID);
		textID.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Registration Form", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(36, 231, 450, 201);
		frmJavaCrudApp.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblName.setBounds(30, 40, 116, 22);
		panel_1.add(lblName);
		
		JLabel lblPhone = new JLabel("Mobile No.");
		lblPhone.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblPhone.setBounds(30, 90, 116, 22);
		panel_1.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblAddress.setBounds(30, 138, 116, 22);
		panel_1.add(lblAddress);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(196, 39, 195, 24);
		panel_1.add(textName);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(196, 90, 195, 24);
		panel_1.add(textPhone);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(196, 142, 195, 24);
		panel_1.add(textAddress);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(520, 136, 476, 296);
		frmJavaCrudApp.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBackground(SystemColor.control);
		scrollPane.setViewportView(table);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textPhone.setText("");
				textAddress.setText("");
				textName.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(599, 459, 145, 48);
		frmJavaCrudApp.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(785, 459, 145, 48);
		frmJavaCrudApp.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Student Registration (CRUD)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(302, 38, 442, 54);
		frmJavaCrudApp.getContentPane().add(lblNewLabel_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,phone,address;
				
				name = textName.getText();
				phone = textPhone.getText();
				address = textAddress.getText();
				
				if(name.isEmpty() && phone.isEmpty() && address.isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Enter Valid Name, Mobile Number and Address !!");
				}else if (name.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Name !!");
				} else if (phone.isEmpty() && address.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Mobile Number and Address !!");
				}else if (address.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Address !!");
				} else {
					try {
						pst = conn.prepareStatement("INSERT INTO student_data(name,phone,address) VALUES(?,?,?)");
						pst.setString(1, name);
						pst.setString(2, phone);
						pst.setString(3, address);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Student Register Successfully !!");
						table_load();
						
						textName.setText("");
						textPhone.setText("");
						textAddress.setText("");
						textName.requestFocus();
					}catch(SQLException e1) {
						e1.printStackTrace();				
					}		
				}
			}	
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(36, 459, 126, 48);
		frmJavaCrudApp.getContentPane().add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,phone,address,id;
				
				name = textName.getText();
				phone = textPhone.getText();
				address = textAddress.getText();
				id = textID.getText();
				
				if(name.isEmpty() && phone.isEmpty() && address.isEmpty()){
					JOptionPane.showMessageDialog(null, "Please Enter Valid Name, Mobile Number and Address !!");
				}else {
					try {
						pst = conn.prepareStatement("UPDATE student_data SET name= ?,phone=?,address=? where id =?");
						pst.setString(1, name);
						pst.setString(2, phone);
						pst.setString(3, address);
						pst.setString(4, id);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Student Record Update Successfully !!");
						table_load();
						
						textName.setText("");
						textPhone.setText("");
						textAddress.setText("");
						textName.requestFocus();
					}catch(SQLException e1) {
						e1.printStackTrace();				
					}
				}
					
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(205, 459, 126, 48);
		frmJavaCrudApp.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,phone,address,id;
				
				name = textName.getText();
				phone = textPhone.getText();
				address = textAddress.getText();
				id = textID.getText();
		           
		           if(name.isEmpty() && phone.isEmpty() && address.isEmpty()){
						JOptionPane.showMessageDialog(null, "Please select the record !");
					}
		           else {
		        	   try {
		                   pst = conn.prepareStatement("DELETE FROM student_data WHERE id =?");
		           
		                   pst.setString(1, id);
		                   pst.executeUpdate();
		                   JOptionPane.showMessageDialog(null, "Student Record Deleted Successfully !");
		                   table_load();
		                  
		                   textName.setText("");
		                   textPhone.setText("");
		                   textAddress.setText("");
		                   textName.requestFocus();
		               }
		               catch (SQLException e1) {
		                   
		                   e1.printStackTrace();
		               }
		           }
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(360, 459, 126, 48);
		frmJavaCrudApp.getContentPane().add(btnDelete);
	}
}
