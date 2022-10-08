/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainFrame;

/**
 *
 * @author lindabergsangel
 */
public class MainFrame extends javax.swing.JFrame {

    int nrDatorVinster;
    int nrSpelarVinster;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGrund = new javax.swing.JPanel();
        pnlStenSaxPåse = new javax.swing.JPanel();
        lblSten = new javax.swing.JLabel();
        lblSax = new javax.swing.JLabel();
        lblPåse = new javax.swing.JLabel();
        lblTextDatornvalde = new javax.swing.JLabel();
        lblDatornsVal = new javax.swing.JLabel();
        txfResultat = new javax.swing.JTextField();
        pnlMinaResultat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMinaResultat = new javax.swing.JTextArea();
        btnSpela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlGrund.setBackground(new java.awt.Color(0, 0, 0));

        pnlStenSaxPåse.setBackground(new java.awt.Color(0, 0, 0));
        pnlStenSaxPåse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)), "Välj sten,sax eller påse genom att klicka på en bild", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kokonor", 3, 18), new java.awt.Color(0, 255, 51))); // NOI18N

        lblSten.setIcon(new javax.swing.ImageIcon("/Users/lindabergsangel/Downloads/sten.jpg")); // NOI18N
        lblSten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStenMouseClicked(evt);
            }
        });

        lblSax.setIcon(new javax.swing.ImageIcon("/Users/lindabergsangel/Downloads/sax.jpg")); // NOI18N
        lblSax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaxMouseClicked(evt);
            }
        });

        lblPåse.setIcon(new javax.swing.ImageIcon("/Users/lindabergsangel/Downloads/påse.jpg")); // NOI18N
        lblPåse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPåseMouseClicked(evt);
            }
        });

        lblTextDatornvalde.setFont(new java.awt.Font("Kohinoor Bangla", 2, 14)); // NOI18N
        lblTextDatornvalde.setForeground(new java.awt.Color(255, 255, 255));
        lblTextDatornvalde.setText("Datorn valde:");

        lblDatornsVal.setBackground(new java.awt.Color(255, 255, 255));
        lblDatornsVal.setForeground(new java.awt.Color(255, 255, 255));
        lblDatornsVal.setPreferredSize(new java.awt.Dimension(150, 52));
        lblDatornsVal.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlStenSaxPåseLayout = new javax.swing.GroupLayout(pnlStenSaxPåse);
        pnlStenSaxPåse.setLayout(pnlStenSaxPåseLayout);
        pnlStenSaxPåseLayout.setHorizontalGroup(
            pnlStenSaxPåseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStenSaxPåseLayout.createSequentialGroup()
                .addComponent(lblSten, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblPåse)
                .addContainerGap())
            .addGroup(pnlStenSaxPåseLayout.createSequentialGroup()
                .addComponent(lblTextDatornvalde, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatornsVal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txfResultat)
        );
        pnlStenSaxPåseLayout.setVerticalGroup(
            pnlStenSaxPåseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStenSaxPåseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStenSaxPåseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPåse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(pnlStenSaxPåseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTextDatornvalde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDatornsVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addComponent(txfResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMinaResultat.setBackground(new java.awt.Color(0, 0, 0));
        pnlMinaResultat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)), "Mina resultat:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kohinoor Devanagari", 2, 18), new java.awt.Color(51, 255, 0))); // NOI18N

        txaMinaResultat.setEditable(false);
        txaMinaResultat.setBackground(new java.awt.Color(255, 255, 255));
        txaMinaResultat.setColumns(20);
        txaMinaResultat.setRows(5);
        jScrollPane1.setViewportView(txaMinaResultat);

        javax.swing.GroupLayout pnlMinaResultatLayout = new javax.swing.GroupLayout(pnlMinaResultat);
        pnlMinaResultat.setLayout(pnlMinaResultatLayout);
        pnlMinaResultatLayout.setHorizontalGroup(
            pnlMinaResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinaResultatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMinaResultatLayout.setVerticalGroup(
            pnlMinaResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinaResultatLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnSpela.setBackground(new java.awt.Color(0, 204, 51));
        btnSpela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSpela.setForeground(new java.awt.Color(0, 0, 0));
        btnSpela.setText("SPELA");
        btnSpela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGrundLayout = new javax.swing.GroupLayout(pnlGrund);
        pnlGrund.setLayout(pnlGrundLayout);
        pnlGrundLayout.setHorizontalGroup(
            pnlGrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStenSaxPåse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlGrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGrundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlMinaResultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGrundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnSpela, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        pnlGrundLayout.setVerticalGroup(
            pnlGrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrundLayout.createSequentialGroup()
                .addGroup(pnlGrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGrundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(pnlStenSaxPåse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGrundLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnSpela, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(pnlMinaResultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpelaActionPerformed
        
        btnSpela.setEnabled(false);
        lblDatornsVal.setText("");
        txfResultat.setText("");
        nrSpelarVinster = 0;
        nrDatorVinster = 0;
    }//GEN-LAST:event_btnSpelaActionPerformed

    private void lblStenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStenMouseClicked
        java.util.Random slump = new java.util.Random();
        
        int datornsTal = slump.nextInt(1,4);
        
        String datornsVal = "";
        
        switch(datornsTal)
        {
            case 1:
                datornsVal = "Sten";
                break;
                
            case 2:
                datornsVal = "Sax";
                break;
                
            case 3:
                datornsVal = "Påse";
                break;
                
        }
        
        lblDatornsVal.setText(datornsVal);
        
        if(datornsVal.equals("Sax"))
        {
            nrSpelarVinster++;
        }
        else if(datornsVal.equals("Påse"))
        {
            nrDatorVinster++;
        }
        
        txfResultat.setText("Dator: "+nrDatorVinster+" Spelare: "+nrSpelarVinster);
        
        if(nrDatorVinster >2 || nrSpelarVinster >2)
        {
            txaMinaResultat.append("Dator: "+nrDatorVinster+" Spelare: "+nrSpelarVinster+"\n");
        }
        
    }//GEN-LAST:event_lblStenMouseClicked

    private void lblSaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaxMouseClicked
        java.util.Random slump = new java.util.Random();
        
        int datornsTal = slump.nextInt(1,4);
        String datornsVal = "";
        
        switch(datornsTal)
        {
            case 1:
                datornsVal = "Sax";
                break;
                
            case 2:
                datornsVal = "Påse";
                break;
                
            case 3:
                datornsVal = "Sten";
                break;
        }
        lblDatornsVal.setText(datornsVal);
        
        if(datornsVal.equals("Påse"))
        {
            nrSpelarVinster++;
        }
        else if(datornsVal.equals("Sten"))
        {
            nrDatorVinster++;
        }
        
        txfResultat.setText("Dator: "+nrDatorVinster+" Spelare: "+nrSpelarVinster);
        
        if(nrDatorVinster >2 || nrSpelarVinster >2)
        {
            txaMinaResultat.append("Dator: "+nrDatorVinster+" Spelare: "+nrSpelarVinster+"\n");
        }
    }//GEN-LAST:event_lblSaxMouseClicked

    private void lblPåseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPåseMouseClicked
        java.util.Random slump = new java.util.Random();
        
        int datornsTal = slump.nextInt(1,4);
        String datornsVal = "";
        
        switch(datornsTal)
        {
            case 1:
                datornsVal = "Påse";
                break;
                
            case 2:
                datornsVal = "Sten";
                break;
                
            case 3:
                datornsVal = "Sax";
                break;
        }
        lblDatornsVal.setText(datornsVal);
        
        if(datornsVal.equals("Sten"))
        {
            nrSpelarVinster++;
        }
        else if(datornsVal.equals("Sax"))
        {
            nrDatorVinster++;
        }
        
        txfResultat.setText("Dator: "+nrDatorVinster+" Spelare: "+nrSpelarVinster);
        
        if(nrDatorVinster >2 || nrSpelarVinster >2)
        {
            txaMinaResultat.append("Dator: "+nrDatorVinster+"Spelare: "+nrSpelarVinster+"\n");
        }
    }//GEN-LAST:event_lblPåseMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatornsVal;
    private javax.swing.JLabel lblPåse;
    private javax.swing.JLabel lblSax;
    private javax.swing.JLabel lblSten;
    private javax.swing.JLabel lblTextDatornvalde;
    private javax.swing.JPanel pnlGrund;
    private javax.swing.JPanel pnlMinaResultat;
    private javax.swing.JPanel pnlStenSaxPåse;
    private javax.swing.JTextArea txaMinaResultat;
    private javax.swing.JTextField txfResultat;
    // End of variables declaration//GEN-END:variables
}
