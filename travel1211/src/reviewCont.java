
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class reviewCont extends JFrame {

	private JPanel contentPane;

	
	public reviewCont(String string) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea(string);
		textArea.setBounds(12, 10, 280, 241);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("돌아가기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewList rl = new reviewList();
				rl.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 261, 97, 40);
		contentPane.add(btnNewButton);
	}
}
