/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.network2.pkg0;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Properties;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.ButtonGroup;
import javax.swing.*;


/**
 *
 * @author Cool Dev
 */
public class ProfileDetails extends javax.swing.JFrame {

    /**
     * Creates new form ProfileDetails
     */
    public ProfileDetails() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        rbt_female = new javax.swing.JRadioButton();
        rbt_male = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_realname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_bio = new javax.swing.JTextField();
        ta_hobbies = new javax.swing.JTextField();
        tf_happy = new javax.swing.JTextField();
        tf_embar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1282, 917));
        setPreferredSize(new java.awt.Dimension(2000, 20000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Whom Do U Love more?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 240, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("D . O . B");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 20));

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 160, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("My Bio");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 80, 30));

        rbt_female.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        rbt_female.setText("Female");
        rbt_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_femaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 90, -1));

        rbt_male.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        rbt_male.setText("Male");
        rbt_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_maleActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("INTERESTED IN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 280, 40, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("REAL NAME");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 40));

        jRadioButton3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton3.setText("Complicated");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton4.setText("I'm an Entrepreneur.");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        jRadioButton5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton5.setText("Commited");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("AGE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 40));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setText("RELALATIONSHIP STATUS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 230, 40));

        jRadioButton6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton6.setText("No");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, -1, -1));

        jRadioButton8.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton8.setText("I'm a Student");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jRadioButton9.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton9.setText("I'm an Employee");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("What Are u Pursuing Now");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 230, 40));

        jRadioButton10.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton10.setText("Single");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jRadioButton11.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton11.setText("Mom");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Are you an Atheist?");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 210, 40));

        jRadioButton12.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton12.setText("Both");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, -1, -1));

        jRadioButton13.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton13.setText("Yes");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        jRadioButton14.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButton14.setText("Yes");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        jRadioButton15.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButton15.setText("Yes");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        jRadioButton16.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jRadioButton16.setText("Dad");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Most Happiest Moments");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 240, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("HOBBIES");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, 40));

        tf_realname.setText(" Enter ur Real Name");
        tf_realname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_realnameMouseClicked(evt);
            }
        });
        getContentPane().add(tf_realname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 130, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Most Embarassing Moments");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, 40));

        tf_bio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bioActionPerformed(evt);
            }
        });
        getContentPane().add(tf_bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 260, 60));

        ta_hobbies.setText("Say about ur Hobbies");
        ta_hobbies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta_hobbiesMouseClicked(evt);
            }
        });
        getContentPane().add(ta_hobbies, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 190, 80));

        tf_happy.setForeground(new java.awt.Color(255, 255, 255));
        tf_happy.setText("  Moments you want to ReLive");
        getContentPane().add(tf_happy, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 260, 60));

        tf_embar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_embarActionPerformed(evt);
            }
        });
        getContentPane().add(tf_embar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 260, 60));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 120, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 620, 370));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 620, 360));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 610, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
      
    private static String username;
    
    private void BigDataUser()
    {
        String usernametxt = username+"_big_data.txt";
        HashMap <String,String> mapping = new HashMap<String,String>();
        mapping.put("Real Name",tf_realname.getText());
    // mapping.put("Last name",jTextField1.getText());
    // mapping.put("Date of Birth",jTextField5.getText());
    //  mapping.put("D O B",jDateChooser1.getDate());
        mapping.put("Hobbies ",ta_hobbies.getText()); 
        mapping.put("Most Happiest Moments",tf_happy.getText());
        mapping.put("Most Embarassing Moments",tf_embar.getText());
        mapping.put("My bio",tf_bio.getText());
      
        
        Properties properties = new Properties();
        properties.putAll(mapping);
        try
        {   
            FileOutputStream f = new FileOutputStream(usernametxt);
            properties.store(f,null);
            f.close();
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Error creating File","ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
    }
       
    
    private void rbt_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_femaleActionPerformed

    private void rbt_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_maleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbt_maleActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void tf_realnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_realnameMouseClicked
        // TODO add your handling code here:
        tf_realname.setText("");
    }//GEN-LAST:event_tf_realnameMouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
          //String date = fmt.format(this.txt_data_ini.getDate());
           // DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
           // String date = fmt.format(this.txt_data_ini.getDate()); //jdatechooser
           // this.teste.setText(date);
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void tf_embarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_embarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_embarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         setVisible(false);
        BigDataUser();
        //Update the profile just presented
        Login newswall = new Login(username);
        //newswall.setSize(getSize());
        newswall.setLocationRelativeTo(null);
        newswall.setVisible(true);
        this.dispose();        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void ta_hobbiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta_hobbiesMouseClicked
        // TODO add your handling code here:
        ta_hobbies.setText("");
    }//GEN-LAST:event_ta_hobbiesMouseClicked

    private void tf_bioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bioActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProfileDetails().setVisible(true);
             //   new ProfileDetails().();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton rbt_female;
    private javax.swing.JRadioButton rbt_male;
    private javax.swing.JTextField ta_hobbies;
    private javax.swing.JTextField tf_bio;
    private javax.swing.JTextField tf_embar;
    private javax.swing.JTextField tf_happy;
    private javax.swing.JTextField tf_realname;
    // End of variables declaration//GEN-END:variables

      
   
  
}
