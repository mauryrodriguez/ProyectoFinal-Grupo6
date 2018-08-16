package proyecto;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmBatalla extends javax.swing.JFrame {
    
    ClsPokemon pokemon1, pokemon2 ;
    ClsJugador jugador1, jugador2;
    boolean defensa1 = false, defensa2 = false;
    int contDefensa1 = 0, contDefensa2= 0;
    int contJuego =1;
    
    ArrayList<Object> jugadores = new ArrayList<>();
    ClsControlador controller = new ClsControlador();

    public FrmBatalla() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        jPanel4.setBackground(Color.GRAY);
        jPanel5.setBackground(Color.GRAY);
        jPanel7.setBackground(Color.GRAY);
        jPanel6.setBackground(Color.GRAY);
        jPanel2.setBackground(Color.GRAY);
        jPanel3.setBackground(Color.GRAY);
        jPanel1.setBackground(Color.GRAY);
        juego();
        txtAreaLog.setEnabled(false);
        txtAreaLog.setText("-----******Registro del Juego******-----");
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnAtaqueJ1 = new javax.swing.JButton();
        btnAtaqueFinalJ1 = new javax.swing.JButton();
        btnCurarJ1 = new javax.swing.JButton();
        btnDefensaJ1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAtaqueJ2 = new javax.swing.JButton();
        btnAtaqueFinalJ2 = new javax.swing.JButton();
        btnCurarJ2 = new javax.swing.JButton();
        btnDefensaJ2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblJugador1 = new javax.swing.JLabel();
        lblPokemon1 = new javax.swing.JLabel();
        lblImgPoke1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblJugador2 = new javax.swing.JLabel();
        lblPokemon2 = new javax.swing.JLabel();
        lblImgPoke2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblVidaP2 = new javax.swing.JLabel();
        lblVidaJ2 = new javax.swing.JLabel();
        lblEstaminaP2 = new javax.swing.JLabel();
        lblEstaminaJ2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblVidaJ1 = new javax.swing.JLabel();
        lblEstaminaJ1 = new javax.swing.JLabel();
        lblVidap1 = new javax.swing.JLabel();
        lblEstaminaP1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtAreaLog.setColumns(20);
        txtAreaLog.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtAreaLog.setRows(5);
        jScrollPane1.setViewportView(txtAreaLog);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAtaqueJ1.setText("ATAQUE");
        btnAtaqueJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueJ1ActionPerformed(evt);
            }
        });

        btnAtaqueFinalJ1.setText("ATAQUE FINAL");
        btnAtaqueFinalJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinalJ1ActionPerformed(evt);
            }
        });

        btnCurarJ1.setText("CURAR");
        btnCurarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurarJ1ActionPerformed(evt);
            }
        });

        btnDefensaJ1.setText("DEFENSA");
        btnDefensaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaJ1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtaqueJ1)
                    .addComponent(btnCurarJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtaqueFinalJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDefensaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtaqueJ1)
                    .addComponent(btnAtaqueFinalJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurarJ1)
                    .addComponent(btnDefensaJ1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAtaqueJ2.setText("ATAQUE");
        btnAtaqueJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueJ2ActionPerformed(evt);
            }
        });

        btnAtaqueFinalJ2.setText("ATAQUE FINAL");
        btnAtaqueFinalJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueFinalJ2ActionPerformed(evt);
            }
        });

        btnCurarJ2.setText("CURAR");
        btnCurarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurarJ2ActionPerformed(evt);
            }
        });

        btnDefensaJ2.setText("DEFENSA");
        btnDefensaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaJ2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtaqueJ2)
                    .addComponent(btnCurarJ2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtaqueFinalJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDefensaJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtaqueJ2)
                    .addComponent(btnAtaqueFinalJ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurarJ2)
                    .addComponent(btnDefensaJ2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPoke1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImgPoke1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPoke2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImgPoke2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVidaP2.setText(" VIDA:");

        lblEstaminaP2.setText("ESTAMINA:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblEstaminaP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstaminaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblVidaP2)
                        .addGap(34, 34, 34)
                        .addComponent(lblVidaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVidaP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVidaJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstaminaP2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstaminaJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVidap1.setText("VIDA:");

        lblEstaminaP1.setText("ESTAMINA:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstaminaP1)
                    .addComponent(lblVidap1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVidaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(lblEstaminaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVidaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVidap1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEstaminaP1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblEstaminaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ESFOT\\Documents\\NetBeansProjects\\ProyectoFinal\\build\\classes\\imagenes\\batalla.gif")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ESFOT\\Documents\\NetBeansProjects\\ProyectoFinal\\build\\classes\\imagenes\\vs.gif")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaqueJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueJ1ActionPerformed
        contJuego++;
        int ataque =pokemon1.ataque(Integer.parseInt(lblVidaJ2.getText()), pokemon1.getAtaque(), defensa2);
        lblVidaJ2.setText(String.valueOf(ataque));
        
        txtAreaLog.append("\nJugador 1:"+ "Uso Ataque normal");
        
        int estaminaJ1=calcularEstamina(Integer.parseInt(lblEstaminaJ1.getText()), 1);
        lblEstaminaJ1.setText(String.valueOf(estaminaJ1));
                
        restardefensaJ2();
        juego();
        finJuego();
        
    }//GEN-LAST:event_btnAtaqueJ1ActionPerformed

    private void btnAtaqueJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueJ2ActionPerformed
        contJuego++;
        int ataque =pokemon2.ataque(Integer.parseInt(lblVidaJ1.getText()), pokemon2.getAtaque(), defensa1);
        lblVidaJ1.setText(String.valueOf(ataque));
        txtAreaLog.append("\nJugador 2:"+ "Uso Ataque normal");
        
        int estaminaJ2=calcularEstamina(Integer.parseInt(lblEstaminaJ2.getText()), 1);
        lblEstaminaJ2.setText(String.valueOf(estaminaJ2));
        
        restardefensaJ1();
        juego();
        finJuego();
    }//GEN-LAST:event_btnAtaqueJ2ActionPerformed

    private void btnDefensaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaJ1ActionPerformed
       contJuego++;
        defensa1 = true;
        txtAreaLog.append("\nJugador 1:"+ "Activó defensa (dura 3 turnos)");
        //System.out.println("Se activo defensa del jugaor 1 por 3 turnos");
       contDefensa1 = 0;
       
       int estaminaJ1=calcularEstamina(Integer.parseInt(lblEstaminaJ1.getText()), 4);
        lblEstaminaJ1.setText(String.valueOf(estaminaJ1));
       
       restardefensaJ2();
       juego();
    }//GEN-LAST:event_btnDefensaJ1ActionPerformed

    private void btnDefensaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaJ2ActionPerformed
        contJuego++;
        defensa2 = true;
        txtAreaLog.append("\nJugador 2:"+ "Activó defensa (dura 3 turnos)");
        //System.out.println("Se activo defensa del jugaor 2 por 3 turnos");
       contDefensa2 = 0;
       
       int estaminaJ2=calcularEstamina(Integer.parseInt(lblEstaminaJ2.getText()), 4);
       lblEstaminaJ2.setText(String.valueOf(estaminaJ2));
        
       restardefensaJ1();
       juego();
    }//GEN-LAST:event_btnDefensaJ2ActionPerformed

    private void btnAtaqueFinalJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinalJ1ActionPerformed
        contJuego++;
        int ataqueFinal =pokemon1.ataqueFinal(Integer.parseInt(lblVidaJ2.getText()), pokemon1.getAtaquefinal());
        lblVidaJ2.setText(String.valueOf(ataqueFinal));
        
        txtAreaLog.append("\nJugador 1:"+ "Uso Ataque final");
        
        int estaminaJ1=calcularEstamina(Integer.parseInt(lblEstaminaJ1.getText()), 2);
        lblEstaminaJ1.setText(String.valueOf(estaminaJ1));
        
        restardefensaJ2();
        juego();
        finJuego();
    }//GEN-LAST:event_btnAtaqueFinalJ1ActionPerformed

    private void btnAtaqueFinalJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueFinalJ2ActionPerformed
        contJuego++;
        int ataqueFinal =pokemon2.ataqueFinal(Integer.parseInt(lblVidaJ1.getText()), pokemon2.getAtaquefinal());
        lblVidaJ1.setText(String.valueOf(ataqueFinal));
        txtAreaLog.append("\nJugador 2:"+ "Uso Ataque final");
        
        int estaminaJ2=calcularEstamina(Integer.parseInt(lblEstaminaJ2.getText()), 2);
        lblEstaminaJ2.setText(String.valueOf(estaminaJ2));
        
        restardefensaJ1();
        juego();
        finJuego();
    }//GEN-LAST:event_btnAtaqueFinalJ2ActionPerformed

    private void btnCurarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurarJ1ActionPerformed
        contJuego++;
        int cura = pokemon1.curar(Integer.parseInt(lblVidaJ1.getText()));
        lblVidaJ1.setText(String.valueOf(cura));
        
        txtAreaLog.append("\nJugador 1:"+ "Uso Curación");
        
        int estaminaJ1=calcularEstamina(Integer.parseInt(lblEstaminaJ1.getText()), 3);
        lblEstaminaJ1.setText(String.valueOf(estaminaJ1));
        
        restardefensaJ2();
        juego();
    }//GEN-LAST:event_btnCurarJ1ActionPerformed

    private void btnCurarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurarJ2ActionPerformed
        contJuego++;
        int cura = pokemon2.curar(Integer.parseInt(lblVidaJ2.getText()));
        lblVidaJ2.setText(String.valueOf(cura));
        
        txtAreaLog.append("\nJugador 2:"+ "Uso Curación");
        
        int estaminaJ2=calcularEstamina(Integer.parseInt(lblEstaminaJ2.getText()), 2);
        lblEstaminaJ2.setText(String.valueOf(estaminaJ2));
        
        restardefensaJ1();
        juego();
    }//GEN-LAST:event_btnCurarJ2ActionPerformed

    public void restardefensaJ1(){
        if(defensa1 == true && contDefensa1 <3){
            contDefensa1++;
            //System.out.println("contador defensa J1 "+contDefensa1);
        }
        if(contDefensa1 == 3){
            defensa1 = false;
            contDefensa1 = 0;
            txtAreaLog.append("\nAVISO:"+ "Termino Defensa del Jugador 1");
            //System.out.println("defensa J1 TERMINO ");
        }
    }
    
    public void restardefensaJ2(){
        if(defensa2 == true && contDefensa2 <3){
            contDefensa2++;
            //System.out.println("contador defensa J2 "+ contDefensa2);
        }
        if(contDefensa2 == 3){
            defensa2 = false;
            contDefensa2 = 0;
            txtAreaLog.append("\nAVISO:"+ "Termino Defensa del Jugador 2");
            //System.out.println("defensa J2 TERMINO");
        }
        
    }
    
    public void juego(){
        if (contJuego%2 == 0) {
            
            btnAtaqueJ2.setEnabled(true);
            btnAtaqueFinalJ2.setEnabled(true);
            btnCurarJ2.setEnabled(true);
            btnDefensaJ2.setEnabled(true);
            
            btnAtaqueJ1.setEnabled(false);
            btnAtaqueFinalJ1.setEnabled(false);
            btnCurarJ1.setEnabled(false);
            btnDefensaJ1.setEnabled(false);
        }else{
            btnAtaqueJ1.setEnabled(true);
            btnAtaqueFinalJ1.setEnabled(true);
            btnCurarJ1.setEnabled(true);
            btnDefensaJ1.setEnabled(true);
            
            btnAtaqueJ2.setEnabled(false);
            btnAtaqueFinalJ2.setEnabled(false);
            btnCurarJ2.setEnabled(false);
            btnDefensaJ2.setEnabled(false);
        }
        
    }
    
    public int calcularEstamina(int estaminaActual, int accion){
        int estaminaRestante = 0;
        switch (accion) {
            case 1:
                estaminaRestante= estaminaActual-((estaminaActual*5)/100);
                estaminaRestante = estaminaRestante+((estaminaRestante*10)/100);
                
                return estaminaRestante;
                
            case 2:
                estaminaRestante= estaminaActual-((estaminaActual*50)/100);
                estaminaRestante = estaminaRestante+((estaminaRestante*10)/100);
                
                return estaminaRestante;
            
            case 3:
                estaminaRestante= estaminaActual-((estaminaActual*20)/100);
                estaminaRestante = estaminaRestante+((estaminaRestante*10)/100);
                
                return estaminaRestante;
                
            case 4:
                estaminaRestante= estaminaActual-((estaminaActual*25)/100);
                estaminaRestante = estaminaRestante+((estaminaRestante*10)/100);
                
                return estaminaRestante;
                        
            default:
                throw new AssertionError();
        }
        
    }
    
  
    public void finJuego(){
      int j1 = Integer.parseInt(lblVidaJ1.getText());
      int j2 = Integer.parseInt(lblVidaJ2.getText());
      if (j1<=0) {
          //System.out.println(jugador2.getCedula());
          agregarVictoria(jugador2.getCedula());
          lblVidaJ1.setText("0");
          JOptionPane.showMessageDialog(null, "El Ganador es " + lblJugador2.getText(), "GANADOR!!!!",JOptionPane.INFORMATION_MESSAGE);
          FrmEstadisticas est = new FrmEstadisticas();
          est.setTitle("Estadisticas");
          est.setLocationRelativeTo(null);
          est.setVisible(true);
          setVisible(false);
      }
      if (j2<=0) {
          //System.out.println(jugador1.getCedula());
          agregarVictoria(jugador1.getCedula());
          lblVidaJ2.setText("0");
          JOptionPane.showMessageDialog(null, "El Ganador es " + lblJugador1.getText(), "GANADOR!!!!",JOptionPane.INFORMATION_MESSAGE);
          FrmEstadisticas est = new FrmEstadisticas();
          est.setTitle("Estadisticas");
          est.setLocationRelativeTo(null);
          est.setVisible(true);
          setVisible(false);
      }
  }
    
        public void agregarVictoria(int ciGanador){
        jugadores = controller.extraerObjetos("jugadores.dat");
            
        if(jugadores.size() > 0){
            ClsJugador jugador = new ClsJugador();

            for(int i = 0; i < jugadores.size(); i ++){
                jugador = (ClsJugador) jugadores.get(i);
                    int victorias = 0;            
                if(ciGanador == jugador.getCedula()){
                    victorias = jugador.getVictorias() + 1;
                    jugador.setVictorias(victorias);
                    controller.escribirObjeto("jugadores.dat", jugadores);
                    break;
                }
              
            }
        }
    }
        
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("imagenes/poke2.png"));


        return retValue;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaqueFinalJ1;
    private javax.swing.JButton btnAtaqueFinalJ2;
    private javax.swing.JButton btnAtaqueJ1;
    private javax.swing.JButton btnAtaqueJ2;
    private javax.swing.JButton btnCurarJ1;
    private javax.swing.JButton btnCurarJ2;
    private javax.swing.JButton btnDefensaJ1;
    private javax.swing.JButton btnDefensaJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblEstaminaJ1;
    public static javax.swing.JLabel lblEstaminaJ2;
    private javax.swing.JLabel lblEstaminaP1;
    private javax.swing.JLabel lblEstaminaP2;
    public static javax.swing.JLabel lblImgPoke1;
    public static javax.swing.JLabel lblImgPoke2;
    public static javax.swing.JLabel lblJugador1;
    public static javax.swing.JLabel lblJugador2;
    public static javax.swing.JLabel lblPokemon1;
    public static javax.swing.JLabel lblPokemon2;
    public static javax.swing.JLabel lblVidaJ1;
    public static javax.swing.JLabel lblVidaJ2;
    private javax.swing.JLabel lblVidaP2;
    private javax.swing.JLabel lblVidap1;
    private javax.swing.JTextArea txtAreaLog;
    // End of variables declaration//GEN-END:variables
}
