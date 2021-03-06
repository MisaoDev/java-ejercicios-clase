package sapo.saposlagartos.gui;

import sapo.saposlagartos.DaoPlayer;
import sapo.saposlagartos.game.Player;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class ControlPanel extends javax.swing.JFrame {

  /**
   * Creates new form ControlPanel
   */
  public ControlPanel() {
    initComponents();
  }
  
  
  public void init(String playerName) {
    DaoPlayer dao = new DaoPlayer();
    Player player = dao.getPlayer(playerName);
    
    labCoins.setText(Long.toString(player.getZeni()));
    labCash.setText(Integer.toString(player.getCash()));
    
  }
  
  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
   * content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jpTabs = new javax.swing.JTabbedPane();
    jpHome = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    labID = new javax.swing.JLabel();
    labCharacters = new javax.swing.JLabel();
    labCoins = new javax.swing.JLabel();
    labCash = new javax.swing.JLabel();
    jpCharacters = new javax.swing.JPanel();
    jpFriends = new javax.swing.JPanel();
    jpMoney = new javax.swing.JPanel();
    jpSettings = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Sapos y Lagartos - Panel de control");
    setMinimumSize(new java.awt.Dimension(700, 500));
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/avi/01.png"))); // NOI18N

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Don Sapo");

    jLabel3.setText("ID de cuenta:");

    jLabel4.setText("Personajes creados:");

    jLabel5.setText("Zeni:");

    jLabel6.setText("Cash:");

    labID.setText("jLabel7");
    labID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    labCharacters.setText("jLabel8");
    labCharacters.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    labCoins.setText("jLabel9");
    labCoins.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    labCash.setText("jLabel10");
    labCash.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel4)
              .addComponent(jLabel5)
              .addComponent(jLabel6))
            .addGap(56, 56, 56)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(labCash, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
              .addComponent(labCoins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(labCharacters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(31, 31, 31)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(labID))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(labCharacters))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(labCoins))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(labCash))))
        .addContainerGap(204, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jpHomeLayout = new javax.swing.GroupLayout(jpHome);
    jpHome.setLayout(jpHomeLayout);
    jpHomeLayout.setHorizontalGroup(
      jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpHomeLayout.createSequentialGroup()
        .addContainerGap(114, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(114, Short.MAX_VALUE))
    );
    jpHomeLayout.setVerticalGroup(
      jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpHomeLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    jpTabs.addTab("", new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/home-regular-36.png")), jpHome); // NOI18N

    javax.swing.GroupLayout jpCharactersLayout = new javax.swing.GroupLayout(jpCharacters);
    jpCharacters.setLayout(jpCharactersLayout);
    jpCharactersLayout.setHorizontalGroup(
      jpCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 838, Short.MAX_VALUE)
    );
    jpCharactersLayout.setVerticalGroup(
      jpCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 447, Short.MAX_VALUE)
    );

    jpTabs.addTab("", new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/user-account-solid-36.png")), jpCharacters); // NOI18N

    javax.swing.GroupLayout jpFriendsLayout = new javax.swing.GroupLayout(jpFriends);
    jpFriends.setLayout(jpFriendsLayout);
    jpFriendsLayout.setHorizontalGroup(
      jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 838, Short.MAX_VALUE)
    );
    jpFriendsLayout.setVerticalGroup(
      jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 447, Short.MAX_VALUE)
    );

    jpTabs.addTab("", new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/heart-circle-solid-36.png")), jpFriends); // NOI18N

    javax.swing.GroupLayout jpMoneyLayout = new javax.swing.GroupLayout(jpMoney);
    jpMoney.setLayout(jpMoneyLayout);
    jpMoneyLayout.setHorizontalGroup(
      jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 838, Short.MAX_VALUE)
    );
    jpMoneyLayout.setVerticalGroup(
      jpMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 447, Short.MAX_VALUE)
    );

    jpTabs.addTab("", new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/dollar-circle-solid-36.png")), jpMoney); // NOI18N

    javax.swing.GroupLayout jpSettingsLayout = new javax.swing.GroupLayout(jpSettings);
    jpSettings.setLayout(jpSettingsLayout);
    jpSettingsLayout.setHorizontalGroup(
      jpSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 838, Short.MAX_VALUE)
    );
    jpSettingsLayout.setVerticalGroup(
      jpSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 447, Short.MAX_VALUE)
    );

    jpTabs.addTab("", new javax.swing.ImageIcon(getClass().getResource("/sapo/saposlagartos/assets/cog-solid-36.png")), jpSettings); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpTabs)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpTabs)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

  }//GEN-LAST:event_formWindowOpened

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
      java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ControlPanel().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jpCharacters;
  private javax.swing.JPanel jpFriends;
  private javax.swing.JPanel jpHome;
  private javax.swing.JPanel jpMoney;
  private javax.swing.JPanel jpSettings;
  private javax.swing.JTabbedPane jpTabs;
  private javax.swing.JLabel labCash;
  private javax.swing.JLabel labCharacters;
  private javax.swing.JLabel labCoins;
  private javax.swing.JLabel labID;
  // End of variables declaration//GEN-END:variables
}
