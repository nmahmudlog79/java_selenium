package databaseConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectDatabase {
	
	// Secret.properties file
    // jdbc driver
    // jdbc url
    // jdbc userName
    // jdbc password
    // MySQL Query

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;

    // Load properties file
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    public static Connection getDatabaseConnection() throws IOException, ClassNotFoundException, SQLException {
        String filePath = "../Practice/configProperty/Secret.Properties";
        Properties properties = loadProperties(filePath);
        String driverClass = properties.getProperty("MYSQLJDBC.driver");
        String url = properties.getProperty("MYSQLJDBC.url");
        String userName = properties.getProperty("MYSQLJDBC.userName");
        String password = properties.getProperty("MYSQLJDBC.password");

        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connection;
    }

    public static void closeDatabaseConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            System.out.println("Connection not Closed");
        }
    }


    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    public static List<String> readDatabaseTableColumn(String tableName, String columnName) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            ConnectDatabase.getDatabaseConnection(); // will create connection to DB
            statement = connection.createStatement();
            String query = "select * from " + tableName;
            resultSet = statement.executeQuery(query);
            data = getResultSetData(resultSet, columnName);
            System.out.println("Data value " + data);
            for (String dt : data) {
                System.out.println(dt);
            }
        } catch (ClassNotFoundException exc) {
            System.out.println("Class not Found Exception");
            throw exc;
        } finally {
            closeDatabaseConnection();
        }
        return data;

    }

    public static List<String> directDatabaseQueryExecution(String query, String columnName) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            ConnectDatabase.getDatabaseConnection(); // will create connection to DB
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            data = getResultSetData(resultSet, columnName);
            System.out.println("Data value " + data);
            for (String dt : data) {
                System.out.println(dt);
            }
        } catch (ClassNotFoundException exc) {
            System.out.println("Class not Found Exception");
            throw exc;
        } finally {
            closeDatabaseConnection();
        }
        return data;
    }

    public static void insertDataFromStringToTable(String arrayData, String tableName, String columnName) throws SQLException, IOException, ClassNotFoundException {
        try {
            ConnectDatabase.getDatabaseConnection(); // will create connection to DB
            preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + ") VALUES (?)");
            preparedStatement.setString(1, arrayData);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void insertIntegerDataFromArrayListToSQLTable(String tableName, String columnName, List<Integer> dataList) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE  TABLE  `" + tableName + "` (`ID` int (10) NOT NULL AUTO_INCREMENT,`phoneNumber` BIGINT (15) DEFAULT NULL, PRIMARY KEY(`ID`));");
            preparedStatement.executeUpdate();

            for (Integer st : dataList) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName + ") VALUES (?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();

            }
        } catch (IOException | ClassNotFoundException | SQLException io) {
            io.printStackTrace();
        }
    }

    public static void insertStringDataFromArrayListToSQLTable(String tableName, String columnName, List<String> dataList) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE  TABLE  `" + tableName + "` (`itemID` int (10) NOT NULL AUTO_INCREMENT,`items` VARCHAR (50) DEFAULT NULL, PRIMARY KEY(`itemID`));");
            preparedStatement.executeUpdate();

            for (String st : dataList) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName + ") VALUES (?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();

            }
        } catch (IOException | ClassNotFoundException | SQLException io) {
            io.printStackTrace();
        }


    }

    public static void insertStringDataFromArrayListToSQLTable1(String tableName, String columnName1, String columnName2, List<String> dataList) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE  TABLE  `" + tableName + "` (`" + columnName1 + "` int (10) NOT NULL AUTO_INCREMENT,`" + columnName2 + "` VARCHAR (50) DEFAULT NULL, PRIMARY KEY(`" + columnName1 + "`));");
            preparedStatement.executeUpdate();

            for (String st : dataList) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName2 + ") VALUES (?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();

            }
        } catch (IOException | ClassNotFoundException | SQLException io) {
            io.printStackTrace();
        }


    }


    public static void insertDataInMultipleColumn(String tableName, String columnName1, String columnName2, List<String> dataList1, List<String> dataList2) {
        try {
            getDatabaseConnection();
            for (String st1 : dataList1) {
                //preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "("+columnName1+","+columnName2 +") VALUES (?,?)");
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName1 + ") VALUES (?)");
                preparedStatement.setObject(1, st1);
                preparedStatement.executeUpdate();
            }
            for (String st2 : dataList2) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName2 + ") VALUES (?)");
                preparedStatement.setObject(1, st2);
                preparedStatement.executeUpdate();
            }
        } catch (IOException | ClassNotFoundException | SQLException io) {
            io.printStackTrace();
        }
    }

    public static void insertDataInMultipleColumn1(String tableName, String columnName1, String columnName2) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + "(" + columnName1 + "," + columnName2 + ") VALUES (?,?)");
            preparedStatement.setString(1, "Mango");
            preparedStatement.setString(2, "Apple");
            preparedStatement.executeUpdate();
        }
    catch(IOException |ClassNotFoundException |SQLException io){
        io.printStackTrace();
    }
    }


    // Old codes

    private static List<String> getResultSetData(ResultSet resultSet, String columnName1, String columnName2) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while (resultSet.next()) {
            String itemName1 = resultSet.getString(columnName1);
            String itemName2 = resultSet.getString(columnName2);
            dataList.add(itemName1);
            dataList.add(itemName2);
        }
        return dataList;
    }

    public static List<String> readDataBase(String tableName, String columnName) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            getDatabaseConnection();// it will connect with Database
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);
            // System.out.println(data);
            for (String dt : data) {
                System.out.println(dt);
            }
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            ConnectDatabase.closeDatabaseConnection();
        }
        return data;
    }

    public static List<String> readDataBase(String tableName, String columnName1, String columnName2) throws Exception {
        List<String> data = new ArrayList<String>();
        try {
            getDatabaseConnection();// it will connect with Database
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName1, columnName2);
            System.out.println(data);
            for (String dt : data) {
                System.out.print(dt + " ");
            }
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            closeDatabaseConnection();
        }
        return data;
    }

    public static void insertDataFromArrayToSqlTable(int[] arrayData, String tableName, String columnName) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            preparedStatement.executeUpdate();

            for (int n = 0; n < arrayData.length; n++) {
                // Insert into tableName (columnName) values()
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                preparedStatement.setInt(1, arrayData[n]);
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromStringToSqlTable(String ArrayData, String tableName, String columnName) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
            preparedStatement.setString(1, ArrayData);
            preparedStatement.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertProfileToSqlTable(String tableName, String columnName1, String columnName2, String name, int num) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + "," + columnName2 + " ) VALUES(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, num);
            preparedStatement.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<String> directDatabaseQueryExecute(String passQuery, String dataColumn) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            getDatabaseConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
            for (String st : data) {
                System.out.println(st);
            }
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            ConnectDatabase.closeDatabaseConnection();
        }
        return data;
    }

    public static void insertDataFromArrayListToSqlTable2(List<Students> list, String tableName, String columnName) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            preparedStatement.executeUpdate();
            for (Students st : list) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromArrayListToSqlTable3(List<String> list, String tableName, String columnName) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` varchar (200) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            preparedStatement.executeUpdate();
            for (String st : list) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromArrayListToSqlTable(List<String> stNameList, List<String> emailList, String tableName, String columnName, String columnName1) {
        try {
            // ALTER TABLE Customers
            //ADD Email varchar(255);
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` varchar (20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            preparedStatement.executeUpdate();
            for (String st : stNameList) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();
            }
            preparedStatement = connection.prepareStatement("   ALTER TABLE " + tableName + " ADD `" + columnName1 + "`varchar (200) DEFAULT NULL ");
            preparedStatement.executeUpdate();
            for (String std : emailList) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + " ) VALUES(?)");
                preparedStatement.setObject(1, std);
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void insertDataFromArrayListToSqlTable(List<Students> list, String tableName, String columnName) {
        try {
            getDatabaseConnection();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            preparedStatement.executeUpdate();
            //ps = connect.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "` (" + columnName + " int(50) );");
            preparedStatement.executeUpdate();
            for (Students st : list) {
                preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                preparedStatement.setObject(1, st);
                preparedStatement.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<Movie> readUserProfileFromSqlTable1(String tableName){
        List<Movie> list= new ArrayList<>();
        Movie movie= null;
        try {
            Connection con= getDatabaseConnection();
            String query="Select * from "+tableName+"";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                int id= rs.getInt("id");
                String title= rs.getString("title");
                int releaseYear= rs.getInt("releaseYear");
                String genre= rs.getString("genre");
                String rating= rs.getString("mpaRating");
                String producer= rs.getString("producer");
                System.out.format("%s,%s,%s,%s,%s,%s\n",id,title,releaseYear,genre,rating);
                movie=new Movie(id,title,releaseYear,genre,rating);
                list.add(movie);
            }
            st.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<User> readUserProfileFromSqlTable(String tableName) throws IOException, SQLException, ClassNotFoundException {
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Connection conn = getDatabaseConnection();
            String query = "SELECT * FROM " + tableName + "";
            // create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java resultSet
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultSet
            while (rs.next()) {
                String name = rs.getString("title");
                String id = rs.getString("release_year");
                String dob = rs.getString("genre");
                System.out.format("%s, %s,%s\n", name, id,dob);
                user = new User(name, id, dob);
                list.add(user);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }


    public static List<User> readUserProfileFromSqlTable() throws IOException, SQLException, ClassNotFoundException {
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Connection conn = getDatabaseConnection();
            String query = "SELECT * FROM Students";
            // create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultset
            while (rs.next()) {
                String name = rs.getString("stName");
                String id = rs.getString("stID");
                String dob = rs.getString("stDOB");
                //System.out.format("%s, %s,%s\n", name, id, dob);
                user = new User(name, id, dob);
                list.add(user);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

}
