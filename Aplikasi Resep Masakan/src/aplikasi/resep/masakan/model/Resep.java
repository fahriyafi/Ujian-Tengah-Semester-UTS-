package aplikasi.resep.masakan.model;

// Class model untuk menyimpan data 1 resep
public class Resep {
    private int id;         // ID otomatis dari database
    private String judul;   // Judul resep   
    private String bahan;   // Bahan-bahan resep
    private String langkah; // Langkah memasak

    // Constructor kosong
    public Resep() {}

    // Constructor lengkap (dipakai saat ambil data dari DB)
    public Resep(int id, String judul, String bahan, String langkah) {
        this.id = id;
        this.judul = judul;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    // Constructor tanpa ID (dipakai saat tambah data baru)
    public Resep(String judul, String bahan, String langkah) {
        this.judul = judul;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getBahan() { return bahan; }
    public void setBahan(String bahan) { this.bahan = bahan; }

    public String getLangkah() { return langkah; }
    public void setLangkah(String langkah) { this.langkah = langkah; }

    // Yang ditampilkan jika objek ini diprint
    @Override
    public String toString() {
        return judul;
    }


}
