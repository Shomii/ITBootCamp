package domaci_14_03_2019;

import java.sql.SQLException;

public class TestStatement {

    public static void main(String args[]) throws SQLException {

        DBAccess db = new DBAccess("jdbc:mysql://localhost:3306/bankadb", "root", "xxxxxxxx");

        db.sqlStatement_01();
    }
}
