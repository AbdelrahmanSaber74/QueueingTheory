package main;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.util.Pair;
public class DeterministicOutputScreen extends javax.swing.JFrame {
    private static DeterministicQS obj;
    public DeterministicOutputScreen(DeterministicQS var) {
        initComponents();
        obj = var;
        DecimalFormat format = new DecimalFormat("0.#####");
        interArrivalTimeLabel.setText(interArrivalTimeLabel.getText() + format.format(obj.getInterArrivalTime()));
        serviceTimeLabel.setText(serviceTimeLabel.getText() + format.format(obj.getServiceTime()));
        systemCapacityLabel.setText(systemCapacityLabel.getText() + obj.getSystemCapacity());
        mLabel.setText(mLabel.getText() + obj.getM());
        tiOutput.setText(Integer.toString(obj.getTi()));
        ArrayList<Pair<Integer, Integer>> nOfTPoints = new ArrayList<>();
        int maxNOfT = 0;
        double maxWqOfN = 0;
        for(int i = 0; i <= obj.getTi(); i++)
        {
            int nOft = obj.nOfT(i);
            nOfTPoints.add(new Pair(i, nOft));
            maxNOfT = Math.max(maxNOfT, nOft);
        }
        ArrayList<Pair<Integer, Double>> wqOfNPoints = new ArrayList<>();
        for(int i = 0; i <= (obj.getTi() / obj.getInterArrivalTime()); i++)
        {
            double wqOfN = obj.wqOfN(i);
            wqOfNPoints.add(new Pair(i, wqOfN));
            maxWqOfN = Math.max(maxWqOfN, wqOfN);
        }
        DeterministicGraphScreen.display(nOfTPoints, (obj.getTi() + 1), (maxNOfT + 1), wqOfNPoints, (((int) (obj.getTi() / obj.getInterArrivalTime())) + 1), (((int) maxWqOfN) + 1));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        interArrivalTimeLabel = new javax.swing.JLabel();
        serviceTimeLabel = new javax.swing.JLabel();
        tiLabel = new javax.swing.JLabel();
        tiOutput = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        systemCapacityLabel = new javax.swing.JLabel();
        mLabel = new javax.swing.JLabel();
        OK = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(50, 50, 50));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("D / D / 1 / (K - 1) / FCFS");

        interArrivalTimeLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        interArrivalTimeLabel.setForeground(new java.awt.Color(50, 50, 50));
        interArrivalTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        interArrivalTimeLabel.setText("(1 / λ) = ");

        serviceTimeLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        serviceTimeLabel.setForeground(new java.awt.Color(50, 50, 50));
        serviceTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviceTimeLabel.setText("(1 / μ) = ");

        tiLabel.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        tiLabel.setForeground(new java.awt.Color(130, 0, 0));
        tiLabel.setText("ti = ");

        tiOutput.setEditable(false);
        tiOutput.setBackground(new java.awt.Color(230, 230, 230));
        tiOutput.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        tiOutput.setForeground(new java.awt.Color(0, 130, 0));
        tiOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiOutputActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 130));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        separator.setForeground(new java.awt.Color(50, 50, 50));

        systemCapacityLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        systemCapacityLabel.setForeground(new java.awt.Color(50, 50, 50));
        systemCapacityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemCapacityLabel.setText("(K - 1) = ");

        mLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        mLabel.setForeground(new java.awt.Color(50, 50, 50));
        mLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLabel.setText("M = ");

        OK.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        OK.setForeground(new java.awt.Color(0, 0, 130));
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(tiOutput))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(interArrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(systemCapacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(serviceTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interArrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemCapacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiOutputActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        DeterministicInputScreen screen = new DeterministicInputScreen();
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OKActionPerformed
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
            java.util.logging.Logger.getLogger(DeterministicOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeterministicOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeterministicOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeterministicOutputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new DeterministicOutputScreen(obj).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton OK;
    private javax.swing.JLabel interArrivalTimeLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel serviceTimeLabel;
    private javax.swing.JLabel systemCapacityLabel;
    private javax.swing.JLabel tiLabel;
    private javax.swing.JTextField tiOutput;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}