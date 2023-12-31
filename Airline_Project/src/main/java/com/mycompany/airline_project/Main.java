/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline_project;

/**
 *
 * @author Nitin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setSize(1280,720);
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

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addCustomer = new javax.swing.JMenuItem();
        searchCustomer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addflight = new javax.swing.JMenuItem();
        bookflight = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        viewticket = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        addadmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Air Sewa");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Customer");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        addCustomer.setText("Add Customer");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(addCustomer);

        searchCustomer.setText("Search Customer");
        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(searchCustomer);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Flight");

        addflight.setText("Add Flight");
        addflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightActionPerformed(evt);
            }
        });
        jMenu2.add(addflight);

        bookflight.setText("Book Flight");
        bookflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightActionPerformed(evt);
            }
        });
        jMenu2.add(bookflight);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ticket");

        viewticket.setText("View Ticket");
        viewticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewticketActionPerformed(evt);
            }
        });
        jMenu3.add(viewticket);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Admin");

        addadmin.setText("Add Admin");
        addadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadminActionPerformed(evt);
            }
        });
        jMenu4.add(addadmin);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        // TODO add your handling code here:
        AddCustomer customer=new AddCustomer();
        Desktop.add(customer);
        customer.setVisible(true);
    }//GEN-LAST:event_addCustomerActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
                // TODO add your handling code here:
                SearchCustomer customer=new SearchCustomer();
                Desktop.add(customer);
                customer.setVisible(true);
               
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void addflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightActionPerformed
        // TODO add your handling code here:
         AddFlight addFlight=new AddFlight();
         Desktop.add(addFlight);
         addFlight.setVisible(true);
    }//GEN-LAST:event_addflightActionPerformed

    private void addadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadminActionPerformed
        // TODO add your handling code here:
        AddAdmin admin=new AddAdmin();
        Desktop.add(admin);
        admin.setVisible(true);
    }//GEN-LAST:event_addadminActionPerformed

    private void bookflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightActionPerformed
        // TODO add your handling code here:
        BookTicket ticket=new BookTicket();
        Desktop.add(ticket);
        ticket.setVisible(true);
    }//GEN-LAST:event_bookflightActionPerformed

    private void viewticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewticketActionPerformed
        // TODO add your handling code here:
        GetTicket ticket=new GetTicket();
        Desktop.add(ticket);
        ticket.setVisible(true);
    }//GEN-LAST:event_viewticketActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem addCustomer;
    private javax.swing.JMenuItem addadmin;
    private javax.swing.JMenuItem addflight;
    private javax.swing.JMenuItem bookflight;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem searchCustomer;
    private javax.swing.JMenuItem viewticket;
    // End of variables declaration//GEN-END:variables
}
