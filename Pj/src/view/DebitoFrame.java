/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerDebito;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author unifgalbuquerque
 */
public class DebitoFrame extends javax.swing.JFrame {

    /**
     * Creates new form DebitoFrame
     */
    public DebitoFrame() {
        initComponents();
        controller = new ControllerDebito(this);
    }

    public JLabel getDébito() {
        return Débito;
    }

    public void setDébito(JLabel Débito) {
        this.Débito = Débito;
    }

    public JToggleButton getButtonconcluido() {
        return buttonconcluido;
    }

    public void setButtonconcluido(JToggleButton buttonconcluido) {
        this.buttonconcluido = buttonconcluido;
    }

    public JLabel getLbconta() {
        return lbconta;
    }

    public void setLbconta(JLabel lbconta) {
        this.lbconta = lbconta;
    }

    public JLabel getLbcpf() {
        return lbcpf;
    }

    public void setLbcpf(JLabel lbcpf) {
        this.lbcpf = lbcpf;
    }

    public JLabel getLbvalor() {
        return lbvalor;
    }

    public void setLbvalor(JLabel lbvalor) {
        this.lbvalor = lbvalor;
    }

    public JTextField getTxtconta() {
        return txtconta;
    }

    public void setTxtconta(JTextField txtconta) {
        this.txtconta = txtconta;
    }

    public JTextField getTxtcpf() {
        return txtcpf;
    }

    public void setTxtcpf(JTextField txtcpf) {
        this.txtcpf = txtcpf;
    }

    public JTextField getTxtvalor() {
        return txtvalor;
    }

    public void setTxtvalor(JTextField txtvalor) {
        this.txtvalor = txtvalor;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Débito = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        txtconta = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        lbcpf = new javax.swing.JLabel();
        lbvalor = new javax.swing.JLabel();
        lbconta = new javax.swing.JLabel();
        buttonconcluido = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Débito.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Débito.setText("Débito");

        lbcpf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbcpf.setText("CPF:");

        lbvalor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbvalor.setText("Valor:");

        lbconta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbconta.setText("Conta:");

        buttonconcluido.setText("Concluído");
        buttonconcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonconcluidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Débito))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbconta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtconta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(buttonconcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Débito)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtconta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbconta, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbvalor, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(buttonconcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonconcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonconcluidoActionPerformed
        // TODO add your handling code here:
//        controller.opDebito();
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
//            java.util.logging.Logger.getLogger(DebitoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DebitoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DebitoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DebitoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DebitoFrame().setVisible(true);
//            }
//        });
//    }
    private ControllerDebito controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Débito;
    private javax.swing.JToggleButton buttonconcluido;
    private javax.swing.JLabel lbconta;
    private javax.swing.JLabel lbcpf;
    private javax.swing.JLabel lbvalor;
    private javax.swing.JTextField txtconta;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
