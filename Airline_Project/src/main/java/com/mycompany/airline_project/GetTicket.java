/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airline_project;

import java.awt.Color;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.FileNotFoundException;

/**
 *
 * @author Nitin
 */
public class GetTicket extends javax.swing.JInternalFrame {
    

    /**
     * Creates new form GetTicket
     */
    public GetTicket() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setResizable(false);
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
        ticketID = new javax.swing.JTextField();
        getTicket = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();
        departure = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        flightName = new javax.swing.JLabel();
        TFirstName = new javax.swing.JLabel();
        TLastName = new javax.swing.JLabel();
        TGender = new javax.swing.JLabel();
        TFlightName = new javax.swing.JLabel();
        TArrival = new javax.swing.JLabel();
        TDeparture = new javax.swing.JLabel();
        TContact = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Ticket ID");

        ticketID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketIDActionPerformed(evt);
            }
        });

        getTicket.setText("Get Ticket");
        getTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTicketActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Thanks for using Air Sewa");

        firstName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        firstName.setText("First Name");

        lastName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lastName.setText("Last Name");

        gender.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        gender.setText("Gender");

        arrival.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        arrival.setText("Arrival");

        departure.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        departure.setText("Departure");

        contact.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        contact.setText("Contact Number");

        flightName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        flightName.setText("Flight Name");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(firstName)
                        .addGap(18, 18, 18)
                        .addComponent(TFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName)
                            .addComponent(gender))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(TGender, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(flightName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFlightName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrival)
                            .addComponent(departure))
                        .addGap(24, 24, 24)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TArrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(contact)
                        .addGap(18, 18, 18)
                        .addComponent(TContact, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(arrival)
                    .addComponent(TArrival)
                    .addComponent(TFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(departure)
                    .addComponent(TLastName)
                    .addComponent(TDeparture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gender)
                        .addComponent(flightName)
                        .addComponent(TGender)
                        .addComponent(TFlightName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contact)
                        .addComponent(TContact, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        print.setText("Print");
        print.setEnabled(false);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(getTicket)
                        .addGap(18, 18, 18)
                        .addComponent(print))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ticketID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getTicket)
                    .addComponent(print))
                .addGap(57, 57, 57)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketIDActionPerformed

    private void getTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTicketActionPerformed
        try {
            // TODO add your handling code here:
            String TicketID=ticketID.getText();
            Connection con;//storing connection between database and code
            PreparedStatement pre;//prepare some queries that we are going to run in sql server
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/airline_project","root","J1a2y3d4e5n6#");
            pre=con.prepareStatement("select * from ticket where TicketID=?");
            pre.setString(1,TicketID);
            ResultSet rs=pre.executeQuery();
            if(rs.next()!=false)
            {
                
                print.setEnabled(true);
                TFirstName.setText(rs.getString("FirstName"));
                TLastName.setText(rs.getString("LastName"));
                TGender.setText(rs.getString("Gender"));
                TArrival.setText(rs.getString("Arrival"));
                TDeparture.setText(rs.getString("Departure"));
                TContact.setText(rs.getString("Contact"));
                String FlightID=rs.getString("FlightID");
                pre=con.prepareStatement("select FlightName from flight where FlightID=?");
                pre.setString(1,FlightID);
                ResultSet resultSet=pre.executeQuery();
                resultSet.next();
                TFlightName.setText(resultSet.getString("FlightName"));
            }
            else
            {
       
                print.setEnabled(false);
               TFirstName.setText("");
                TLastName.setText("");
                TGender.setText("");
                TArrival.setText("");
                TDeparture.setText("");
                TContact.setText("");
                TFlightName.setText("");
                JOptionPane.showMessageDialog(null,"No Such Ticket");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getTicketActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
// TODO add your handling code here:
            JFileChooser fileChooser=new JFileChooser("C:\\Users\\Nitin\\Downloads");
            int chooseOption=fileChooser.showSaveDialog(null);
            if(chooseOption==JFileChooser.APPROVE_OPTION)
            {
                Document document=new Document(PageSize.A4);
                try{
                    PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(fileChooser.getSelectedFile().getAbsolutePath()+".pdf"));
                    document.open();
                    PdfContentByte contentByte = writer.getDirectContent();
                    PdfTemplate template = contentByte.createTemplate(794, 800);
                    Graphics2D g2 = template.createGraphics(794, 800);
                    g2.scale(0.8,1);
                    panel.print(g2);
                    g2.dispose();
                    contentByte.addTemplate(template, 0, 0);
                    JOptionPane.showMessageDialog(null,"Ticket Downloaded");
                } catch (DocumentException ex) {
                    Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GetTicket.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    if(document.isOpen())
                    {
                        document.close();
                    }
                }
            }

        
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TArrival;
    private javax.swing.JLabel TContact;
    private javax.swing.JLabel TDeparture;
    private javax.swing.JLabel TFirstName;
    private javax.swing.JLabel TFlightName;
    private javax.swing.JLabel TGender;
    private javax.swing.JLabel TLastName;
    private javax.swing.JLabel arrival;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel departure;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel flightName;
    private javax.swing.JLabel gender;
    private javax.swing.JButton getTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastName;
    private javax.swing.JPanel panel;
    private javax.swing.JButton print;
    private javax.swing.JTextField ticketID;
    // End of variables declaration//GEN-END:variables
}
