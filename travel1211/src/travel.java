
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.rankingdate;
import Database.searchdate;
import javax.swing.UIManager;

public class travel extends JFrame {

	private JPanel contentPane;
	public static String conti;
	public static String count;
	public static String area;
	public static JComboBox<String> contibox, countrybox, areabox;
	static int hits = 0;
	public boolean bUpdate = false;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public travel() {
		searchdate.dbConnectcont();
		searchdate.dbConnecteurope();
		searchdate.dbConnectamerica();
		searchdate.dbConnectafrica();
		searchdate.dbConnectasia();
		searchdate.dbConnectkorea();
		searchdate.dbConnectjapan();
		searchdate.dbConnectengland();
		rankingdate.dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uACE0\uC2F6\uC740 \uC5EC\uD589\uC9C0\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 10, 639, 69);
		contentPane.add(lblNewLabel);
		
		contibox = new JComboBox<String>();
		contibox.setBackground(Color.WHITE);
		contibox.setBounds(240, 107, 255, 36);
		contentPane.add(contibox);
		try {
			if(contibox.getSelectedItem() == null) {
				searchdate.query("select", "select * from continent");
			while(searchdate.rs.next()) {
				conti = searchdate.rs.getString("continame");
				contibox.addItem(conti);
					}
				}
			} catch (SQLException e1) {
			e1.printStackTrace();
		 }		
		
		countrybox = new JComboBox<String>();
		countrybox.setBackground(Color.WHITE);
		countrybox.setBounds(240, 194, 255, 36);
		contentPane.add(countrybox);
		contibox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bUpdate = true;
					if(contibox.getSelectedItem().equals("유럽")) {
						countrybox.removeAllItems();
						searchdate.query("select", "select * from ceurope");
						
					while(searchdate.rs.next()) {
						count = searchdate.rs.getString("countryname");
						countrybox.addItem(count);	
							}
					}
					else if(contibox.getSelectedItem().equals("아메리카")) {
						countrybox.removeAllItems();
						searchdate.query("select", "select * from camerica");
					while(searchdate.rs.next()) {
						count = searchdate.rs.getString("countryname");
						countrybox.addItem(count);	
							}
					}
					else if(contibox.getSelectedItem().equals("아프리카")) {
						countrybox.removeAllItems();
						searchdate.query("select", "select * from cafrica");
					while(searchdate.rs.next()) {
						count = searchdate.rs.getString("countryname");
						countrybox.addItem(count);	
							}
					}
					else if(contibox.getSelectedItem().equals("아시아")) {
						countrybox.removeAllItems();
						searchdate.query("select", "select * from casia");
					while(searchdate.rs.next()) {
						count = searchdate.rs.getString("countryname");
						countrybox.addItem(count);	
							}
					}
					bUpdate = false;
					} catch (SQLException e1) {
					e1.printStackTrace();
				 }
			}
		});
				
		JLabel contilabel = new JLabel("\uB300\uB959");
		contilabel.setFont(new Font("굴림", Font.PLAIN, 16));
		contilabel.setHorizontalAlignment(SwingConstants.CENTER);
		contilabel.setBounds(126, 106, 113, 36);
		contentPane.add(contilabel);
		
		JLabel countrylabel = new JLabel("\uB098\uB77C");
		countrylabel.setHorizontalAlignment(SwingConstants.CENTER);
		countrylabel.setFont(new Font("굴림", Font.PLAIN, 16));
		countrylabel.setBounds(126, 193, 113, 36);
		contentPane.add(countrylabel);
		


		JLabel arealabel = new JLabel("\uC9C0\uC5ED");
		arealabel.setHorizontalAlignment(SwingConstants.CENTER);
		arealabel.setFont(new Font("굴림", Font.PLAIN, 16));
		arealabel.setBounds(126, 284, 113, 36);
		contentPane.add(arealabel);
		
		areabox = new JComboBox<String>();
		areabox.setBackground(Color.WHITE);
		areabox.setBounds(240, 285, 255, 36);
		contentPane.add(areabox);
		countrybox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (bUpdate) return;
					if(countrybox.getSelectedItem().equals("영국")) {
						areabox.removeAllItems();		
						searchdate.query("select", "select * from england");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("프랑스")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from france");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("미국")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from usa");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("캐나다")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from canada");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("남아프리카공화국")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from safrica");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("모로코")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from morocco");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("한국")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from korea");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					else if(countrybox.getSelectedItem().equals("일본")) {
						areabox.removeAllItems();
						searchdate.query("select", "select * from japan");
					while(searchdate.rs.next()) {
						area = searchdate.rs.getString("area");
						areabox.addItem(area);	
							}
					}
					} catch (SQLException e1) {
					e1.printStackTrace();
				 }
			}
		});
		
		JButton searchbtn = new JButton("\uAC80\uC0C9");
		searchbtn.setBackground(new Color(0, 191, 255));
		searchbtn.setBounds(12, 377, 194, 57);
		contentPane.add(searchbtn);
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				travelList tl = new travelList();
				tl.setVisible(true);
				dispose();
				
				if(e.getSource() == searchbtn) {
					try {
						hits++;
						rankingdate.query("insert", "insert into ranking values ('" + hits + "','" + travel.countrybox.getSelectedItem() + "','" + travel.areabox.getSelectedItem() + "')");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("랭킹목록 추가 완료");
					hits = 0;
				}
			}
		});
		
		JButton rankbtn = new JButton("\uB7AD\uD0B9");
		rankbtn.setBackground(new Color(0, 191, 255));
		rankbtn.setBounds(242, 377, 194, 57);
		contentPane.add(rankbtn);
		rankbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rank rk = new rank();
				rk.setVisible(true);
				dispose();
			}
		});
		
		JButton reviewbtn = new JButton("\uD6C4\uAE30");
		reviewbtn.setBackground(new Color(0, 191, 255));
		reviewbtn.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  reviewList rL = new reviewList();
				  rL.setVisible(true);
				  dispose();
			  }
		  });
		
	      JButton back = new JButton("로그아웃");
	      back.setForeground(new Color(0, 0, 0));
	      back.setBackground(new Color(176, 224, 230));
	      back.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	          	login log = new login();
	          	log.setVisible(true);
	          	dispose();
	          }
	      });
	      back.setFont(new Font("굴림", Font.PLAIN, 15));
	      back.setBounds(562, 21, 106, 38);
	      contentPane.add(back);
	      
		reviewbtn.setBounds(478, 377, 194, 57);
		contentPane.add(reviewbtn);
	}
}
