package mysql.labs;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.xdevapi.UpdateResult;

import java.sql.*;


/*
 *  MySQL Exercise 4:
 *
 *   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
 *   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
 *   demonstrate how to:
 *
 *   Note: CRUD means (Create, Read, Update, Delete)
 *
 *       1.) CRUD new flights
 *       2.) CRUD new passengers
 *       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
 *
 *
 *   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not
 *   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
 *   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484
 *
 */

public class Exercise_04 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        update();
        delete();
        create();
        update2();
        create2();
        delete2();
    }

    public static void update() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/airtravel?"
                    + " "
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            connection = DriverManager
                    .getConnection(connectionString);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("Select * from passengers");
            // resultSet = statement.executeQuery("SELECT * from flights");

            while (resultSet.next()) {
                //  String flightLocation = resultSet.getString("starting_locationid" );
                String passengerFirstName = resultSet.getString("first_name");
                String email = resultSet.getString("email");
                String query = "update passengers set email = ? where first_name = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, "evaniscool@yahoo.com");
                preparedStmt.setString(2, "Evan");
                // String query2 = "update flights set arrival =? Where flightLocation =? ";

                // preparedStmt.setDate(1, Date.valueOf("12-12-12"));
                // preparedStmt.executeUpdate();
                if (email != null) {
                    System.out.println("Email: " + email);
                } else {
                    System.out.println("No email given ");
                }
                String query2 = "delete from passengers where first_name = ? ";
                PreparedStatement prep = connection.prepareStatement(query2);
                prep.setString(1, "geno");
                prep.executeUpdate();


            }
        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();

        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void delete() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/airtravel?"
                + " "
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        Connection connection;
        connection = DriverManager
                .getConnection(connectionString);
        String query2 = "delete from passengers where first_name = ? ";
        PreparedStatement prep2 = connection.prepareStatement(query2);
        prep2.setString(1, "geno");
        prep2.executeUpdate();
        System.out.println(prep2);
    }

    public static void create() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/airtravel?"
                + " "
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        Connection connection;
        connection = DriverManager
                .getConnection(connectionString);
        Statement st = connection.createStatement();
        st.executeUpdate("INSERT INTO passengers VALUES('12','bart', 'simpson', 'Springfield', '2001','seattle','Washington','US','11111')");
        System.out.println(st);


    }

    public static void update2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/airtravel?"
                + "  "
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        Connection connection;
        connection = DriverManager
                .getConnection(connectionString);
        Statement st = connection.createStatement();
        st.executeUpdate("update Flights set arrival = 2022-01-02 where passenger_id =  3");
        System.out.println(st);
    }

    public static void delete2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/airtravel?"
                + ""
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        Connection connection;
        connection = DriverManager
                .getConnection(connectionString);
        Statement st = connection.createStatement();
        st.executeUpdate("delete from flights where passenger_id = 5");
        System.out.println(st);
    }

    public static void create2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost/airtravel?"
                + ""
                + "&useSSL=false&allowPublicKeyRetrieval=true";
        Connection connection;
        connection = DriverManager
                .getConnection(connectionString);
        Statement st = connection.createStatement();
        st.executeUpdate("INSERT INTO flights VALUES('22','2022-12-12', '2022-12-12', 'SEA', 'SAN','17')");
        System.out.println(st);cd docu
    }
}










        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */



