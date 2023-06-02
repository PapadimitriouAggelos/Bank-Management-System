package bankmanagementsystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SignUpTwo extends javax.swing.JFrame 
{
    String formno;

    //constructor
    public SignUpTwo(String formno)
    {
        this.formno=formno;
        
        initComponents();
        
        setLocation(250, 100);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(30,30,100,100);
        add(image);
        
        String[] incomecategory={"Μικρότερο από 12.000 $", "Μεγαλύτερο από 12.000 $", "Μηδέν"};
        cbincome.setModel(new javax.swing.DefaultComboBoxModel<>(incomecategory));
        
        String[] occupation={"Mισθωτός", "Aυτοαπασχολούμενος", "Επιχείρηση", "Φοιτητής", "Συνταξιούχος", "Άλλο"};
        cboccupation.setModel(new javax.swing.DefaultComboBoxModel<>(occupation));
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblapplicationform = new javax.swing.JLabel();
        lblpersonaldetails = new javax.swing.JLabel();
        lblincome = new javax.swing.JLabel();
        lbloccupation = new javax.swing.JLabel();
        lblpannumber = new javax.swing.JLabel();
        lblclientnumber = new javax.swing.JLabel();
        lblseniorcitizen = new javax.swing.JLabel();
        lblexistingaccount = new javax.swing.JLabel();
        cbincome = new javax.swing.JComboBox<>();
        cboccupation = new javax.swing.JComboBox<>();
        tfpannumber = new javax.swing.JTextField();
        tfclientnumber = new javax.swing.JTextField();
        rbsenioryes = new javax.swing.JRadioButton();
        rbseniorno = new javax.swing.JRadioButton();
        rbexistingyes = new javax.swing.JRadioButton();
        rbexistingno = new javax.swing.JRadioButton();
        btnext = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up Page 2");

        lblapplicationform.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblapplicationform.setText("Αίτηση Φόρμας ");

        lblpersonaldetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpersonaldetails.setText("Σελίδα 2: Προσωπικά στοιχεία");

        lblincome.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblincome.setText("Εισόδημα:");

        lbloccupation.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbloccupation.setText("Ενασχόληση:");

        lblpannumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpannumber.setText("PAN Αριθμός");

        lblclientnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclientnumber.setText("Αριθμός Πελάτη");

        lblseniorcitizen.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblseniorcitizen.setText("Ηλικιωμένος Πολίτης:");

        lblexistingaccount.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblexistingaccount.setText("Υπάρχων Λογαριασμός");

        cbincome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rbsenioryes);
        rbsenioryes.setText("Ναι");

        buttonGroup1.add(rbseniorno);
        rbseniorno.setText("Όχι");

        buttonGroup2.add(rbexistingyes);
        rbexistingyes.setText("Ναι");

        buttonGroup2.add(rbexistingno);
        rbexistingno.setText("Όχι");

        btnext.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnext.setText("Επόμενο");
        btnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnextActionPerformed(evt);
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
                        .addGap(173, 173, 173)
                        .addComponent(lblapplicationform))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblpersonaldetails)))
                .addGap(0, 356, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblincome)
                                    .addComponent(lbloccupation))
                                .addComponent(lblpannumber))
                            .addComponent(lblclientnumber)
                            .addComponent(lblseniorcitizen)
                            .addComponent(lblexistingaccount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbincome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboccupation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfpannumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(rbsenioryes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbseniorno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfclientnumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbexistingyes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbexistingno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnext, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblapplicationform)
                .addGap(34, 34, 34)
                .addComponent(lblpersonaldetails)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblincome)
                    .addComponent(cbincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloccupation)
                    .addComponent(cboccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpannumber)
                    .addComponent(tfpannumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblclientnumber)
                    .addComponent(tfclientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblseniorcitizen)
                    .addComponent(rbseniorno)
                    .addComponent(rbsenioryes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblexistingaccount)
                    .addComponent(rbexistingyes)
                    .addComponent(rbexistingno))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnext)
                    .addComponent(btback))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnextActionPerformed
        // Επόμενο button code
        String income=(String) cbincome.getSelectedItem();
        String occupation=(String) cboccupation.getSelectedItem();
        String pannumber=tfpannumber.getText().trim();
        String clientnumber=tfclientnumber.getText().trim();
        
        String seniorcitizen=null;
        if(rbsenioryes.isSelected())
            seniorcitizen="Ναι";
        else if(rbseniorno.isSelected())
            seniorcitizen="Όχι";
        
        String existingaccount=null;
        if(rbexistingyes.isSelected())
            existingaccount="Ναι";
        else if(rbexistingno.isSelected())
            existingaccount="Όχι";
        
        if(income.equals("") || occupation.equals("") || pannumber.equals("") || clientnumber.equals("") || seniorcitizen.equals("") || existingaccount.equals(""))
            JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσετε όλα τα στοιχεία της φόρμας για να συνεχίσετε");
        
        try
        {
            Conn con=new Conn();
            String query="insert into signuptwo values('"+formno+"', '"+income+"', '"+occupation+"', '"+pannumber+"', '"+clientnumber+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            con.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Τα στοιχεία σας αποθηκεύθηκαν επιτυχώς");
            
            setVisible(false);
            new SignUpThree(formno);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnextActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new SignUpOne();
    }//GEN-LAST:event_btbackActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new SignUpTwo("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbincome;
    private javax.swing.JComboBox<String> cboccupation;
    private javax.swing.JLabel lblapplicationform;
    private javax.swing.JLabel lblclientnumber;
    private javax.swing.JLabel lblexistingaccount;
    private javax.swing.JLabel lblincome;
    private javax.swing.JLabel lbloccupation;
    private javax.swing.JLabel lblpannumber;
    private javax.swing.JLabel lblpersonaldetails;
    private javax.swing.JLabel lblseniorcitizen;
    private javax.swing.JRadioButton rbexistingno;
    private javax.swing.JRadioButton rbexistingyes;
    private javax.swing.JRadioButton rbseniorno;
    private javax.swing.JRadioButton rbsenioryes;
    private javax.swing.JTextField tfclientnumber;
    private javax.swing.JTextField tfpannumber;
    // End of variables declaration//GEN-END:variables
}
