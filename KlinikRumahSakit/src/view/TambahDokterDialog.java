/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.*;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author admin
 */
public class TambahDokterDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JLabel nomorPegawaiLabel;
    private JLabel tambahDokterLabel;
    private JTextField namaText;
    private JTextField nomorPegawaiText;
    private JToggleButton tambahButton;

    public TambahDokterDialog() {
        init();
    }

    public TambahDokterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        init();
    }

    public void init() {
        this.setLayout(null);
        namaLabel = new JLabel("Formulir Penambahan Dokter");
        namaLabel.setBounds(100, 5, 200, 25);
        this.add(namaLabel);

        this.setLayout(null);
        namaLabel = new JLabel("Nama :");
        namaLabel.setBounds(15, 70, 100, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 70, 100, 25);
        this.add(namaText);

        this.setLayout(null);
        nomorPegawaiLabel = new JLabel("Nomor Pegawai:");
        nomorPegawaiLabel.setBounds(15, 100, 100, 25);
        this.add(nomorPegawaiLabel);

        nomorPegawaiText = new JTextField();
        nomorPegawaiText.setBounds(115, 100, 100, 25);
        this.add(nomorPegawaiText);

        this.setLayout(null);
        tambahButton = new JToggleButton("Tambah");
        tambahButton.setBounds(100, 150, 100, 25);
        this.add(tambahButton);
        tambahButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            Dokter dokter = new Dokter();
            dokter.setNama(namaText.getText());
            dokter.setNomorPegawai(nomorPegawaiText.getText());
            FrameUtama.rumahSakit.tambahDokter(dokter);
            
            DokterTableModel dokterModel = new DokterTableModel(FrameUtama.rumahSakit.getDaftarDokter());
            FrameUtama.lihatDokter.setDokterTableModel(dokterModel);
            FrameUtama.lihatDokter.updateTable();
            JOptionPane.showMessageDialog(null, "Data telah Ditambahkan");
            this.dispose();
        }
    }

    public static void main(String[] args) {
        TambahDokterDialog test = new TambahDokterDialog();
        test.setSize(350, 300);
        test.setVisible(true);
    }
}
