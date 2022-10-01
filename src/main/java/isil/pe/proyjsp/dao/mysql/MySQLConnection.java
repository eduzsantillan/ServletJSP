package isil.pe.proyjsp.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/moduloseg2";
    public static final String USER="root";
    public static final String PASS="budakar01";


    public MySQLConnection() throws Exception{
        Class.forName(DRIVER);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public Connection getConnection(String url,String user, String pass) throws SQLException {
        return DriverManager.getConnection(url,user,pass);
    }

    public void closeConnection(Connection con) throws SQLException {
        con.close();
    }

}
