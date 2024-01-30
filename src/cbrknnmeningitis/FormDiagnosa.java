/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
package cbrknnmeningitis;


import db.TableViewer;
import java.util.List;
import javax.swing.JOptionPane;
import utility.Util;

/**
 *
 * @author Fiqih Amrullah
 */
public class FormDiagnosa extends javax.swing.JFrame 
{
     private List<ParameterAttribute> listpa;

    /** Creates new form FormBobot */
    public FormDiagnosa() {
        initComponents(); 
        Util.TengahWindow(this);
        setResizable(false);              
        loadDataAttributes();
        
    }
    
     public void loadDataAttributes()
     {
        jtblatributmeningitis.setModel(TableViewer.ConvertMengitisListToTableModel());    
        
     } 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblatributmeningitis = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlblKemiripan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblResult = new javax.swing.JLabel();
        jbtnTutup = new javax.swing.JButton();
        jbtnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diagnosa Meningitis");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("DIAGNOSA KASUS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entri Kasus Baru dengan Benar"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Meningitis");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, -1));

        jlblKemiripan.setFont(new java.awt.Font("Dialog", 1, 24));
        jlblKemiripan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblKemiripan.setText("0");
        jPanel2.add(jlblKemiripan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 80));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kemiripan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, -1));

        jlblResult.setFont(new java.awt.Font("Dialog", 0, 36));
        jlblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblResult.setText("?");
        jPanel2.add(jlblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 100, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 380, 140));

        jbtnTutup.setText("Tutup");
        jbtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTutupActionPerformed(evt);
            }
        });

        jbtnSimpan.setText("Diagnosa");
        jbtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbtnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jtblatributmeningitisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblatributmeningitisMouseClicked
// TODO add your handling code here:
     
}//GEN-LAST:event_jtblatributmeningitisMouseClicked

private void jbtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSimpanActionPerformed
// TODO add your handling code here:
    // TODO add your handling code here:
     MeningitisData mdata = new MeningitisData(-1); 
     for(int i=0;i<jtblatributmeningitis.getRowCount();i++)
     {
        ParameterAttribute pa  = new ParameterAttribute(jtblatributmeningitis.getValueAt(i, 1).toString());  
        mdata.addData(pa, Double.parseDouble(jtblatributmeningitis.getValueAt(i, 2).toString()));         
     }     
     CaseBaseReasoning cbreasoning = new CaseBaseReasoning(mdata);     
     MeningitisData mdresult = cbreasoning.caseRetrieve();
     jlblKemiripan.setText(String.format("%.2f", mdresult.getSim()  *100) + " %");
     if (mdresult.getTypeofMeningitis().equals("1"))
     {
       jlblResult.setText("Ya");    
     }else{
       jlblResult.setText("Tidak");      
     }
     
     
     JOptionPane.showMessageDialog(this, "Diagnosa Berhasil dilakukan!!","Sukses",JOptionPane.INFORMATION_MESSAGE);
    
}//GEN-LAST:event_jbtnSimpanActionPerformed

private void jbtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTutupActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jbtnTutupActionPerformed

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
            java.util.logging.Logger.getLogger(FormDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDiagnosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormDiagnosa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnSimpan;
    private javax.swing.JButton jbtnTutup;
    private javax.swing.JLabel jlblKemiripan;
    private javax.swing.JLabel jlblResult;
    private javax.swing.JTable jtblatributmeningitis;
    // End of variables declaration//GEN-END:variables
}
