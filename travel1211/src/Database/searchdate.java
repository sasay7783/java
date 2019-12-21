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
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("대륙 데이터베이스 연결 성공!");            
         
		}catch(Exception e) {
    System.out.println("대륙 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnecteurope() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("유럽 데이터베이스 연결 성공!");
            
            
         
		}catch(Exception e) {
    System.out.println("유럽 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnectamerica() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("아메리카 데이터베이스 연결 성공!");
            
            
         
		}catch(Exception e) {
    System.out.println("아메리카 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnectafrica() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("아프리카 데이터베이스 연결 성공!");
            
            
         
		}catch(Exception e) {
    System.out.println("아프리카 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnectasia() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("아시아 데이터베이스 연결 성공!");            
         
		}catch(Exception e) {
    System.out.println("아시아 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnectengland() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("영국 데이터베이스 연결 성공!");            
         
		}catch(Exception e) {
    System.out.println("영국 데이터베이스 연결 실패!");
        }
	}
	
	public static void dbConnectkorea() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("한국 데이터베이스 연결 성공!");            
         
		}catch(Exception e) {
    System.out.println("한국 데이터베이스 연결 실패!");
        }
	}

	public static void dbConnectjapan() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
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
            
            System.out.println("일본 데이터베이스 연결 성공!");            
         
		}catch(Exception e) {
    System.out.println("일본 데이터베이스 연결 실패!");
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
			System.out.println("데이터베이스 연결 해제!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
