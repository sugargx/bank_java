/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.aMain;

import src.po.Account;

/**
 *
 * @author HP
 */
public class addAccount_backFrame extends javax.swing.JFrame {

    
     static Account account = new Account();
    /**
     * Creates new form addAccount_backFrame
     */
     static int id;
     static String password;
    public addAccount_backFrame(int id, String password) {
        
        initComponents();
        setLocationRelativeTo(null); 
        
//        this.account = acc;
//        
//        TF_id.setText(acc.getId() + "");
//        TF_password.setText(acc.getPassword());
        this.id = id;
        this.password = password;
        System.out.println(id);
        System.out.println(password);         
        TF_id.setText(id+ "");
        TF_password.setText(password);
        
        
    }

//    addAccount_backFrame(int id, String password) {
//        TF_id.setText(id+ "");
//        TF_password.setText(password);
//    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        TF_id = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        TF_password = new javax.swing.JTextField();
        btn_yes = new javax.swing.JButton();
        label_title2 = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        label_id.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_id.setText("id:");

        TF_id.setEnabled(false);
        TF_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_idActionPerformed(evt);
            }
        });

        label_password.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_password.setText("初始密码：");

        TF_password.setEnabled(false);

        btn_yes.setFont(new java.awt.Font("华文彩云", 0, 24)); // NOI18N
        btn_yes.setText("确认");
        btn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yesActionPerformed(evt);
            }
        });

        label_title2.setFont(new java.awt.Font("幼圆", 0, 24)); // NOI18N
        label_title2.setText("恭喜您开户成功！");

        label_info.setFont(new java.awt.Font("宋体", 0, 12)); // NOI18N
        label_info.setForeground(new java.awt.Color(153, 153, 153));
        label_info.setText("建议您尽快修改密码！");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(label_title2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_password)
                            .addComponent(label_id))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_password, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(TF_id))
                                .addGap(18, 18, 18)
                                .addComponent(label_info))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btn_yes)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_title2)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(TF_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_info))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_yes)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        this.setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btn_yesActionPerformed

    private void TF_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_idActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(addAccount_backFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addAccount_backFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addAccount_backFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addAccount_backFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addAccount_backFrame(id, password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_password;
    private javax.swing.JButton btn_yes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title2;
    // End of variables declaration//GEN-END:variables
}
