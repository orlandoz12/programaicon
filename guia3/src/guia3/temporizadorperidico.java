 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia3;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class temporizadorperidico extends javax.swing.JFrame {

  Timer temporizador,temporizador2;
  ActionListener al;
  ActionListener bl;
  int h,m,s,hours,minutes,seconds;
    public temporizadorperidico() {
        initComponents();
        
        bl=new ActionListener(){
            int i=0;
              public void actionPerformed(ActionEvent e){
                
                       jLabel3.setText("*****alarma *****"+i);
                       jLabel3.setText("*****alarma *****"+i);
                         jLabel3.setText("*****alarma *****"+i);
                           jLabel3.setText("*****alarma *****"+i);
                  i++;
              
               
             
             
            }
        };
        al=new ActionListener(){
            
           
            public void actionPerformed(ActionEvent e){
             LocalDateTime locaDate=LocalDateTime.now();
             hours=locaDate.getHour();
              minutes=locaDate.getMinute();
              seconds=locaDate.getSecond();
             texto.setText("horas :"+ hours +" : "+ minutes +" : "+ seconds);
            jLabel3.setText("");
            if(hours==h && minutes==m && seconds==s){
            
             temporizador2.start();
}
            }
            
            
        };
        temporizador=new Timer(1000,al);
       temporizador2=new Timer(5000,bl);
       
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
        minutosa = new javax.swing.JTextField();
        segundosa = new javax.swing.JTextField();
        horasa = new javax.swing.JTextField();
        texto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        minutosa.setBackground(new java.awt.Color(51, 255, 0));
        minutosa.setText("0");
        minutosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutosaMouseClicked(evt);
            }
        });
        minutosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minutosaKeyTyped(evt);
            }
        });

        segundosa.setBackground(new java.awt.Color(51, 255, 0));
        segundosa.setText("0");
        segundosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundosaMouseClicked(evt);
            }
        });
        segundosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                segundosaKeyTyped(evt);
            }
        });

        horasa.setBackground(new java.awt.Color(51, 204, 0));
        horasa.setText("0");
        horasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horasaMouseClicked(evt);
            }
        });
        horasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasaActionPerformed(evt);
            }
        });
        horasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horasaKeyTyped(evt);
            }
        });

        texto.setBackground(new java.awt.Color(255, 204, 0));
        texto.setText("RELOJ");

        jLabel4.setText("H");

        jLabel5.setText("M");

        jLabel6.setText("S");

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("programar alarma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horasa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minutosa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segundosa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(71, 71, 71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horasa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutosa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(horasa.getText().isEmpty() || minutosa.getText().isEmpty() || segundosa.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "favor de no dejar campós vacios");
       }else{
           
       
        if(!temporizador.isRunning()){
           temporizador.start();
            h=Integer.parseInt(horasa.getText());
           m=Integer.parseInt(minutosa.getText());
           s=Integer.parseInt(segundosa.getText());
           jButton1.setText("Detener");
            horasa.setVisible(false);
          minutosa.setVisible(false);
          segundosa.setVisible(false);
           }else{
           temporizador.stop();
          
           jButton1.setText("iniciar");
            horasa.setVisible(true);
          minutosa.setVisible(true);
          segundosa.setVisible(true);
           temporizador2.stop();
          horasa.setText("0");
          minutosa.setText("0");
          segundosa.setText("0");
          texto.setText("RELOJ");
       } 
      
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void horasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasaActionPerformed

    private void horasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horasaMouseClicked
         horasa.setText("");
          
        
    }//GEN-LAST:event_horasaMouseClicked

    private void minutosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosaMouseClicked
        minutosa.setText("");
    }//GEN-LAST:event_minutosaMouseClicked

    private void segundosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundosaMouseClicked
          segundosa.setText("");
    }//GEN-LAST:event_segundosaMouseClicked

    private void horasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horasaKeyTyped
   char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
       
    }//GEN-LAST:event_horasaKeyTyped

    private void minutosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutosaKeyTyped
      char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_minutosaKeyTyped

    private void segundosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundosaKeyTyped
      char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_segundosaKeyTyped

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
            java.util.logging.Logger.getLogger(temporizadorperidico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(temporizadorperidico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(temporizadorperidico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(temporizadorperidico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temporizadorperidico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField horasa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField minutosa;
    private javax.swing.JTextField segundosa;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}