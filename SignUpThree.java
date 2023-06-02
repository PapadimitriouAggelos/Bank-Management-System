package bankmanagementsystem;

import java.util.Random;
import javax.swing.JOptionPane;

public class SignUpThree extends javax.swing.JFrame 
{
    String formno;
    
    //constructor
    public SignUpThree(String formno) 
    {
        this.formno=formno;
        
        initComponents();
        
        setLocation(250,100);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblapplicationform = new javax.swing.JLabel();
        lblpersonaldetails = new javax.swing.JLabel();
        lblaccounttype = new javax.swing.JLabel();
        rbsavingaccount = new javax.swing.JRadioButton();
        rbcurrentaccount = new javax.swing.JRadioButton();
        rbfixeddepositaccount = new javax.swing.JRadioButton();
        rbrecurringdepositaccount = new javax.swing.JRadioButton();
        lblcardnumber = new javax.swing.JLabel();
        lblnumber = new javax.swing.JLabel();
        lblpin = new javax.swing.JLabel();
        lblpinnumber = new javax.swing.JLabel();
        lbl16digit = new javax.swing.JLabel();
        lblappear = new javax.swing.JLabel();
        lbl4digit = new javax.swing.JLabel();
        lblservicesrequired = new javax.swing.JLabel();
        cbatmcard = new javax.swing.JCheckBox();
        cbmobilebanking = new javax.swing.JCheckBox();
        cbchequebook = new javax.swing.JCheckBox();
        cbinternetbanking = new javax.swing.JCheckBox();
        cbemailalerts = new javax.swing.JCheckBox();
        cbestatement = new javax.swing.JCheckBox();
        cbdilono = new javax.swing.JCheckBox();
        btsubmit = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up Page 3");

        lblapplicationform.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblapplicationform.setText("Αίτηση Φόρμας");

        lblpersonaldetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpersonaldetails.setText("Σελίδα 3: Προσωπικά Στοιχεία");

        lblaccounttype.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblaccounttype.setText("Τύπος Λογαριασμού:");

        buttonGroup1.add(rbsavingaccount);
        rbsavingaccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        rbsavingaccount.setText("Λογαριασμός Αποταμίευσης");

        buttonGroup1.add(rbcurrentaccount);
        rbcurrentaccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        rbcurrentaccount.setText("Τρεχούμενος Λογαριασμός");

        buttonGroup1.add(rbfixeddepositaccount);
        rbfixeddepositaccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        rbfixeddepositaccount.setText("Λογαριασμό Πάγιας Κατάθεσης");

        buttonGroup1.add(rbrecurringdepositaccount);
        rbrecurringdepositaccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        rbrecurringdepositaccount.setText("Επαναλαμβανόμενος Λογαριασμός Καταθέσεων");

        lblcardnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblcardnumber.setText("Αριθμός Κάρτας:");

        lblnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblnumber.setText("XXXX-XXXX-XXXX-4184");

        lblpin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpin.setText("PIN:");

        lblpinnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpinnumber.setText("XXXX");

        lbl16digit.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lbl16digit.setText("(16-ψήφιος αριθμός κάρτας)");

        lblappear.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblappear.setText("Εμφανίζεται στην κάρτα ΑΤΜ/Βιβλίο Επιταγών και στις Καταστάσεις Κίνησης");

        lbl4digit.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lbl4digit.setText("(4-ψήφιος κωδικός)");

        lblservicesrequired.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblservicesrequired.setText("Απαιτούμενες Υπηρεσίες");

        cbatmcard.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbatmcard.setText("Κάρτα ATM");

        cbmobilebanking.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbmobilebanking.setText("Mobile Banking");

        cbchequebook.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbchequebook.setText("Βιβλίο Επιταγών");

        cbinternetbanking.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbinternetbanking.setText("Internet Banking");

        cbemailalerts.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbemailalerts.setText("Email Alerts");

        cbestatement.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cbestatement.setText("E-Statement");

        cbdilono.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        cbdilono.setText("Δια του παρόντος δηλώνω ότι τα παραπάνω καταχωρημένα στοιχεία είναι σωστά");

        btsubmit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsubmit.setText("Υποβολή");
        btsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubmitActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btcancel.setText("Ακύρωση");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(lblpersonaldetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblapplicationform))
                            .addComponent(lblaccounttype)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbsavingaccount)
                                    .addComponent(rbcurrentaccount)
                                    .addComponent(lblcardnumber)
                                    .addComponent(lbl16digit))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbrecurringdepositaccount)
                                            .addComponent(rbfixeddepositaccount)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblnumber))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblpinnumber)
                                            .addComponent(lblappear)))))
                            .addComponent(lblpin)
                            .addComponent(lblservicesrequired)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbatmcard)
                                    .addComponent(cbmobilebanking)
                                    .addComponent(cbchequebook))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbestatement)
                                    .addComponent(cbemailalerts)
                                    .addComponent(cbinternetbanking)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl4digit)
                                .addGap(152, 152, 152))
                            .addComponent(cbdilono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblapplicationform)
                .addGap(18, 18, 18)
                .addComponent(lblpersonaldetails)
                .addGap(55, 55, 55)
                .addComponent(lblaccounttype)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsavingaccount)
                    .addComponent(rbfixeddepositaccount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbcurrentaccount)
                    .addComponent(rbrecurringdepositaccount))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcardnumber)
                    .addComponent(lblnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl16digit)
                    .addComponent(lblappear))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpinnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl4digit)
                .addGap(41, 41, 41)
                .addComponent(lblservicesrequired)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbatmcard)
                    .addComponent(cbinternetbanking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmobilebanking)
                    .addComponent(cbemailalerts))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbchequebook)
                    .addComponent(cbestatement))
                .addGap(29, 29, 29)
                .addComponent(cbdilono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsubmit)
                    .addComponent(btcancel)
                    .addComponent(btback))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Ακύρωση button code
        setVisible(false);
        new Login();
    }//GEN-LAST:event_btcancelActionPerformed

    private void btsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsubmitActionPerformed
        // Υποβολή button code
        String accounttype=null;
        if(rbsavingaccount.isSelected())
            accounttype="Λογαριασμός Αποταμίευσης";
        else if(rbcurrentaccount.isSelected())
            accounttype="Τρεχούμενος Λογαριασμός";
        else if(rbfixeddepositaccount.isSelected())
            accounttype="Λογαριασμός Πάγιας Κατάθεσης";
        else if(rbrecurringdepositaccount.isSelected())
            accounttype="Επαναλαμβανόμενος Λογαριασμός Καταθέσεων";
        
        Random random=new Random();
        String cardnumber=""+ Math.abs((random.nextLong() % 90000000L)) + 5040936000000000L;
        String pinnumber=""+ Math.abs((random.nextLong() & 9000L) + 1000L);
        
        String servicesrequired="";
        if(cbatmcard.isSelected())
            servicesrequired= servicesrequired + " Κάρτα ATM";
        else if(cbmobilebanking.isSelected())
            servicesrequired= servicesrequired + " Mobile Banking";
        else if(cbchequebook.isSelected())
            servicesrequired= servicesrequired + " Βιβλίο Επιταγών";
        else if(cbinternetbanking.isSelected())
            servicesrequired= servicesrequired + " Internet Banking";
        else if(cbemailalerts.isSelected())
            servicesrequired= servicesrequired + " Email alerts";
        else if(cbestatement.isSelected())
            servicesrequired= servicesrequired + " E-Statement";
        
        if(accounttype.equals("") || servicesrequired.equals(""))
            JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσετε όλα τα στοιχεία της φόρμας για να συνεχίσετε");
        
        if(!cbdilono.isSelected())
            JOptionPane.showMessageDialog(null, "Επιλέξτε την αποδοχή για να σε συνεχίσετε");
        
        try
        {
            Conn con=new Conn();
            String query1="insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+servicesrequired+"')";
            String query2="insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

            con.s.executeUpdate(query1);
            con.s.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null, "Τα στοιχεία σας αποθηκεύθηκαν επιτυχώς\n"+"Αριθμός Κάρτας: "+cardnumber+"\n Pin: "+pinnumber);
            
            setVisible(false);
            new Login();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btsubmitActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new SignUpTwo(formno);
    }//GEN-LAST:event_btbackActionPerformed

    //Main
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new SignUpThree("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbatmcard;
    private javax.swing.JCheckBox cbchequebook;
    private javax.swing.JCheckBox cbdilono;
    private javax.swing.JCheckBox cbemailalerts;
    private javax.swing.JCheckBox cbestatement;
    private javax.swing.JCheckBox cbinternetbanking;
    private javax.swing.JCheckBox cbmobilebanking;
    private javax.swing.JLabel lbl16digit;
    private javax.swing.JLabel lbl4digit;
    private javax.swing.JLabel lblaccounttype;
    private javax.swing.JLabel lblappear;
    private javax.swing.JLabel lblapplicationform;
    private javax.swing.JLabel lblcardnumber;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblpersonaldetails;
    private javax.swing.JLabel lblpin;
    private javax.swing.JLabel lblpinnumber;
    private javax.swing.JLabel lblservicesrequired;
    private javax.swing.JRadioButton rbcurrentaccount;
    private javax.swing.JRadioButton rbfixeddepositaccount;
    private javax.swing.JRadioButton rbrecurringdepositaccount;
    private javax.swing.JRadioButton rbsavingaccount;
    // End of variables declaration//GEN-END:variables
}
