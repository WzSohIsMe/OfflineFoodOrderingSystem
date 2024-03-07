/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author User
 */
public class frmCustReceipt extends javax.swing.JFrame {

    /**
     * Creates new form frmCustReceipt
     */
    private String Username;
    private String UserID;
    private String Password;
    private String UserRole;
    private String Date;
    private String Time;
    private int PaymentID;
    private int OrderID;
    
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(frmCustReceipt.class);
    
    public frmCustReceipt() {
        initComponents();
    }
    
    public frmCustReceipt(String ID, String u, String p, String r, String d, String t) {
        UserID = ID;
        Username = u;
        Password = p;
        UserRole = r;
        Date = d;
        Time = t;
        initComponents();
    }
    
    public frmCustReceipt(String ID, String u, String p, String r, String d) {
        UserID = ID;
        Username = u;
        Password = p;
        UserRole = r;
        Date = d;
        initComponents();
    }
    
    public frmCustReceipt(String ID, String u, String p, String r, String d, int pay) {
        UserID = ID;
        Username = u;
        Password = p;
        UserRole = r;
        Date = d;
        PaymentID = pay;
        initComponents();
    }
    
    public frmCustReceipt(String ID, String u, String p, String r, String d, String pay,String ord) {
        UserID = ID;
        Username = u;
        Password = p;
        UserRole = r;
        Date = d;
        PaymentID = Integer.parseInt(pay);
        OrderID = Integer.parseInt(ord);
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

        pnlBackground = new javax.swing.JPanel();
        lblPaymentSuccessful = new javax.swing.JLabel();
        btnPayOrder = new javax.swing.JButton();
        lblDatetime = new javax.swing.JLabel();
        lblHeresYourReceipt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceipt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));
        pnlBackground.setPreferredSize(new java.awt.Dimension(450, 700));

        lblPaymentSuccessful.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPaymentSuccessful.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentSuccessful.setText("Payment Successful");

        btnPayOrder.setBackground(new java.awt.Color(102, 102, 102));
        btnPayOrder.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnPayOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPayOrder.setText("OK");
        btnPayOrder.setToolTipText("");
        btnPayOrder.setBorder(null);
        btnPayOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayOrder.setDefaultCapable(false);
        btnPayOrder.setFocusPainted(false);
        btnPayOrder.setName(""); // NOI18N
        btnPayOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayOrderActionPerformed(evt);
            }
        });

        lblDatetime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDatetime.setForeground(new java.awt.Color(255, 255, 255));
        lblDatetime.setText("Datetime");

        lblHeresYourReceipt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeresYourReceipt.setForeground(new java.awt.Color(255, 255, 255));
        lblHeresYourReceipt.setText("Here's your receipt");

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        tblReceipt.setAutoCreateRowSorter(true);
        tblReceipt.setBackground(new java.awt.Color(102, 102, 102));
        tblReceipt.setForeground(new java.awt.Color(255, 255, 255));
        tblReceipt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Food ID", "Food Category", "Food Name", "Quantity", "Price", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReceipt.setCellSelectionEnabled(true);
        tblReceipt.setGridColor(new java.awt.Color(102, 102, 102));
        tblReceipt.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblReceipt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblReceipt.setShowGrid(true);
        jScrollPane1.setViewportView(tblReceipt);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblHeresYourReceipt)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnPayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblPaymentSuccessful))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblDatetime)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblPaymentSuccessful)
                .addGap(15, 15, 15)
                .addComponent(lblHeresYourReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDatetime)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPayOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayOrderActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        frmCustFeedback custFeedback = new frmCustFeedback(UserID,Username,Password,UserRole,PaymentID,OrderID);
        custFeedback.toFront();
        custFeedback.setVisible(true);
        this.dispose();
        logger.info(UserRole + ": " + Username + " " + "got the Receipt and will give Feedback");
    }//GEN-LAST:event_btnPayOrderActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Receipt custReceipt = new Receipt();
        custReceipt.getReceipt();
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(frmCustReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCustReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCustReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCustReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCustReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayOrder;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblDatetime;
    private javax.swing.JLabel lblHeresYourReceipt;
    private javax.swing.JLabel lblPaymentSuccessful;
    private javax.swing.JPanel pnlBackground;
    public static javax.swing.JTable tblReceipt;
    // End of variables declaration//GEN-END:variables
}
