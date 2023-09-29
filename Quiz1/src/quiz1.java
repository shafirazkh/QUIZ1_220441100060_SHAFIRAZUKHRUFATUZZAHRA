/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;

public class quiz1 extends javax.swing.JFrame {
    String pilihan;
    int harga_makanan;
    int bayar, beli, harga;
    
    
    public quiz1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in_jumlahb = new javax.swing.JTextField();
        in_namak = new javax.swing.JTextField();
        in_hargak = new javax.swing.JTextField();
        in_jumlahk = new javax.swing.JTextField();
        in_total = new javax.swing.JTextField();
        in_menu = new javax.swing.JComboBox<>();
        btn_simpan = new javax.swing.JButton();
        btn_riset = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jLabel1.setText("The BrownVibe");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 240, 60);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Menu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 120, 20);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah Beli");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 90, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Harga Kopi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 110, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Total Harga");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 340, 110, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Nama Kopi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 260, 90, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah Kopi");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 300, 110, 30);

        in_jumlahb.setBackground(new java.awt.Color(153, 102, 0));
        in_jumlahb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(in_jumlahb);
        in_jumlahb.setBounds(160, 160, 140, 27);

        in_namak.setBackground(new java.awt.Color(153, 102, 0));
        in_namak.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        in_namak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_namakActionPerformed(evt);
            }
        });
        getContentPane().add(in_namak);
        in_namak.setBounds(160, 260, 140, 30);

        in_hargak.setBackground(new java.awt.Color(153, 102, 0));
        in_hargak.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(in_hargak);
        in_hargak.setBounds(160, 120, 140, 30);

        in_jumlahk.setBackground(new java.awt.Color(153, 102, 0));
        in_jumlahk.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(in_jumlahk);
        in_jumlahk.setBounds(160, 300, 140, 30);

        in_total.setBackground(new java.awt.Color(153, 102, 0));
        in_total.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(in_total);
        in_total.setBounds(160, 340, 140, 30);

        in_menu.setBackground(new java.awt.Color(153, 102, 0));
        in_menu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        in_menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Americano", "Cappuchino", "Caramel Macchiato", "Expresso", "Flat White", "Hawaiian", " " }));
        in_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_menuActionPerformed(evt);
            }
        });
        getContentPane().add(in_menu);
        in_menu.setBounds(160, 80, 140, 27);

        btn_simpan.setBackground(new java.awt.Color(255, 204, 153));
        btn_simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(310, 220, 160, 30);

        btn_riset.setBackground(new java.awt.Color(255, 204, 153));
        btn_riset.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_riset.setText("Riset");
        btn_riset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_risetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_riset);
        btn_riset.setBounds(310, 390, 160, 30);

        btn_keluar.setBackground(new java.awt.Color(255, 204, 153));
        btn_keluar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar);
        btn_keluar.setBounds(310, 430, 160, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz1.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_namakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_namakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_namakActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        harga = Integer.parseInt(in_hargak.getText());
        beli = Integer.parseInt(in_jumlahb.getText());
        
        bayar = harga * beli;
        
        DecimalFormat angka = new DecimalFormat("###.###");
        in_total.setText("" + Integer.toString(bayar));
        in_jumlahk.setText("" + Integer.toString(beli));
        String selectedOption = (String) in_menu.getSelectedItem();
        in_namak.setText(selectedOption);
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_risetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_risetActionPerformed
        in_menu.setSelectedIndex(0);
        in_jumlahb.setText("");
        in_namak.setText("");
        in_hargak.setText("");
        in_jumlahk.setText("");
        in_total.setText("");
    }//GEN-LAST:event_btn_risetActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void in_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_menuActionPerformed
        pilihan = (String) in_menu.getSelectedItem();
        switch (pilihan) {
            case "Americano":
                harga_makanan = 20000;
                break;
            case "Cappuchino": 
                harga_makanan = 18000;
                break;
            case "Caramel Macchiato":
                harga_makanan = 17000;
                break;
            case "Expresso":
                harga_makanan = 16000;
                break;
            case "Flat White":
                harga_makanan = 15000;
                break;
            case "Hawaiian":
                harga_makanan = 14000;
                break;
        }
        in_hargak.setText(""+Integer.toString(harga_makanan));
    }//GEN-LAST:event_in_menuActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_riset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField in_hargak;
    private javax.swing.JTextField in_jumlahb;
    private javax.swing.JTextField in_jumlahk;
    private javax.swing.JComboBox<String> in_menu;
    private javax.swing.JTextField in_namak;
    private javax.swing.JTextField in_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
