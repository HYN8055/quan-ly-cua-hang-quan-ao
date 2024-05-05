/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class OracleJDBCConnection {
	public static Connection getJDBCConnection() {
		Connection c = null;
		try {
			// Dang ky Oracle Driver voi DriverManager
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Cac thong so
                        String url01 = "jdbc:oracle:thin:@localhost:1521:orcl21";
                        String url02 = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userName = "SYS AS SYSDBA";
                        String password01 = "Huynhyennhi8055";
                        String password02 = "Pthaonhu131104@";
			//Tao ket noi 
			c = DriverManager.getConnection(url02, userName, password02);
		} catch (Exception e) {
			// TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu !","Lỗi", JOptionPane.ERROR_MESSAGE);
		}
		return c;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
                            c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void printInfo(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

