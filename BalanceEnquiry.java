package bankmanagementsystem;

import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BalanceEnquiry extends javax.swing.JFrame 
{
    String pin;
    
    //constructor
    public BalanceEnquiry(String pin) 
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
        
        Conn con=new Conn();
        int balance=0;
        try
        {
            ResultSet rs= con.s.executeQuery("select * from bank where pin='"+pin+"'");
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString("amount"));
                else
                    balance -= Integer.parseInt(rs.getString("amount"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        JLabel text=new JLabel("Το υπόλοιπο του λογαριασμού είναι "+balance);
        text.setForeground(Color.GRAY);
        text.setBounds(170, 300, 400, 30);
        image.add(text);
        
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Balance Enquiry");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(btback)
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new Transaction(pin);
    }//GEN-LAST:event_btbackActionPerformed

    //Main
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BalanceEnquiry("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    // End of variables declaration//GEN-END:variables
}
