package bankmanagementsystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Transaction extends javax.swing.JFrame
{
    String pin;
    
    //constructor
    public Transaction(String pin)
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

        lblpleaseselectyourtransaction = new javax.swing.JLabel();
        btdeposit = new javax.swing.JButton();
        btfastcash = new javax.swing.JButton();
        btpinchange = new javax.swing.JButton();
        btcashwithdrawl = new javax.swing.JButton();
        btministatement = new javax.swing.JButton();
        btbalanceenquiry = new javax.swing.JButton();
        btexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transaction");

        lblpleaseselectyourtransaction.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblpleaseselectyourtransaction.setForeground(new java.awt.Color(153, 153, 153));
        lblpleaseselectyourtransaction.setText("Παρακαλώ επιλέξτε την συναλλαγή σας");

        btdeposit.setBackground(new java.awt.Color(0, 51, 51));
        btdeposit.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btdeposit.setText("Κατάθεση");
        btdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdepositActionPerformed(evt);
            }
        });

        btfastcash.setBackground(new java.awt.Color(0, 51, 51));
        btfastcash.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btfastcash.setText("Γρήγορα Μετρητά");

        btpinchange.setBackground(new java.awt.Color(0, 51, 51));
        btpinchange.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btpinchange.setText("Αλλαγή PIN");
        btpinchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpinchangeActionPerformed(evt);
            }
        });

        btcashwithdrawl.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btcashwithdrawl.setText("Ανάληψη");
        btcashwithdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcashwithdrawlActionPerformed(evt);
            }
        });

        btministatement.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btministatement.setText("Κατάθεση");
        btministatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btministatementActionPerformed(evt);
            }
        });

        btbalanceenquiry.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btbalanceenquiry.setText("Υπόλοιπο");
        btbalanceenquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbalanceenquiryActionPerformed(evt);
            }
        });

        btexit.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btexit.setText("Έξοδος");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btpinchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btfastcash, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btministatement)
                                .addComponent(btcashwithdrawl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btbalanceenquiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblpleaseselectyourtransaction)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(lblpleaseselectyourtransaction)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcashwithdrawl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btfastcash, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btministatement, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btpinchange, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbalanceenquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        // Έξοδος button code
        System.exit(0);
    }//GEN-LAST:event_btexitActionPerformed

    private void btdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdepositActionPerformed
        // Κατάθεση button code
        setVisible(false);
        new Deposit(pin);
    }//GEN-LAST:event_btdepositActionPerformed

    private void btcashwithdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcashwithdrawlActionPerformed
        // Ανάληψη button code
        setVisible(false);
        new Withdrawl(pin);
    }//GEN-LAST:event_btcashwithdrawlActionPerformed

    private void btpinchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpinchangeActionPerformed
        // Αλλαγή pin button code
        setVisible(false);
        new PinChange(pin);
    }//GEN-LAST:event_btpinchangeActionPerformed

    private void btbalanceenquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbalanceenquiryActionPerformed
        // Υπόλοιπο button code
        setVisible(false);
        new BalanceEnquiry(pin);
    }//GEN-LAST:event_btbalanceenquiryActionPerformed

    private void btministatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btministatementActionPerformed
        // Κατάθεση button code
        setVisible(false);
        new MiniStatement(pin);
    }//GEN-LAST:event_btministatementActionPerformed

    //Main
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Transaction("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbalanceenquiry;
    private javax.swing.JButton btcashwithdrawl;
    private javax.swing.JButton btdeposit;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btfastcash;
    private javax.swing.JButton btministatement;
    private javax.swing.JButton btpinchange;
    private javax.swing.JLabel lblpleaseselectyourtransaction;
    // End of variables declaration//GEN-END:variables
}
