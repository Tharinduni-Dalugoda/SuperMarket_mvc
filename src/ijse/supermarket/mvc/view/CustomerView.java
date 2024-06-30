/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ijse.supermarket.mvc.view;

import ijse.supermarket.mvc.controller.CustomerController;
import ijse.supermarket.mvc.dto.CustomerDto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        this.customerController = new CustomerController();
        initComponents();
        loadCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        telLabel = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcust = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customer");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 10));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("Cust ID");

        dobLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("DOB");

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        salaryLabel.setText("Salary");

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtdob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtsalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Cust Name");

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address");

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        telLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telLabel.setForeground(new java.awt.Color(255, 255, 255));
        telLabel.setText("Tel No:");

        txttel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 102, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblcust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblcust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblcust);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtaddress))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdob))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtname))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveCustomer();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
           updateCustomer();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblcustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustMouseClicked
        searchCustomer();
    }//GEN-LAST:event_tblcustMouseClicked

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTable tblcust;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer() {
        CustomerDto dto = new CustomerDto();
        dto.setCustID(txtid.getText());
        dto.setCustName(txtname.getText());
        dto.setDOB(txtdob.getText());
        dto.setAddress(txtaddress.getText());
        dto.setSalary(Integer.parseInt(txtsalary.getText()));
        dto.setTelNo(Integer.parseInt(txttel.getText()));

        try {
            String result = customerController.saveCustomer(dto);
            System.out.println(result);
            JOptionPane.showMessageDialog(this, result);
            loadCustomers();
            clear();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clear() {
        txtid.setText("");
        txtname.setText("");
        txtdob.setText("");
        txtaddress.setText("");
        txtsalary.setText("");
        txttel.setText("");

    }

    public Void loadCustomers() {
        try {
            String columns[] = {"ID", "Name", "Dob", "Address", "Salary"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblcust.setModel(dtm);

            ArrayList<CustomerDto> customerDtos = customerController.getAllCustomer();

            for (CustomerDto customerDto : customerDtos) {
                Object[] rowData = {customerDto.getCustID(), customerDto.getCustName(), customerDto.getDOB(), customerDto.getAddress(), customerDto.getSalary()};
                dtm.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        return null;

    }

    public void searchCustomer() {
        String id = tblcust.getValueAt(tblcust.getSelectedRow(), 0).toString();
        try {
            CustomerDto dto = customerController.searchCustomer(id);
            if (dto != null) {
                txtid.setText(dto.getCustID());
                txtname.setText(dto.getCustName());
                txtdob.setText(dto.getDOB());
                txtaddress.setText(dto.getAddress());
                txtsalary.setText(Integer.toString(dto.getSalary()));
                txttel.setText(Integer.toString(dto.getTelNo()));

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void updateCustomer() {
        try {
            CustomerDto dto = new CustomerDto();
            dto.setCustID(txtid.getText());
            dto.setCustName(txtname.getText());
            dto.setDOB(txtdob.getText());
            dto.setAddress(txtaddress.getText());
            dto.setSalary(Integer.parseInt(txtsalary.getText()));
            dto.setTelNo(Integer.parseInt(txttel.getText()));
            
            String resp = customerController.updateCustomer(dto);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

}
