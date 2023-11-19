/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.Conexao;
import DAO.GerenteDAO;
import java.awt.GridLayout;
import java.sql.Connection;
import java.util.List;
import javax.swing.JLabel;
import java.sql.SQLException;

/**
 *
 * @author unifgalbuquerque
 */
public class SaldoContasFrame extends javax.swing.JFrame {

    /**
     * Creates new form SaldoContasFrame
     */
    public SaldoContasFrame() {
        initComponents();
    }
    public void exibirContasBanco() {
    panelinfo.removeAll(); // Remove qualquer componente anteriormente exibido

    try {
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        GerenteDAO dao = new GerenteDAO(conn);

        List<String[]> saldos = dao.obterSaldosContas();
        

        panelinfo.setLayout(new GridLayout(saldos.size(), 1));

        for (String[] dadosConta : saldos) {
            String cpf = dadosConta[0];
            String saldo = dadosConta[1];
            
            JLabel labelSaldo = new JLabel("Cpf: " + cpf + "  " + "Saldo: " + saldo);
            panelinfo.add(labelSaldo); 
        }

        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        
    }

    panelinfo.revalidate(); 
    panelinfo.repaint();
}

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbsaldodascontas = new javax.swing.JLabel();
        buttonconcluido = new javax.swing.JButton();
        panelinfo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbsaldodascontas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbsaldodascontas.setText("Saldo das Contas");

        buttonconcluido.setText("Concluído");
        buttonconcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonconcluidoActionPerformed(evt);
            }
        });

        panelinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelinfoLayout = new javax.swing.GroupLayout(panelinfo);
        panelinfo.setLayout(panelinfoLayout);
        panelinfoLayout.setHorizontalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelinfoLayout.setVerticalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbsaldodascontas)
                    .addComponent(buttonconcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbsaldodascontas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonconcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonconcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonconcluidoActionPerformed
        // TODO add your handling code here:
        new OutraOpFrame().setVisible(true);
    }//GEN-LAST:event_buttonconcluidoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SaldoContasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SaldoContasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SaldoContasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SaldoContasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SaldoContasFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonconcluido;
    private javax.swing.JLabel lbsaldodascontas;
    private javax.swing.JPanel panelinfo;
    // End of variables declaration//GEN-END:variables
}
