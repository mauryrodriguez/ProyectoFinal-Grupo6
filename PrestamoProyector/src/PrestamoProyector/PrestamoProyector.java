package PrestamoProyector;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author 729-Producciones
 */
public class PrestamoProyector extends javax.swing.JFrame {
    
    ArrayList<Object> listaAdministrativo= new ArrayList<>();
    ArrayList<Object> listaDocente= new ArrayList<>();
    ArrayList<Object> listaDocentePrestamo= new ArrayList<>();
    String proyector[] = {"13","25","34","48","56"};
    String aula[] = {"M-38","M-26","M-14","M-18","Lab-22"};
    Random rnd = new Random();
    int clavePro=0;
    
    
    public PrestamoProyector() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        informacionPersonasLlenarCombo();
        bloquearDesbloquearComponentes(2);
        btn_cerrarSesion.setEnabled(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_cedulaAdministrativo = new javax.swing.JComboBox();
        btn_ingresar = new javax.swing.JButton();
        txt_passAdministrativo = new javax.swing.JPasswordField();
        btn_cerrarSesion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_cedulaDocenteDevolucion = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        lbl_nombreAdministrativo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmb_cedulaDocente = new javax.swing.JComboBox();
        cmb_proyector = new javax.swing.JComboBox();
        cmb_aula = new javax.swing.JComboBox();
        btn_realizarPrestamo = new javax.swing.JButton();
        lbl_clavePro = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nombreDocente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_numPro = new javax.swing.JLabel();
        lbl_numAula = new javax.swing.JLabel();
        btn_devolucion = new javax.swing.JButton();
        txt_passDevolucion = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_historial = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Realizar Prestamo");

        jLabel3.setText("Administrativo:");

        jLabel4.setText("Clave:");

        cmb_cedulaAdministrativo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Cedúla--" }));
        cmb_cedulaAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cedulaAdministrativoActionPerformed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_cerrarSesion.setText("Cerrar Sesión");
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_cedulaAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_passAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmb_cedulaAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_passAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_cerrarSesion))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Devolucion de Proyector");

        jLabel5.setText("Docente:");

        cmb_cedulaDocenteDevolucion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Cedúla--" }));
        cmb_cedulaDocenteDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cedulaDocenteDevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(cmb_cedulaDocenteDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_cedulaDocenteDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nombreAdministrativo.setText("Bienvenido");

        jLabel6.setText("Datos para el prestamo:");

        jLabel8.setText("Docente:");

        jLabel9.setText("Proyector:");

        jLabel10.setText("Aula:");

        cmb_cedulaDocente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Cedúla--" }));

        btn_realizarPrestamo.setText("Realizar Prestamo");
        btn_realizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realizarPrestamoActionPerformed(evt);
            }
        });

        lbl_clavePro.setText("Clave Generada es:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lbl_nombreAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_cedulaDocente, 0, 197, Short.MAX_VALUE)
                            .addComponent(cmb_proyector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_aula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_realizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_clavePro, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombreAdministrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_cedulaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_proyector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmb_aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_realizarPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lbl_clavePro)
                .addGap(20, 20, 20))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Prestamo Para Docente:");

        jLabel12.setText("Tiene un prestamo:");

        jLabel13.setText("Proyector: ");

        jLabel14.setText("Aula:");

        jLabel15.setText("Clave para Devolución:");

        btn_devolucion.setText("Devolver");
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_nombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txt_passDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lbl_numAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_numPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_nombreDocente))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_numPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(lbl_numAula, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txt_passDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_devolucion)
                .addGap(25, 25, 25))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Historial de Prestamos");

        tbl_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente", "Aula", "Proyector", "Administrativo", "Fecha", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_historial);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        
        Administrativo cedula = (Administrativo) cmb_cedulaAdministrativo.getSelectedItem();
        String pass = new String(txt_passAdministrativo.getPassword());
        
        if (cmb_cedulaAdministrativo.getSelectedIndex() == -1 || new String(txt_passAdministrativo.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese o Seleccione Datos");
        }else{
            if (cedula.getPassAdmi().equals(pass)) {
                bloquearDesbloquearComponentes(1);
                lbl_nombreAdministrativo.setText("Bienvenido: " + cedula.getNombre());
                cmb_cedulaAdministrativo.setEnabled(false);
                txt_passAdministrativo.setText(null);
                btn_ingresar.setEnabled(false);
                btn_cerrarSesion.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
            }
        }
        
        
        
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_realizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realizarPrestamoActionPerformed
        
        if (cmb_cedulaDocente.getSelectedIndex() == -1 || cmb_proyector.getSelectedIndex() == -1 || cmb_aula.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione Datos");
        } else {
            
            if (!validarAtributosDocente()) {
                
                Administrativo cedulaA = (Administrativo) cmb_cedulaAdministrativo.getSelectedItem();//casting llenar tabla
                Docente cedulaD = (Docente) cmb_cedulaDocente.getSelectedItem();
                //cmb_cedulaDocenteDevolucion.addItem(cedulaD.getCedula());
                clavePro = rnd.nextInt(8999) + 1001;//genera numero entero de 4 digitos
                lbl_clavePro.setText("Clave Generada es:  " + clavePro);
                System.out.println("Docente: " + cedulaD.getNombre() + " CI: " + cedulaD.getCedula() + " Clave:  " + clavePro);
                //Guarda clave de prestamo proyector
                for (int i = 0; i < listaDocente.size(); i++) {
                    Docente listaDocenteGuardar = (Docente) listaDocente.get(i);
                    if (cedulaD.getCedula().equals(listaDocenteGuardar.getCedula())) {
                        listaDocenteGuardar.setProyector(cmb_proyector.getSelectedItem().toString());
                        listaDocenteGuardar.setAula(cmb_aula.getSelectedItem().toString());
                        listaDocenteGuardar.setClave(clavePro);
                        listaDocentePrestamo.add(listaDocenteGuardar);
                        DefaultComboBoxModel modelP = new DefaultComboBoxModel(listaDocentePrestamo.toArray());
                        cmb_cedulaDocenteDevolucion.setModel(modelP);
                        cmb_cedulaDocenteDevolucion.setEnabled(true);
                        cmb_cedulaDocenteDevolucion.setSelectedIndex(-1);
                        break;
                    }
                }

                //Fecha y Hora
                Date date = new Date();
                DateFormat fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                System.out.println("Fecha: " + fechaHora.format(date));
                //Llenar tabla
                String usuarioG[] = {cedulaD.getNombre() + " " + cedulaD.getApellido(), cmb_aula.getSelectedItem().toString(),
                    cmb_proyector.getSelectedItem().toString(), cedulaA.getNombre() + " " + cedulaA.getApellido(), fechaHora.format(date), "Préstamo"};
                DefaultTableModel modeloU = (DefaultTableModel) tbl_historial.getModel();
                modeloU.addRow(usuarioG);
                JOptionPane.showMessageDialog(null, "Préstamo Exitoso");
                limpiarCombo();
            }
            
        }
        
        
    }//GEN-LAST:event_btn_realizarPrestamoActionPerformed

    public boolean validarAtributosDocente (){//valida docente y proyector que no se repita
        Docente cedulaD = (Docente) cmb_cedulaDocente.getSelectedItem();
        
        for (int i = 0; i < listaDocentePrestamo.size(); i++) {
            Docente validarDocente = (Docente) listaDocentePrestamo.get(i);
            if (cedulaD.getCedula().equals(validarDocente.getCedula())) {//Valida si docente ya tiene proyector
                JOptionPane.showMessageDialog(null, "El Docente Ya Cuenta Con Un Proyector", "Error", JOptionPane.WARNING_MESSAGE);
                return true;
            }else if (cmb_proyector.getSelectedItem().toString().equals(validarDocente.getProyector())) {//Valida proyector se encuentra prestado
                JOptionPane.showMessageDialog(null, "Proyector No Disponible", "Error", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        }
        
        return false;
    }
    
    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        //String claveValidar = new String(txt_passDevolucion.getPassword());
        //System.out.println("Item 0: "+cmb_cedulaDocenteDevolucion.getSelectedItem());
        if (cmb_cedulaDocenteDevolucion.getSelectedIndex() == -1 || new String(txt_passDevolucion.getPassword()).equals("")) { 
            JOptionPane.showMessageDialog(null, "Seleccione o Ingrese Datos", "Error", JOptionPane.WARNING_MESSAGE);
            
        }else{
            int claveD = Integer.valueOf(new String(txt_passDevolucion.getPassword()));
            Docente devolucion = (Docente) cmb_cedulaDocenteDevolucion.getSelectedItem();
            Administrativo cedulaA = (Administrativo) cmb_cedulaAdministrativo.getSelectedItem();

            //Fecha y Hora
            Date date = new Date();
            DateFormat fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Fecha: " + fechaHora.format(date));

            if (claveD == devolucion.getClave()) {
                cmb_cedulaDocenteDevolucion.removeItem(devolucion);
                //Llenar tabla
                String usuarioG[] = {devolucion.getNombre() + " " + devolucion.getApellido(), devolucion.getAula(),
                    devolucion.getProyector(), cedulaA.getNombre() + " " + cedulaA.getApellido(), fechaHora.format(date), "Devolución"};
                DefaultTableModel modeloU = (DefaultTableModel) tbl_historial.getModel();
                modeloU.addRow(usuarioG);
                cmb_cedulaDocenteDevolucion.setSelectedIndex(-1);
                listaDocentePrestamo.remove(devolucion);
                JOptionPane.showMessageDialog(null, "Devolucion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Clave Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        
    }//GEN-LAST:event_btn_devolucionActionPerformed

    private void cmb_cedulaDocenteDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cedulaDocenteDevolucionActionPerformed
        
        if (cmb_cedulaDocenteDevolucion.getSelectedIndex() != -1) {
            Docente cedulaD = (Docente) cmb_cedulaDocenteDevolucion.getSelectedItem();
            lbl_nombreDocente.setText(cedulaD.getNombre() + " " + cedulaD.getApellido());
            lbl_numPro.setText(cedulaD.getProyector());
            lbl_numAula.setText(cedulaD.getAula());
        }else{
            lbl_nombreDocente.setText(null);
            lbl_numPro.setText(null);
            lbl_numAula.setText(null);
            txt_passDevolucion.setText(null);
        }
        
        
    }//GEN-LAST:event_cmb_cedulaDocenteDevolucionActionPerformed

    private void cmb_cedulaAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cedulaAdministrativoActionPerformed
        
    }//GEN-LAST:event_cmb_cedulaAdministrativoActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        bloquearDesbloquearComponentes(2);
        limpiarCombo();
        lbl_clavePro.setText("Clave Generada es:  ");
        lbl_nombreAdministrativo.setText("Bienvenido: ");
        cmb_cedulaAdministrativo.setEnabled(true);
        cmb_cedulaAdministrativo.setSelectedIndex(-1);
        btn_ingresar.setEnabled(true);
        btn_cerrarSesion.setEnabled(true);

    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    public void bloquearDesbloquearComponentes(int a){
        if (a==1) {
            cmb_cedulaDocente.setEnabled(true);
            cmb_proyector.setEnabled(true);
            cmb_aula.setEnabled(true);
            btn_realizarPrestamo.setEnabled(true);
            cmb_cedulaDocenteDevolucion.setEnabled(true);
            
        }else if(a==2){
            cmb_cedulaDocente.setEnabled(false);
            cmb_proyector.setEnabled(false);
            cmb_aula.setEnabled(false);
            btn_realizarPrestamo.setEnabled(false);
            cmb_cedulaDocenteDevolucion.setEnabled(false);
        }
    }
    
    public void limpiarCombo(){
        cmb_cedulaDocente.setSelectedIndex(-1);
        cmb_proyector.setSelectedIndex(-1);
        cmb_aula.setSelectedIndex(-1);
        cmb_cedulaDocenteDevolucion.setSelectedIndex(-1);
    }
    
    
    public void informacionPersonasLlenarCombo() {
        //Administrativo
        Object a[] = {new Administrativo("Pedro", "Arias", "1234567890", "12345"), new Administrativo("Juan", "Benitez", "1234567891", "12345"),
            new Administrativo("Elizabeth", "Delgado", "1234567892", "12345"), new Administrativo("Stefy", "Rosero", "1234567893", "12345")};
        for (int i = 0; i < a.length; i++) {
            listaAdministrativo.add(a[i]);
        }
        if (listaAdministrativo.size() > 0) {
            DefaultComboBoxModel modelA = new DefaultComboBoxModel(listaAdministrativo.toArray());
            cmb_cedulaAdministrativo.setModel(modelA);
            cmb_cedulaAdministrativo.setSelectedIndex(-1);
        }
        //Docente
        Object d[] = {new Docente("Edwin", "Salvador", "1234567895", "", "", 0), new Docente("Susana", "Mier", "1234567896", "", "", 0),
            new Docente("Juan", "Zaldumbide", "1234567897", "", "", 0), new Docente("Ricardo", "Jacome", "1234567898", "", "", 0)};
        for (int i = 0; i < d.length; i++) {
            listaDocente.add(d[i]);
        }
        if (listaDocente.size() > 0) {
            DefaultComboBoxModel modelD = new DefaultComboBoxModel(listaDocente.toArray());
            cmb_cedulaDocente.setModel(modelD);
            cmb_cedulaDocente.setSelectedIndex(-1);

        }
        //Proyector
        for (int i = 0; i < proyector.length; i++) {
            cmb_proyector.addItem(proyector[i]);
        }
        cmb_proyector.setSelectedIndex(-1);
        //Aula
        for (int i = 0; i < aula.length; i++) {
            cmb_aula.addItem(aula[i]);
        }
        cmb_aula.setSelectedIndex(-1);

        if (listaDocentePrestamo.size() > 0) {
            DefaultComboBoxModel modelP = new DefaultComboBoxModel(listaDocentePrestamo.toArray());
            cmb_cedulaDocenteDevolucion.setModel(modelP);
        }
        cmb_cedulaDocenteDevolucion.setSelectedIndex(-1);
        cmb_cedulaDocenteDevolucion.setEnabled(false);

    }
    
    
    
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
            java.util.logging.Logger.getLogger(PrestamoProyector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoProyector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoProyector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoProyector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoProyector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_realizarPrestamo;
    private javax.swing.JComboBox cmb_aula;
    private javax.swing.JComboBox cmb_cedulaAdministrativo;
    private javax.swing.JComboBox cmb_cedulaDocente;
    private javax.swing.JComboBox cmb_cedulaDocenteDevolucion;
    private javax.swing.JComboBox cmb_proyector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_clavePro;
    private javax.swing.JLabel lbl_nombreAdministrativo;
    private javax.swing.JLabel lbl_nombreDocente;
    private javax.swing.JLabel lbl_numAula;
    private javax.swing.JLabel lbl_numPro;
    private javax.swing.JTable tbl_historial;
    private javax.swing.JPasswordField txt_passAdministrativo;
    private javax.swing.JPasswordField txt_passDevolucion;
    // End of variables declaration//GEN-END:variables
}
