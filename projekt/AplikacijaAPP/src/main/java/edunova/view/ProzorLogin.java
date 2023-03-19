/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaOperater;
import edunova.model.Operater;
import edunova.util.Aplikacija;
import java.awt.event.KeyEvent;

/**
 *
 * @author dell
 */
public class ProzorLogin extends javax.swing.JFrame {

    private ObradaOperater obrada;

    /**
     * Creates new form ProzorLogin
     */
    public ProzorLogin() {
        initComponents();
        obrada = new ObradaOperater();
        setTitle(Aplikacija.NAZIV_APP + " Login");
    }

    private void autoriziraj() {
        lblPoruka.setText("");
        if (txtEmail.getText().isEmpty()) {
            lblPoruka.setText("Obavezno email");
            return;
        }

        if (pswLozinka.getPassword().length == 0) {
            lblPoruka.setText("Obavezno lozinka");
            return;
        }

        Operater o = obrada.autoriziraj(txtEmail.getText(),
                pswLozinka.getPassword());

        if (o == null) {
            lblPoruka.setText("Neispravna kombinacija emaila i lozinke");
            return;
        }
        Aplikacija.OPERATER=o;

        new ProzorIzbornik().setVisible(true);
        dispose();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        btnAutoriziraj = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Email");

        txtEmail.setText("ivandubravac99@gmail.com");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel2.setText("Lozinka");

        pswLozinka.setText("edunova");
        pswLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswLozinkaKeyPressed(evt);
            }
        });

        btnAutoriziraj.setText("Autoriziraj");
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswLozinka, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAutoriziraj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAutoriziraj)
                .addGap(18, 18, 18)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
        autoriziraj();
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        lblPoruka.setText("");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtEmail.getText().isEmpty()) {
                lblPoruka.setText("Obavezno email");
                return;
            }

            if (pswLozinka.getPassword().length == 0) {
                pswLozinka.requestFocus();
                lblPoruka.setText("Obavezno lozinka");
                return;
            }
            autoriziraj();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void pswLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswLozinkaKeyPressed
        lblPoruka.setText("");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (pswLozinka.getPassword().length == 0) {
                lblPoruka.setText("Obavezno lozinka");
                return;
            }

            if (txtEmail.getText().isEmpty()) {
                lblPoruka.setText("Obavezno email");
                txtEmail.requestFocus();
                return;
            }
            autoriziraj();
        }
    }//GEN-LAST:event_pswLozinkaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
