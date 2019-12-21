import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Database.reviewdate;
import Database.traveldate;
import javax.swing.UIManager;

public class main extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
					reviewdate.dbConnect();	
					traveldate.dbConnect();	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("ui/12311.png"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(101, 28, 490, 148);
		contentPane.add(lblNewLabel);
		
		JButton Login = new JButton("\uB85C\uADF8\uC778");
		Login.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 16));
		Login.setBackground(new Color(0, 191, 255));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login l = new login();
				l.setVisible(true);
				dispose();
			}
		});
		Login.setBounds(220, 186, 264, 73);
		contentPane.add(Login);
		
		JButton newUser = new JButton("\uD68C\uC6D0\uAC00\uC785");
		newUser.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 16));
		newUser.setBackground(new Color(0, 191, 255));
		newUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newUser u = new newUser();
				dispose();
				u.setVisible(true);
			}
		});
		newUser.setBounds(220, 285, 264, 73);
		contentPane.add(newUser);
		
		JButton end = new JButton("\uC885\uB8CC");
		end.setFont(new Font("³ª´®¹Ù¸¥°íµñ", Font.PLAIN, 16));
		end.setBackground(new Color(0, 191, 255));
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		end.setBounds(220, 378, 264, 73);
		contentPane.add(end);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
