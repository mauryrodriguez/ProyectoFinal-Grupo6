package proyecto;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    //ARRAY JUGADORES
    ArrayList<Object> jugadores = new ArrayList<>();
    ClsControlador controller = new ClsControlador();
    
    //ARRAY POKEMON
    ArrayList<ClsPokemon> pokemones = new ArrayList<>();
    FrmBatalla batalla = new FrmBatalla();

     

    public FrmPrincipal() {
        initComponents();
        
        this.getContentPane().setBackground(Color.BLACK);
        jPanel4.setBackground(Color.DARK_GRAY);
        jPanel2.setBackground(Color.GRAY);
        jPanel1.setBackground(Color.GRAY);
        jPanel3.setBackground(Color.GRAY);
        jPanel5.setBackground(Color.GRAY);
        jPanel6.setBackground(Color.GRAY);
        //LLENA ARRAY DE JUGADORES CON EL ARCHIVO
        jugadores = controller.extraerObjetos("jugadores.dat");
        llenarCombo1();
        
        //CREACION DE POKEMON DE ACUERDO A SU TIPO
        PokemonFuego nuevo = new PokemonFuego ("/imagenes/poke2.png", "Nuevo");
        PokemonFuego entei = new PokemonFuego("/imagenes/Entei.png", "Entei");
        PokemonAgua feraligatr = new PokemonAgua("/imagenes/Feraligatr.png", "Feraligatr");
        PokemonAire unfezant = new PokemonAire("/imagenes/Unfezant.png", "Unfezant");
        PokemonTierra trapinch = new PokemonTierra("/imagenes/Trapinch.png", "Trapinch");
         
        //LLENA ARRAY DE POKEMON
        pokemones.add(nuevo);
        pokemones.add(entei);
        pokemones.add(feraligatr);
        pokemones.add(unfezant);
        pokemones.add(trapinch);
        cmbPokemon.setModel(new javax.swing.DefaultComboBoxModel(pokemones.toArray()));
        llenarPokemon();
        
        btnJugador2.setEnabled(false);
        btnJugador1.setEnabled(false);
        btnEmpezar.setEnabled(false);
        cmbJugador2.setEnabled(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbJugador1 = new javax.swing.JComboBox<>();
        lblPokeJ1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbJugador2 = new javax.swing.JComboBox<>();
        lblPokeJ2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbPokemon = new javax.swing.JComboBox<>();
        lblImgPokemon = new javax.swing.JLabel();
        btnRegistrarJ = new javax.swing.JButton();
        btnEmpezar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnJugador1 = new javax.swing.JButton();
        btnJugador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(lblPokeJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblPokeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPokeJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPokeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPokemonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cmbPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImgPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegistrarJ.setText("Registrar Jugador");
        btnRegistrarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJActionPerformed(evt);
            }
        });

        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        btnJugador1.setText("Jugador 1");
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });

        btnJugador2.setText("Jugador 2");
        btnJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrarJ, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(btnJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(133, 133, 133)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJugador2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnJugador1)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnEmpezar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarJ)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJActionPerformed
        FrmRegistroJugador registro = new FrmRegistroJugador();
        registro.setTitle("Registrar Jugador");
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnRegistrarJActionPerformed

    private void cmbJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugador1ActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugador1.getSelectedItem();
        if(jugadores.size() > 1){
            cmbJugador2.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
            cmbJugador2.removeItem(jugadorSeleccionado);
            cmbJugador2.setEnabled(true);
            btnJugador1.setEnabled(true);
        }else{
            cmbJugador2.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se Necesita Registrar otro jugador", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_cmbJugador1ActionPerformed

    private void cmbPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPokemonActionPerformed
        llenarPokemon();
    }//GEN-LAST:event_cmbPokemonActionPerformed

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        ClsPokemon pokeselecionado = (ClsPokemon) cmbPokemon.getSelectedItem();
        
        batalla.pokemon1 = pokeselecionado;
        
        ImageIcon icon = new ImageIcon(getClass().getResource(pokeselecionado.getImg()));
        Image conversion = icon.getImage();
        Image tamano = conversion.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon iconFin = new ImageIcon(tamano);
        lblPokeJ1.setIcon(iconFin);
        
        batalla.lblPokemon1.setText(pokeselecionado.getNombre());
        batalla.lblImgPoke1.setIcon(iconFin);
        batalla.lblVidaJ1.setText(String.valueOf(pokeselecionado.getVida()));
        batalla.lblEstaminaJ1.setText(String.valueOf(pokeselecionado.getEstamina()));
        btnJugador2.setEnabled(true);
        cmbJugador2.setEnabled(true);
    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btnJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador2ActionPerformed
        ClsPokemon pokeselecionado = (ClsPokemon) cmbPokemon.getSelectedItem();
        
        batalla.pokemon2 = pokeselecionado;

        ImageIcon icon = new ImageIcon(getClass().getResource(pokeselecionado.getImg()));
        Image conversion = icon.getImage();
        Image tamano = conversion.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        ImageIcon iconFin = new ImageIcon(tamano);
        lblPokeJ2.setIcon(iconFin);
        btnEmpezar.setEnabled(true);
        
        batalla.lblPokemon2.setText(pokeselecionado.getNombre());
        batalla.lblImgPoke2.setIcon(iconFin);
        batalla.lblVidaJ2.setText(String.valueOf(pokeselecionado.getVida()));
        batalla.lblEstaminaJ2.setText(String.valueOf(pokeselecionado.getEstamina()));
        
    }//GEN-LAST:event_btnJugador2ActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        batalla.setTitle("Batalla Pokemon");
        batalla.setLocationRelativeTo(null);
        batalla.setVisible(true);
        setVisible(false);
        
        ClsJugador jugador1 = (ClsJugador)cmbJugador1.getSelectedItem();
        ClsJugador jugador2 = (ClsJugador)cmbJugador2.getSelectedItem();
        
        batalla.jugador1 = jugador1;
        batalla.jugador2 = jugador2;
        
        batalla.lblJugador1.setText(jugador1.getNombre()+" "+ jugador1.getApellido());
        batalla.lblJugador2.setText(jugador2.getNombre()+" "+ jugador2.getApellido());
                
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void cmbJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugador2ActionPerformed
       
    }//GEN-LAST:event_cmbJugador2ActionPerformed

    public void llenarCombo1(){
        if(jugadores.size() > 0){
            cmbJugador1.setEnabled(true);
            jugadores = controller.extraerObjetos("jugadores.dat");
            cmbJugador1.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cmbJugador1.setEnabled(false);
        }
    }
    
    
    public void llenarPokemon(){
        ClsPokemon pokeselecionado = (ClsPokemon) cmbPokemon.getSelectedItem();

        ImageIcon icon = new ImageIcon(getClass().getResource(pokeselecionado.getImg()));
        Image conversion = icon.getImage();
        Image tamano = conversion.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconFin = new ImageIcon(tamano);
        lblImgPokemon.setIcon(iconFin);

    }
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrincipal principal = new FrmPrincipal();
                principal.setTitle("Principal");
                principal.setLocationRelativeTo(null);
                principal.setVisible(true);
            }
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("imagenes/poke2.png"));


        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JButton btnRegistrarJ;
    private javax.swing.JComboBox<String> cmbJugador1;
    private javax.swing.JComboBox<String> cmbJugador2;
    private javax.swing.JComboBox<String> cmbPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblImgPokemon;
    private javax.swing.JLabel lblPokeJ1;
    private javax.swing.JLabel lblPokeJ2;
    // End of variables declaration//GEN-END:variables
}
