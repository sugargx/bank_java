/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.aMain;

import src.Dao.BankDao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class transmoneyFrame extends javax.swing.JFrame {

    /**
     * Creates new form transmoneyFrame
     */
    BankDao dao = new BankDao();

    public transmoneyFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        TF_id = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        TF_password = new javax.swing.JTextField();
        label_id_accept = new javax.swing.JLabel();
        TF_id_accept = new javax.swing.JTextField();
        label_money = new javax.swing.JLabel();
        TF_money = new javax.swing.JTextField();
        btn_yes = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("华文琥珀", 0, 24)); // NOI18N
        jLabel1.setText("转账");

        label_id.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_id.setText("转出人账号：");

        label_password.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_password.setText("转出人密码：");

        label_id_accept.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_id_accept.setText("转入人账号：");

        TF_id_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_id_acceptActionPerformed(evt);
            }
        });

        label_money.setFont(new java.awt.Font("华文彩云", 0, 18)); // NOI18N
        label_money.setText("转账金额：");

        btn_yes.setFont(new java.awt.Font("华文彩云", 0, 24)); // NOI18N
        btn_yes.setText("确定");
        btn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yesActionPerformed(evt);
            }
        });

        btn_no.setFont(new java.awt.Font("华文彩云", 0, 24)); // NOI18N
        btn_no.setText("取消");
        btn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_yes)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_password)
                        .addComponent(label_id)
                        .addComponent(label_money)
                        .addComponent(label_id_accept)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_no)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_money, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TF_id_accept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(TF_password, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(TF_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_id_accept)
                    .addComponent(TF_id_accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_money)
                    .addComponent(TF_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_yes)
                    .addComponent(btn_no))
                .addGap(48, 48, 48))
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

    private void TF_id_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_id_acceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_id_acceptActionPerformed

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        String id_s = TF_id.getText();
        String password = TF_password.getText();
        String id_accept_s = TF_id_accept.getText();
        String money_s = TF_money.getText();
        int flag_id = 1;
        int flag_id_accept = 1;
        int flag_money = 1;
        if (money_s.charAt(0) == '.' || money_s.charAt(money_s.length() - 1) == '.') {
            flag_money = 0;
        } else {
            for (int i = 1; i < money_s.length() - 1; i++) {
                if ((money_s.charAt(i) < '0' || money_s.charAt(i) > '9') && money_s.charAt(i) != '.') {
                    flag_money = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < id_s.length(); i++) {
            if (id_s.charAt(i) < '0' || id_s.charAt(i) > '9') {
                flag_id = 0;
                break;
            }
        }
        for (int i = 0; i < id_accept_s.length(); i++) {
            if (id_accept_s.charAt(i) < '0' || id_accept_s.charAt(i) > '9') {
                flag_id_accept = 0;
                break;
            }
        }
        if (id_s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入您的ID");
        } else if (flag_id == 0) {
            JOptionPane.showMessageDialog(null, "您输入的转出ID格式有误");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入您的密码");
        } else if (id_accept_s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入要转入的ID");
        } else if (flag_id_accept == 0) {
            JOptionPane.showMessageDialog(null, "您输入的转入ID格式有误");
        } else if (id_s.equals(id_accept_s)) {
            JOptionPane.showMessageDialog(null, "抱歉，转入ID与转出ID不能相同");
        } else if (money_s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入您的转账金额");
        } else if (flag_money == 0) {
            JOptionPane.showMessageDialog(null, "您输入的转账金额有误");
        } else {
            try {
                int id = Integer.parseInt(id_s);
                int id_accept = Integer.parseInt(id_accept_s);
                double money = Double.parseDouble(money_s);
                double money_all = -1;
                if (dao.accountExist(id, password) == 0) {
                    JOptionPane.showMessageDialog(null, "转出Id或密码错误！");
                } else if (dao.idExist(id_accept) == 0) {
                    JOptionPane.showMessageDialog(null, "转入Id不存在!");
                } else if ((dao.getMoney(id) - money) <= 0) {
                    this.setVisible(false);
                    new showMoney_transFrame(dao.getMoney(id)).setVisible(true);
                } else {
                    money_all = dao.transMoney(id, money, password, id_accept);
                    if (money_all != -1) {
                        Date date = new Date();
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        this.setVisible(false);
                        new transmoney_backFrame(money, money_all, df.format(date)).setVisible(true);

                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(transmoneyFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(transmoneyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btn_yesActionPerformed

    private void btn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noActionPerformed
        this.setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btn_noActionPerformed

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
            java.util.logging.Logger.getLogger(transmoneyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transmoneyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transmoneyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transmoneyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transmoneyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_id_accept;
    private javax.swing.JTextField TF_money;
    private javax.swing.JTextField TF_password;
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_id_accept;
    private javax.swing.JLabel label_money;
    private javax.swing.JLabel label_password;
    // End of variables declaration//GEN-END:variables
}
