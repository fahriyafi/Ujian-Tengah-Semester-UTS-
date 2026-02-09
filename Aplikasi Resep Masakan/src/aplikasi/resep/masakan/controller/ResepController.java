package aplikasi.resep.masakan.controller;

import aplikasi.resep.masakan.database.DatabaseHelper;
import aplikasi.resep.masakan.model.Resep;
import java.sql.*;
import java.util.ArrayList;

// Controller berfungsi menghubungkan UI (tampilan)
// dengan database. Semua logika CRUD ada di sini.
public class ResepController {

    //   METHOD: Tambah resep baru
    public boolean tambahResep(Resep r) {
        
        String sql = "INSERT INTO resep (judul, bahan, langkah) VALUES (?, ?, ?)";
        
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Set parameter sesuai input user
            ps.setString(1, r.getJudul());
            ps.setString(2, r.getBahan());
            ps.setString(3, r.getLangkah());
            
            // Jika berhasil, kembalikan true
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            
            // Print error jika gagal
            e.printStackTrace();
            return false;
        }
    }

    //   METHOD: Ambil semua resep dari database
    public ArrayList<Resep> ambilSemua() {
        
        ArrayList<Resep> list = new ArrayList<>();

        String sql = "SELECT * FROM resep";
        
        try (Connection conn = DatabaseHelper.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            // Looping isi tabel resep
            while (rs.next()) {
                
                // Masukkan setiap data ke ArrayList
                list.add(new Resep(
                        rs.getInt("id"),
                        rs.getString("judul"),
                        rs.getString("bahan"),
                        rs.getString("langkah")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //   METHOD: Hapus resep berdasarkan ID
    public boolean hapus(int id) {
        
        String sql = "DELETE FROM resep WHERE id = ?";
        
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);   // pilih ID yang dihapus
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
