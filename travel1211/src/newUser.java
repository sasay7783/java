import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Database.rankingdate;
import Database.traveldate;
import java.awt.Color;

public class newUser extends JFrame {
	private JPanel contentPane;
	private static JTextField id, name, homearea;
	private static JPasswordField pwd;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public newUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(152, 0, 369, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(150, 77, 137, 63);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(150, 150, 137, 63);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(150, 223, 137, 63);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC8FC\uAC70 \uC9C0\uC5ED");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(150, 296, 137, 63);
		contentPane.add(label_1);
		
		id = new JTextField("");
		id.setBounds(299, 93, 228, 27);
		contentPane.add(id);
		id.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setColumns(10);
		pwd.setBounds(299, 169, 228, 27);
		contentPane.add(pwd);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(299, 241, 228, 27);
		contentPane.add(name);
		
		homearea = new JTextField();
		homearea.setColumns(10);
		homearea.setBounds(299, 317, 228, 27);
		contentPane.add(homearea);
		
		JButton newcomplete = new JButton("\uC791\uC131 \uC644\uB8CC");
		newcomplete.setBackground(new Color(0, 191, 255));
		newcomplete.setBounds(73, 390, 156, 50);
		contentPane.add(newcomplete);
		newcomplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == newcomplete) {
				try {
					traveldate.query("insert", "insert into member values ('" + id.getText() + "','" + pwd.getText() + "','" + name.getText() + "','"+ homearea.getText() + "')");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("새항목 추가완료");

				id.setText("");
				pwd.setText("");
				name.setText("");
				homearea.setText("");
				}
			}
		});
		
		JButton main = new JButton("\uBA54\uC778\uD654\uBA74\uC73C\uB85C");
		main.setBackground(new Color(0, 191, 255));
		main.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main b = new main();
				b.setVisible(true);
				dispose();
			}
		});
		main.setBounds(272, 390, 156, 50);
		contentPane.add(main);
		
		JButton login = new JButton("\uB85C\uADF8\uC778 \uD654\uBA74\uC73C\uB85C");
		login.setBackground(new Color(0, 191, 255));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login l = new login();
				l.setVisible(true);
				dispose();
			}
		});
		login.setBounds(470, 390, 156, 50);
		contentPane.add(login);
	}
}
