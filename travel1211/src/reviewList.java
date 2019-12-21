
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class reviewList extends JFrame {

	static String driver, url;

	static Connection conn;

	static Statement stmt;

	static ResultSet rs;

	TextField id, password, name, number, address;

	static long count = 0;
	
	public static void dbConnect() {
		
		
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		try{

    		Class.forName("com.mysql.jdbc.Driver");

    		System.out.println("드라이버 검색 성공!");        

    	}catch(ClassNotFoundException e){

    		System.err.println("error = " + e);

    	}

        url = "jdbc:odbc:travel?useUnicode=yes&characterEncoding=UTF8";

        conn = null;

        stmt = null;

        rs = null;

        String url = "jdbc:mysql://localhost/travel?useUnicode=yes&characterEncoding=UTF8";

        String sql = "Select * From review";

		try {
			conn = DriverManager.getConnection(url,"root","apmsetup");
            stmt = conn.createStatement( );
            rs = stmt.executeQuery(sql);
            System.out.println("데이터베이스 연결 성공!");            

        }

        catch(Exception e) {

            System.out.println("데이터베이스 연결 실패!");
            }

	}
	
	private JPanel contentPane;
	private JTable table;

	String[] head = {"제목", "내용"};
	DefaultTableModel model = new DefaultTableModel(head,0);
	
	void select(){
		String sql = "select * from review";
		
		try {
			dbConnect();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("입력확인");
				model.addRow(new Object[] {rs.getString("posttitle"),
											rs.getString("postcontents")});
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("데이터베이스 연결 실패!");
		}
		
	}
	
	
	
	public reviewList() {
		select();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 89, 633, 284);
		contentPane.add(scrollPane);
		
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
				System.out.println(table.getValueAt(row, column));
				String string = (String) table.getValueAt(row, column);
				new reviewCont(string);
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\uB9AC\uBDF0 \uAC8C\uC2DC\uD310");
		lblNewLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 18));
		lblNewLabel.setBounds(28, 31, 131, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB9AC\uBDF0 \uC791\uC131");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewRegi r2 = new reviewRegi();
				r2.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(346, 383, 97, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정/삭제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewChange r3 = new reviewChange();
				r3.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(455, 383, 97, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("돌아가기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				travel tL = new travel();
				tL.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(564, 383, 97, 41);
		contentPane.add(btnNewButton_2);
	}
	
}
