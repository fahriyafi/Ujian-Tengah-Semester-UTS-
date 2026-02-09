package aplikasi.resep.masakan.view;

import aplikasi.resep.masakan.controller.ResepController;
import aplikasi.resep.masakan.model.Resep;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

// Frame utama aplikasi (tampilan utama)
public class MainFrame extends javax.swing.JFrame {
    
    // Controller untuk menghubungkan UI dan database
    private final ResepController controller = new ResepController();
    
    // ListModel untuk menampilkan data resep dalam bentuk list
    private final DefaultListModel<ResepWrapper> listModel = new DefaultListModel<>();

    // Constructor → dipanggil saat aplikasi dibuka
    public MainFrame() {
        initComponents(); // generate UI
        
        tampilData();   // tampilkan data dari database ke list

        // Tambahkan event ketika tombol diklik
        btnTambah.addActionListener(e -> btnTambahActionPerformed(e));
        btnHapus.addActionListener(e -> btnHapusActionPerformed(e));
        btnBaca.addActionListener(e -> btnBacaActionPerformed(e));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtJudul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBahan = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLangkah = new javax.swing.JTextArea();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBaca = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listResep = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 242, 242));

        txtBahan.setColumns(20);
        txtBahan.setRows(5);
        txtBahan.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtBahan);

        txtLangkah.setColumns(20);
        txtLangkah.setRows(5);
        txtLangkah.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtLangkah);

        btnTambah.setText("Tambah");

        btnHapus.setText("Hapus");

        jLabel1.setText("Judul");

        jLabel2.setText("Bahan");

        jLabel3.setText("Langkah");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("APALIKASI RESEP MASAKAN");

        btnBaca.setText("Baca Resep");

        jScrollPane4.setViewportView(listResep);

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("List Resep :");

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtJudul))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnBaca)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnBaca))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // ============= TAMPILKAN DATA ===================
    private void tampilData() {
        listModel.clear();  // kosongkan list sebelum diisi ulang

        int no = 1; // nomor urut tampilan
        for (Resep r : controller.ambilSemua()) {
            
            // Masukkan ke list model dengan nomor urut
            listModel.addElement(new ResepWrapper(no, r));
            no++;
        }

        // Tampilkan isi model ke JList
        listResep.setModel(listModel);
    }
    
    // ============= TOMBOL TAMBAH ===================
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        
        // Ambil input dari user
        Resep r = new Resep(
                txtJudul.getText(),
                txtBahan.getText(),
                txtLangkah.getText()
        );

        // Proses simpan ke database
        if (controller.tambahResep(r)) {
            JOptionPane.showMessageDialog(this, "Resep berhasil ditambah!");
            tampilData();   // refresh list
            bersihkanInput();   // kosongkan form input
        }
    }
    
    // ============= TOMBOL HAPUS ===================
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {
        
        // Ambil item yang dipilih dari list
        ResepWrapper wrap = listResep.getSelectedValue();
        
        if (wrap == null) {
            JOptionPane.showMessageDialog(this, "Pilih resep dulu!");
            return;
        }

        // Ambil objek Resep asli dari wrapper
        Resep selected = wrap.getResep();

        // Hapus dari database
        if (controller.hapus(selected.getId())) {
            JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!");
            tampilData();
        }
    }
    
    // ============= TOMBOL BACA RESEP ===================
    private void btnBacaActionPerformed(java.awt.event.ActionEvent evt) {
        
        // Ambil item yang dipilih
        ResepWrapper wrap = listResep.getSelectedValue();
        
        if (wrap == null) {
            JOptionPane.showMessageDialog(this, "Pilih resep dulu!");
            return;
        }

        Resep selected = wrap.getResep();

        // Format tampilan popup resep
        String pesan = "🧾 " + selected.getJudul() + "\n\n"
                + "📌 Bahan:\n" + selected.getBahan() + "\n\n"
                + "🍳 Langkah:\n" + selected.getLangkah();

        JOptionPane.showMessageDialog(this, pesan, "Baca Resep", JOptionPane.INFORMATION_MESSAGE);
    }

    // ============= CLEAR INPUT ===================
    private void bersihkanInput() {
        txtJudul.setText("");
        txtBahan.setText("");
        txtLangkah.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaca;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<ResepWrapper> listResep;
    private javax.swing.JTextArea txtBahan;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextArea txtLangkah;
    // End of variables declaration//GEN-END:variables
}
