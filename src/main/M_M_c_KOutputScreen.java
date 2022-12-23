package main;
import java.text.DecimalFormat;
public class M_M_c_KOutputScreen extends javax.swing.JFrame {
    private static M_M_c_K obj;
    public M_M_c_KOutputScreen(M_M_c_K var) {
        initComponents();
        obj = var;
        DecimalFormat format = new DecimalFormat("0.#####");
        λLabel.setText(λLabel.getText() + format.format(obj.getArrivalRate()));
        μLabel.setText(μLabel.getText() + format.format(obj.getServiceRate()));
        cLabel.setText(cLabel.getText() + obj.getC());
        kLabel.setText(kLabel.getText() + obj.getC());
        lOutput.setText(format.format(obj.getL()));
        lqOutput.setText(format.format(obj.getLq()));
        wOutput.setText(format.format(obj.getW()));
        wqOutput.setText(format.format(obj.getWq()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        λLabel = new javax.swing.JLabel();
        μLabel = new javax.swing.JLabel();
        lLabel = new javax.swing.JLabel();
        lqLabel = new javax.swing.JLabel();
        wLabel = new javax.swing.JLabel();
        wqLabel = new javax.swing.JLabel();
        lOutput = new javax.swing.JTextField();
        pLabel = new javax.swing.JLabel();
        pInput = new javax.swing.JTextField();
        pEqualsButton = new javax.swing.JButton();
        lqOutput = new javax.swing.JTextField();
        wOutput = new javax.swing.JTextField();
        wqOutput = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        pOutput = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        cLabel = new javax.swing.JLabel();
        kLabel = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(50, 50, 50));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("M / M / c / K / FCFS");

        λLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        λLabel.setForeground(new java.awt.Color(50, 50, 50));
        λLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        λLabel.setText("λ = ");

        μLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        μLabel.setForeground(new java.awt.Color(50, 50, 50));
        μLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        μLabel.setText("μ = ");

        lLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        lLabel.setForeground(new java.awt.Color(130, 0, 0));
        lLabel.setText("L = ");

        lqLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        lqLabel.setForeground(new java.awt.Color(130, 0, 0));
        lqLabel.setText("Lq = ");

        wLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        wLabel.setForeground(new java.awt.Color(130, 0, 0));
        wLabel.setText("W = ");

        wqLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        wqLabel.setForeground(new java.awt.Color(130, 0, 0));
        wqLabel.setText("Wq = ");

        lOutput.setEditable(false);
        lOutput.setBackground(new java.awt.Color(230, 230, 230));
        lOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lOutput.setForeground(new java.awt.Color(0, 130, 0));
        lOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lOutputActionPerformed(evt);
            }
        });

        pLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        pLabel.setForeground(new java.awt.Color(130, 0, 0));
        pLabel.setText("P");

        pInput.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        pInput.setForeground(new java.awt.Color(50, 50, 50));
        pInput.setText("0");
        pInput.setMargin(new java.awt.Insets(2, 2, -6, 2));
        pInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pInputActionPerformed(evt);
            }
        });

        pEqualsButton.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        pEqualsButton.setForeground(new java.awt.Color(130, 0, 0));
        pEqualsButton.setText("=");
        pEqualsButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pEqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pEqualsButtonActionPerformed(evt);
            }
        });

        lqOutput.setEditable(false);
        lqOutput.setBackground(new java.awt.Color(230, 230, 230));
        lqOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lqOutput.setForeground(new java.awt.Color(0, 130, 0));
        lqOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lqOutputActionPerformed(evt);
            }
        });

        wOutput.setEditable(false);
        wOutput.setBackground(new java.awt.Color(230, 230, 230));
        wOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        wOutput.setForeground(new java.awt.Color(0, 130, 0));

        wqOutput.setEditable(false);
        wqOutput.setBackground(new java.awt.Color(230, 230, 230));
        wqOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        wqOutput.setForeground(new java.awt.Color(0, 130, 0));

        OK.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        OK.setForeground(new java.awt.Color(0, 0, 130));
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        pOutput.setEditable(false);
        pOutput.setBackground(new java.awt.Color(230, 230, 230));
        pOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        pOutput.setForeground(new java.awt.Color(0, 130, 0));

        separator.setForeground(new java.awt.Color(50, 50, 50));

        cLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        cLabel.setForeground(new java.awt.Color(50, 50, 50));
        cLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cLabel.setText("c = ");

        kLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        kLabel.setForeground(new java.awt.Color(50, 50, 50));
        kLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kLabel.setText("K = ");

        Back.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 130));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(wqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(wqOutput))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(wLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(wOutput))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(lqOutput))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(lOutput))
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(λLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(μLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pEqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(pOutput))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45))))))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(λLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(μLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lqOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wqOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pEqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pInputActionPerformed

    private void lqOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lqOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lqOutputActionPerformed

    private void lOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lOutputActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OKActionPerformed

    private void pEqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pEqualsButtonActionPerformed
        try
        {
            String input = pInput.getText().replaceAll(" ", "");
            int n = Integer.parseInt(input);
            if(n < 0)
                pInput.setText("0");
            else if(n > obj.getK())
                pInput.setText(Integer.toString(obj.getK()));
            pOutput.setText((new DecimalFormat("0.#####")).format(obj.pOfN(n)));
        } catch(Exception e) {
            pOutput.setText("error");
        }
    }//GEN-LAST:event_pEqualsButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        M_M_c_KInputScreen screen = new M_M_c_KInputScreen();
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed
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
            java.util.logging.Logger.getLogger(M_M_c_KOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_M_c_KOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_M_c_KOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_M_c_KOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_M_c_KOutputScreen(obj).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton OK;
    private javax.swing.JLabel cLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kLabel;
    private javax.swing.JLabel lLabel;
    private javax.swing.JTextField lOutput;
    private javax.swing.JLabel lqLabel;
    private javax.swing.JTextField lqOutput;
    private javax.swing.JButton pEqualsButton;
    private javax.swing.JTextField pInput;
    private javax.swing.JLabel pLabel;
    private javax.swing.JTextField pOutput;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JLabel wLabel;
    private javax.swing.JTextField wOutput;
    private javax.swing.JLabel wqLabel;
    private javax.swing.JTextField wqOutput;
    private javax.swing.JLabel λLabel;
    private javax.swing.JLabel μLabel;
    // End of variables declaration//GEN-END:variables
}