package USSS.Utils;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class DataBaseUtils {


    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
/*    private static String DB_URL = "jdbc:oracle:thin:@//dynamo:1521/RUS35";

    private static String USER = "vmpapp36";
    private static String PASS = "vmpapp36";*/
    private static Connection connection;

    public DataBaseUtils(String dataBase, String host, String port, String userName, String userPass) throws ClassNotFoundException, IOException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("Драйвер подключен");
/*      ReadConfiguration  readConf = new ReadConfiguration();
        String dbURL = "jdbc:oracle:thin:@//"+ readConf.getHost() + ":"+ readConf.getPort() + "/" + readConf.getDataBase();
        String userName = readConf.getUserName();
        String userPass = readConf.getUserPass();*/
        String dbURL = "jdbc:oracle:thin:@//"+ host + ":"+ port + "/" + dataBase;
        try{
            connection = DriverManager.getConnection(dbURL, userName, userPass);
        }catch (SQLException e){
            throw new SQLException("Error connecting to database \r\n" + dbURL + "\r\n" + userName + "\r\n" + userPass + "\r\n");
        }

    }
    public ArrayList <Map<String, String>> ExecuteQuery(String query, String... list){

        ArrayList <Map<String, String>> map =  new ArrayList <Map<String, String>>();
        try{
            Statement statement = connection.createStatement();
            // выбираем данные с БД
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Map<String, String> m = new HashMap<String, String>();
                for (int i = 0; i < list.length; i++) {
                    m.put(list[i], rs.getString(list[i]));
                }
                map.add(m);
            }
            return map;
        }catch (Exception ex){
            Logger.getLogger(DataBaseUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public void insert(String str) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(str);
    }

    public void close(){
        if(connection != null)
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}

