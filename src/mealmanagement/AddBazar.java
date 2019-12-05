/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealmanagement;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Shohanur Rahman
 */
public class AddBazar extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String todaymeal = null;

    public AddBazar() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

       

        DatabaseToJcombobox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2), "Add Bazar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro", 0, 48), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mealmanagement/update.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setToolTipText("not editable");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mealmanagement/autoset.PNG"))); // NOI18N
        jButton4.setText("Set");
        jButton4.setToolTipText("auto calculate meal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mealmanagement/ssearch.png.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Purchase Amount");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Today's Meal Rate");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setToolTipText("not editable");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mealmanagement/confirm.png"))); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Today's Meal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
           if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Valid Date", "error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {

                String sql = " SELECT * FROM addbazar WHERE Date = ?";

                ps = con.prepareStatement(sql);

                ps.setString(1, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                rs = ps.executeQuery();

                if (rs.next()) {
                    jComboBox1.removeAllItems();
                    jComboBox1.addItem(rs.getString(2));
                    jTextField2.setText(rs.getString(3));
                    //jTextField3.setText(rs.getString(4));
                    //jTextField4.setText(rs.getString(5));
                     DatabaseToJcombobox();
                    rs.close();
                    ps.close();

                } else {
                    JOptionPane.showMessageDialog(null, "No Bazar Added In This Date");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Insert Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBox1.getSelectedItem() != null && jComboBox1.getSelectedItem().equals("Select Name")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Name", "error", JOptionPane.WARNING_MESSAGE);

        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Insert Valid Date", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Insert Amount", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Insert Today's Meal", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Click Set Button", "error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {

                String sql = "insert into addbazar (Date,Name,Amount,Meal,MealRate) values (?,?,?,?,?)";
                ps = con.prepareStatement(sql);

                ps.setString(1, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                String s = jComboBox1.getSelectedItem().toString();
                ps.setString(2, s);

                ps.setString(3, jTextField2.getText());
                ps.setString(4, jTextField3.getText());
                ps.setString(5, jTextField4.getText());

                int R = ps.executeUpdate();

                if (R == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Inserted ");
                    FinalBalance();

                    //jComboBox1.getEditor().setItem("");
                    jComboBox1.removeAllItems();
                    DatabaseToJcombobox();
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");

                } else if (R == 0) {
                    JOptionPane.showMessageDialog(null, "Name and Date already Exist", "error", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (jComboBox1.getSelectedItem() != null && jComboBox1.getSelectedItem().equals("Select Name")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Name", "error", JOptionPane.WARNING_MESSAGE);
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Valid Date", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField2.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Amount", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField3.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Today's Meal", "error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField4.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Click Set Button", "error", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {

                String sql = "update addbazar set Amount = ?, Name =? where  Date=?";
                ps = con.prepareStatement(sql);

                ps.setString(3, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                String s = jComboBox1.getSelectedItem().toString();
                ps.setString(2, s);
                // ps.setString(2, jTextField1.getText());
                ps.setString(1, jTextField2.getText());

                int R = ps.executeUpdate();
                if (R == 1) {
                    JOptionPane.showMessageDialog(null, "update Successfully");

                    FinalBalance();

                    jComboBox1.removeAllItems();
                    DatabaseToJcombobox();
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");

                } else if (R == 0) {
                    JOptionPane.showMessageDialog(null, "insert Amount for update ", "error", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (jTextField2.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Amount", "error", JOptionPane.WARNING_MESSAGE);
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Insert Valid Date", "error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {

                String sql1 = "SELECT SUM(TotalMeal) AS Meal FROM addmeal where Date = ? ";
                ps = con.prepareStatement(sql1);
                ps.setString(1, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());

                rs = ps.executeQuery();

                if (rs.next()) {
                    todaymeal = rs.getString(1);
                    jTextField3.setText(todaymeal);

                    rs.close();
                    ps.close();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            try {
                double bazar = Double.parseDouble(jTextField2.getText());
                double meal = Double.parseDouble(jTextField3.getText());
                // String mealrate = String.valueOf(bazar / meal);

                String mealrate = String.format("%.3f", bazar / meal);
                jTextField4.setText(mealrate);
            } catch (Exception ex) {
                //JOptionPane.showMessageDialog(null, ex);
                JOptionPane.showMessageDialog(null, "No Meal Added on this Date");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_HOME) {
            setVisible(false);
            Home ob = new Home();
            ob.setVisible(true);
            // ob.setExtendedState(JFrame.MAXIMIZED_HORIZ); //max size frame
            ob.setResizable(false);
            ob.setLocationRelativeTo(null);
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close current progran
        }
    }//GEN-LAST:event_formKeyPressed

    public void FinalBalance() {
        String perheadmeal = null;
        String totalbazar = null;
        String totalmeal = null;
        String balance = null;

        //sum total bazar
        try {

            String sql = "SELECT SUM(Amount) AS Totala FROM addbazar ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                totalbazar = rs.getString(1);
                rs.close();
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //totalmeal
        try {

            String sql = "SELECT SUM(Meal) AS Totalm FROM addbazar ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                totalmeal = rs.getString(1);

                rs.close();
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //update
        try {
            String sql1 = "update finalcal set  Balance = Deposite - TotalMeal * ?";
            ps = con.prepareStatement(sql1);

            try {
                double tbazar = Double.parseDouble(totalbazar);
                double tmeal = Double.parseDouble(totalmeal);
                double mealrate = tbazar / tmeal;

                balance = String.format("%.3f", mealrate);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "update Successfully");
            }

            ps.setString(1, balance);

            int R = ps.executeUpdate();
            if (R == 1) {
                JOptionPane.showMessageDialog(null, "update Successfully");

            } else if (R == 0) {
                JOptionPane.showMessageDialog(null, "insert value for update ", "error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void DatabaseToJcombobox() {
        try {
            jComboBox1.addItem("Select Name");
            String sql = "select * from newmember";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                jComboBox1.addItem(name);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void showTableData() {
        try {
            String sql = "select * from addbazar ";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBazar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
