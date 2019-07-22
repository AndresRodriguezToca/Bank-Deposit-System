/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodri
 */
public class budgetFrame extends javax.swing.JFrame {

    /**
     * Creates new form budgetFrame
     * @param name
     * @param email
     */
    public budgetFrame(String name, String email, double budget) {
        //Decoration
        String publicName = name;
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Gather and display user info
        jLabelEmail.setText(email);
        jLabelUserName.setText(name);
        jTextFieldActualBalance.setText(String.valueOf(budget));
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
        jButtonSignOut = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelBalanceText = new javax.swing.JLabel();
        jTextFieldActualBalance = new javax.swing.JTextField();
        jLabelMoney = new javax.swing.JLabel();
        jButtonTakeBalance = new javax.swing.JButton();
        jButtonDeposit = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jLabelCalendar = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();
        jLabelTextCita = new javax.swing.JLabel();
        jLabelPadLock = new javax.swing.JLabel();
        jLabelImageTop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSignOut.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSignOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignOut.setText("Sign Out");
        jButtonSignOut.setName(""); // NOI18N
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, -1));

        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_JD-17_2246811.png"))); // NOI18N
        jPanel1.add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 116));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("someone@someone.com");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 182, 27));

        jLabelWelcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWelcome.setText("Welcome back,");
        jPanel1.add(jLabelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserName.setText("Someone");
        jPanel1.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, -1));

        jLabelBalanceText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBalanceText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBalanceText.setText("My Balance:");
        jPanel1.add(jLabelBalanceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jTextFieldActualBalance.setEditable(false);
        jTextFieldActualBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldActualBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActualBalanceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldActualBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 40));

        jLabelMoney.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelMoney.setForeground(new java.awt.Color(0, 153, 0));
        jLabelMoney.setText("$");
        jPanel1.add(jLabelMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 30, 50));

        jButtonTakeBalance.setText("Take from Balance");
        jButtonTakeBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTakeBalanceActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTakeBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 160, 50));

        jButtonDeposit.setText("Make a Deposit");
        jButtonDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 160, 50));
        jPanel1.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 640, 10));

        jLabelCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_19-calendar-512x512_265514.png"))); // NOI18N
        jPanel1.add(jLabelCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 120));

        jLabelText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText.setText("Meet a specialist :");
        jPanel1.add(jLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabelTextCita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTextCita.setForeground(new java.awt.Color(0, 153, 255));
        jLabelTextCita.setText("Make an appointment >");
        jLabelTextCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTextCitaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelTextCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabelPadLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_padlock-closed_49855.png"))); // NOI18N
        jLabelPadLock.setText("Protected Area");
        jPanel1.add(jLabelPadLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabelImageTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelImageTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background-3246124_1280.jpg"))); // NOI18N
        jPanel1.add(jLabelImageTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldActualBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActualBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActualBalanceActionPerformed

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        // Sign out button
        JOptionPane.showMessageDialog(rootPane, "Good Bye " + jLabelUserName.getText());
        mainFrame framemain = new mainFrame();
        this.setVisible(false);
        framemain.setVisible(true);
    }//GEN-LAST:event_jButtonSignOutActionPerformed

    private void jButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositActionPerformed
        //Gather the amount of the deposit
        String value = JOptionPane.showInputDialog("How much you want to deposit?");
        double i = Double.parseDouble(value);
        boolean extract = false;
        //Check deposit
        if(i <= 0){
            JOptionPane.showMessageDialog(rootPane, "The deposit made it's less or equal than 0. No operation made.");
        } else if (i > 32767){
            JOptionPane.showMessageDialog(rootPane, "The deposit made it's to big to make a transaction.");
        }
        //Make connection and deposit
        String url = "jdbc:mysql://10.0.0.90:3306/customers_db";
        String username = "Admin";
        String passwordDB = "Andres8888UiOp**";
        mainFrame a = new mainFrame();
        try {
            runMe(url,"customer_db",username,passwordDB, i, extract);
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonDepositActionPerformed

    private void jButtonTakeBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTakeBalanceActionPerformed
        //Gather the amount to take from deposit
        String value = JOptionPane.showInputDialog("How much you want to take out?");
        double i = Double.parseDouble(value);
        boolean extract = true;
        //Make sure input it's less that actual balance
        if(i <= 0){
            JOptionPane.showMessageDialog(rootPane, "Incorrect Value");
        }
        //Make connection and take from deposit
        String url = "jdbc:mysql://10.0.0.90:3306/customers_db";
        String username = "Admin";
        String passwordDB = "Andres8888UiOp**";
        mainFrame a = new mainFrame();
        try {
            runMe(url,"customer_db",username,passwordDB, i, extract);
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTakeBalanceActionPerformed

    private void jLabelTextCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTextCitaMouseClicked
        //Joke
        JOptionPane.showMessageDialog(rootPane, "Sorry, hope you didn't expect a contact form!?");
    }//GEN-LAST:event_jLabelTextCitaMouseClicked
    //Driver Test
    protected void driverTest() throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver Found");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found ... ");
            throw (e);
        }
    }
    //Make Connection
    protected Connection makeCon (String host, String database, String user, String password)
          throws Exception {

            String url = "";
            try {
                url = "jdbc:mysql://10.0.0.90:3306/customers_db";
                Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established to " + url + "...");
            return con;
            } catch (java.sql.SQLException e) {
            System.out.println("Connection couldn't be established to " + url);
            throw (e);
            }
    }
    //Connection and process
    public void runMe(String host, String database, String user, String password, double budget, boolean extract)
            throws Exception {
        
        /* run driverTest method shown below */
        driverTest();

        /* make the connection to the database */
        Connection conMe = makeCon(host, database, user, password);
        
        /*Run Query*/
        String nameUser =jLabelUserName.getText();
        try {
            Statement cs = conMe.createStatement();
            String selectQuery = "SELECT * FROM customers_db.customers";
            ResultSet rs = cs.executeQuery(selectQuery);
            
            //Declare arraylist for selected elements
            ArrayList<String> arrayUser = new ArrayList<>();
            ArrayList<Double> arrayBudget = new ArrayList<>();
            boolean updateDB = false;
            int counter = 0;
            //Gather elements
            while(rs.next()){
                    arrayUser.add(rs.getString("customerName"));
                    arrayBudget.add(rs.getDouble("budget"));
                    counter++;
            }
            //Balance Handle
            for(int i = 0; i < counter; i++){
                    if(arrayUser.get(i).equals(jLabelUserName.getText()) && !extract){
                        double tempBudget = arrayBudget.get(i);
                        budget += tempBudget;
                        updateDB = true;
                    } else if(arrayUser.get(i).equals(jLabelUserName.getText()) && extract){
                        double tempBudget = arrayBudget.get(i);
                        if(budget > tempBudget){
                            JOptionPane.showMessageDialog(rootPane, "You cannot take more than the actual balance");
                            return;
                        } else if(budget < tempBudget){
                            budget = tempBudget - budget;
                        }
                    }
            }
            //Update process
            if(updateDB){
                String updateQuery = "UPDATE customers_db.customers SET budget = '" + budget + "' WHERE customerName = '" + nameUser + "'";
                int row = cs.executeUpdate(updateQuery);
                jTextFieldActualBalance.setText(String.valueOf(budget));
                JOptionPane.showMessageDialog(rootPane, "Balance Updated!");
            } else if(!updateDB){
                String updateQuery = "UPDATE customers_db.customers SET budget = '" + budget + "' WHERE customerName = '" + nameUser + "'";
                int row = cs.executeUpdate(updateQuery);
                jTextFieldActualBalance.setText(String.valueOf(budget));
                JOptionPane.showMessageDialog(rootPane, "Balance Updated!");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Error");
            }
        } catch (SQLException e) {
            System.out.println ("Error executing sql statement");
            throw (e);
        }
        
        /* close the database */
        conMe.close();
        System.out.println("Closed Connection");
    }
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
            java.util.logging.Logger.getLogger(budgetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(budgetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(budgetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(budgetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeposit;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JButton jButtonTakeBalance;
    private javax.swing.JLabel jLabelBalanceText;
    private javax.swing.JLabel jLabelCalendar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelImageTop;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelPadLock;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JLabel jLabelTextCita;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTextFieldActualBalance;
    // End of variables declaration//GEN-END:variables
}
