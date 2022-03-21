//package utils;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.time.LocalDate;
//
//public class JDBCUtils {
//
//    private static String jdbcURL="jdbc:sqlserver://localhost:1433;DatabaseName=demo";
//    private static String jdbcUsername="sa";//登陸資料庫
//    private static String jdbcPassword="Passw0rd";
//
//	public static Connection getConnection() {
//		Connection connection = null;
//		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//			System.out.println("connection to db");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("faliurea30");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("faliure2");
//		}
//		return connection;
//	}
//    
//
//
//	public static void printSQLException(SQLException ex) {
//		for (Throwable e : ex) {
//			if (e instanceof SQLException) {
//				e.printStackTrace(System.err);
//				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//				System.err.println("Message: " + e.getMessage());
//				Throwable t = ex.getCause();
//				while (t != null) {
//					System.out.println("Cause: " + t);
//					t = t.getCause();
//				}
//			}
//		}
//	}
//
//	public static Date getSQLDate(LocalDate date) {
//		return java.sql.Date.valueOf(date);
//	}
//
//	public static LocalDate getUtilDate(Date sqlDate) {
//		return sqlDate.toLocalDate();
//	}
//
//
//
//
//
//
//
//}
