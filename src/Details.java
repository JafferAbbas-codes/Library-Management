
import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tahira Batool
 */
public class Details extends javax.swing.JFrame {

    /**
     * Creates new form Details
     */
    AccountsSettings cata;
    String t;
    int h;

    public Details() {
        this.getContentPane().setBackground(Color.WHITE);

        initComponents();

        jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
//        jTable1.getColumnModel().getColumn(1).setMaxWidth(230);
//        jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
//        jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
        this.setSize(600, 400);

    }

    public Details(AccountsSettings s, String t, int h) {
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        this.setSize(600, 400);
        cata = s;
        this.t = t;
        this.h = h;
        if (h == 1) {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
        } else {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }

        if (t.equals("member")) {
            jLabel1.setText("Member Details");
        } else {
            jLabel1.setText("Employee Details");
        }

    }

    void showList() {
        try {
            cata.ReadMinfo();
            cata.ReadEinfo();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
        Object[] ar = new Object[5];
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        try {

            if (t.equals("member")) {
                for (int i = 0; i < cata.memberinfo.size(); i++) {
                    ar[0] = i + 1;
                    ar[1] = cata.memberinfo.get(i).getname();
                    ar[2] = cata.memberinfo.get(i).geterp();
                    ar[3] = cata.memberinfo.get(i).getUsername();
                    model.addRow(ar);
                }
            } else if (t.equals("employee")) {
                for (int i = 0; i < cata.employeeinfo.size(); i++) {
                    ar[0] = i + 1;
                    ar[1] = cata.employeeinfo.get(i).getname();
                    ar[2] = cata.employeeinfo.get(i).geterp();
                    ar[3] = cata.employeeinfo.get(i).getUserName();

                    model.addRow(ar);
                }
            }

        } catch (NullPointerException ex) {
            System.err.println(ex);
            ex.getStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_add-notes_46774.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_trash_46839.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-icon (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Name", "ERP ", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTable1);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_reload_46828.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("                                    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton4)
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(98, 98, 98)
                .addComponent(jButton5)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(47, 47, 47))
        );

        setSize(new java.awt.Dimension(616, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        ManagementSystem a = new ManagementSystem();
        JPanel p = new JPanel();
        JLabel l = new JLabel("Enter Your Password!");
        JPasswordField pa = new JPasswordField(10);
        p.add(l);
        p.add(pa);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, p, "Prove Your Identity", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (option == 0) {
            String password = pa.getText();

            if (password.equals(a.getInchargeP()) && t.equals("member")) {
                new MemberAccountCreation(cata, h).setVisible(true);
                this.setVisible(false);
            } else if (password.equals(a.getInchargeP()) && t.equals("employee")) {
                new EmployeeAccountCreation(cata, h).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Password");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ManagementSystem a = new ManagementSystem();
        JPanel p = new JPanel();
        JLabel l = new JLabel("Enter Your Password!");
        JPasswordField pa = new JPasswordField(10);
        p.add(l);
        p.add(pa);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, p, "Prove Your Identity", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (option == 0) {
            String password = pa.getText();

            if (password.equals(a.getInchargeP()) && t.equals("member")) {
                new MemberAccountDeletion(cata, h).setVisible(true);
                this.setVisible(false);
            } else if (password.equals(a.getInchargeP()) && t.equals("employee")) {
                new EmployeesAccountDeletion(cata, h).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Password");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (h == 1) {
            new AccountSetting(cata, h).setVisible(true);
            this.setVisible(false);
        } else if (h == 0) {
            new LibraryManagment().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        showList();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
