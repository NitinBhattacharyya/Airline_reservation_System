/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airline_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nitin
 */
public class AddFlight extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddFlight() {
        initComponents();
        this.setSize(850,680);
        this.setResizable(false);
        AutoID();
    }
    public void AutoID()
    {
        try {
            Connection con;//storing connection between database and code
            PreparedStatement pre;//prepare some queries that we are going to run in sql server
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/airline_project","root","J1a2y3d4e5n6#");
            pre=con.prepareStatement("Select MAX(FlightID) from flight");
            ResultSet rs=pre.executeQuery();
            rs.next();
            if(rs.getString("MAX(FlightID)")==null)
            {
                flightID.setText("FL001");
            }
            else
            {
                long id=Long.parseLong(rs.getString("MAX(FlightID)").substring(2,rs.getString("MAX(FlightID)").length()));
                id++;
                flightID.setText("FL"+String.format("%03d", id));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        flightID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        flightName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        arrival = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        departure = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateOfFlight = new com.toedter.calendar.JDateChooser();
        addFlight = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fare = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Add Flight");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(850, 680));
        setMinimumSize(new java.awt.Dimension(850, 680));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Flight Panel ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 490, 48);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,100));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Flight ID");

        flightID.setEditable(false);
        flightID.setCaretColor(new java.awt.Color(255, 255, 255));
        flightID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Flight Name");

        flightName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Arrival");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Departure");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Duration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 120, 300, 290);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,100));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Seats");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(14, 17, 40, 19);
        jPanel2.add(seats);
        seats.setBounds(118, 16, 128, 22);

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Fare");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(14, 57, 30, 19);

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Date of Flight");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(14, 96, 90, 19);
        jPanel2.add(dateOfFlight);
        dateOfFlight.setBounds(118, 96, 128, 22);

        addFlight.setText("Add");
        addFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightActionPerformed(evt);
            }
        });
        jPanel2.add(addFlight);
        addFlight.setBounds(20, 140, 72, 23);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(171, 136, 72, 23);
        jPanel2.add(fare);
        fare.setBounds(118, 56, 128, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(480, 120, 270, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer.jpg"))); // NOI18N
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flightNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNameActionPerformed

    private void flightIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightActionPerformed
        try {
            // TODO add your handling code here:
            String FlightID=flightID.getText();
            String FlightName=flightName.getText();
            String Arrival=arrival.getText();
            String Departure=departure.getText();
            String Duration=duration.getText();
            String Seats=seats.getText();
            String Fare=fare.getText();
            DateFormat db=new SimpleDateFormat("dd-MM-yyyy");
            String DateOfFlight=db.format(dateOfFlight.getDate());
            Connection con;//storing connection between database and code
            PreparedStatement pre;//prepare some queries that we are going to run in sql server
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/airline_project","root","J1a2y3d4e5n6#");
            pre=con.prepareStatement("insert into flight(FlightID,FlightName,Arrival,Departure,Duration,Seats,Fare,Date)values(?,?,?,?,?,?,?,?)");
            pre.setString(1,FlightID);
            pre.setString(2,FlightName);
            pre.setString(3,Arrival);
            pre.setString(4,Departure);
            pre.setString(5,Duration);
            pre.setString(6,Seats);
            pre.setString(7,Fare);
            pre.setString(8,DateOfFlight);
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null,"Flight Added Succesfully");
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlight;
    private javax.swing.JTextField arrival;
    private com.toedter.calendar.JDateChooser dateOfFlight;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField flightID;
    private javax.swing.JTextField flightName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField seats;
    // End of variables declaration//GEN-END:variables
}