
import dao.ConnectionProvider;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prems
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
    }
    
    private boolean validateFields() {
        if(txtEmployeeName.getText().equals("") || txtCountry.getText().equals("") || txtState.getText().equals("") || txtCity.getText().equals("") || txtPhone.getText().equals("") || txtSalary.getText().equals("") || txtAge.getText().equals("") || (Integer.parseInt(txtAge.getText()))>150 ){
            return true;
        }
        else return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Manage Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emplyee Id", "Name", "Country", "State", "City", "Age", "Gender", "Phone", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 989, 800));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Enter Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setText("Employee Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 119, -1, -1));
        getContentPane().add(txtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 151, 361, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 191, -1, -1));
        getContentPane().add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 223, 361, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Country");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 263, -1, -1));
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 295, 361, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("State");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 335, -1, -1));
        getContentPane().add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 451, 361, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 419, -1, -1));
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 379, 361, -1));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 491, -1, -1));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 523, 361, -1));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 563, -1, -1));

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 595, 361, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 635, -1, -1));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 667, 361, -1));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel11.setText("Salary");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 707, -1, -1));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 745, 361, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 800, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 800, 103, -1));

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 800, 87, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 847, 347, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1362, 32, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BigBG.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        int index = employeeTable.getSelectedRow();
        TableModel model = employeeTable.getModel();
        String id = model.getValueAt(index, 0).toString();
        txtEmployeeId.setText(id);
        String name = model.getValueAt(index, 1).toString();
        txtEmployeeName.setText(name);
        String country = model.getValueAt(index, 2).toString();
        txtCountry.setText(country);
        String state = model.getValueAt(index, 3).toString();
        txtState.setText(state);
        String city = model.getValueAt(index, 4).toString();
        txtCity.setText(city);
         String age = model.getValueAt(index, 5).toString();
        txtAge.setText(age);
        String gender = model.getValueAt(index, 6).toString();
        txtGender.removeAllItems();
        if(gender.equals("male")){
            txtGender.addItem("male");
            txtGender.addItem("female");
        }
        else{
            txtGender.addItem("female");
            txtGender.addItem("male");
        }
        String phone = model.getValueAt(index, 7).toString();
        txtPhone.setText(phone);
        String salary = model.getValueAt(index, 8).toString();
        txtSalary.setText(salary);
      
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        txtEmployeeId.setEnabled(false);
    }//GEN-LAST:event_employeeTableMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        txtEmployeeId.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Employee_id"), rs.getString("Employee_name"), rs.getString("COuntry"), rs.getString("State"), rs.getString("City"), rs.getString("Age"), rs.getString("Gender"), rs.getString("Phone_number"), rs.getString("Salary")});
            }
            
            rs = st.executeQuery("select count(*) as num from employee");
            int num = 0;
            while (rs.next()){
                num = Integer.parseInt(rs.getString("num"));
            }
            num+=1;
            txtEmployeeId.setText("TBE"+num);
            updateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Till here ok");
        if(validateFields()){
            JOptionPane.showMessageDialog(null, "Enter all the fields");
        }
        else{
            String id = txtEmployeeId.getText();
            String name = txtEmployeeName.getText();
            String country = txtCountry.getText();
            String state = txtState.getText();
            String city = txtCity.getText();
            String phone = txtPhone.getText();
            String gender = (String) txtGender.getSelectedItem();
            int age = Integer.parseInt(txtAge.getText());
            int salary = Integer.parseInt(txtSalary.getText());
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into employee (Employee_id,Employee_name,Country,State,City,Age,Gender,Phone_number,salary) values(?,?,?,?,?,?,?,?,?)");
                ps.setString(1,id);
                ps.setString(2,name);
                ps.setString(3,country);
                ps.setString(4,state);
                ps.setString(5,city);
                ps.setInt(6,age);
                ps.setString(7,gender);
                ps.setString(8,phone);
                ps.setInt(9,salary);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Employee added Successfully");
                setVisible(false);
                new Employee().setVisible(true);
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String id = txtEmployeeId.getText();
         try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("delete from employee where  Employee_id=? ");
                ps.setString(1,id);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Employee deleted Successfully");
                setVisible(false);
                new Employee().setVisible(true);
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Employee().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String id = txtEmployeeId.getText();
        String name = txtEmployeeName.getText();
        String country = txtCountry.getText();
        String state = txtState.getText();
        String city = txtCity.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = (String) txtGender.getSelectedItem();
        String phone = txtPhone.getText();
        int salary = Integer.parseInt(txtPhone.getText());
        
        
        if(validateFields()){
            JOptionPane.showMessageDialog(null, "Enter all the fields Correctly");
        }
        else{
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update employee set Employee_id=? , Employee_name=? , Country=? , State=? , City=? , Age=?, Gender=?,  Phone_number=?, Salary=?   where Employee_id=?");
                ps.setString(1,id);
                ps.setString(2,name);
                ps.setString(3,country);
                ps.setString(4,state);
                ps.setString(5,city);
                ps.setInt(6,age);
                ps.setString(7,gender);
                ps.setString(8,phone);
                ps.setInt(9,salary);
                ps.setString(10,id);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Employee updated Successfully");
                setVisible(false);
                new Employee().setVisible(true);
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtState;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
