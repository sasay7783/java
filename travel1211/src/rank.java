

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.rankingdate;
import Database.traveldate;
import java.awt.Color;

public class rank extends JFrame {

	 private JPanel contentPane;
	 private JTable table;
	 static DefaultTableModel DtmStorage;
	 private String country, area;
	 private Integer htis;
	 /**
	  * Launch the application.
	  */

	 /**
	  * Create the frame.
	  */
	 
	 public rank() { 
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 700, 500);
	  contentPane = new JPanel();
	  contentPane.setBackground(new Color(224, 255, 255));
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(null);
	  
	  JLabel lblNewLabel = new JLabel("\uC5EC\uD589\uC9C0 \uC21C\uC704");
	  lblNewLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 22));
	  lblNewLabel.setBounds(14, 12, 265, 64);
	  contentPane.add(lblNewLabel);
	  
	  JScrollPane scrollPane = new JScrollPane();
	  scrollPane.setBounds(14, 69, 654, 382);
	  contentPane.add(scrollPane);
	  
      JButton back = new JButton("\uB4A4\uB85C\uAC00\uAE30");
      back.setBackground(new Color(0, 191, 255));
      back.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          	travel tra = new travel();
          	tra.setVisible(true);
          	dispose();
          }
      });
      back.setFont(new Font("굴림", Font.PLAIN, 15));
      back.setBounds(562, 21, 106, 38);
      contentPane.add(back);
	  
	  String[] column = {"", "", "", ""};
	  DtmStorage = new DefaultTableModel(column, 0);
	  try {
		  int rank = 1;
		rankingdate.query("select", "select countryname, areaname, count(hits) as hit from ranking group by areaname order by hit desc");
		while(rankingdate.rs.next()) {
			htis = rankingdate.rs.getInt("hit");
			country = rankingdate.rs.getString("countryname");
			area = rankingdate.rs.getString("areaname");
			DtmStorage.addRow(new String[] {String.format("%d", rank++) , country, area, String.format("%d", htis) });
		}
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}  
	  table = new JTable(DtmStorage);
	  table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
	  table.setAutoCreateRowSorter(true);
	  table.setCellSelectionEnabled(rootPaneCheckingEnabled);
	  scrollPane.setViewportView(table);
	  
	  DtmStorage.setColumnIdentifiers(new String[] {"순위", "나라", "여행지", "조회 수"});
	  
	  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	  table.getColumnModel().getColumn(0).setPreferredWidth(150);
	  table.getColumnModel().getColumn(1).setPreferredWidth(150);
	  table.getColumnModel().getColumn(2).setPreferredWidth(200);
	  table.getColumnModel().getColumn(3).setPreferredWidth(150);
	 }
	}