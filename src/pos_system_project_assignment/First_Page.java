
package pos_system_project_assignment;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Dasun Malshan
 */
public class First_Page extends javax.swing.JFrame {

    /**
     * Creates new form First_Page
     */
    public First_Page() {
        initComponents();
    }
    
    // MySQL Database And LOG4j Objects---------------------------------------   
     Connection con ;       
     PreparedStatement pst; 
     ResultSet rs;
     public static Logger log = Logger.getLogger(String.valueOf(First_Page.class));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtpcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteitem = new javax.swing.JButton();
        txtpname = new javax.swing.JTextField();
        txtpromotionval = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        itemdis = new javax.swing.JTextField();
        promodis = new javax.swing.JTextField();
        qty = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        paid1 = new javax.swing.JLabel();
        paidtext1 = new javax.swing.JTextField();
        balance1 = new javax.swing.JLabel();
        balancefield1 = new javax.swing.JTextField();
        okbtn1 = new javax.swing.JButton();
        creditcash = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paidfield2 = new javax.swing.JTextField();
        balancefield2 = new javax.swing.JTextField();
        paid2 = new javax.swing.JLabel();
        balance2 = new javax.swing.JLabel();
        okbtn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS MANAGEMENT SYSTEM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NO.", "ITEM NAME", "ITEM DIS.", "QUANTITY", "PROMOTION", "PROMO. DIS.", "PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 760, 280));

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane3.setViewportView(bill);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 760, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Add Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ITEM NO.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 40));

        txtpcode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpcodeActionPerformed(evt);
            }
        });
        txtpcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpcodeKeyPressed(evt);
            }
        });
        jPanel1.add(txtpcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ITEM NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 140, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("QUANTITY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("PROMOTION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PRICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 80, 40));

        deleteitem.setBackground(new java.awt.Color(0, 0, 0));
        deleteitem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteitem.setForeground(new java.awt.Color(255, 255, 255));
        deleteitem.setText("DELETE");
        deleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemActionPerformed(evt);
            }
        });
        jPanel1.add(deleteitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 120, 40));

        txtpname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, 30));

        txtpromotionval.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtpromotionval, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 130, 30));

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("AMOUNT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, -1, -1));

        txtamount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtamount.setToolTipText("");
        jPanel1.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("ITEM DIS>>");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("PROMO. DIS.>>");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        itemdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdisActionPerformed(evt);
            }
        });
        jPanel1.add(itemdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, 30));

        promodis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promodisActionPerformed(evt);
            }
        });
        jPanel1.add(promodis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 170, 30));

        qty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyStateChanged(evt);
            }
        });
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1210, 210));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("POS MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 90));

        paid1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid1.setText("PAID");
        paid1.setEnabled(false);
        getContentPane().add(paid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, -1, -1));

        paidtext1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paidtext1.setEnabled(false);
        paidtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidtext1ActionPerformed(evt);
            }
        });
        paidtext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paidtext1KeyPressed(evt);
            }
        });
        getContentPane().add(paidtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 180, 30));

        balance1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        balance1.setText("BALANCE");
        balance1.setEnabled(false);
        getContentPane().add(balance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        balancefield1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balancefield1.setEnabled(false);
        balancefield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancefield1ActionPerformed(evt);
            }
        });
        getContentPane().add(balancefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 180, 30));

        okbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okbtn1.setText("PAY");
        okbtn1.setEnabled(false);
        okbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(okbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 480, 120, 30));

        creditcash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        creditcash.setText("CREDIT/CASH");
        creditcash.setEnabled(false);
        creditcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditcashActionPerformed(evt);
            }
        });
        getContentPane().add(creditcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, -1, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("TOTAL : ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, -1));

        total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        total.setText("0000");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 51, 0));
        jLabel12.setText("LKR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 120, -1));

        jLabel14.setText("OR");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("CASH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("CREDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 90, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 420, 110));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("@ Dasun Malshan Perera");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(515, 515, 515))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1280, 30));

        paidfield2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paidfield2.setEnabled(false);
        paidfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidfield2ActionPerformed(evt);
            }
        });
        paidfield2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paidfield2KeyPressed(evt);
            }
        });
        getContentPane().add(paidfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 562, 180, 30));

        balancefield2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balancefield2.setEnabled(false);
        getContentPane().add(balancefield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 602, 180, 30));

        paid2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paid2.setText("PAID");
        paid2.setEnabled(false);
        getContentPane().add(paid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, 20));

        balance2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        balance2.setText("BALANCE");
        balance2.setEnabled(false);
        getContentPane().add(balance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        okbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okbtn2.setText("PAY");
        okbtn2.setEnabled(false);
        okbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtn2ActionPerformed(evt);
            }
        });
        okbtn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okbtn2KeyPressed(evt);
            }
        });
        getContentPane().add(okbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, 120, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("ADD ITEM TO DATABASE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        printbtn.setBackground(new java.awt.Color(255, 0, 0));
        printbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        printbtn.setText("PRINT");
        printbtn.setEnabled(false);
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });
        jPanel5.add(printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, 40));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("CLEAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 110, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Add Button Action Perfome code
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        // Check item available in the text boxes
        if(txtamount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Not Selected Any Item");
        }
        else{
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        // Item Add to the table       
        model.addRow(new Object[]
        {
           txtpcode.getText(),
           txtpname.getText(),
           itemdis.getText(),
           qty.getValue().toString(),
           txtpromotionval.getText(),
           promodis.getText(),
           txtprice.getText(),
           txtamount.getText(),
        
        });
        log.info("ITEM ADDED SUCCESFULLY");
        int sum = 0;
        
        // Calculate Final Total In the Table Item
        for(int i=0;i<jTable1.getRowCount();i++ ){
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 7).toString());
        }
        
        // Print total in the Field
        total.setText(Integer.toString(sum));
        
        // Clear Item Fieleds After Succesfully Add a item
        txtpcode.setText("");
        txtpname.setText("");
        txtpromotionval.setText("");
        txtprice.setText("");
        txtamount.setText("");
        itemdis.setText("");
        promodis.setText("");
        
        }    
        // quantity Reset
        qty.setValue(1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpcodeActionPerformed

    // Credit Card Selected Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             
     if(Integer.parseInt(total.getText()) > 0){
         
        log.info("CREDIT CARD PAYMENT METHOD SELECTED");
         
        paid1.setEnabled(true);
        paidtext1.setEnabled(true);
        okbtn1.setEnabled(true);
        balance1.setEnabled(true);
        balancefield1.setEnabled(true);
        creditcash.setText("CASH PAY");
     }
     
    }//GEN-LAST:event_jButton4ActionPerformed

    // Cash Selected Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
     if(Integer.parseInt(total.getText()) > 0){
         
        log.info("CASH PAYMENT METHOD SELECTED");
        
        paid1.setEnabled(true);
        paidtext1.setEnabled(true);
        okbtn1.setEnabled(true);
        balance1.setEnabled(true);
        balancefield1.setEnabled(true);
        creditcash.setText("CREDIT CARD");
     }
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void paidtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidtext1ActionPerformed

    private void balancefield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancefield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balancefield1ActionPerformed

    // Print Button
    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        
        log.info("PRINTING BILL>>>");
        
        String finalTotal = total.getText();
        String firstPay = paidtext1.getText();
        String firstBalance = balancefield1.getText();
        String secondPay = paidfield2.getText();
        String secondBalance = balancefield2.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        // Print Bill
        bill.setText(bill.getText()+ "***************************************************************************************************************************************************************************\n");
        bill.setText(bill.getText()+ "-------------------------------------------------------------------------POS MANAGEMENT SYSTEM BILL------------------------------------------------------------------------------------------\n");
        bill.setText(bill.getText()+ "***************************************************************************************************************************************************************************\n\n");
        bill.setText(bill.getText()+ "Item No."+ "\t" + "Item Name" + "\t" + "Item Discription"+"\t" + "Quantity" + "\t" + "Promotion Value" + "\t" + "Promotion Discription" + "\t" + "Price" + "\t"+"Total" + "\n");
        bill.setText(bill.getText()+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        // Get Data From Table and print all Details of the all items
        for(int i=0;i<model.getRowCount();i++){
            String itemNo = (String)model.getValueAt(i, 0);
            String name = (String)model.getValueAt(i, 1);
            String itemDiscription = (String)model.getValueAt(i, 2);
            String qty1 = (String)model.getValueAt(i, 3);
            String promotionValue = (String)model.getValueAt(i, 4);
            String PromotionDiscription = (String)model.getValueAt(i, 5);
            String price = (String)model.getValueAt(i, 6);
            String total1 = (String)model.getValueAt(i, 7);
                       
            bill.setText(bill.getText()+ itemNo+"\t"+name+"\t"+itemDiscription+"\t"+qty1+"\t"+promotionValue+"\t\t"+PromotionDiscription+"\t"+price+"\t"+total1+"\n");
        }
        
        bill.setText(bill.getText()+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        bill.setText(bill.getText()+ "\n--------------Total------ \t"+finalTotal+"  LKR\n");
        bill.setText(bill.getText()+ "--------------Payed------ \t"+firstPay+"  LKR\n");
        bill.setText(bill.getText()+ "--------------Balance---- \t"+firstBalance+"  LKR\n\n");
        if(Integer.parseInt(firstBalance) < 0){
            bill.setText(bill.getText()+ "------------2nd Pay--------\t"+secondPay+"  LKR\n");
            bill.setText(bill.getText()+ "--------Final Balance------\t"+secondBalance+"  LKR\n\n\n");
        }
        
        bill.setText(bill.getText()+ "********************************************************************************************************************************************************************************************\n");
        bill.setText(bill.getText()+ "************************************************************THANK YOU!!!********************************************************************************************************************\n");
        
    }//GEN-LAST:event_printbtnActionPerformed

    // Key Press Code After Enter Item Code(Connect database and take data)
    private void txtpcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpcodeKeyPressed
        
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            String pcode = txtpcode.getText();
            
            
            try {
                // Connect to tha Database
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/pos_system","root","");
                
                // Prepaire Statement
                pst = con.prepareStatement("select * from item where item_no = ?");
                pst.setString(1, pcode);
                rs = pst.executeQuery();
                
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "Product Not Found");
                }
                else{
                    // Get Data from Database
                    String name = rs.getString("name");
                    String item_discription = rs.getString("item_dis");
                    String promotion_discription = rs.getString("promotion_dis");
                    int promotion_value = rs.getInt("promotion_value");
                    
                    // Calculation part of printing price if promotion available
                    int price;
                    if(promotion_value==0){
                       price = rs.getInt("price"); 
                    }
                    else{
                        price = rs.getInt("price") - (rs.getInt("price") * promotion_value/100) ;
                    }
                    
                    // Adding Values to the Fields, fetch from database
                    txtpname.setText(name.trim());
                    txtpromotionval.setText(String.valueOf(promotion_value)+ "% OFF");
                    txtprice.setText(String.valueOf(price));
                    itemdis.setText(item_discription);
                    promodis.setText(promotion_discription);
                    txtamount.setText(String.valueOf(price*Integer.parseInt(qty.getValue().toString())));
                    
                }
                               
            } catch (ClassNotFoundException ex) {
                log.error(ex);;
            } catch (SQLException ex) {
               log.error(ex);;
            }
        }
        
    }//GEN-LAST:event_txtpcodeKeyPressed

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnameActionPerformed

    // Delete Button Code
    private void deleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemActionPerformed
        
        
        DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
        
        // Delete Item
        if(jTable1.getSelectedRowCount()==1){
            model2.removeRow(jTable1.getSelectedRow());
            log.info("ITEM DELETED SUCCESFULLY");
        
        // Set Total again After Delete Item From The Table    
        int sum = 0;
        for(int i=0;i<jTable1.getRowCount();i++ ){
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 7).toString());
        }        
        total.setText(String.valueOf(sum));
        }
        else if(jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is empty");
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select single line for delete");
        }
        
    }//GEN-LAST:event_deleteitemActionPerformed

    private void okbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtn1ActionPerformed
        
        try{
            // Calculate Balance After pay 
            int balance = Integer.parseInt(paidtext1.getText()) - Integer.parseInt(total.getText()) ;
            balancefield1.setText(String.valueOf(balance));
            balancefield1.setForeground(Color.BLACK);
        
            log.info("TOTAL AMOUNT : " + total.getText() +" LKR");
            log.info("PAID         : " + paidtext1.getText()+" LKR");
            log.info("BALANCE      : " + String.valueOf(balance)+" LKR");
        
            // Check and Active Another Pay Method
            if(balance<0){
                log.warn("INSUFFISANT MONEY");
                balancefield1.setForeground(Color.red);
                creditcash.setEnabled(true);
            }
            else{
                printbtn.setEnabled(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            log.fatal(e);
        }
        
    }//GEN-LAST:event_okbtn1ActionPerformed

    private void creditcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditcashActionPerformed
        
        log.info("PAY AGAIN WITH OTHER METHOD");
        
        paid2.setEnabled(true);
        balance2.setEnabled(true);
        paidfield2.setEnabled(true);
        balancefield2.setEnabled(true);
        okbtn2.setEnabled(true);
    }//GEN-LAST:event_creditcashActionPerformed

    // Clear Button
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        log.info("CLEAR ALL FIELD");
        log.info("---------------");
        
        DefaultTableModel model3 = (DefaultTableModel) jTable1.getModel();
        int rowsToRemove = model3.getRowCount();
        
        //Remove All Table Items
        for(int i=rowsToRemove-1;i>=0;i--){
            model3.removeRow(i);
        }
        
        // Clear All Field
        paid1.setEnabled(false);
        balance1.setEnabled(false);
        paidtext1.setEnabled(false);
        paidtext1.setText("");
        balancefield1.setEnabled(false);
        balancefield1.setText("");
        okbtn1.setEnabled(false);
        
        paid2.setEnabled(false);
        balance2.setEnabled(false);
        paidfield2.setEnabled(false);
        paidfield2.setText("");
        balancefield2.setEnabled(false);
        balancefield2.setText("");
        okbtn2.setEnabled(false); 
        creditcash.setText("CREDIS/CASH");
        creditcash.setEnabled(false);
        
        total.setText("0000");
        bill.setText("");
        printbtn.setEnabled(false);
        
        balancefield1.setForeground(Color.black);
        balancefield2.setForeground(Color.black);
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void okbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtn2ActionPerformed

        try{
            log.info("2nd PAY AMOUNT: "+ paidfield2.getText()+" LKR");
        
            // Check New Balance
            int newBalance = Integer.parseInt(paidfield2.getText()) + (Integer.parseInt(balancefield1.getText()));     
            balancefield2.setText(String.valueOf(newBalance));
            balancefield2.setForeground(Color.black);
            if(newBalance<0){
                balancefield2.setForeground(Color.red);
                log.error("NEW BALANCE   : "+ String.valueOf(newBalance)+" LKR");
                log.fatal("INSUFFIECENT MONEY   : "+ String.valueOf(newBalance)+" LKR");
            
            }
            else{
                log.info("NEW BALANCE   : "+ String.valueOf(newBalance)+" LKR");
                printbtn.setEnabled(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            log.fatal(e);
        }     
    }//GEN-LAST:event_okbtn2ActionPerformed

    private void paidfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidfield2ActionPerformed

    private void itemdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemdisActionPerformed

    private void promodisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promodisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promodisActionPerformed

    // Add Item To Database Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Add_New_Item addItem = new Add_New_Item();
        addItem.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    // Quantity take from spinner
    private void qtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyStateChanged
        
        // quantity cannot be minus number
        if(Integer.parseInt(qty.getValue().toString()) < 1){
            qty.setValue(1);
        }
        else{
            
        }
        
        // If price is empty, spiner should not be up!
        if(txtprice.getText().equals("")){
            qty.setValue(1);
        }
        else{
            int quantity = Integer.parseInt(qty.getValue().toString());
            int price = Integer.parseInt(txtprice.getText());
            int totalnew = quantity * price;
            txtamount.setText(String.valueOf(totalnew));
        }
    }//GEN-LAST:event_qtyStateChanged

    private void paidtext1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidtext1KeyPressed
    
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            try{
            // Calculate Balance After pay 
            int balance = Integer.parseInt(paidtext1.getText()) - Integer.parseInt(total.getText()) ;
            balancefield1.setText(String.valueOf(balance));
            balancefield1.setForeground(Color.BLACK);
        
            log.info("TOTAL AMOUNT : " + total.getText() +" LKR");
            log.info("PAID         : " + paidtext1.getText()+" LKR");
            log.info("BALANCE      : " + String.valueOf(balance)+" LKR");
        
            // Check and Active Another Pay Method
            if(balance<0){
                log.warn("INSUFFISANT MONEY");
                balancefield1.setForeground(Color.red);
                creditcash.setEnabled(true);
            }
            else{
                printbtn.setEnabled(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            log.fatal(e);
        }
        
        }
        
    }//GEN-LAST:event_paidtext1KeyPressed

    private void okbtn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okbtn2KeyPressed
        
    }//GEN-LAST:event_okbtn2KeyPressed

    private void paidfield2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidfield2KeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            try{
            log.info("2nd PAY AMOUNT: "+ paidfield2.getText()+" LKR");
        
            // Check New Balance
            int newBalance = Integer.parseInt(paidfield2.getText()) + (Integer.parseInt(balancefield1.getText()));     
            balancefield2.setText(String.valueOf(newBalance));
            balancefield2.setForeground(Color.black);
            if(newBalance<0){
                balancefield2.setForeground(Color.red);
                log.error("NEW BALANCE   : "+ String.valueOf(newBalance)+" LKR");
                log.fatal("INSUFFIECENT MONEY   : "+ String.valueOf(newBalance)+" LKR");
            
            }
            else{
                log.info("NEW BALANCE   : "+ String.valueOf(newBalance)+" LKR");
                printbtn.setEnabled(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            log.fatal(e);
        }
        }
    }//GEN-LAST:event_paidfield2KeyPressed

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
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance1;
    private javax.swing.JLabel balance2;
    private javax.swing.JTextField balancefield1;
    private javax.swing.JTextField balancefield2;
    private javax.swing.JTextArea bill;
    private javax.swing.JButton creditcash;
    private javax.swing.JButton deleteitem;
    private javax.swing.JTextField itemdis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okbtn1;
    private javax.swing.JButton okbtn2;
    private javax.swing.JLabel paid1;
    private javax.swing.JLabel paid2;
    private javax.swing.JTextField paidfield2;
    private javax.swing.JTextField paidtext1;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField promodis;
    private javax.swing.JSpinner qty;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtpcode;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpromotionval;
    // End of variables declaration//GEN-END:variables
}
