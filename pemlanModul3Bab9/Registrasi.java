import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Registrasi {

    public Registrasi() {
        FormComponent();
    }

    //  FORM UTAMA
    public void FormComponent() {

        JFrame frameForm = new JFrame("Form Daftar Ulang Mahasiswa Baru");
        frameForm.setSize(480, 580);
        frameForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameForm.setLocationRelativeTo(null);
        frameForm.setLayout(null);
        // warna latar abu muda
        frameForm.getContentPane().setBackground(new java.awt.Color(245, 247, 250));

        // Panel kartu putih 
        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBounds(30, 20, 410, 520);
        card.setBackground(java.awt.Color.WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new java.awt.Color(210, 215, 230), 1),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        frameForm.add(card);

        // Strip biru di atas kartu 
        JPanel strip = new JPanel();
        strip.setBounds(0, 0, 410, 5);
        strip.setBackground(new java.awt.Color(67, 97, 238));
        strip.setLayout(null);
        card.add(strip);

        // Judul 
        JLabel labelJudul = new JLabel("Form Daftar Ulang Mahasiswa Baru");
        labelJudul.setBounds(0, 20, 410, 24);
        labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
        labelJudul.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        labelJudul.setForeground(new java.awt.Color(30, 30, 60));
        card.add(labelJudul);

        JLabel labelSub = new JLabel("Isi semua kolom di bawah ini dengan benar");
        labelSub.setBounds(0, 46, 410, 16);
        labelSub.setHorizontalAlignment(SwingConstants.CENTER);
        labelSub.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
        labelSub.setForeground(new java.awt.Color(130, 140, 170));
        card.add(labelSub);

        // pemisah
        JSeparator sep0 = new JSeparator();
        sep0.setBounds(20, 68, 370, 2);
        sep0.setForeground(new java.awt.Color(230, 233, 245));
        card.add(sep0);

        // Helper ukuran baris
        int lx = 20, lw = 140, fx = 170, fw = 210, fh = 26, gap = 44;
        int y = 82;

        // Nama Lengkap 
        card.add(buatLabel("Nama Lengkap", lx, y, lw));
        JTextField txtNama = buatField(fx, y, fw, fh);
        card.add(txtNama);
        y += gap;

        // Tanggal Lahir
        card.add(buatLabel("Tanggal Lahir", lx, y, lw));
        JTextField txtTglLahir = buatField(fx, y, fw, fh);
        txtTglLahir.setToolTipText("Format: DD-MM-YYYY");
        card.add(txtTglLahir);

        // hint kecil format
        JLabel hintTgl = new JLabel("DD-MM-YYYY");
        hintTgl.setBounds(fx, y + fh + 1, fw, 12);
        hintTgl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 10));
        hintTgl.setForeground(new java.awt.Color(180, 185, 200));
        card.add(hintTgl);
        y += gap;

        // Jenis Kelamin 
        card.add(buatLabel("Jenis Kelamin", lx, y, lw));
        JRadioButton radioLaki = new JRadioButton("Laki-laki");
        radioLaki.setBounds(fx, y, 90, fh);
        radioLaki.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        radioLaki.setBackground(java.awt.Color.WHITE);
        radioLaki.setForeground(new java.awt.Color(50, 55, 80));
        JRadioButton radioPerempuan = new JRadioButton("Perempuan");
        radioPerempuan.setBounds(fx + 95, y, 100, fh);
        radioPerempuan.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        radioPerempuan.setBackground(java.awt.Color.WHITE);
        radioPerempuan.setForeground(new java.awt.Color(50, 55, 80));
        ButtonGroup groupKelamin = new ButtonGroup();
        groupKelamin.add(radioLaki);
        groupKelamin.add(radioPerempuan);
        card.add(radioLaki);
        card.add(radioPerempuan);
        y += gap;

        // Nomor Pendaftaran
        card.add(buatLabel("Nomor Pendaftaran", lx, y, lw));
        JTextField txtNoPend = buatField(fx, y, fw, fh);
        card.add(txtNoPend);
        y += gap;

        // Nomor Telepon    
        card.add(buatLabel("Nomor Telepon", lx, y, lw));
        JTextField txtNoTel = buatField(fx, y, fw, fh);
        card.add(txtNoTel);
        y += gap;

        // Alamat (textarea)
        card.add(buatLabel("Alamat Lengkap", lx, y, lw));
        JTextArea taAlamat = new JTextArea();
        taAlamat.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        taAlamat.setForeground(new java.awt.Color(30, 30, 60));
        taAlamat.setLineWrap(true);
        taAlamat.setWrapStyleWord(true);
        JScrollPane spAlamat = new JScrollPane(taAlamat);
        spAlamat.setBounds(fx, y, fw, 52);
        spAlamat.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
        card.add(spAlamat);
        y += 62;

        // Email
        card.add(buatLabel("Email", lx, y, lw));
        JTextField txtEmail = buatField(fx, y, fw, fh);
        card.add(txtEmail);
        y += gap + 4;

        // Tombol Submit
        JButton btSubmit = new JButton("Submit");
        btSubmit.setBounds(155, y, 100, 32);
        btSubmit.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        btSubmit.setBackground(new java.awt.Color(67, 97, 238));
        btSubmit.setForeground(java.awt.Color.WHITE);
        btSubmit.setBorder(BorderFactory.createEmptyBorder(4, 12, 4, 12));
        btSubmit.setFocusPainted(false);
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        card.add(btSubmit);

        // Aksi Submit 
        btSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama        = txtNama.getText().trim();
                String tglLahir    = txtTglLahir.getText().trim();
                String noPend      = txtNoPend.getText().trim();
                String noTel       = txtNoTel.getText().trim();
                String alamat      = taAlamat.getText().trim();
                String email       = txtEmail.getText().trim();
                String jenisKelamin = "";

                if (radioLaki.isSelected())       jenisKelamin = "Laki-laki";
                else if (radioPerempuan.isSelected()) jenisKelamin = "Perempuan";

                // reset warna
                txtNama.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
                txtTglLahir.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
                txtNoPend.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
                txtNoTel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
                spAlamat.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));
                txtEmail.setBorder(BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1));

                // validasi + highlight merah
                boolean valid = true;
                java.awt.Color clrErr = new java.awt.Color(239, 68, 68);
                if (nama.isEmpty())         { txtNama.setBorder(BorderFactory.createLineBorder(clrErr, 1));    valid = false; }
                if (tglLahir.isEmpty())     { txtTglLahir.setBorder(BorderFactory.createLineBorder(clrErr, 1)); valid = false; }
                if (jenisKelamin.isEmpty()) { radioLaki.setForeground(clrErr); radioPerempuan.setForeground(clrErr); valid = false; }
                else                        { radioLaki.setForeground(new java.awt.Color(50,55,80)); radioPerempuan.setForeground(new java.awt.Color(50,55,80)); }
                if (noPend.isEmpty())       { txtNoPend.setBorder(BorderFactory.createLineBorder(clrErr, 1));  valid = false; }
                if (noTel.isEmpty())        { txtNoTel.setBorder(BorderFactory.createLineBorder(clrErr, 1));   valid = false; }
                if (alamat.isEmpty())       { spAlamat.setBorder(BorderFactory.createLineBorder(clrErr, 1));   valid = false; }
                if (email.isEmpty())        { txtEmail.setBorder(BorderFactory.createLineBorder(clrErr, 1));   valid = false; }

                if (!valid) {
                    JOptionPane.showMessageDialog(
                        frameForm,
                        "Semua kolom wajib diisi!\nMohon lengkapi data yang ditandai merah.",
                        "Data Belum Lengkap",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                // konfirmasi
                int pilihan = JOptionPane.showConfirmDialog(
                    frameForm,
                    "Apakah anda yakin data yang Anda isi sudah benar?",
                    "Konfirmasi Data",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );

                if (pilihan == JOptionPane.OK_OPTION) {
                    frameForm.setVisible(false);
                    TampilkanData(nama, tglLahir, jenisKelamin, noPend, noTel, alamat, email);
                }
                // jika CANCEL → tetap di form
            }
        });

        frameForm.setVisible(true);
    }

    //  HASIL DATA
    public void TampilkanData(String nama, String tglLahir, String jenisKelamin,
                               String noPend, String noTel, String alamat, String email) {

        JFrame hasil = new JFrame("Data Mahasiswa");
        hasil.setSize(440, 420);
        hasil.setLayout(null);
        hasil.setLocationRelativeTo(null);
        hasil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hasil.getContentPane().setBackground(new java.awt.Color(245, 247, 250));

        // Panel kartu putih 
        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBounds(25, 18, 390, 365);
        card.setBackground(java.awt.Color.WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new java.awt.Color(210, 215, 230), 1),
            BorderFactory.createEmptyBorder(0, 0, 0, 0)
        ));
        hasil.add(card);

        // strip aksen atas
        JPanel strip = new JPanel();
        strip.setBounds(0, 0, 390, 5);
        strip.setBackground(new java.awt.Color(67, 97, 238));
        strip.setLayout(null);
        card.add(strip);

        // judul
        JLabel labelJudul = new JLabel("Data Mahasiswa");
        labelJudul.setBounds(0, 14, 390, 22);
        labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
        labelJudul.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        labelJudul.setForeground(new java.awt.Color(30, 30, 60));
        card.add(labelJudul);

        JSeparator sep = new JSeparator();
        sep.setBounds(20, 42, 350, 2);
        sep.setForeground(new java.awt.Color(230, 233, 245));
        card.add(sep);

        // Baris data 
        int y = 54, gap = 34;
        String[][] baris = {
            {"Nama Lengkap",      nama},
            {"Tanggal Lahir",     tglLahir},
            {"Jenis Kelamin",     jenisKelamin},
            {"No. Pendaftaran",   noPend},
            {"No. Telepon",       noTel},
            {"Alamat",            alamat},
            {"Email",             email}
        };

        for (String[] b : baris) {
            JLabel lKey = new JLabel(b[0]);
            lKey.setBounds(22, y, 130, 22);
            lKey.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
            lKey.setForeground(new java.awt.Color(110, 120, 155));
            card.add(lKey);

            JLabel lSep = new JLabel(":");
            lSep.setBounds(154, y, 12, 22);
            lSep.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
            lSep.setForeground(new java.awt.Color(150, 155, 175));
            card.add(lSep);

            JLabel lVal = new JLabel("<html>" + b[1].replace("\n", "<br>") + "</html>");
            lVal.setBounds(168, y, 210, 22);
            lVal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
            lVal.setForeground(new java.awt.Color(30, 30, 60));
            card.add(lVal);

            y += gap;
        }

        // tombol tutup
        JButton btnTutup = new JButton("Tutup");
        btnTutup.setBounds(145, 318, 100, 30);
        btnTutup.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        btnTutup.setBackground(new java.awt.Color(67, 97, 238));
        btnTutup.setForeground(java.awt.Color.WHITE);
        btnTutup.setBorder(BorderFactory.createEmptyBorder(4, 12, 4, 12));
        btnTutup.setFocusPainted(false);
        btnTutup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        card.add(btnTutup);

        btnTutup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hasil.dispose();
                System.exit(0);
            }
        });

        hasil.setVisible(true);
    }

    private JLabel buatLabel(String teks, int x, int y, int w) {
        JLabel lbl = new JLabel(teks);
        lbl.setBounds(x, y, w, 26);
        lbl.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        lbl.setForeground(new java.awt.Color(90, 100, 135));
        return lbl;
    }

    private JTextField buatField(int x, int y, int w, int h) {
        JTextField tf = new JTextField();
        tf.setBounds(x, y, w, h);
        tf.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        tf.setForeground(new java.awt.Color(30, 30, 60));
        tf.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new java.awt.Color(205, 212, 232), 1),
            BorderFactory.createEmptyBorder(2, 8, 2, 8)
        ));
        return tf;
    }
}