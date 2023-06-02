package bankmanagementsystem;

import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame 
{

    //constructor
    public Login() 
    {
        initComponents();
        
        setLocation(250, 200);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,60,100,100);
        add(image);
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblwelcome = new javax.swing.JLabel();
        lblcardno = new javax.swing.JLabel();
        lblpin = new javax.swing.JLabel();
        tfcardno = new javax.swing.JTextField();
        btsignin = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        btsignup = new javax.swing.JButton();
        tfpin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        lblwelcome.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblwelcome.setText("Καλώς ήρθατε στο ATM");

        lblcardno.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblcardno.setText("Αριθμός Κάρτας:");

        lblpin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblpin.setText("PIN");

        btsignin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsignin.setText("SIGN IN");
        btsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsigninActionPerformed(evt);
            }
        });

        btclear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btclear.setText("CLEAR");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        btsignup.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsignup.setText("SIGN UP");
        btsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(lblwelcome)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcardno)
                            .addComponent(lblpin))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfcardno)
                            .addComponent(tfpin, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblwelcome)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcardno)
                    .addComponent(tfcardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpin)
                    .addComponent(tfpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsignin)
                    .addComponent(btclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsignup)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // Clear button code
        tfcardno.setText(" ");
        tfpin.setText("");
    }//GEN-LAST:event_btclearActionPerformed

    private void btsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsignupActionPerformed
        // Sign Up button code
        setVisible(false);
        new SignUpOne();
    }//GEN-LAST:event_btsignupActionPerformed

    private void btsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsigninActionPerformed
        // Sign In button code
        String cardnumber=tfcardno.getText();
        String pin=tfpin.getText();
        
        Conn con=new Conn();
        String query="select * from login where cardnumber='"+cardnumber+"' and pinnumber='"+pin+"'";
        
        try
        {
            ResultSet rs= con.s.executeQuery(query);
            
            if(rs.next())
            {
                setVisible(false);
                new Transaction(pin);
            }
            else
                JOptionPane.showMessageDialog(null, "Λανθασμένος Αριθμός Κάρτας ή PIN");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btsigninActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclear;
    private javax.swing.JButton btsignin;
    private javax.swing.JButton btsignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblcardno;
    private javax.swing.JLabel lblpin;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTextField tfcardno;
    private javax.swing.JPasswordField tfpin;
    // End of variables declaration//GEN-END:variables
}
