package com.mycompany.cronometro;

/**
 *
 * @author javier
 */


import com.mycompany.cronometro.Logica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Timer;



public class Vista extends javax.swing.JFrame {

    Logica crono;
    Timer time;
    
    
    public Vista() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Cronometro");
        
       
        
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        //this.setOpacity(0);
        crono = new Logica();
        time = new Timer(10, run);
        btnStop.setEnabled(false);
        btnRestart.setEnabled(false);
        
        
        
    }
    
    
     ActionListener run = (ActionEvent e) -> {
    
        crono.Cronometrar();
        UpdateTimer();
    
    };
   
    
    public String svf (int value){
      return   String.valueOf(value);
    }
    
    public void restartLabel(){
              
              lblHours.setText("00");
              lblMinutes.setText("00");
              lblSeconds.setText("00");
              lblMsec.setText("00");
    }
    
    public void UpdateTimer(){
        
        String Thours = "";
        String TSeconds = "";
        String TMinutes = "";
        String TMseconds = "";
        
        if(crono.getHours()<=9){
            Thours = "0"+svf(crono.getHours());
        }else{
            Thours = svf(crono.getHours());
        }
        
          if(crono.getMinutes()<=9){
            TMinutes = "0"+svf(crono.getMinutes());
        }else{
            TMinutes = svf(crono.getMinutes());
        }
          
            if(crono.getSeconds()<=9){
            TSeconds = "0"+svf(crono.getSeconds());
        }else{
            TSeconds = svf(crono.getSeconds());
        }
            
              if(crono.getMiliseconds()<=9){
            TMseconds = "0"+svf(crono.getMiliseconds());
        }else{
            TMseconds = svf(crono.getMiliseconds());
        }
              
              lblHours.setText(Thours);
              lblMinutes.setText(TMinutes);
              lblSeconds.setText(TSeconds);
              lblMsec.setText(TMseconds);
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lblSeconds = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMinutes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMsec = new javax.swing.JLabel();
        btnCloset = new com.mycompany.cronometro.CunstomButton();
        btnRestart = new com.mycompany.cronometro.CunstomButton();
        btnStart = new com.mycompany.cronometro.CunstomButton();
        btnStop = new com.mycompany.cronometro.CunstomButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblSeconds.setBackground(new java.awt.Color(0, 102, 255));
        lblSeconds.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        lblSeconds.setForeground(new java.awt.Color(0, 102, 255));
        lblSeconds.setText("00");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText(":");

        lblHours.setBackground(new java.awt.Color(0, 102, 255));
        lblHours.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        lblHours.setForeground(new java.awt.Color(0, 102, 255));
        lblHours.setText("00");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText(":");

        lblMinutes.setBackground(new java.awt.Color(0, 102, 255));
        lblMinutes.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        lblMinutes.setForeground(new java.awt.Color(0, 102, 255));
        lblMinutes.setText("00");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText(":");

        lblMsec.setBackground(new java.awt.Color(0, 102, 255));
        lblMsec.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        lblMsec.setForeground(new java.awt.Color(0, 102, 255));
        lblMsec.setText("00");

        btnCloset.setBackground(new java.awt.Color(153, 0, 0));
        btnCloset.setForeground(new java.awt.Color(204, 0, 0));
        btnCloset.setOpaque(false);
        btnCloset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosetActionPerformed(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(255, 255, 255));
        btnRestart.setForeground(new java.awt.Color(102, 102, 102));
        btnRestart.setText("Restart");
        btnRestart.setOpaque(false);
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setForeground(new java.awt.Color(102, 102, 102));
        btnStart.setText("Start");
        btnStart.setOpaque(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(255, 255, 255));
        btnStop.setForeground(new java.awt.Color(102, 102, 102));
        btnStop.setText("Stop");
        btnStop.setOpaque(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCloset, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHours)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinutes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSeconds)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMsec))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCloset, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblHours)
                            .addComponent(lblSeconds)
                            .addComponent(jLabel2)
                            .addComponent(lblMinutes)
                            .addComponent(jLabel3)
                            .addComponent(lblMsec))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
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

    private void btnClosetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosetActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_btnClosetActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // TODO add your handling code here:

        crono.RestartTimer();
        restartLabel();
        btnStop.setEnabled(false);
        

    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        time.start();
        UpdateTimer();
        btnStop.setEnabled(true);
        btnRestart.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        time.stop();
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.cronometro.CunstomButton btnCloset;
    private com.mycompany.cronometro.CunstomButton btnRestart;
    private com.mycompany.cronometro.CunstomButton btnStart;
    private com.mycompany.cronometro.CunstomButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblMinutes;
    private javax.swing.JLabel lblMsec;
    private javax.swing.JLabel lblSeconds;
    // End of variables declaration//GEN-END:variables
}
