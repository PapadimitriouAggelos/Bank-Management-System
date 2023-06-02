package bankmanagementsystem;

import java.awt.Image;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends javax.swing.JFrame 
{

    String pin;
    
    //constructor
    public FastCash(String pin)
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
        bt100 = new javax.swing.JButton();
        bt1000 = new javax.swing.JButton();
        bt5000 = new javax.swing.JButton();
        bt500 = new javax.swing.JButton();
        bt2000 = new javax.swing.JButton();
        bt10000 = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Διάλεξε το Ποσό Ανάληψης");

        bt100.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt100.setText("Rs 100 $");
        bt100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt100ActionPerformed(evt);
            }
        });

        bt1000.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt1000.setText("Rs 1000$");
        bt1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1000ActionPerformed(evt);
            }
        });

        bt5000.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt5000.setText("Rs 5000$");
        bt5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5000ActionPerformed(evt);
            }
        });

        bt500.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt500.setText("Rs 500 $");
        bt500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt500ActionPerformed(evt);
            }
        });

        bt2000.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt2000.setText("Rs 2000 $");
        bt2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2000ActionPerformed(evt);
            }
        });

        bt10000.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bt10000.setText("Rs 10.000 $");
        bt10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10000ActionPerformed(evt);
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
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt1000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt5000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt2000, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt500, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt10000, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt500, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1000, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2000, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt5000, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10000, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // Πίσω button code
        setVisible(false);
        new Transaction(pin);
    }//GEN-LAST:event_btbackActionPerformed

    private void bt100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt100ActionPerformed
        // 100$ button code
        String amount= "100";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt100ActionPerformed

    private void bt500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt500ActionPerformed
        // 500$ button code
        String amount= "500";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt500ActionPerformed

    private void bt1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1000ActionPerformed
        // 1000$ button code
        String amount= "1000";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt1000ActionPerformed

    private void bt2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2000ActionPerformed
        // 2000$ button code
        String amount= "2000";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt2000ActionPerformed

    private void bt5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5000ActionPerformed
        // 5000$ button code
        String amount= "5000";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt5000ActionPerformed

    private void bt10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10000ActionPerformed
        // 10.000$ button code
        String amount= "10000";
        
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from bank where pin='"+pin+"'");
            int balance=0;
            
            while(rs.next())
            {
                if(rs.getString("type").equals("Κατάθεση"))
                    balance += Integer.parseInt(rs.getString(amount));
                else
                    balance -= Integer.parseInt(rs.getString(amount));
            }
            
            if(balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null, "Ανεπαρκής υπόλοιπο");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pin+"', '"+date+"','Ανάληψη ', '"+amount+"')";
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Το ποσό των "+amount+" χρεώθηκε επιτυχώς");
            
            setVisible(false);
            new Transaction(pin);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt10000ActionPerformed

    //Main
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FastCash("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt100;
    private javax.swing.JButton bt1000;
    private javax.swing.JButton bt10000;
    private javax.swing.JButton bt2000;
    private javax.swing.JButton bt500;
    private javax.swing.JButton bt5000;
    private javax.swing.JButton btback;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
