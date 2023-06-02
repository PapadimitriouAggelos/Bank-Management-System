package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.util.Random;
import javax.swing.*;

public class SignUpOne extends javax.swing.JFrame 
{

    JDateChooser date;
    
    Random ran=new Random();
    int random=ran.nextInt(5000);
    
    //constructor
    public SignUpOne()
    {
        
        
        initComponents();
        
        setLocation(250, 100);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(30,30,100,100);
        add(image);
        
        date=new JDateChooser();
        date.setBounds(310, 256, 150, 30);
        add(date);
        
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        lblapplicationform = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblsurname = new javax.swing.JLabel();
        lbldateofbirth = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblmaritalstatus = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lbltk = new javax.swing.JLabel();
        lblnomos = new javax.swing.JLabel();
        lblpersonaldetails = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfsurname = new javax.swing.JTextField();
        rbman = new javax.swing.JRadioButton();
        rbwoman = new javax.swing.JRadioButton();
        tfemail = new javax.swing.JTextField();
        rbmarried = new javax.swing.JRadioButton();
        rbunmarried = new javax.swing.JRadioButton();
        rbother = new javax.swing.JRadioButton();
        tfaddress = new javax.swing.JTextField();
        tfcity = new javax.swing.JTextField();
        tfnomos = new javax.swing.JTextField();
        tftk = new javax.swing.JTextField();
        btnext = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up Page 1");

        lblapplicationform.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblapplicationform.setText("Αίτηση φόρμας Νο."+random);

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblname.setText("Όνομα:");

        lblsurname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsurname.setText("Επίθετο:");

        lbldateofbirth.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldateofbirth.setText("Ημερομηνία Γέννησης:");

        lblgender.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblgender.setText("Φύλο:");

        lblemail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblemail.setText("Email:");

        lblmaritalstatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblmaritalstatus.setText("Οικογενειακή Κατάσταση:");

        lbladdress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbladdress.setText("Διεύθυνση:");

        lblcity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblcity.setText("Πόλη:");

        lbltk.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbltk.setText("Τ.Κ.");

        lblnomos.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblnomos.setText("Νομός:");

        lblpersonaldetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblpersonaldetails.setText("Σελίδα 1: Προσωπικά Στοιχεία");

        buttonGroup1.add(rbman);
        rbman.setText("Άνδρας");

        buttonGroup1.add(rbwoman);
        rbwoman.setText("Γυναίκα");

        buttonGroup2.add(rbmarried);
        rbmarried.setText("Έγγαμος");

        buttonGroup2.add(rbunmarried);
        rbunmarried.setText("Άγαμος");

        buttonGroup2.add(rbother);
        rbother.setText("Άλλο");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblpersonaldetails)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lblapplicationform)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnext, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsurname)
                            .addComponent(lblname)
                            .addComponent(lbldateofbirth)
                            .addComponent(lblgender)
                            .addComponent(lblemail)
                            .addComponent(lblmaritalstatus)
                            .addComponent(lbladdress)
                            .addComponent(lblcity)
                            .addComponent(lbltk)
                            .addComponent(lblnomos))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbman, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(rbwoman, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfname)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbmarried, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rbunmarried, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbother, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfemail)
                            .addComponent(tfsurname)
                            .addComponent(tfaddress)
                            .addComponent(tfcity)
                            .addComponent(tfnomos)
                            .addComponent(tftk))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblapplicationform)
                .addGap(26, 26, 26)
                .addComponent(lblpersonaldetails)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsurname)
                    .addComponent(tfsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldateofbirth)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblgender)
                            .addComponent(rbman)
                            .addComponent(rbwoman))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemail)
                            .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmaritalstatus)
                            .addComponent(rbmarried)
                            .addComponent(rbunmarried)
                            .addComponent(rbother))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbladdress)
                            .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcity)
                            .addComponent(tfcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnomos)
                            .addComponent(tfnomos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbltk))
                    .addComponent(tftk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnext)
                    .addComponent(btback))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnextActionPerformed
        // Επόμενο button code
        String formno=""+random;
        String name=tfname.getText();
        String surname=tfsurname.getText();
        String d=((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender= null;
        
        if(rbman.isSelected())
            gender="Άνδρας";
        else if(rbwoman.isSelected())
            gender="Γυναίκα";
        
        String email=tfemail.getText();
        
        String maritalstatus=null;
        
        if(rbmarried.isSelected())
            maritalstatus="Έγγαμος";
        else if(rbunmarried.isSelected())
            maritalstatus="Άγαμος";
        else if(rbother.isSelected())
            maritalstatus="Άλλο";
        
        String address=tfaddress.getText();
        String city=tfcity.getText();
        String nomos=tfnomos.getText();
        String tk=tftk.getText();
        
        if(name.equals("") || surname.equals("") || d.equals("") || gender.equals("") || email.equals("") || maritalstatus.equals("") || address.equals("") || city.equals("") || nomos.equals("") || tk.equals(""))
            JOptionPane.showMessageDialog(null, "Πρέπει να συμπληρώσετε όλα τα στοιχεία της φόρμας για να συνεχίσετε");
        
        try
        {
            Conn con=new Conn();
            String query="insert into signup values('"+formno+"', '"+name+"', '"+surname+"', '"+d+"', '"+gender+"', '"+email+"', '"+maritalstatus+"', '"+address+"', '"+city+"', '"+nomos+"', '"+tk+"')";
            con.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Τα στοιχεία σας αποθηκεύθηκαν επιτυχώς");
            
            setVisible(false);
            new SignUpTwo(formno);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnextActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new Login();
    }//GEN-LAST:event_btbackActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new SignUpOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btback;
    private javax.swing.JButton btnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblapplicationform;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldateofbirth;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblmaritalstatus;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnomos;
    private javax.swing.JLabel lblpersonaldetails;
    private javax.swing.JLabel lblsurname;
    private javax.swing.JLabel lbltk;
    private javax.swing.JRadioButton rbman;
    private javax.swing.JRadioButton rbmarried;
    private javax.swing.JRadioButton rbother;
    private javax.swing.JRadioButton rbunmarried;
    private javax.swing.JRadioButton rbwoman;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfcity;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfnomos;
    private javax.swing.JTextField tfsurname;
    private javax.swing.JTextField tftk;
    // End of variables declaration//GEN-END:variables
}
