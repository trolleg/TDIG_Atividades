/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Renan
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }
    
    int variavelAltoContraste = 0;
    int variavelAmpliado = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        modoAltoContraste = new javax.swing.JMenuItem();
        modoAmpliado = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setPreferredSize(new java.awt.Dimension(400, 300));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setText("Depois da promulgação da Constituição, a Lei nº 10.098 foi o primeiro\navanço efetivo na legislação brasileira em relação à acessibilidade.\nEla estabelece normas gerais e critérios básicos para a promoção\nda acessibilidade das pessoas com deficiência ou com mobilidade\nreduzida e dá outras providências.\n\nEssa lei foi regulamentada pelo Decreto nº 5.296, de 2 de dezembro\nde 2004. Este decreto representou um grande avanço, pois\nestabelece, no seu conceito de acessibilidade, a “utilização, com\nsegurança e autonomia, […] dos dispositivos, sistemas e meios de\ncomunicação e informação”.\n\nhttps://mwpt.com.br/acessibilidade-digital/leis-federais-sobre-acessibilidade-na-web/\n");
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Configurações");

        modoAltoContraste.setText("Modo Alto Contraste");
        modoAltoContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoAltoContrasteActionPerformed(evt);
            }
        });
        jMenu1.add(modoAltoContraste);

        modoAmpliado.setText("Modo Ampliado");
        modoAmpliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoAmpliadoActionPerformed(evt);
            }
        });
        jMenu1.add(modoAmpliado);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modoAltoContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoAltoContrasteActionPerformed
        // TODO add your handling code here:
        if(variavelAltoContraste % 2 == 0) {
            panel.setBackground(Color.black);
            textArea.setBackground(Color.black);
            textArea.setForeground(Color.white);
            variavelAltoContraste++;
        }
        else {
            panel.setBackground(Color.white);
            textArea.setBackground(Color.white);
            textArea.setForeground(Color.black);
            variavelAltoContraste++;
        }
    }//GEN-LAST:event_modoAltoContrasteActionPerformed

    private void modoAmpliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoAmpliadoActionPerformed
        // TODO add your handling code here:
        if(variavelAmpliado % 2 == 0) {
            textArea.setFont(new Font("Arial", Font.PLAIN, 24));
            variavelAmpliado++;
        }
        else {
            textArea.setFont(new Font("Arial", Font.PLAIN, 12));
            variavelAmpliado++;
        }
    }//GEN-LAST:event_modoAmpliadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem modoAltoContraste;
    private javax.swing.JMenuItem modoAmpliado;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
