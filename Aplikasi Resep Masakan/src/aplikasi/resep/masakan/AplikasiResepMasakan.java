package aplikasi.resep.masakan;

import aplikasi.resep.masakan.database.DatabaseHelper;
import aplikasi.resep.masakan.view.MainFrame;

// Class utama aplikasi
public class AplikasiResepMasakan {
    
    public static void main(String[] args) {
        
        // Buat tabel otomatis jika belum ada
        DatabaseHelper.createTable(); 

        // Tampilkan UI aplikasi
        new MainFrame().setVisible(true);
    }
}
