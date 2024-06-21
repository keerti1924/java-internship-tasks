import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class crud {

	private JFrame frame;
	private JTextField textName;
	private JTextField textEdition;
	private JTextField textPrice;
	private JTextField textBookID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crud window = new crud();
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
	public crud() {
		initialize();
		Connect();
		table_load(); 
	}

	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	private JTable table;
	
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/onlineshop","root","");
		}catch(ClassNotFoundException e){
			
		}catch(SQLException e){
			
		} 
	}
	
	public void table_load() {
		try {
			pst = conn.prepareStatement("SELECT * FROM book_shop");
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1144, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK SHOP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(426, 20, 255, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(43, 72, 422, 248);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 50, 87, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(40, 110, 87, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(40, 168, 87, 28);
		panel.add(lblNewLabel_1_2);
		
		textName = new JTextField();
		textName.setBounds(165, 54, 202, 26);
		panel.add(textName);
		textName.setColumns(10);
		
		textEdition = new JTextField();
		textEdition.setColumns(10);
		textEdition.setBounds(165, 114, 202, 26);
		panel.add(textEdition);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(165, 172, 202, 26);
		panel.add(textPrice);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,edition,price;
				
				name = textName.getText();
				edition = textEdition.getText();
				price = textPrice.getText();
				
				try {
					pst = conn.prepareStatement("INSERT INTO book_shop(name,edition,price) VALUES(?,?,?)");
					pst.setString(1, name);
					pst.setString(2, edition);
					pst.setString(3, price);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added Successfully !!");
					table_load();
					
					textName.setText("");
					textEdition.setText("");
					textPrice.setText("");
					textName.requestFocus();
				}catch(SQLException e1) {
					e1.printStackTrace();				
				}			
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(61, 341, 128, 53);
		frame.getContentPane().add(btnSave);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textEdition.setText("");
				textPrice.setText("");
				textName.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(344, 341, 121, 53);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(199, 341, 128, 53);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(43, 414, 422, 77);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Book ID");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(45, 27, 87, 28);
		panel_2.add(lblNewLabel_1_2_1);
		
		textBookID = new JTextField();
		textBookID.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
				try {
                    
                    String id = textBookID.getText();
                        pst = conn.prepareStatement("SELECT name,edition,price from book_shop where id = ?");
                        pst.setString(1, id);
                        ResultSet rs = pst.executeQuery();
                    if(rs.next()==true)
                    {
                      
                        String name = rs.getString(1);
                        String edition = rs.getString(2);
                        String price = rs.getString(3);
                        
                        textName.setText(name);
                        textEdition.setText(edition);
                        textPrice.setText(price);

                    }   
                    else
                    {
                    	textName.setText("");
                        textEdition.setText("");
                        textPrice.setText("");
                         
                    }
                } 
            
             catch (SQLException ex) {
                   
                }
				
			}
		});
		textBookID.setColumns(10);
		textBookID.setBounds(169, 27, 202, 26);
		panel_2.add(textBookID);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,edition,price,id;
                
                
                name = textName.getText();
                edition = textEdition.getText();
                price = textPrice.getText();
                id  = textBookID.getText();
                
                 try {
                        pst = conn.prepareStatement("UPDATE book_shop SET name= ?,edition=?,price=? where id =?");
                        pst.setString(1, name);
                        pst.setString(2, edition);
                        pst.setString(3, price);
                        pst.setString(4, id);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Update Successfully !");
                        table_load();
                       
                        textName.setText("");
    					textEdition.setText("");
    					textPrice.setText("");
    					textName.requestFocus();
                    }
                    catch (SQLException e1) {
                        
                        e1.printStackTrace();
                    }
                 
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(598, 438, 185, 53);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   String id;
		           id  = textBookID.getText();
		           
		            try {
		                   pst = conn.prepareStatement("DELETE FROM book_shop WHERE id =?");
		           
		                   pst.setString(1, id);
		                   pst.executeUpdate();
		                   JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");
		                   table_load();
		                  
		                   textName.setText("");
		                   textEdition.setText("");
		                   textPrice.setText("");
		                   textName.requestFocus();
		               }
		               catch (SQLException e1) {
		                   
		                   e1.printStackTrace();
		               }
		            
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(835, 438, 185, 53);
		frame.getContentPane().add(btnDelete);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Book Name", "Edition", "Price"
			}
		));
		table.setBounds(507, 77, 581, 333);
		frame.getContentPane().add(table);
	}
}
