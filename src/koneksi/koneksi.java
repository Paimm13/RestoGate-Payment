/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author fahim
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static String namaKasirLogin = "";
    private static Connection conn;
    public static Connection getConnection() {
        try {
            if (conn == null) {
                String url = "jdbc:mysql://localhost:3306/db_RestoPayment";
                String user = "root"; // sesuaikan
                String pass = "";     // sesuaikan
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}

