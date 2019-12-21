import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.imagedate;
import Database.searchdate;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class travelList extends JFrame {

	 private JPanel contentPane;
	 private String apic;
	 private JTextArea pictravel;

	 /**
	  * Launch the application.
	  */

	 /**
	  * Create the frame.
	  */
	 public travelList() {
		 imagedate.dbConnect();
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 700, 500);
	  contentPane = new JPanel();
	  contentPane.setBackground(new Color(224, 255, 255));
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(null);
	  
	  JLabel lblNewLabel = new JLabel("\uB300\uD45C \uAD00\uAD11\uC9C0");
	  lblNewLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 22));
	  lblNewLabel.setBounds(14, 12, 265, 64);
	  contentPane.add(lblNewLabel);
	  
	  JButton reviewEye = new JButton("\uB9AC\uBDF0 \uBAA9\uB85D");
	  reviewEye.setBackground(new Color(0, 191, 255));
      reviewEye.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              reviewList rL = new reviewList();
              rL.setVisible(true);
              dispose();
          }
      });
      reviewEye.setFont(new Font("굴림", Font.PLAIN, 15));
      reviewEye.setBounds(444, 414, 106, 38);
      contentPane.add(reviewEye);
      
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
            back.setBounds(562, 414, 106, 38);
            contentPane.add(back);
      
      if(travel.areabox.getSelectedItem().equals("버킹엄 궁전")) {
          JLabel pic = new JLabel(new ImageIcon("image/king.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          try {
			searchdate.query("select", "select * from england");
			if(searchdate.rs.next()) {
				apic = searchdate.rs.getString("areapic");
			      pictravel = new JTextArea(apic);
			      pictravel.setBounds(280, 135, 368, 215);
			      pictravel.setColumns(10);
			      pictravel.setAutoscrolls(true);
			      contentPane.add(pictravel);
			      pictravel.setLineWrap(true);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

      }
      else if(travel.areabox.getSelectedItem().equals("에펠탑")) {
          JLabel pic = new JLabel(new ImageIcon("image/top.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          try {
			searchdate.query("select", "select * from england");
			if(searchdate.rs.next()) {
				apic = searchdate.rs.getString("areapic");
		          JLabel pictravel = new JLabel(apic);
		          pictravel.setBounds(24, 137, 255, 210);
		          contentPane.add(pictravel);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
      else if(travel.areabox.getSelectedItem().equals("자유의 여신상")) {
          JLabel pic = new JLabel(new ImageIcon("image/free.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          JLabel pictravel = new JLabel();
          pictravel.setBounds(24, 137, 255, 210);
          contentPane.add(pictravel);
      }
      else if(travel.areabox.getSelectedItem().equals("나이아가라 폭포")) {
          JLabel pic = new JLabel(new ImageIcon("image/water.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          JLabel pictravel = new JLabel();
          pictravel.setBounds(24, 137, 255, 210);
          contentPane.add(pictravel);
      }
      else if(travel.areabox.getSelectedItem().equals("카사블랑카")) {
          JLabel pic = new JLabel(new ImageIcon("image/kasa.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          JLabel pictravel = new JLabel();
          pictravel.setBounds(24, 137, 255, 210);
          contentPane.add(pictravel);
      }
      else if(travel.areabox.getSelectedItem().equals("케이프 타운")) {
          JLabel pic = new JLabel(new ImageIcon("image/kf.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          JLabel pictravel = new JLabel();
          pictravel.setBounds(24, 137, 255, 210);
          contentPane.add(pictravel);
      }
      else if(travel.areabox.getSelectedItem().equals("제주도")) {
          JLabel pic = new JLabel(new ImageIcon("image/jeju.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          try {
			searchdate.query("select", "select * from korea");
			if(searchdate.rs.next()) {
				apic = searchdate.rs.getString("areapic");
			      pictravel = new JTextArea(apic);
			      pictravel.setBounds(280, 135, 368, 215);
			      contentPane.add(pictravel);
			      pictravel.setColumns(10);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
      else if(travel.areabox.getSelectedItem().equals("도톤보리")) {
          JLabel pic = new JLabel(new ImageIcon("image/osaka.jpg"));
          pic.setBounds(24, 137, 255, 210);
          contentPane.add(pic);
          try {
			searchdate.query("select", "select * from korea");
			if(searchdate.rs.next()) {
				apic = searchdate.rs.getString("areapic");
			      pictravel = new JTextArea(apic);
			      pictravel.setBounds(280, 135, 368, 215);
			      contentPane.add(pictravel);
			      pictravel.setColumns(10);
			      pictravel.setWrapStyleWord(true);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
      
      JLabel search = new JLabel("선택한 여행지는 : " + travel.areabox.getSelectedItem().toString() + " 입니다.");
      search.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
      search.setBounds(21, 86, 546, 39);
      contentPane.add(search);
      
      JPanel panel = new JPanel();
      panel.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel.setBackground(new Color(175, 238, 238));
      panel.setBounds(14, 124, 658, 241);
      contentPane.add(panel);
      

	 }
	}