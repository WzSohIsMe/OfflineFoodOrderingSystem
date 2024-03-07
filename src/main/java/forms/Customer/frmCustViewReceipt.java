/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author User
 */
public class frmCustViewReceipt extends javax.swing.JFrame {

    /**
     * Creates new form frmCustViewReceipt
     */
    private String UserID;
    private String Username;
    private String Password;
    private String UserRole;
    private String Date;
    private String PaymentID;
    private String OrderID;
    
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(frmCustViewReceipt.class);
    
    public frmCustViewReceipt() {
        initComponents();
    }
    
    public frmCustViewReceipt(String ID, String u, String p, String r, String d, String pay,String ord) {
        UserID = ID;
        Username = u;
        Password = p;
        UserRole = r;
        Date = d;
        PaymentID = pay;
        OrderID = ord;
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
        btnOK = new javax.swing.JButton();
        lblDatetime = new javax.swing.JLabel();
        lblHeresYourReceipt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceipt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        btnOK.setBackground(new java.awt.Color(102, 102, 102));
        btnOK.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.setToolTipText("");
        btnOK.setBorder(null);
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.setDefaultCapable(false);
        btnOK.setFocusPainted(false);
        btnOK.setName(""); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
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
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        frmCustTransactionRecord ctr = new frmCustTransactionRecord(UserID,Username,Password,UserRole);
        ctr.toFront();
        ctr.setVisible(true);
        this.dispose();
        logger.info(UserRole + ": " + Username + " " + "Viewed the Receipt and back to the Transaction History");
    }//GEN-LAST:event_btnOKActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        DefaultTableModel model = (DefaultTableModel) tblReceipt.getModel();
        model.setRowCount(0);
        File file = new File("D:\\Documents\\Uni_Modules\\Object Oriented Development with Java\\Group Assignment\\Group_9_APU_Cafeteria_Food_Ordering_System\\src\\main\\java\\Database\\order.txt");
        
        try{
            Scanner scan = new Scanner(file);
            scan.useDelimiter("[|\n]");
            
            while(scan.hasNext()){
                String orderidx = scan.next();
                String useridx = scan.next();
                String usernamex = scan.next();
                String orderdatex = scan.next();
                String foodnamex = scan.next();
                
                TransactionHistory custHistory = new TransactionHistory();
                
                String foodidx = custHistory.getFoodID(foodnamex);
                String foodpricex = custHistory.getFoodPrice(foodnamex);
                
                String categoryx = scan.next();
                String quantityx = scan.next();
                String paidamount = scan.next();
                String paymentdate = scan.next().trim();
                
                if(orderidx.equals(OrderID)&&usernamex.equals(Username)&&useridx.equals(UserID)){
                    
                    model.addRow(new Object[] {foodidx,categoryx,foodnamex,quantityx,foodpricex,paidamount});
                    lblDatetime.setText(Date);
                    
                }else{
                    
                }
            
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCustViewReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }     
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
            java.util.logging.Logger.getLogger(frmCustViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCustViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCustViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCustViewReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCustViewReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblDatetime;
    private javax.swing.JLabel lblHeresYourReceipt;
    private javax.swing.JLabel lblPaymentSuccessful;
    private javax.swing.JPanel pnlBackground;
    public static javax.swing.JTable tblReceipt;
    // End of variables declaration//GEN-END:variables
}
