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
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        this.setUndecorated(true);
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jTextField = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jLabelAccessCode = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jButtonNewAccount = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelName1 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(639,429);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLabel.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Bank Deposit System");
        mainLabel.setToolTipText("");
        getContentPane().add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        jButtonLogIn.setText("Log in");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 70, -1));

        jButtonExit.setText("Exit");
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 80, -1));
        getContentPane().add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 160, 30));
        getContentPane().add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 30));

        jLabelAccessCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAccessCode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAccessCode.setText("Access Code");
        getContentPane().add(jLabelAccessCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, -1));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, 30));

        jButtonNewAccount.setText("New Account");
        jButtonNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 110, -1));
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 160, 30));

        jLabelName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName1.setText("User Name");
        getContentPane().add(jLabelName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 90, 30));

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/earth-1149733_640.jpg"))); // NOI18N
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        //Close Aplication
        this.dispose();
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jButtonNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountActionPerformed
        // Create a New Account
        boolean login = false;
        //Gather and check User Name
        String userName = jTextFieldname.getText();
        if("".equals(userName) || " ".equals(userName)){
            JOptionPane.showMessageDialog(rootPane, "User Name can not be empty");
        }   else if (userName.length() > 80){
            JOptionPane.showMessageDialog(rootPane, "User Name extremely Long");
        }
        
        //Gather and check Email
        String userEmail = jTextField.getText();
        if("".equals(userEmail) || " ".equals(userEmail)){
            JOptionPane.showMessageDialog(rootPane, "Email address can not be empty");
            return;
        } else if (!userEmail.contains("@") || !userEmail.contains(".")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Email");
            return;
        } else if (userEmail.length() > 120){
            JOptionPane.showMessageDialog(rootPane, "Email extremely Long");
        }
        
        //Gather and check password
        String password = "";
        int tempPassword = 0;
        char[] userPassword = jPasswordField.getPassword();
        for(int x = 0; x < userPassword.length; x++){
            password += userPassword[x];
            tempPassword = Integer.parseInt(password);
        }
        if(userPassword.length < 4 || userPassword.length > 4){
            JOptionPane.showMessageDialog(rootPane, "Invalid Password");
            return;
        }
        
        //Get Connection
        String url = "jdbc:mysql://10.0.0.90:3306/customers_db";
        String username = "Admin";
        String passwordDB = "Andres8888UiOp**";
        mainFrame a = new mainFrame();
        try {
            runMe(url,"customer_db",username,passwordDB, userName, userEmail, tempPassword, login);
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonNewAccountActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        boolean login = true;
        //Gather and check User Name
        String userName = jTextFieldname.getText();
        if("".equals(userName) || " ".equals(userName)){
            JOptionPane.showMessageDialog(rootPane, "User Name can not be empty");
        }   else if (userName.length() > 80){
            JOptionPane.showMessageDialog(rootPane, "User Name extremely Long");
        }
        //Gather and check Email
        String userEmail = jTextField.getText();
        if("".equals(userEmail) || " ".equals(userEmail)){
            JOptionPane.showMessageDialog(rootPane, "Email address can not be empty");
            return;
        } else if (!userEmail.contains("@") || !userEmail.contains(".")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Email");
            return;
        } else if (userEmail.length() > 120){
            JOptionPane.showMessageDialog(rootPane, "Email extremely Long");
        }
        
        //Gather and check password
        String password = "";
        int tempPassword = 0;
        char[] userPassword = jPasswordField.getPassword();
        for(int x = 0; x < userPassword.length; x++){
            password += userPassword[x];
            tempPassword = Integer.parseInt(password);
        }
        if(userPassword.length < 4 || userPassword.length > 4){
            JOptionPane.showMessageDialog(rootPane, "Invalid Password");
            return;
        }
        //Get Connection
        String url = "jdbc:mysql://10.0.0.90:3306/customers_db";
        String username = "Admin";
        String passwordDB = "Andres8888UiOp**";
        mainFrame a = new mainFrame();
        try {
            runMe(url,"customer_db",username,passwordDB, userName, userEmail, tempPassword, login);
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonLogInActionPerformed
    private static String generateInsert(String name, String email, int password){
        return "INSERT INTO customers_db.customers (CUSTOMERNAME, EMAIL, ACCESSCODE, BUDGET)" + "VALUES ('" + name + "','" + email + "','" + password + "','" + 0 +"')";
    }
    public void runMe(String host, String database, String user, String password, String name, String email, int userPassword, boolean login)
            throws Exception {

        /* run driverTest method shown below */
        driverTest();

        /* make the connection to the database */
        Connection conMe = makeCon(host, database, user, password);
        
        /*Run Query*/
        if(!login){
            try {
                Statement cs = conMe.createStatement();
                int row = cs.executeUpdate(generateInsert(name, email, userPassword));

            } catch (SQLException e) {
                System.out.println ("Error executing sql statement");
                throw (e);
            
            }
        } else if(login) {
            try {
                Statement cs = conMe.createStatement();
                String selectQuery = "SELECT * FROM customers_db.customers";
                ResultSet rs = cs.executeQuery(selectQuery);
                
                ArrayList<String> arrayUser = new ArrayList<String>();
                ArrayList<String> arrayEmail = new ArrayList<String>();
                ArrayList<Integer> arrayInt = new ArrayList<Integer>();
                ArrayList<Double> arrayBudget = new ArrayList<Double>();
                int counter = 0;
                while(rs.next()){
                    arrayUser.add(rs.getString("customerName"));
                    arrayEmail.add(rs.getString("email"));
                    arrayInt.add(rs.getInt("accessCode"));
                    arrayBudget.add(rs.getDouble("budget"));
                    counter++;
                }
                boolean found = false;
                double budget =0;
                for(int i = 0; i < counter; i++){
                    if(name.equals(arrayUser.get(i)) && email.equals(arrayEmail.get(i)) && userPassword == arrayInt.get(i)){
                        budget = arrayBudget.get(i);
                        JOptionPane.showMessageDialog(rootPane, "Successfully Login");
                        budgetFrame secondFrame = new budgetFrame(name,email, budget);
                        this.setVisible(false);
                        secondFrame.setVisible(true);
                        found = true;
                    }
                }
                if(!found){
                    JOptionPane.showMessageDialog(rootPane, "Credentials Wrongs");
                }
            } catch (SQLException e) {
                System.out.println ("Error executing sql statement");
                throw (e);
            
            }
        }
        
        /* close the database */
        conMe.close();
        System.out.println("Closed Connection");
        if(!login){
            JOptionPane.showMessageDialog(rootPane, "Account Created Successfully!!!");
        }
    }
    protected void driverTest() throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver Found");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found ... ");
            throw (e);
        }
    }

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNewAccount;
    private javax.swing.JLabel jLabelAccessCode;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JLabel mainLabel;
    // End of variables declaration//GEN-END:variables
}
