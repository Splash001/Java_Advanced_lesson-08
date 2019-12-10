package ua.lviv.lgs.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "Splash001";
	private static String URL = "jdbc:mysql://localhost/i_shop?useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static Connection openConnection()
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
//		java.net.URL u = ConnectionUtils.class.getClassLoader().getResource("ua/lviv/lgs/logger/loggerConfig.xml");
//		DOMConfigurator.configure(u);
//		DOMConfigurator.configure("loggerConfig.xml");
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}
}