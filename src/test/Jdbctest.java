package test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class Jdbctest {
	private String driver;  
    private String url;  
    private String user;  
    private String pass;  
    
    public void initParam(String paramFile)throws Exception{
    	Properties props = new Properties();
    	props.load(new FileInputStream(paramFile));  
        this.driver = props.getProperty("driver");  
        this.url = props.getProperty("url");  
        this.user = props.getProperty("user");  
        this.pass = props.getProperty("pass"); 
        Class.forName(driver);
    }
    
    public void insertUsePrepare() throws Exception {
    	long start = System.currentTimeMillis();
    	Connection conn = null;  
    	PreparedStatement pstmt = null;
    	try {  
             conn = DriverManager.getConnection(url, user, pass);  
             pstmt = conn.prepareStatement("insert into account(id,name,money) values(?,?,?)");  
             // 向其中插入100条数据  
             for (int i = 0; i < 100; i++) {  
                 pstmt.setString(1,""+i);
                 pstmt.setString(2, ""+i);
                 pstmt.setInt(3, i);
                 pstmt.executeUpdate();  
             }  
             System.out.println("使用PreparedStatement费时："  
                     + (System.currentTimeMillis() - start));  
   
         } catch (Exception e) {  
             e.printStackTrace();  
         } finally {  
             if (pstmt != null) {  
                 pstmt.close();  
             }  
             if (conn != null) {  
                 conn.close();  
             }  
         }  
    }
    
	public static void main(String[] args) throws Exception {
		Jdbctest pstmtdemo = new Jdbctest();  
		pstmtdemo.initParam("d:\\mysql.ini");
		pstmtdemo.insertUsePrepare();  

	}

}
