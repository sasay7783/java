package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class searchdate {
	static String driver, url;
	static Connection conn;
	static Statement stmt;
	public static ResultSet rs;
	static String tmpstr;
	public static long count = 0;
	
	public static void dbConnectcont() {
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
        String sql = "Select * From continent";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("��� �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("��� �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnecteurope() {
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
        String sql = "Select * From ceurope";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("���� �����ͺ��̽� ���� ����!");
            
            
         
		}catch(Exception e) {
    System.out.println("���� �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnectamerica() {
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
        String sql = "Select * From camerica";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("�Ƹ޸�ī �����ͺ��̽� ���� ����!");
            
            
         
		}catch(Exception e) {
    System.out.println("�Ƹ޸�ī �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnectafrica() {
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
        String sql = "Select * From cafrica";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("������ī �����ͺ��̽� ���� ����!");
            
            
         
		}catch(Exception e) {
    System.out.println("������ī �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnectasia() {
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
        String sql = "Select * From casia";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("�ƽþ� �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("�ƽþ� �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnectengland() {
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
        String sql = "Select * From england";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("���� �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("���� �����ͺ��̽� ���� ����!");
        }
	}
	
	public static void dbConnectkorea() {
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
        String sql = "Select * From korea";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("�ѱ� �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("�ѱ� �����ͺ��̽� ���� ����!");
        }
	}

	public static void dbConnectjapan() {
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
        String sql = "Select * From japan";
		try {
         
            conn = DriverManager.getConnection(url,"root","apmsetup");

            stmt = conn.createStatement( );

            rs = stmt.executeQuery(sql);
            
            System.out.println("�Ϻ� �����ͺ��̽� ���� ����!");            
         
		}catch(Exception e) {
    System.out.println("�Ϻ� �����ͺ��̽� ���� ����!");
        }
	}


	public static void query(String order, String sql) throws SQLException {
		if (order == "select") {
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
