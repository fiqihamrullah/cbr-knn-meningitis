/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
package cbrknnmeningitis;

import db.CasesDBManager;
import db.TableViewer;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import utility.Util;
 

/**
 *
 * @author TOSHIBA
 */
public class FormCases extends javax.swing.JFrame 
{
     
       private int idxrow;
       private Meningitis meningitis;
      

    /** Creates new form FormCases */
    public FormCases() 
    {
        initComponents();
        Util.TengahWindow(this);
        setResizable(false);        
        setTitle("Pengolahan Data Kasus");
        initTable();
        loadDataCases();
    }
   
    private void initTable()
    {
       jtblatributmeningitis.setModel(TableViewer.ConvertMengitisListToTableModel());
       
        

 
    }
     
  
     public void loadDataCases()
     {
        CasesDBManager cdbmanager = new CasesDBManager();  
        CasesDBManager cdbm = new CasesDBManager();
        meningitis = cdbm.loadListAllCases();
        jTblCases.setModel(TableViewer.ConvertMengitisCaseToTableModel(meningitis));
     } 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmbStatus = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblatributmeningitis = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCases = new javax.swing.JTable();
        jbtnTutup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnHapus = new javax.swing.JButton();
        jbtnSimpan = new javax.swing.JButton();
        jtbnBersihkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entri Kasus"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Meningitis");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jcmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ya", "Tidak" }));
        jcmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jcmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 300, -1));

        jtblatributmeningitis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblatributmeningitis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblatributmeningitisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblatributmeningitis);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, 360));

        jLabel5.setText("Atribut Meningitis");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 419, 460));

        jTblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTblCases.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTblCases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblCasesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblCases);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 121, 620, 390));

        jbtnTutup.setText("Tutup");
        jbtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTutupActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("PENGOLAHAN DATA KASUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jbtnHapus.setText("Hapus");
        jbtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 130, 50));

        jbtnSimpan.setText("Simpan");
        jbtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 170, 50));

        jtbnBersihkan.setText("Bersihkan");
        jtbnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnBersihkanActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnBersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTutupActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jbtnTutupActionPerformed

private void jcmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStatusActionPerformed
// TODO add your handling code here:
   
}//GEN-LAST:event_jcmbStatusActionPerformed

private void jbtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSimpanActionPerformed
// TODO add your handling code here:
    // TODO add your handling code here:
    MeningitisData md = new MeningitisData(-1);
    String slc = jcmbStatus.getSelectedItem().toString();
    if (slc.equals("Ya"))
    {
      md.setTypeofMeningitis("1");
    }else{
      md.setTypeofMeningitis("0");  
    }
  
    for(int i=0;i<jtblatributmeningitis.getRowCount();i++)
    {
        ParameterAttribute pa  = new ParameterAttribute(jtblatributmeningitis.getValueAt(i, 1).toString());
        md.addData(pa, Double.parseDouble(jtblatributmeningitis.getValueAt(i, 2).toString()));
       
         
         
    }
    
     
    CasesDBManager cdb = new CasesDBManager();
    cdb.saveCase(md);    
    JOptionPane.showMessageDialog(this, "Data Kasus Berhasil Disimpan!","Sukses",JOptionPane.INFORMATION_MESSAGE);
    
}//GEN-LAST:event_jbtnSimpanActionPerformed

private void jbtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHapusActionPerformed
// TODO add your handling code here:
    int respon = JOptionPane.showConfirmDialog(this,"Apakah Anda yakin akan menghapus Kasus tersebut?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (respon == JOptionPane.YES_NO_OPTION)
    {
        CasesDBManager cdbmanager = new CasesDBManager();  
        cdbmanager.deleteCase(meningitis.getData(idxrow)); 
        loadDataCases();
        JOptionPane.showMessageDialog(this, "Data Kasus Tersebut Berhasil Dihapus!","Sukses",JOptionPane.INFORMATION_MESSAGE);
    } 
}//GEN-LAST:event_jbtnHapusActionPerformed

private void jTblCasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCasesMouseClicked
// TODO add your handling code here:
    int baris = jTblCases.rowAtPoint(evt.getPoint());

}//GEN-LAST:event_jTblCasesMouseClicked

private void jtblatributmeningitisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblatributmeningitisMouseClicked
// TODO add your handling code here:
     
}//GEN-LAST:event_jtblatributmeningitisMouseClicked

private void jtbnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnBersihkanActionPerformed
// TODO add your handling code here:
    initTable();
}//GEN-LAST:event_jtbnBersihkanActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCases().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblCases;
    private javax.swing.JButton jbtnHapus;
    private javax.swing.JButton jbtnSimpan;
    private javax.swing.JButton jbtnTutup;
    private javax.swing.JComboBox jcmbStatus;
    private javax.swing.JTable jtblatributmeningitis;
    private javax.swing.JButton jtbnBersihkan;
    // End of variables declaration//GEN-END:variables
}
