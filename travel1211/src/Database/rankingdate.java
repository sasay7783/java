package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rankingdate {
	static String driver, url;
	static Connection conn;
	static Statement stmt;
	public static ResultSet rs;
	static String tmpstr;
	public static long count = 0;
	
	public static void dbConnect() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("����̹� �˻� ����!");        
    	}catch(ClassNotFoundException e){
    		System.err.println("error = " + e);
    	}
        
    	
        url = "jdbc:odbc:travel";
        conn = null;
        stmt = null;
        rs = null;
        String url = "jdbc:mysql://localhost/travel?useUnicode=yes&characterEncoding=UTF8";
        String sql = "Select * From ranking";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("��ŷ �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("��ŷ �����ͺ��̽� ���� ����!");
        }
	}
	public static void query(String order, String sql) throws SQLException {
		if (order.equals("select")) {
			rs = stmt.executeQuery(sql);
		} 
		else {
			stmt.executeUpdate(sql);
		}
	}
	
	public static void dbDis(){
		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			System.out.println("�����ͺ��̽� ���� ����!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}