package ua.hillel.lesson10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SqlConfig {
  public void getSqlConfig() {
//    Connection connection = null;
//    try {
//      connection = DriverManager.getConnection("DB_URL", "DB_USER", "DB_PASS");
//    } catch (SQLException sqlException) {
//      System.out.println("");
//    } finally {
//      if (connection != null) {
//        try {
//          connection.close();
//        } catch (SQLException e )
//        {
//
//        }
//      }
//    }



    try(Connection connection = DriverManager.getConnection("DB_URL", "DB_USER", "DB_PASS")) {
      connection.beginRequest();
    } catch (SQLException e) {

    }
  }
}
