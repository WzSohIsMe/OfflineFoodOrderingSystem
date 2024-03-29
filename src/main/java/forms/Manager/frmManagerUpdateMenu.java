/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms.Manager;

import forms.Login.frmLogin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author User
 */
public class frmManagerUpdateMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmCustMenuCategories
     */
    
    private String manager_id;
    private String manager_name;
    private String manager_pass;
    private String manager_role;
    
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(frmManagerUpdateMenu.class);
    
    public frmManagerUpdateMenu() {
        initComponents();
        foodFiletoTable();
        addCategorytocombobox();
        cmbUpdateItemCategory.setSelectedIndex(-1);
    }
    
    public frmManagerUpdateMenu(String id, String name, String pass, String role) {
        initComponents();
        this.manager_id = id;
        this.manager_name = name;
        this.manager_pass = pass;
        this.manager_role = role;
        foodFiletoTable();
        addCategorytocombobox();
        cmbUpdateItemCategory.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUpdateMenuBackground = new javax.swing.JPanel();
        lblUpdateMenu = new javax.swing.JLabel();
        btnUpdateMenuBack = new javax.swing.JButton();
        pnlInnerUpdateMenuBackground = new javax.swing.JPanel();
        lblMenuListSearchTitle = new javax.swing.JLabel();
        txtMenuListSearch = new javax.swing.JTextField();
        btnSearchMenuList = new javax.swing.JButton();
        btnDeleteMenuList = new javax.swing.JButton();
        lblMenuListTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenuList = new javax.swing.JTable();
        btnClearUpdateItem = new javax.swing.JButton();
        lblUpdateMenuNameTitle = new javax.swing.JLabel();
        txtUpdateItemName = new javax.swing.JTextField();
        btnAddUpdateItem = new javax.swing.JButton();
        lblUpdateItemCategoryTitle = new javax.swing.JLabel();
        lbllblUpdateItemPriceTitle = new javax.swing.JLabel();
        txtUpdateItemPrice = new javax.swing.JTextField();
        lblUpdateItemDescriptionTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaUpdateItemDescription = new javax.swing.JTextArea();
        lblIDUpdateItem = new javax.swing.JLabel();
        lblUpdateItemTitle = new javax.swing.JLabel();
        lblIDTitleUpdateItem = new javax.swing.JLabel();
        btnUpdateMenuList = new javax.swing.JButton();
        cmbUpdateItemCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Menu");
        setBackground(new java.awt.Color(51, 51, 51));
        setName("frmCustMenuCategories"); // NOI18N
        setResizable(false);

        pnlUpdateMenuBackground.setBackground(new java.awt.Color(51, 51, 51));
        pnlUpdateMenuBackground.setName("frmCustMenuCategories"); // NOI18N
        pnlUpdateMenuBackground.setPreferredSize(new java.awt.Dimension(1230, 700));
        pnlUpdateMenuBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUpdateMenu.setBackground(new java.awt.Color(71, 71, 71));
        lblUpdateMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUpdateMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateMenu.setText("Update Menu");
        pnlUpdateMenuBackground.add(lblUpdateMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 53));

        btnUpdateMenuBack.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateMenuBack.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnUpdateMenuBack.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMenuBack.setText("BACK");
        btnUpdateMenuBack.setToolTipText("");
        btnUpdateMenuBack.setBorder(null);
        btnUpdateMenuBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMenuBack.setDefaultCapable(false);
        btnUpdateMenuBack.setName(""); // NOI18N
        btnUpdateMenuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMenuBackActionPerformed(evt);
            }
        });
        pnlUpdateMenuBackground.add(btnUpdateMenuBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 192, 45));

        pnlInnerUpdateMenuBackground.setBackground(new java.awt.Color(71, 71, 71));
        pnlInnerUpdateMenuBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuListSearchTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMenuListSearchTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuListSearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuListSearchTitle.setText("Search");
        lblMenuListSearchTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblMenuListSearchTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 80, 30));

        txtMenuListSearch.setBackground(new java.awt.Color(51, 51, 51));
        txtMenuListSearch.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenuListSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuListSearch.setBorder(null);
        pnlInnerUpdateMenuBackground.add(txtMenuListSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 260, 31));

        btnSearchMenuList.setBackground(new java.awt.Color(102, 0, 248));
        btnSearchMenuList.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSearchMenuList.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchMenuList.setText("SEARCH");
        btnSearchMenuList.setToolTipText("");
        btnSearchMenuList.setBorder(null);
        btnSearchMenuList.setBorderPainted(false);
        btnSearchMenuList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchMenuList.setDefaultCapable(false);
        btnSearchMenuList.setName(""); // NOI18N
        btnSearchMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMenuListActionPerformed(evt);
            }
        });
        pnlInnerUpdateMenuBackground.add(btnSearchMenuList, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 102, 37));

        btnDeleteMenuList.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteMenuList.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnDeleteMenuList.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMenuList.setText("DELETE");
        btnDeleteMenuList.setToolTipText("");
        btnDeleteMenuList.setBorder(null);
        btnDeleteMenuList.setBorderPainted(false);
        btnDeleteMenuList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteMenuList.setDefaultCapable(false);
        btnDeleteMenuList.setName(""); // NOI18N
        btnDeleteMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMenuListActionPerformed(evt);
            }
        });
        pnlInnerUpdateMenuBackground.add(btnDeleteMenuList, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 102, 37));

        lblMenuListTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuListTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuListTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuListTitle.setText("Menu List");
        pnlInnerUpdateMenuBackground.add(lblMenuListTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 40));

        tblMenuList.setAutoCreateRowSorter(true);
        tblMenuList.setBackground(new java.awt.Color(71, 71, 71));
        tblMenuList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblMenuList.setForeground(new java.awt.Color(255, 255, 255));
        tblMenuList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Name", "Price", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenuList.getTableHeader().setReorderingAllowed(false);
        tblMenuList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenuList);
        if (tblMenuList.getColumnModel().getColumnCount() > 0) {
            tblMenuList.getColumnModel().getColumn(0).setResizable(false);
            tblMenuList.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblMenuList.getColumnModel().getColumn(1).setResizable(false);
            tblMenuList.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblMenuList.getColumnModel().getColumn(2).setResizable(false);
            tblMenuList.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblMenuList.getColumnModel().getColumn(3).setResizable(false);
            tblMenuList.getColumnModel().getColumn(3).setPreferredWidth(3);
            tblMenuList.getColumnModel().getColumn(4).setResizable(false);
            tblMenuList.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        pnlInnerUpdateMenuBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 590, 190));

        btnClearUpdateItem.setBackground(new java.awt.Color(102, 102, 102));
        btnClearUpdateItem.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnClearUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnClearUpdateItem.setText("CLEAR");
        btnClearUpdateItem.setToolTipText("");
        btnClearUpdateItem.setBorder(null);
        btnClearUpdateItem.setBorderPainted(false);
        btnClearUpdateItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearUpdateItem.setDefaultCapable(false);
        btnClearUpdateItem.setName(""); // NOI18N
        btnClearUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearUpdateItemActionPerformed(evt);
            }
        });
        pnlInnerUpdateMenuBackground.add(btnClearUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 102, 37));

        lblUpdateMenuNameTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUpdateMenuNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateMenuNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateMenuNameTitle.setText("Name");
        lblUpdateMenuNameTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblUpdateMenuNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 210, 40));

        txtUpdateItemName.setBackground(new java.awt.Color(51, 51, 51));
        txtUpdateItemName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtUpdateItemName.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdateItemName.setBorder(null);
        pnlInnerUpdateMenuBackground.add(txtUpdateItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 242, 31));

        btnAddUpdateItem.setBackground(new java.awt.Color(102, 0, 248));
        btnAddUpdateItem.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAddUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUpdateItem.setText("ADD");
        btnAddUpdateItem.setToolTipText("");
        btnAddUpdateItem.setBorder(null);
        btnAddUpdateItem.setBorderPainted(false);
        btnAddUpdateItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUpdateItem.setDefaultCapable(false);
        btnAddUpdateItem.setName(""); // NOI18N
        btnAddUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUpdateItemActionPerformed(evt);
            }
        });
        pnlInnerUpdateMenuBackground.add(btnAddUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 102, 37));

        lblUpdateItemCategoryTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUpdateItemCategoryTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateItemCategoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateItemCategoryTitle.setText("Category");
        lblUpdateItemCategoryTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblUpdateItemCategoryTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 40));

        lbllblUpdateItemPriceTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbllblUpdateItemPriceTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbllblUpdateItemPriceTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbllblUpdateItemPriceTitle.setText("Price");
        lbllblUpdateItemPriceTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lbllblUpdateItemPriceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 40));

        txtUpdateItemPrice.setBackground(new java.awt.Color(51, 51, 51));
        txtUpdateItemPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtUpdateItemPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdateItemPrice.setBorder(null);
        pnlInnerUpdateMenuBackground.add(txtUpdateItemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 242, 30));

        lblUpdateItemDescriptionTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUpdateItemDescriptionTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateItemDescriptionTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateItemDescriptionTitle.setText("Description");
        lblUpdateItemDescriptionTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblUpdateItemDescriptionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 210, 40));

        txaUpdateItemDescription.setBackground(new java.awt.Color(51, 51, 51));
        txaUpdateItemDescription.setColumns(20);
        txaUpdateItemDescription.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaUpdateItemDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaUpdateItemDescription.setLineWrap(true);
        txaUpdateItemDescription.setRows(5);
        jScrollPane2.setViewportView(txaUpdateItemDescription);

        pnlInnerUpdateMenuBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 90));

        lblIDUpdateItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIDUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        lblIDUpdateItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDUpdateItem.setToolTipText("");
        lblIDUpdateItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlInnerUpdateMenuBackground.add(lblIDUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 40));

        lblUpdateItemTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUpdateItemTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateItemTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateItemTitle.setText("Update Item");
        lblUpdateItemTitle.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblUpdateItemTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 40));

        lblIDTitleUpdateItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIDTitleUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        lblIDTitleUpdateItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIDTitleUpdateItem.setText("ID:");
        lblIDTitleUpdateItem.setToolTipText("");
        pnlInnerUpdateMenuBackground.add(lblIDTitleUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 40));

        btnUpdateMenuList.setBackground(new java.awt.Color(102, 0, 248));
        btnUpdateMenuList.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnUpdateMenuList.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMenuList.setText("UPDATE");
        btnUpdateMenuList.setToolTipText("");
        btnUpdateMenuList.setBorder(null);
        btnUpdateMenuList.setBorderPainted(false);
        btnUpdateMenuList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMenuList.setDefaultCapable(false);
        btnUpdateMenuList.setName(""); // NOI18N
        btnUpdateMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMenuListActionPerformed(evt);
            }
        });
        pnlInnerUpdateMenuBackground.add(btnUpdateMenuList, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 102, 37));

        cmbUpdateItemCategory.setBackground(new java.awt.Color(51, 51, 51));
        cmbUpdateItemCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbUpdateItemCategory.setForeground(new java.awt.Color(255, 255, 255));
        pnlInnerUpdateMenuBackground.add(cmbUpdateItemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, -1));

        pnlUpdateMenuBackground.add(pnlInnerUpdateMenuBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 96, 990, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUpdateMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUpdateMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlUpdateMenuBackground.getAccessibleContext().setAccessibleName("Update Menu");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUpdateItemActionPerformed
        try {
            String itemName = txtUpdateItemName.getText();
            String itemPrice = txtUpdateItemPrice.getText();
            int itemCatIndex = cmbUpdateItemCategory.getSelectedIndex();
            String itemDesc = txaUpdateItemDescription.getText();
            
            if(itemName.equals("") || itemPrice.equals("") || itemCatIndex == -1 || itemDesc.equals("")){
                JOptionPane.showMessageDialog(this, "Please fill up all the information!");
                logger.error(manager_role + ": " + manager_name + " " + "failed to Update Menu (Missing Information)");
            }else if(checkNumber(itemPrice)){
                JOptionPane.showMessageDialog(this, "Invalid Price input!");
                logger.error(manager_role + ": " + manager_name + " " + "failed to Update Menu (Invalid Price input)");
            }else{
                add_update_MenuItem();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
            logger.error(manager_role + ": " + manager_name + " " + "failed to Update Menu");
        }
    }//GEN-LAST:event_btnAddUpdateItemActionPerformed

    private void btnUpdateMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMenuListActionPerformed
        foodFiletoTable();
        logger.info(manager_role + ": " + manager_name + " " + "updated Menu List");
    }//GEN-LAST:event_btnUpdateMenuListActionPerformed

    private void tblMenuListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuListMouseClicked
        MenuListToUpdateItem();
        logger.info(manager_role + ": " + manager_name + " " + "Selected an Item in the Menu List");
    }//GEN-LAST:event_tblMenuListMouseClicked

    private void btnClearUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearUpdateItemActionPerformed
        lblIDUpdateItem.setText(null);
        cmbUpdateItemCategory.setSelectedIndex(-1);
        txtUpdateItemName.setText(null);
        txtUpdateItemPrice.setText(null);
        txaUpdateItemDescription.setText(null);
        tblMenuList.clearSelection();
        logger.info(manager_role + ": " + manager_name + " " + "Cleared All Inputs");
    }//GEN-LAST:event_btnClearUpdateItemActionPerformed

    private void btnDeleteMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMenuListActionPerformed
        try {
            if(tblMenuList.getSelectedRow() != -1){
                deletingFoodRow();
                logger.info(manager_role + ": " + manager_name + " " + "Deleted an Item");
            }else{
                JOptionPane.showMessageDialog(this, "Please select an Item to Delete!");
                logger.error(manager_role + ": " + manager_name + " " + "has Failed to Delete an Item (Category not selected)");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
            logger.error(manager_role + ": " + manager_name + " " + "has Failed to Delete an Item");
        }
    }//GEN-LAST:event_btnDeleteMenuListActionPerformed

    private void btnSearchMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMenuListActionPerformed
        searchingMenuTable();
        logger.info(manager_role + ": " + manager_name + " " + "has Searched for an Item");
    }//GEN-LAST:event_btnSearchMenuListActionPerformed

    private void btnUpdateMenuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMenuBackActionPerformed
        this.dispose();
        frmManagerMainMenu frmMMM = new frmManagerMainMenu(manager_id, manager_name, manager_pass, manager_role);
        frmMMM.setVisible(true);
        logger.info(manager_role + ": " + manager_name + " " + "Quit Update Menu back to Manager Main Menu");
    }//GEN-LAST:event_btnUpdateMenuBackActionPerformed

    public boolean checkNumber(String num){
        try{
            Double.parseDouble(num);
            return false;
        }catch(Exception ex){
            return true;
        }
    }
    
    public void add_update_MenuItem() throws IOException{
        DefaultTableModel model = (DefaultTableModel)tblMenuList.getModel();
        int selectedRowIndex = tblMenuList.getSelectedRow();
        
        if(selectedRowIndex == -1){
            addItem();
            JOptionPane.showMessageDialog(null, "Item Successfully added!");
            logger.info(manager_role + ": " + manager_name + " " + "Added Item Successfully");
        }else{
            deletingFoodRow();
            addItem();
            JOptionPane.showMessageDialog(null, "Item Successfully Updated!");
            logger.info(manager_role + ": " + manager_name + " " + "Updated Item Successfully");
        }
    }
    
    public void addCategorytocombobox(){
         File category_file = new File("D:\\Documents\\Uni_Modules\\Object Oriented Development with Java\\Group Assignment\\Group_9_APU_Cafeteria_Food_Ordering_System\\src\\main\\java\\Database\\category.txt");

        try{
            Scanner scan = new Scanner(category_file);
            scan.useDelimiter("[|\n]");
            
            while(scan.hasNext()){
                int categoryid = Integer.parseInt(scan.next());
                String category = scan.next().trim();
                cmbUpdateItemCategory.addItem(category);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void foodFiletoTable(){
        Food_Menu f = new Food_Menu();
        f.importFiletoTable();
    }
    
    public void MenuListToUpdateItem(){
        DefaultTableModel model = (DefaultTableModel)tblMenuList.getModel();
        int selectedRowIndex = tblMenuList.convertRowIndexToModel(tblMenuList.getSelectedRow());
        
        lblIDUpdateItem.setText(model.getValueAt(selectedRowIndex, 0).toString());
        cmbUpdateItemCategory.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        txtUpdateItemName.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtUpdateItemPrice.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txaUpdateItemDescription.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }
    
    public void deletingFoodRow() throws FileNotFoundException, IOException{
        DefaultTableModel model = (DefaultTableModel)tblMenuList.getModel();
        int selectedRowIndex = tblMenuList.convertRowIndexToModel(tblMenuList.getSelectedRow());
        
        model.removeRow(selectedRowIndex);
        
        txtMenuListSearch.setText(null);
        searchingMenuTable();
        
        File file = new File("D:\\Documents\\Uni_Modules\\Object Oriented Development with Java\\Group Assignment\\Group_9_APU_Cafeteria_Food_Ordering_System\\src\\main\\java\\Database\\food.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i=0; i<tblMenuList.getRowCount(); i++){
            for(int j=0; j<tblMenuList.getColumnCount(); j++){
                if(j == (tblMenuList.getColumnCount()-1)){
                   bw.write(tblMenuList.getValueAt(i, j).toString()); 
                }else{
                   bw.write(tblMenuList.getValueAt(i, j).toString() + "|"); 
                }
            }
            bw.newLine();
        }
        
        bw.close();
        fw.close();
    }
    
    public void addItem(){
        String item_name = txtUpdateItemName.getText();
        String item_category = cmbUpdateItemCategory.getSelectedItem().toString();
        String item_price = txtUpdateItemPrice.getText();
        String item_desc = txaUpdateItemDescription.getText();
        
        Food_Menu f = new Food_Menu(item_name, item_category, item_price, item_desc);
        f.saveInformation();
    }
    
    public void searchingMenuTable(){
        String search_text = txtMenuListSearch.getText();
        
        Food_Menu f = new Food_Menu();
        f.searchInformation(search_text);
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
            java.util.logging.Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmManagerUpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmManagerUpdateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUpdateItem;
    private javax.swing.JButton btnClearUpdateItem;
    private javax.swing.JButton btnDeleteMenuList;
    private javax.swing.JButton btnSearchMenuList;
    private javax.swing.JButton btnUpdateMenuBack;
    private javax.swing.JButton btnUpdateMenuList;
    private javax.swing.JComboBox<String> cmbUpdateItemCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIDTitleUpdateItem;
    private javax.swing.JLabel lblIDUpdateItem;
    private javax.swing.JLabel lblMenuListSearchTitle;
    private javax.swing.JLabel lblMenuListTitle;
    private javax.swing.JLabel lblUpdateItemCategoryTitle;
    private javax.swing.JLabel lblUpdateItemDescriptionTitle;
    private javax.swing.JLabel lblUpdateItemTitle;
    private javax.swing.JLabel lblUpdateMenu;
    private javax.swing.JLabel lblUpdateMenuNameTitle;
    private javax.swing.JLabel lbllblUpdateItemPriceTitle;
    private javax.swing.JPanel pnlInnerUpdateMenuBackground;
    private javax.swing.JPanel pnlUpdateMenuBackground;
    public static javax.swing.JTable tblMenuList;
    private javax.swing.JTextArea txaUpdateItemDescription;
    private javax.swing.JTextField txtMenuListSearch;
    private javax.swing.JTextField txtUpdateItemName;
    private javax.swing.JTextField txtUpdateItemPrice;
    // End of variables declaration//GEN-END:variables
}
