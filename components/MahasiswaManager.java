package components;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

// import components.Mahasiswa;

public class MahasiswaManager extends JFrame {
    private DefaultTableModel model;
    private JTable table;
    private JTextField textFieldId, textFieldNama, textFieldNPM, textFieldProgramStudi, textFieldAgama, textFieldNoTelepon, textFieldAlamat, textFieldTanggalLahir;
    private JButton buttonTambah, buttonPerbarui, buttonHapus, buttonRefresh, buttonClear;

    private ArrayList<Mahasiswa> listMahasiswa;

    public MahasiswaManager() {
        listMahasiswa = new ArrayList<>();

        setTitle("Data Mahasiswa");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Menggunakan null layout

        // Panel input data
        JPanel panelInput = new JPanel();
        panelInput.setLayout(null);
        panelInput.setBounds(20, 20, 920, 320);
        panelInput.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        JLabel labelId = new JLabel("ID");
        labelId.setFont(new Font("Arial", Font.PLAIN, 15));
        labelId.setBounds(25, 25, 265, 25);
        panelInput.add(labelId);

        textFieldId = new JTextField();
        textFieldId.setBounds(320, 25, 575, 25);
        textFieldId.setHorizontalAlignment(JTextField.CENTER);
        textFieldId.setEditable(false);
        panelInput.add(textFieldId);

        JLabel labelNama = new JLabel("Nama Lengkap");
        labelNama.setFont(new Font("Arial", Font.PLAIN, 15));
        labelNama.setBounds(25, 60, 265, 25);
        panelInput.add(labelNama);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(320, 60, 575, 25);
        panelInput.add(textFieldNama);

        JLabel labelNPM = new JLabel("NPM");
        labelNPM.setFont(new Font("Arial", Font.PLAIN, 15));
        labelNPM.setBounds(25, 95, 265, 25);
        panelInput.add(labelNPM);

        textFieldNPM = new JTextField();
        textFieldNPM.setBounds(320, 95, 575, 25);
        panelInput.add(textFieldNPM);

        JLabel labelProgramStudi = new JLabel("Program Studi");
        labelProgramStudi.setFont(new Font("Arial", Font.PLAIN, 15));
        labelProgramStudi.setBounds(25, 130, 265, 25);
        panelInput.add(labelProgramStudi);

        textFieldProgramStudi = new JTextField();
        textFieldProgramStudi.setBounds(320, 130, 575, 25);
        panelInput.add(textFieldProgramStudi);

        JLabel labelAgama = new JLabel("Agama");
        labelAgama.setFont(new Font("Arial", Font.PLAIN, 15));
        labelAgama.setBounds(25, 165, 265, 25);
        panelInput.add(labelAgama);

        textFieldAgama = new JTextField();
        textFieldAgama.setBounds(320, 165, 575, 25);
        panelInput.add(textFieldAgama);

        JLabel labelNoTelepon = new JLabel("No Telepon");
        labelNoTelepon.setFont(new Font("Arial", Font.PLAIN, 15));
        labelNoTelepon.setBounds(25, 200, 265, 25);
        panelInput.add(labelNoTelepon);

        textFieldNoTelepon = new JTextField();
        textFieldNoTelepon.setBounds(320, 200, 575, 25);
        panelInput.add(textFieldNoTelepon);

        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setFont(new Font("Arial", Font.PLAIN, 15));
        labelAlamat.setBounds(25, 235, 265, 25);
        panelInput.add(labelAlamat);

        textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(320, 235, 575, 25);
        panelInput.add(textFieldAlamat);

        JLabel labelTanggalLahir = new JLabel("Tanggal Lahir");
        labelTanggalLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        labelTanggalLahir.setBounds(25, 270, 265, 25);
        panelInput.add(labelTanggalLahir);

        textFieldTanggalLahir = new JTextField();
        textFieldTanggalLahir.setBounds(320, 270, 575, 25);
        panelInput.add(textFieldTanggalLahir);

        
        // Panel tombol hapus, refresh, dan clearform
        JPanel panelHapusRefresh = new JPanel();
        panelHapusRefresh.setLayout(null);
        panelHapusRefresh.setBounds(960, 20, 320, 320);
        panelHapusRefresh.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        JLabel labelAction = new JLabel("ACTION");
        labelAction.setFont(new Font("Arial", Font.BOLD, 30));
        labelAction.setBounds(40, 20, 240, 50);
        labelAction.setHorizontalAlignment(SwingConstants.CENTER);
        panelHapusRefresh.add(labelAction);

        buttonTambah = new JButton("Tambah");
        buttonTambah.setBounds(40, 90, 110, 50);
        panelHapusRefresh.add(buttonTambah);

        buttonPerbarui = new JButton("Perbarui");
        buttonPerbarui.setBounds(170, 90, 110, 50);
        panelHapusRefresh.add(buttonPerbarui);

        buttonHapus = new JButton("Hapus");
        buttonHapus.setBounds(40, 160, 110, 50);
        panelHapusRefresh.add(buttonHapus);

        buttonRefresh = new JButton("Refresh");
        buttonRefresh.setBounds(170, 160, 110, 50);
        panelHapusRefresh.add(buttonRefresh);

        buttonClear = new JButton("Clear Form");
        buttonClear.setBounds(40, 230, 240, 50);
        panelHapusRefresh.add(buttonClear);

        // Tabel list data mahasiswa
        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("Nama Lengkap");
        model.addColumn("NPM");
        model.addColumn("Program Studi");
        model.addColumn("Agama");
        model.addColumn("No Telepon");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Lahir");
        table.setFont(new Font("Arial", Font.PLAIN, 13)); // Mengatur font pada tabel
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15)); // Mengatur font pada header tabel
        table.getColumnModel().getColumn(0).setPreferredWidth(35);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(130);
        table.getColumnModel().getColumn(6).setPreferredWidth(300);
        table.getColumnModel().getColumn(7).setPreferredWidth(130);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 350, 1260, 295);

        add(panelInput);
        add(panelHapusRefresh);
        add(scrollPane);

        // Tombol Tambah
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahData();
            }
        });

        // Tombol Perbarui
        buttonPerbarui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                perbaruiData();
            }
        });

        // Tombol Hapus
        buttonHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusData();
            }
        });

        // Tombol Refresh
        buttonRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshData();
            }
        });

        // Tombol Clear Form
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        // Pemilihan baris di tabel
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int id = (int) model.getValueAt(selectedRow, 0);
                    String namaLengkap = (String) model.getValueAt(selectedRow, 1);
                    int npm = (int) model.getValueAt(selectedRow, 2);
                    String programStudi = (String) model.getValueAt(selectedRow, 3);
                    String agama = (String) model.getValueAt(selectedRow, 4);
                    String noTelepon = (String) model.getValueAt(selectedRow, 5);
                    String alamat = (String) model.getValueAt(selectedRow, 6);
                    String tanggalLahir = (String) model.getValueAt(selectedRow, 7);

                    textFieldId.setText(String.valueOf(id));
                    textFieldNama.setText(namaLengkap);
                    textFieldNPM.setText(String.valueOf(npm));
                    textFieldProgramStudi.setText(programStudi);
                    textFieldAgama.setText(agama);
                    textFieldNoTelepon.setText(noTelepon);
                    textFieldAlamat.setText(alamat);
                    textFieldTanggalLahir.setText(tanggalLahir);
                }
            }
        });
    }

    private void tambahData() {
        String namaLengkap = textFieldNama.getText();
        int npm = Integer.parseInt(textFieldNPM.getText());
        String programStudi = textFieldProgramStudi.getText();
        String agama = textFieldAgama.getText();
        String noTelepon = textFieldNoTelepon.getText();
        String alamat = textFieldAlamat.getText();
        String tanggalLahir = textFieldTanggalLahir.getText();

        int id = listMahasiswa.size() + 1; // ID diambil dari ukuran listMahasiswa ditambah 1
        Mahasiswa mahasiswa = new Mahasiswa(id, namaLengkap, npm, programStudi, agama, noTelepon, alamat, tanggalLahir);
        listMahasiswa.add(mahasiswa);
        model.addRow(new Object[]{id, namaLengkap, npm, programStudi, agama, noTelepon, alamat, tanggalLahir});

        clearForm();

        System.out.println("Data berhasil ditambahkan!");
    }

    private void perbaruiData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data mahasiswa yang akan diperbarui!");
            return;
        }

        String namaLengkap = textFieldNama.getText();
        int npm = Integer.parseInt(textFieldNPM.getText());
        String programStudi = textFieldProgramStudi.getText();
        String agama = textFieldAgama.getText();
        String noTelepon = textFieldNoTelepon.getText();
        String alamat = textFieldAlamat.getText();
        String tanggalLahir = textFieldTanggalLahir.getText();

        listMahasiswa.get(selectedRow).setNamaLengkap(namaLengkap);
        listMahasiswa.get(selectedRow).setNpm(npm);
        listMahasiswa.get(selectedRow).setProgramStudi(programStudi);
        listMahasiswa.get(selectedRow).setAgama(agama);
        listMahasiswa.get(selectedRow).setNoTelepon(noTelepon);
        listMahasiswa.get(selectedRow).setAlamat(alamat);
        listMahasiswa.get(selectedRow).setTanggalLahir(tanggalLahir);

        model.setValueAt(namaLengkap, selectedRow, 1);
        model.setValueAt(npm, selectedRow, 2);
        model.setValueAt(programStudi, selectedRow, 3);
        model.setValueAt(agama, selectedRow, 4);
        model.setValueAt(noTelepon, selectedRow, 5);
        model.setValueAt(alamat, selectedRow, 6);
        model.setValueAt(tanggalLahir, selectedRow, 7);

        clearForm();

        System.out.println("Data berhasil diperbarui!");
    }

    private void hapusData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data mahasiswa yang akan dihapus!");
            return;
        }

        int id = (int) model.getValueAt(selectedRow, 0);
        listMahasiswa.removeIf(mahasiswa -> mahasiswa.getId() == id);
        model.removeRow(selectedRow);

        clearForm();

        System.out.println("Data berhasil dihapus!");
    }

    private void refreshData() {
        model.setRowCount(0);

        for (Mahasiswa mahasiswa : listMahasiswa) {
            model.addRow(new Object[]{mahasiswa.getId(), mahasiswa.getNamaLengkap(), mahasiswa.getNpm(), mahasiswa.getProgramStudi(), mahasiswa.getAgama(), mahasiswa.getNoTelepon(), mahasiswa.getAlamat(), mahasiswa.getTanggalLahir()});
        }

        clearForm();

        System.out.println("Data berhasil diperbarui!");
    }

    private void clearForm() {
        textFieldId.setText("");
        textFieldNama.setText("");
        textFieldNPM.setText("");
        textFieldProgramStudi.setText("");
        textFieldAgama.setText("");
        textFieldNoTelepon.setText("");
        textFieldAlamat.setText("");
        textFieldTanggalLahir.setText("");
    }
}
