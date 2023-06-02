package bankmanagementsystem;

import java.awt.Image;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//κλάση που αφορά την κατάθεση
public class Deposit extends javax.swing.JFrame 
{
    String pin;
    
    //constructor
    public Deposit(String pin) 
    {
        this.pin=pin;
        
        initComponents();
        
        setLocation(200, 0);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblentertheamount = new javax.swing.JLabel();
        tfamount = new javax.swing.JTextField();
        btdeposit = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposit");

        lblentertheamount.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblentertheamount.setForeground(new java.awt.Color(204, 204, 204));
        lblentertheamount.setText("Eισάγετε το ποσό που θέλετε να καταθέσετε");

        btdeposit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btdeposit.setText("Κατάθεση");
        btdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdepositActionPerformed(evt);
            }
        });

        btback.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btback.setText("Πίσω");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblentertheamount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfamount))
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(lblentertheamount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new Transaction(pin);
    }//GEN-LAST:event_btbackActionPerformed

    private void btdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdepositActionPerformed
        // Κατάθεση button code
        String deposit=tfamount.getText();
        Date date=new Date();
        
        if(deposit.equals(""))
            JOptionPane.showMessageDialog(null, "Παρακαλούμε πληκτρολογήστε το ποσό της κατάθεσης");
        
        try
        {
            Conn con=new Conn();
            String query="insert into bank values('"+pin+"', '"+date+"', 'Κατάθεση', '"+deposit+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Η κατάθεση πραγματοποιήθηκε επιτυχώς");
            setVisible(false);
            new Transaction(pin);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btdepositActionPerformed

    public static void main(String args[]) 
    {
    
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new Deposit("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btdeposit;
    private javax.swing.JLabel lblentertheamount;
    private javax.swing.JTextField tfamount;
    // End of variables declaration//GEN-END:variables
}
