package bankmanagementsystem;

import java.awt.Image;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//κλάση που αφορά την ανάληψη
public class Withdrawl extends javax.swing.JFrame 
{

    String pin;
    
    //constructor
    public Withdrawl(String pin) 
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

        jLabel1 = new javax.swing.JLabel();
        tfamount = new javax.swing.JTextField();
        btwithdraw = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Withdrawl");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Εισάγετε το ποσό της ανάληψης");

        btwithdraw.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btwithdraw.setText("Ανάληψη");
        btwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btwithdrawActionPerformed(evt);
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
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfamount, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btwithdraw))
                .addGap(388, 388, 388))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new Transaction(pin);
    }//GEN-LAST:event_btbackActionPerformed

    private void btwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btwithdrawActionPerformed
        // Ανάληψη button code
        String amount=tfamount.getText();
        Date date=new Date();
        
        if(amount.equals(""))
            JOptionPane.showMessageDialog(null, "Παρακαλούμε πληκτρολογήστε το ποσό της ανάληψης");
        
        try
        {
            Conn conn=new Conn();
            String query="insert into bank values('"+pin+"', '"+date+"', 'Ανάληψη', '"+amount+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Η ανάληψη πραγματοποιήθηκε επιτυχώς");
            setVisible(false);
            new Transaction(pin);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btwithdrawActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Withdrawl("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btwithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfamount;
    // End of variables declaration//GEN-END:variables
}
