package aplikasi.resep.masakan.database;

import java.sql.*;

// Kelas helper ini bertugas menangani koneksi database SQLite
public class DatabaseHelper {
    
    // Lokasi file database
    private static final String URL = "jdbc:sqlite:resep.db";

    //  METHOD: Membuat koneksi ke SQLite
    public static Connection getConnection() {
        try {
            
            // Buat koneksi ke file resep.db
            return DriverManager.getConnection(URL);
            
        } catch (Exception e) {
            
            e.printStackTrace();    // jika gagal koneksi
            return null;
        }
    }

    //  METHOD: Membuat tabel resep jika belum ada
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS resep ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "judul TEXT NOT NULL,"
                + "bahan TEXT NOT NULL,"
                + "langkah TEXT NOT NULL"
                + ");";

        try (Connection conn = getConnection(); 
                
            Statement stmt = conn.createStatement()) {
            
            // Eksekusi perintah CREATE TABLE
            stmt.execute(sql);
            System.out.println("Tabel berhasil dibuat!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
