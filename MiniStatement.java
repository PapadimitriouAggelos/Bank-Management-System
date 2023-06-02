package bankmanagementsystem;

import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MiniStatement extends javax.swing.JFrame 
{
    String pin;
    
    //constructor
    public MiniStatement(String pin) 
    {
        this.pin=pin;
        
        initComponents();
        
        setLocation(200, 0);
        
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblministatement = new javax.swing.JLabel();
        lblcard = new javax.swing.JLabel();
        lblmini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mini Statement");

        lblministatement.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblministatement.setText("Mini Statement");

        lblcard.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblministatement))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblcard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(lblmini, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblministatement)
                .addGap(64, 64, 64)
                .addComponent(lblcard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmini, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        try
        {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select * from login where pinnumber='"+pin+"'");

            while(rs.next())
            {
                lblcard.setText("Αριθμός Κάρτας: "+rs.getString("cardnumber").substring(0, 4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        try
        {
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("select * from bank where pin='"+pin+"'");
            while(rs.next())
            {
                lblmini.setText(lblmini.getText() + "<html>" +rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+ "<br><br>");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Main
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new MiniStatement("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblcard;
    private javax.swing.JLabel lblmini;
    private javax.swing.JLabel lblministatement;
    // End of variables declaration//GEN-END:variables
}
