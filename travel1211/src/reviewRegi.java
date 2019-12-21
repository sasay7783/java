

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Database.reviewdate;
import java.awt.Color;

public class reviewRegi extends JFrame {

	private JPanel contentPane;
	JTextField posttitle, postcontents;
	private JPasswordField password;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

//	 * Create the frame.
//	 */
	public reviewRegi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9AC\uBDF0 \uC791\uC131");
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 10, 116, 45);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uB9AC\uBDF0 \uC81C\uBAA9");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label.setBounds(12, 54, 288, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uB9AC\uBDF0 \uB0B4\uC6A9");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label_1.setBounds(12, 133, 288, 45);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 350, 99, 26);
		contentPane.add(lblNewLabel_1);
		
		password = new JPasswordField("");
		password.setBounds(66, 353, 116, 21);
		contentPane.add(password);
		password.setColumns(10);
		
		posttitle = new JTextField("");
		posttitle.setBounds(12, 90, 636, 33);
		contentPane.add(posttitle);
		posttitle.setColumns(100);
		
		postcontents = new JTextField("");
		postcontents.setColumns(500);
		postcontents.setBounds(12, 170, 636, 173);
		contentPane.add(postcontents);
		
		JButton reviewRegi = new JButton("\uB9AC\uBDF0 \uB4F1\uB85D");
		reviewRegi.setBounds(426, 376, 105, 45);
		contentPane.add(reviewRegi);
		reviewRegi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == reviewRegi) {
				try {
					reviewdate.query("insert", "insert into review values ('" + password.getText() + "','" + posttitle.getText() + "','" + postcontents.getText() + "')");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				textField.setText("¸®ºäµî·Ï ¿Ï·á");
				
				password.setText("");
				posttitle.setText("");
				postcontents.setText("");
				}
			}
		});
		
		JButton reviewCancel = new JButton("\uB3CC\uC544\uAC00\uAE30");
		 reviewCancel.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  reviewList tL = new reviewList();
				  tL.setVisible(true);
				  dispose();
			  }
		  });
		reviewCancel.setBounds(543, 376, 105, 45);
		contentPane.add(reviewCancel);
		
		textField = new JTextField();
		textField.setBounds(12, 430, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
	}
}
