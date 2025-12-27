/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpus;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.*;

/**
 *
 * @author Haikal
 */
public class PerpusFrame extends javax.swing.JFrame {
    private String role;
    DefaultListModel<String> modelBuku = new DefaultListModel<>();
    ArrayList<String> pathPdf = new ArrayList<>();
    ArrayList<String> deskripsiBuku = new ArrayList<>();
    
    private void applyRole() {
    if (role.equals("USER")) {
        btnTambah.setEnabled(false);
        btnHapus.setEnabled(false);
    }
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PerpusFrame.class.getName());

    /**
     * Creates new form PerpusFrame
     */
    public PerpusFrame(String role) {
        this.role = role;
        initComponents();
        setIconImage(
        Toolkit.getDefaultToolkit().getImage(
            getClass().getResource("/perpus/icon.png")
        )
    );
        setTitle(AppInfo.APP_NAME + " v" + AppInfo.VERSION);
        initData();
        applyRole();

        txtPetunjuk.setContentType("text/html");
        txtPetunjuk.setEditable(false);
        tampilHome();

        listBuku.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int index = listBuku.getSelectedIndex();
                if (index != -1) {
                    tampilDetailBuku(index);
                }
            }
        });
    }
    
    private void tampilDetailBuku(int index) {
    String html = "<html>"
        + "<body style='font-family:Segoe UI, Arial; padding:16px;'>"
        + "<h2 style='color:#2c3e50;'>" + modelBuku.get(index) + "</h2>"
        + "<hr>"
        + "<p style='font-size:13px;'>" + deskripsiBuku.get(index) + "</p>"
        + "<p style='font-size:11px;color:#777;'>"
        + "File: " + pathPdf.get(index)
        + "</p>"
        + "</body></html>";

    txtPetunjuk.setText(html);
    txtPetunjuk.setCaretPosition(0);
}

    
    private void tampilHome() {
    String html = "<html>"
        + "<body style='font-family:Segoe UI, Arial; padding:16px; color:#2c3e50;'>"
        + "<h2 style='margin-top:0; color:#1f4fd8;'>Panduan Perpustakaan Digital</h2>"
        + "<hr>"
        + "<p>Aplikasi ini digunakan untuk membaca dan mengelola koleksi buku PDF.</p>"
        + "<ul>"
        + "<li>Pilih judul buku di kiri</li>"
        + "<li>Lihat detail di panel ini</li>"
        + "<li>Klik Baca untuk membuka PDF</li>"
        + "</ul>"
        + "<p style='font-size:11px;color:#777;'>Status: Home</p>"
        + "</body></html>";

    txtPetunjuk.setText(html);
    txtPetunjuk.setCaretPosition(0);
}

    
    private void initData() {
    String[] judul = {
        "Teka Teki Rumah Aneh",
        "Hill House",
        "Dark Matter"
    };

    String[] deskripsi = {
        "Teka-Teki Rumah Aneh adalah novel misteri karya Uketsu (@uketsu) yang menceritakan penulis lepas yang menyelidiki denah rumah aneh yang akan dibeli temannya, di mana tata letak yang tidak simetris mengindikasikan adanya ruangan tersembunyi atau fungsi rahasia, mengarah pada misteri pembunuhan dan rahasia keluarga yang mengerikan melalui analisis arsitektur interior yang unik dan menegangkan, cocok untuk penggemar genre misteri dengan elemen supernatural dan plot twist.",
        "The Haunting of Hill House karya Shirley Jackson adalah novel horor psikologis gotik tentang sebuah rumah terpencil yang angker, tempat sekelompok orang yang diselidiki oleh Dr. Montague (termasuk Eleanor, Theodora, dan Luke) mengalami fenomena supernatural yang semakin intens, tetapi intinya adalah eksplorasi ketakutan, isolasi, dan kondisi mental karakter, terutama Eleanor, yang membuat pembaca bertanya-tanya apakah hantu itu nyata atau berasal dari pikirannya yang rapuh, menjadikannya klasik horor yang mengandalkan teror psikologis daripada jump scares.",
        "Dark Matter (oleh Blake Crouch) adalah novel thriller fiksi ilmiah tentang Jason Dessen, seorang fisikawan yang diculik ke alam semesta paralel di mana ia membuat pilihan berbeda, dan harus berjuang melintasi berbagai realitas multiverse untuk kembali ke istri dan putranya yang ia cintai, menghadapi versi dirinya yang lain sebagai musuh terbesar. Novel ini mengeksplorasi pertanyaan tentang pilihan, penyesalan, dan arti kebahagiaan melalui petualangan semesta yang penuh ketegangan dan plot rumit."
    };

    String[] path = {
        "pdf/teka-teki-rumah-aneh.pdf",
        "pdf/hill-house.pdf",
        "pdf/dark-matter.pdf"
    };

    for (int i = 0; i < judul.length; i++) {
        modelBuku.addElement(judul[i]);
        deskripsiBuku.add(deskripsi[i]);
        pathPdf.add(path[i]);
    }

    listBuku.setModel(modelBuku);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        listBuku = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBaca = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPetunjuk = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERPUSTAKAAN HAIKAL");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        listBuku.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JScrollPane.setViewportView(listBuku);

        getContentPane().add(JScrollPane, java.awt.BorderLayout.LINE_START);

        btnBaca.setText("Baca");
        btnBaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacaActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnBaca)
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaca)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnHome)
                    .addComponent(btnLogout))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(txtPetunjuk);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.getAccessibleContext().setAccessibleParent(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacaActionPerformed
        // TODO add your handling code here:
        int index = listBuku.getSelectedIndex();

        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Pilih buku terlebih dahulu");
            return;
        }

        new PDFReaderFrame(pathPdf.get(index)).setVisible(true);
    }//GEN-LAST:event_btnBacaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String judul = JOptionPane.showInputDialog("Judul buku");
        if (judul == null || judul.trim().isEmpty()) return;

        String deskripsi = JOptionPane.showInputDialog("Deskripsi buku");
        if (deskripsi == null || deskripsi.trim().isEmpty()) return;

        modelBuku.addElement(judul);
        deskripsiBuku.add(deskripsi);
        pathPdf.add("pdf/default.pdf");

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int index = listBuku.getSelectedIndex();
        if (index != -1) {
            modelBuku.remove(index);
            deskripsiBuku.remove(index);
            pathPdf.remove(index);
            tampilHome();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        listBuku.clearSelection();
        tampilHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SplashScreen splash = new SplashScreen();
        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnBaca;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listBuku;
    private javax.swing.JTextPane txtPetunjuk;
    // End of variables declaration//GEN-END:variables
}
