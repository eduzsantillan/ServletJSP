package isil.pe.proyjsp.dao;

import isil.pe.proyjsp.dao.mysql.MySQLConnection;
import isil.pe.proyjsp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {


    public int addUser(User user) throws Exception{

            MySQLConnection mySQLConnection = new MySQLConnection();
            Connection con = mySQLConnection.getConnection();
            int rowsAffected =0;

            String queryInsert ="INSERT INTO USERS (name,lastname,username,pass,tipDOC,nroDoc,enable) " +
                    "VALUES (?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(queryInsert);
            ps.setString(1,user.getName());
            ps.setString(2,user.getLastname());
            ps.setString(3,user.getUsername());
            ps.setString(4,user.getPass());
            ps.setString(5,user.getTipDoc());
            ps.setString(6,user.getNroDoc());
            ps.setInt(7,user.getEnable());

            rowsAffected = ps.executeUpdate();
            return rowsAffected;
    }

    public List<User> getUsers() throws Exception{

            MySQLConnection mySQLConnection = new MySQLConnection();
            Connection con = mySQLConnection.getConnection();

            String querySelect = "SELECT * FROM USERS";
            Statement st = con.createStatement();
            ResultSet resultSet = st.executeQuery(querySelect);

            List<User> listUsers = new ArrayList<>();

            while(resultSet.next()){
                    User user = new User();
                    user.setName(resultSet.getString("name"));
                    user.setLastname(resultSet.getString("lastname"));
                    user.setUsername(resultSet.getString("username"));
                    user.setTipDoc(resultSet.getString("tipDoc"));
                    user.setNroDoc(resultSet.getString("nroDoc"));
                    user.setPass(resultSet.getString("pass"));
                    user.setEnable(Integer.parseInt(resultSet.getString("enable")));
                    listUsers.add(user);
            }
            return listUsers;
    }



}
