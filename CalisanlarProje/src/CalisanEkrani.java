
import java.util.ArrayList;
import javax.management.modelmbean.ModelMBean;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

public class CalisanEkrani extends javax.swing.JDialog {

    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) calisanTablosu.getModel();
        calisanGoruntule();
    }

    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisanTablosu = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adEklemeAlani = new javax.swing.JTextField();
        soyadEklemeAlani = new javax.swing.JTextField();
        departmanEklemeAlani = new javax.swing.JTextField();
        maasEklemeAlani = new javax.swing.JTextField();
        mesajYazisi2 = new javax.swing.JLabel();
        eklemeButonu = new javax.swing.JButton();
        guncellemeButonu = new javax.swing.JButton();
        silmeButonu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));

        calisanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD", "SOYAD", "DEPARTMAN", "MAAŞ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisanTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisanTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisanTablosu);
        if (calisanTablosu.getColumnModel().getColumnCount() > 0) {
            calisanTablosu.getColumnModel().getColumn(0).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(1).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Ad :");

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Soyad :");

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Departman :");

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Maaş :");

        adEklemeAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adEklemeAlaniActionPerformed(evt);
            }
        });

        mesajYazisi2.setForeground(new java.awt.Color(255, 0, 0));

        eklemeButonu.setBackground(new java.awt.Color(0, 0, 255));
        eklemeButonu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        eklemeButonu.setForeground(new java.awt.Color(255, 255, 255));
        eklemeButonu.setText("Çalışan Ekle");
        eklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklemeButonuActionPerformed(evt);
            }
        });

        guncellemeButonu.setBackground(new java.awt.Color(0, 0, 255));
        guncellemeButonu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        guncellemeButonu.setForeground(new java.awt.Color(255, 255, 255));
        guncellemeButonu.setText("Çalışan Güncelle");
        guncellemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellemeButonuActionPerformed(evt);
            }
        });

        silmeButonu1.setBackground(new java.awt.Color(0, 0, 255));
        silmeButonu1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        silmeButonu1.setForeground(new java.awt.Color(255, 255, 255));
        silmeButonu1.setText("Çalışan Sil");
        silmeButonu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silmeButonu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(aramaCubugu)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(mesajYazisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adEklemeAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(soyadEklemeAlani)
                            .addComponent(departmanEklemeAlani)
                            .addComponent(maasEklemeAlani))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guncellemeButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eklemeButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(silmeButonu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adEklemeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eklemeButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soyadEklemeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncellemeButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departmanEklemeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silmeButonu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maasEklemeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(mesajYazisi2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);

        calisanTablosu.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased

        String ara = aramaCubugu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void adEklemeAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adEklemeAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adEklemeAlaniActionPerformed

    private void eklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklemeButonuActionPerformed
        mesajYazisi2.setText("");

        String ad = adEklemeAlani.getText();
        String soyad = soyadEklemeAlani.getText();
        String departman = departmanEklemeAlani.getText();
        String maas = maasEklemeAlani.getText();

        islemler.calisanEkle(ad, soyad, departman, maas);
        calisanGoruntule();
        mesajYazisi2.setText("Yeni çalışan başarıyla eklendi...");
    }//GEN-LAST:event_eklemeButonuActionPerformed

    private void guncellemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellemeButonuActionPerformed
        String ad = adEklemeAlani.getText();
        String soyad = soyadEklemeAlani.getText();
        String departman = departmanEklemeAlani.getText();
        String maas = maasEklemeAlani.getText();

        int selectedRow = calisanTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi2.setText("Çalışanlar tablosu şu anda boş ! ");
            } else {
                mesajYazisi2.setText("Lütfen güncellenecek çalışanı seçiniz ! ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.calisanGuncelle(id, ad, soyad, departman, maas);
            calisanGoruntule();
            mesajYazisi2.setText("Çalışan başarıyla güncellendi...");
        }
    }//GEN-LAST:event_guncellemeButonuActionPerformed

    private void calisanTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisanTablosuMouseClicked
        int selectedRow = calisanTablosu.getSelectedRow();

        adEklemeAlani.setText((String) model.getValueAt(selectedRow, 1));
        soyadEklemeAlani.setText((String) model.getValueAt(selectedRow, 2));
        departmanEklemeAlani.setText((String) model.getValueAt(selectedRow, 3));
        maasEklemeAlani.setText((String) model.getValueAt(selectedRow, 4));
    }//GEN-LAST:event_calisanTablosuMouseClicked

    private void silmeButonu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silmeButonu1ActionPerformed
        mesajYazisi2.setText("");
        int selectedRow = calisanTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi2.setText("Çalışanlar tablosu şu anda boş ! ");
            } else {
                mesajYazisi2.setText("Lütfen silinecek çalışanı seçiniz ! ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.calisanSil(id);
            calisanGoruntule();
            mesajYazisi2.setText("Çalışan başarıyla silindi...");
        }
    }//GEN-LAST:event_silmeButonu1ActionPerformed

    public void calisanGoruntule() {
        model.setRowCount(0);

        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();

        calisanlar = islemler.calisanlariGetir();

        if (calisanlar != null) {

            for (Calisan calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(), calisan.getAd(), calisan.getSoyad(), calisan.getDepartman(), calisan.getMaas()};
                model.addRow(eklenecek);
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adEklemeAlani;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JTable calisanTablosu;
    private javax.swing.JTextField departmanEklemeAlani;
    private javax.swing.JButton eklemeButonu;
    private javax.swing.JButton guncellemeButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maasEklemeAlani;
    private javax.swing.JLabel mesajYazisi2;
    private javax.swing.JButton silmeButonu1;
    private javax.swing.JTextField soyadEklemeAlani;
    // End of variables declaration//GEN-END:variables
}
