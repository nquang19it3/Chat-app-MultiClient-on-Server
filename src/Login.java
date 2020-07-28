
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    static String info;
    public Connection on;
    public Statement st;
    boolean isConnected = true;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        this.getContentPane().setBackground(new Color(51, 51, 51));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            on = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngocquang", "root", "");
            st = on.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not connected");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPsw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("CHAT BOX");

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setText("Tài khoản");
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtIP.setBackground(new java.awt.Color(0, 0, 0));
        txtIP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIP.setForeground(new java.awt.Color(153, 153, 153));
        txtIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP.setText("Địa chỉ IP");
        txtIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIPFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 204));
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPsw.setBackground(new java.awt.Color(0, 0, 0));
        txtPsw.setForeground(new java.awt.Color(153, 153, 153));
        txtPsw.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-facebook-messenger-128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(txtIP)
                            .addComponent(txtPsw))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "select *from login where Username = '" + txtName.getText() + "'and Password = '" + String.valueOf(txtPsw.getPassword()) + "'";
            ResultSet rss = st.executeQuery(sql);
            if (rss.next()) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                connectToServer();
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bài! Tài khoản hoặc mật khẩu không chính xác. ");
                txtName.setText("");
                txtPsw.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Người dùng không có sẵn!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        if (txtName.getText().trim().equals("Tài khoản")) {
            txtName.setText("");
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (txtName.getText().trim().equals("")) {
            txtName.setText("Tài khoản");
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIPFocusGained
        // TODO add your handling code here:
        if (txtIP.getText().trim().equals("Địa chỉ IP")) {
            txtIP.setText("");
        }
    }//GEN-LAST:event_txtIPFocusGained

    private void txtIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIPFocusLost
        // TODO add your handling code here:
        if (txtIP.getText().trim().equals("")) {
            txtIP.setText("Địa chỉ IP");
        }
    }//GEN-LAST:event_txtIPFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPsw;
    // End of variables declaration//GEN-END:variables

    private void connectToServer() {
        String username = txtName.getText();
        String IP = txtIP.getText();
        try {
            Socket s = new Socket(IP, 4444);
            if (s != null) {
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF(username);
                String i = new DataInputStream(s.getInputStream()).readUTF();
                if (i.equals("You Are Already Registered....!!")) {
                    
                } else {
                    Client main = new Client();
                    main.initFrame(username, txtIP.getText(), s);
                    if (main.isConnected()) {
                        main.setLocationRelativeTo(null);
                        main.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
            }
        } catch (Exception e) {
             isConnected = false;
            JOptionPane.showMessageDialog(this, "Không thể kết nối đến máy chủ, "
                    + "vui lòng thử lại sau.!", "Kết nối thất bại", JOptionPane.ERROR_MESSAGE);
        }

    }

}
