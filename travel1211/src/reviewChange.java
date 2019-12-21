

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Database.reviewdate;
import java.awt.Color;

public class reviewChange extends JFrame {

	private JPanel contentPane;
	private JTextField posttitle;
	private JTextField postcontents;
	static String driver, url;
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	private JTextField textField;
	static long count = 0;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */

	public reviewChange() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9AC\uBDF0 \uC218\uC815");
		lblNewLabel.setBounds(12, 22, 288, 45);
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uB9AC\uBDF0 \uC81C\uBAA9");
		label.setBounds(12, 77, 288, 45);
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uB9AC\uBDF0 \uB0B4\uC6A9");
		label_1.setBounds(12, 156, 288, 45);
		label_1.setFont(new Font("굴림", Font.PLAIN, 15));
		contentPane.add(label_1);
		
		posttitle = new JTextField();
		posttitle.setBounds(12, 113, 636, 33);
		contentPane.add(posttitle);
		posttitle.setColumns(10);
		
		postcontents = new JTextField();
		postcontents.setBounds(12, 193, 636, 173);
		postcontents.setColumns(10);
		contentPane.add(postcontents);
		
		JButton reviewRe = new JButton("\uC218\uC815\uD558\uAE30");
		reviewRe.setBounds(426, 376, 105, 33);
		reviewRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == reviewRe) {
				try {
					reviewdate.query("update", "update review set password = '"+textField.getText()+"', posttitle = '"+posttitle.getText()+"', postcontents='"+postcontents.getText()+"' where password = '"+textField.getText()+"'");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//System.out.println("새항목 수정완료");
				textField_1.setText("수정 성공");
				posttitle.setText("");
				postcontents.setText("");
				}
			}
		});
		contentPane.add(reviewRe);
		
		JButton reCancel = new JButton("\uB3CC\uC544\uAC00\uAE30");
		reCancel.setBounds(543, 418, 105, 33);
		 reCancel.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  reviewList rL = new reviewList();
				  rL.setVisible(true);
				  dispose();
			  }
		  });
		contentPane.add(reCancel);
		
		JButton reviewLo = new JButton("\uBD88\uB7EC\uC624\uAE30");
		reviewLo.setBounds(551, 88, 97, 23);
		reviewLo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewdate.dbConnect();
				String password = textField.getText();
				
				
				String sql = "select * from review where password like '" + password + "'" ;
				
				try {
					
					rs = stmt.executeQuery(sql);
					if(rs.next()) {
						if(password.equals(rs.getString("password"))) {
							posttitle.setText(rs.getString("posttitle"));
							postcontents.setText(rs.getString("postcontents"));
							
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(reviewLo);
		
		textField = new JPasswordField();
		textField.setBounds(433, 89, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton reviewDel = new JButton("\uB9AC\uBDF0 \uC0AD\uC81C");
		reviewDel.setBounds(543, 376, 105, 33);
		reviewDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewdate.dbConnect();
				
				String password1 = textField.getText();
				String posttitle1 = posttitle.getText();
				String postcontents1 = postcontents.getText();
				
				String sql = "delete from review where password = '" + password1 + "'" ;
				
				try {
					
					//rs = stmt.executeQuery(sql);
					stmt.executeUpdate(sql);
					textField_1.setText("삭제 성공");
					
					 textField.setText("");
					 posttitle.setText("");
					 postcontents.setText("");
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(reviewDel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 430, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638\uC785\uB825");
		lblNewLabel_1.setBounds(451, 72, 98, 20);
		contentPane.add(lblNewLabel_1);
	}
}
