package proyecto;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrmRegistroJugador extends javax.swing.JFrame {
    
    ArrayList<Object> jugadores = new ArrayList<>();
    int cont = 0;
    ClsControlador controller = new ClsControlador();

    public FrmRegistroJugador() {
        
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        jPanel2.setBackground(Color.GRAY);
        jPanel1.setBackground(Color.GRAY);
        jugadores = controller.extraerObjetos("jugadores.dat");
               
        llenarCombo();
        llenarGrid();
        if(jugadores.size() > 0){
            ClsJugador ultimo = (ClsJugador) jugadores.get(jugadores.size()-1);
            cont = ultimo.getId();
        }
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbJugadores = new javax.swing.JTable();
        btnSeleccionPersonajes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbJugadores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "Nick"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbJugadores);

        btnSeleccionPersonajes.setText("Ir a Seleccionar Personajes");
        btnSeleccionPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionPersonajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnSeleccionPersonajes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionPersonajes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Nick:");

        jLabel3.setText("Cédula:");

        jLabel2.setText("Apellido:");

        jLabel1.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula)
                                    .addComponent(txtNick))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ESFOT\\Documents\\NetBeansProjects\\ProyectoFinal\\build\\classes\\imagenes\\registro jugador.jpg")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ClsJugador jug = new ClsJugador();
        boolean validarCi = false;
        boolean validarNick = false;
            
        if((txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || (txtCedula.getText().equals("")) || (txtNick.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            for(int i = 0; i < jugadores.size(); i ++){
            jug = (ClsJugador) jugadores.get(i);
            //System.out.println(jug.getCedula());
            if(jug.getCedula() == Integer.parseInt(txtCedula.getText())){
                validarCi = true;
                break;
            }
            if(jug.getUsuario().equals(txtNick.getText())){
                validarNick = true;
                break;
            }
            
        }
            if(validarCi == true){
                JOptionPane.showMessageDialog(null, "CI "+txtCedula.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else if(validarNick == true){
                JOptionPane.showMessageDialog(null, "Nick "+txtNick.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else{
                //System.out.println("registra");
                cont++;
                ClsJugador jugador = new ClsJugador(cont, txtNombre.getText(), txtApellido.getText(),Integer.parseInt(txtCedula.getText()), txtNick.getText(),0);
                jugadores.add(jugador);
                controller.escribirObjeto("jugadores.dat", jugadores);
                jugadores = controller.extraerObjetos("jugadores.dat");
                limpiar();
                llenarCombo();
                Object jugadorG [] = {jugador.getNombre(), jugador.getApellido(),jugador.getCedula(),jugador.getUsuario()};
                DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
                model.addRow(jugadorG);
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionPersonajesActionPerformed
        FrmPrincipal principal = new FrmPrincipal();
        principal.setTitle("Principal");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSeleccionPersonajesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugadores.remove(jugadorSeleccionado);
        controller.escribirObjeto("jugadores.dat", jugadores);
        llenarCombo();
        limpiar();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugadoresActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        txtNombre.setText(jugadorSeleccionado.getNombre());
        txtApellido.setText(jugadorSeleccionado.getApellido());
        txtCedula.setText(String.valueOf(jugadorSeleccionado.getCedula()));
        txtNick.setText(jugadorSeleccionado.getUsuario());
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_cmbJugadoresActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ClsJugador jugadorSeleccionado = (ClsJugador)cmbJugadores.getSelectedItem();
        ClsJugador jug = new ClsJugador();
        boolean validarCi = false;
        boolean validarNick = false;
                
        if((txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || (txtCedula.getText().equals("")) || (txtNick.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            for(int i = 0; i < jugadores.size(); i ++){
            jug = (ClsJugador) jugadores.get(i);
            //System.out.println(jug.getId());
            if(jug.getId() != jugadorSeleccionado.getId() ){
                if(jug.getCedula() == Integer.parseInt(txtCedula.getText())){
                    validarCi = true;
                    break;
                }
                if(jug.getUsuario().equals(txtNick.getText())){
                    validarNick = true;
                    break;
                }
            } 
        }
            if(validarCi == true){
                JOptionPane.showMessageDialog(null, "CI "+txtCedula.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else if(validarNick == true){
                JOptionPane.showMessageDialog(null, "Nick "+txtNick.getText()+ " ya existe", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else{
                jugadorSeleccionado.setNombre(txtNombre.getText());
                jugadorSeleccionado.setApellido(txtApellido.getText());
                jugadorSeleccionado.setCedula(Integer.parseInt(txtCedula.getText()));
                jugadorSeleccionado.setUsuario(txtNick.getText());
                //System.out.println(jugadorSeleccionado.getId());

                Object jugadorG [] = {jugadorSeleccionado.getNombre(), jugadorSeleccionado.getApellido(),jugadorSeleccionado.getCedula(),jugadorSeleccionado.getUsuario()};
                DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
                model.removeRow(cmbJugadores.getSelectedIndex());
                jugadores.remove(cmbJugadores.getSelectedIndex());
                model.insertRow(cmbJugadores.getSelectedIndex(), jugadorG);
                jugadores.add(cmbJugadores.getSelectedIndex(), jugadorSeleccionado);
                controller.escribirObjeto("jugadores.dat", jugadores);
                llenarCombo();
                limpiar();
                btnEditar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public void limpiar(){
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtNick.setText(null);
        btnGuardar.setEnabled(true);
    }
    
    public void llenarCombo(){
        if(jugadores.size() > 0){
            cmbJugadores.setEnabled(true);
            jugadores = controller.extraerObjetos("jugadores.dat");
            cmbJugadores.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cmbJugadores.setEnabled(false);
        }
    }
    
    public void llenarGrid(){
        if(jugadores.size() > 0){
            ClsJugador jugador = new ClsJugador();
            DefaultTableModel model = (DefaultTableModel) tbJugadores.getModel();
            for(int i = 0; i < jugadores.size(); i ++){
                jugador = (ClsJugador) jugadores.get(i);
                Object jugadorG [] = {jugador.getNombre(), jugador.getApellido(), jugador.getCedula(),jugador.getUsuario()};
                model.insertRow(i, jugadorG);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionPersonajes;
    private javax.swing.JComboBox<String> cmbJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbJugadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
