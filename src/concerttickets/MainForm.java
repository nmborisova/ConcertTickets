/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerttickets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import model.ConcertTicket;

/**
 *
 * @author n.m.borisova
 */
public class MainForm extends javax.swing.JFrame {
    private List<ConcertTicket> tickets;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        tickets = new ArrayList<>();
        loadAllConcerts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNewConcert = new javax.swing.JPanel();
        jTxtConcertTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtPriceRegular = new javax.swing.JTextField();
        jTxtLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnUploadImage = new javax.swing.JButton();
        jLblPhoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelNewConcertImg = new javax.swing.JLabel();
        jPanelListConcerts = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtConcertTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConcertTitleActionPerformed(evt);
            }
        });

        jLabel2.setText("Име на концерта:");

        jLabel3.setText("Цена на стандартен билет");

        jTxtPriceRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPriceRegularActionPerformed(evt);
            }
        });

        jTxtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLocationActionPerformed(evt);
            }
        });

        jLabel4.setText("Локация:");

        jBtnUploadImage.setText("Качи картинка");
        jBtnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUploadImageActionPerformed(evt);
            }
        });

        jButton1.setText("Запази информация за концерт");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelNewConcertImg.setOpaque(true);

        javax.swing.GroupLayout jPanelNewConcertLayout = new javax.swing.GroupLayout(jPanelNewConcert);
        jPanelNewConcert.setLayout(jPanelNewConcertLayout);
        jPanelNewConcertLayout.setHorizontalGroup(
            jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                        .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewConcertLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTxtConcertTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                        .addComponent(jTxtPriceRegular)
                                        .addComponent(jTxtLocation))
                                    .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                                        .addComponent(jBtnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabelNewConcertImg)))))
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addComponent(jLblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanelNewConcertLayout.setVerticalGroup(
            jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewConcertLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtConcertTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPriceRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewConcertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUploadImage)
                    .addComponent(jLabelNewConcertImg))
                .addGap(11, 11, 11)
                .addComponent(jLblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelListConcertsLayout = new javax.swing.GroupLayout(jPanelListConcerts);
        jPanelListConcerts.setLayout(jPanelListConcertsLayout);
        jPanelListConcertsLayout.setHorizontalGroup(
            jPanelListConcertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        jPanelListConcertsLayout.setVerticalGroup(
            jPanelListConcertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jMenu1.setText("New Ticket");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("List all");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelNewConcert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelListConcerts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelNewConcert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelListConcerts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        jPanelListConcerts.setVisible(false);
        jPanelNewConcert.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        jPanelListConcerts.setVisible(true);
        loadAllConcerts();
        jPanelNewConcert.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void loadAllConcerts(){
        
        int y = 10;
        for(ConcertTicket t : tickets) {
            JPanel ticketPanel = new TicketDetails(t);
            ticketPanel.setVisible(true);
            ticketPanel.setBounds(10,y,577,139);
            y+=100;
            jPanelListConcerts.add(ticketPanel);
        }
    }
    
    private void jTxtConcertTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConcertTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConcertTitleActionPerformed

    private void jTxtPriceRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPriceRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPriceRegularActionPerformed

    private void jTxtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLocationActionPerformed

    private void jBtnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUploadImageActionPerformed
        // TODO add your handling code here:
        
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.addChoosableFileFilter(new ImageFilter());
       fileChooser.setAcceptAllFileFilterUsed(false);

       int option = fileChooser.showOpenDialog(this);
       if(option == JFileChooser.APPROVE_OPTION){
          File file = fileChooser.getSelectedFile();
          try {               
               Path resourceDirectory = Paths.get("src","resources");
               String absolutePath = resourceDirectory.toFile().getAbsolutePath();
              
               FileChannel src = new FileInputStream(file).getChannel();
               FileChannel dest = new FileOutputStream(new File(absolutePath+"/"+file.getName())).getChannel();
               dest.transferFrom(src, 0, src.size());
               src.close();
               dest.close();
               ImageIcon imgIcon = new ImageIcon(absolutePath+"/"+file.getName());
               jLblPhoto.setIcon(imgIcon);
               jLblPhoto.setSize(imgIcon.getIconWidth(), imgIcon.getIconHeight());
               jLabelNewConcertImg.setText(file.getName());
           } catch (Exception ex) {
               // TODO Auto-generated catch block
               ex.printStackTrace();
           }
       }else{
       }
    }//GEN-LAST:event_jBtnUploadImageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ConcertTicket ticket = new ConcertTicket();
        ticket.setConcertTitle(jTxtConcertTitle.getText());
        ticket.setLocation(jTxtLocation.getText());
        ticket.setRegularPrice(Double.valueOf(jTxtPriceRegular.getText()));
        ticket.setPhotoName(jLabelNewConcertImg.getText());
        tickets.add(ticket);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnUploadImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNewConcertImg;
    private javax.swing.JLabel jLblPhoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelListConcerts;
    private javax.swing.JPanel jPanelNewConcert;
    private javax.swing.JTextField jTxtConcertTitle;
    private javax.swing.JTextField jTxtLocation;
    private javax.swing.JTextField jTxtPriceRegular;
    // End of variables declaration//GEN-END:variables
}
