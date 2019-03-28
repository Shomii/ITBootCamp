package domaci_14_03_2019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBAccess {

    /**
     * Napisati program koji iz baze pdoataka Banka.db ispisuje sve filijale,
     * kao i naziv mesta gde se nalaze.
     *
     */
    //  Na poslu nisam uspeo da instaliram SQL Lite, zadatak je uradjen sa MySQL
    String stringToConnect;
    String user;
    String pass;

    public DBAccess(String stringToConnect, String user, String pass) {
        this.stringToConnect = stringToConnect;
        this.user = user;
        this.pass = pass;
    }

    public void sqlStatement_01() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankadb", "root", "xxxxxxxx"); Statement st = conn.createStatement();) {

            ResultSet rs = st.executeQuery("SELECT filijala.naziv, filijala.adresa, mesto.naziv\n"
                    + "FROM filijala\n"
                    + "JOIN mesto ON filijala.idMEs = mesto.idMes");

            System.out.println("Naziv filijale" + "\t\t" + "Adresa" + "\t\t\t" + "Mesto");
            System.out.println("------------------------------------------------------");
            
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println("Doslo je do greske");
        }
    }

}
