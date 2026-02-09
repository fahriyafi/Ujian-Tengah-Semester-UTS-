
package aplikasi.resep.masakan.view;

// Wrapper ini dipakai agar JList bisa menampilkan "nomor + judul"
public class ResepWrapper {
    private final int nomor;    // nomor urut
    private final aplikasi.resep.masakan.model.Resep resep; // objek resep asli

    public ResepWrapper(int nomor, aplikasi.resep.masakan.model.Resep resep) {
        this.nomor = nomor;
        this.resep = resep;
    }

    // Ambil data Resep asli
    public aplikasi.resep.masakan.model.Resep getResep() {
        return resep;
    }

    // Yang ditampilkan di JList
    @Override
    public String toString() {
        return nomor + ". " + resep.getJudul();
    }
}

