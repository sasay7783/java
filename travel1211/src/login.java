import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Database.traveldate;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private static JTextField id;
	private static JPasswordField pwd;
	public static String userid = null;
	public static String userpwd = null;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(181, 159, 341, 63);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(61, 214, 137, 63);
		contentPane.add(label);
		
		id = new JTextField("");
		id.setColumns(10);
		id.setBounds(210, 232, 228, 27);
		contentPane.add(id);
		
		pwd = new JPasswordField();
		pwd.setColumns(10);
		pwd.setBounds(210, 288, 228, 27);
		contentPane.add(pwd);
		
		JLabel label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(61, 269, 137, 63);
		contentPane.add(label_1);
		
		JButton newUser = new JButton("\uD68C\uC6D0\uAC00\uC785");
		newUser.setBackground(new Color(0, 191, 255));
		newUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newUser u = new newUser();
				u.setVisible(true);
				dispose();
			}
		});
		newUser.setBounds(97, 371, 235, 55);
		contentPane.add(newUser);
		
		JLabel label_2 = new JLabel(new ImageIcon("ui/12311.png"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("나눔바른고딕", Font.BOLD, 26));
		label_2.setBounds(20, 0, 645, 149);
		contentPane.add(label_2);
		
		JButton end = new JButton("\uC885\uB8CC");
		end.setBackground(new Color(0, 191, 255));
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		end.setBounds(382, 371, 235, 55);
		contentPane.add(end);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.setBackground(new Color(0, 191, 255));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == login) {
				try {
					if(id.getText().equals("") || pwd.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 입력해주십시오.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
					traveldate.query("select", "select * from member");
					while(traveldate.rs.next()) {
						if(traveldate.rs.getString("id").equals(id.getText()) && traveldate.rs.getString("password").equals(pwd.getText())) {
							userid = id.getText();
							userpwd = pwd.getText();
							}
					}
					if(userid != null || userpwd != null) {
						JOptionPane.showMessageDialog(null, "로그인 성공!");
						id.setText("");
						pwd.setText("");
						dispose();
						travel t = new travel();
						t.setVisible(true);
					 }	else {
						 JOptionPane.showMessageDialog(null, "로그인 실패!", "ERROR", JOptionPane.ERROR_MESSAGE);
							}	
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				}
			}
		});
		login.setBounds(469, 232, 148, 85);
		contentPane.add(login);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(20, 148, 645, 303);
		contentPane.add(panel);
	}
}
