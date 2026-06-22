package belajar.java.backend.belajar_spring_dasar.livecoding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnalisisGaji {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_perusahaan";
        String user = "root";
        String password = "";

        String query = "SELECT d.nama_departemen, AVG(k.gaji) AS rata_rata_gaji " +
                "FROM departemen d " +
                "JOIN karyawan k ON d.id = k.id_departemen " +
                "GROUP BY d.id, d.nama_departemen " +
                "HAVING AVG(k.gaji) > 10000000 " +
                "ORDER BY rata_rata_gaji DESC";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String namaDept = rs.getString("nama_departemen");
                double rataGaji = rs.getDouble("rata_rata_gaji");

                System.out.println("Departemen: " + namaDept + " -> Rata-rata Gaji: Rp " + rataGaji);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
