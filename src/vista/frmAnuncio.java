package vista;

public class frmAnuncio extends javax.swing.JFrame {

    public frmAnuncio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAnuncio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateFechaLimite = new com.toedter.calendar.JDateChooser();
        pnlRequisitos = new javax.swing.JPanel();
        rbtnPrimaria = new javax.swing.JRadioButton();
        rbtnSecundaria = new javax.swing.JRadioButton();
        rbtnTecnico = new javax.swing.JRadioButton();
        rbtnBachiller = new javax.swing.JRadioButton();
        rbtnTituloUniversitario = new javax.swing.JRadioButton();
        rbtnMaestria = new javax.swing.JRadioButton();
        rbtnDoctorado = new javax.swing.JRadioButton();
        pnlRequisitosEspecificos = new javax.swing.JPanel();
        chbxInglesBasico = new javax.swing.JCheckBox();
        chbxInglesIntermedio = new javax.swing.JCheckBox();
        chbxInglesAvanzado = new javax.swing.JCheckBox();
        chbxOfimaticaBasica = new javax.swing.JCheckBox();
        chbxOfimaticaIntermedia = new javax.swing.JCheckBox();
        chbxOfimaticaAvanzada = new javax.swing.JCheckBox();
        pnlOtrosRequisitos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtHabilidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHabilidad = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(446, 483));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Anuncio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 428;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(txtAnuncio, gridBagConstraints);

        jLabel2.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 372;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel3.setText("Cargo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 428;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(txtCargo, gridBagConstraints);

        jLabel4.setText("Fecha Límite");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel1.add(dateFechaLimite, gridBagConstraints);

        pnlRequisitos.setBorder(javax.swing.BorderFactory.createTitledBorder("Requisitos"));
        pnlRequisitos.setToolTipText("");

        Grupo1.add(rbtnPrimaria);
        rbtnPrimaria.setText("Primaria");

        Grupo1.add(rbtnSecundaria);
        rbtnSecundaria.setText("Secundaria");

        Grupo1.add(rbtnTecnico);
        rbtnTecnico.setText("Técnico");

        Grupo1.add(rbtnBachiller);
        rbtnBachiller.setText("Bachiller");

        Grupo1.add(rbtnTituloUniversitario);
        rbtnTituloUniversitario.setText("Título universitario");

        Grupo1.add(rbtnMaestria);
        rbtnMaestria.setText("Maestría");

        Grupo1.add(rbtnDoctorado);
        rbtnDoctorado.setText("Doctorado");

        javax.swing.GroupLayout pnlRequisitosLayout = new javax.swing.GroupLayout(pnlRequisitos);
        pnlRequisitos.setLayout(pnlRequisitosLayout);
        pnlRequisitosLayout.setHorizontalGroup(
            pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSecundaria)
                    .addComponent(rbtnPrimaria))
                .addGap(18, 18, 18)
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTecnico)
                    .addComponent(rbtnBachiller))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRequisitosLayout.createSequentialGroup()
                        .addComponent(rbtnTituloUniversitario)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnDoctorado))
                    .addComponent(rbtnMaestria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRequisitosLayout.setVerticalGroup(
            pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPrimaria)
                    .addComponent(rbtnTecnico)
                    .addComponent(rbtnTituloUniversitario)
                    .addComponent(rbtnDoctorado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMaestria)
                    .addComponent(rbtnSecundaria)
                    .addComponent(rbtnBachiller))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(pnlRequisitos, gridBagConstraints);

        pnlRequisitosEspecificos.setBorder(javax.swing.BorderFactory.createTitledBorder("Requisitos específicos"));
        pnlRequisitosEspecificos.setToolTipText("");

        chbxInglesBasico.setText("Inglés básico");

        chbxInglesIntermedio.setText("Inglés intermedio");

        chbxInglesAvanzado.setText("Inglés avanzado");

        chbxOfimaticaBasica.setText("Ofimática básica");

        chbxOfimaticaIntermedia.setText("Ofimática intermedia");

        chbxOfimaticaAvanzada.setText("Ofimática avanzada");

        javax.swing.GroupLayout pnlRequisitosEspecificosLayout = new javax.swing.GroupLayout(pnlRequisitosEspecificos);
        pnlRequisitosEspecificos.setLayout(pnlRequisitosEspecificosLayout);
        pnlRequisitosEspecificosLayout.setHorizontalGroup(
            pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosEspecificosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxOfimaticaBasica)
                    .addComponent(chbxInglesBasico))
                .addGap(18, 18, 18)
                .addGroup(pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxInglesIntermedio)
                    .addComponent(chbxOfimaticaIntermedia))
                .addGap(18, 18, 18)
                .addGroup(pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxInglesAvanzado)
                    .addComponent(chbxOfimaticaAvanzada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRequisitosEspecificosLayout.setVerticalGroup(
            pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosEspecificosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxInglesBasico)
                    .addComponent(chbxInglesIntermedio)
                    .addComponent(chbxInglesAvanzado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRequisitosEspecificosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbxOfimaticaBasica)
                    .addComponent(chbxOfimaticaIntermedia)
                    .addComponent(chbxOfimaticaAvanzada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jPanel1.add(pnlRequisitosEspecificos, gridBagConstraints);

        pnlOtrosRequisitos.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros requisitos"));

        jLabel5.setText("Habilidad");

        tablaHabilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHabilidad);
        if (tablaHabilidad.getColumnModel().getColumnCount() > 0) {
            tablaHabilidad.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnAgregar.setText("Agregar");

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout pnlOtrosRequisitosLayout = new javax.swing.GroupLayout(pnlOtrosRequisitos);
        pnlOtrosRequisitos.setLayout(pnlOtrosRequisitosLayout);
        pnlOtrosRequisitosLayout.setHorizontalGroup(
            pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOtrosRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlOtrosRequisitosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(txtHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOtrosRequisitosLayout.setVerticalGroup(
            pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOtrosRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlOtrosRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlOtrosRequisitosLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(276, 276, 276))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = -267;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel1.add(pnlOtrosRequisitos, gridBagConstraints);

        btnGuardar.setText("Guardar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel1.add(btnGuardar, gridBagConstraints);

        btnModificar.setText("Modificar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel1.add(btnModificar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnuncio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JCheckBox chbxInglesAvanzado;
    public javax.swing.JCheckBox chbxInglesBasico;
    public javax.swing.JCheckBox chbxInglesIntermedio;
    public javax.swing.JCheckBox chbxOfimaticaAvanzada;
    public javax.swing.JCheckBox chbxOfimaticaBasica;
    public javax.swing.JCheckBox chbxOfimaticaIntermedia;
    public com.toedter.calendar.JDateChooser dateFechaLimite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlOtrosRequisitos;
    private javax.swing.JPanel pnlRequisitos;
    private javax.swing.JPanel pnlRequisitosEspecificos;
    public javax.swing.JRadioButton rbtnBachiller;
    public javax.swing.JRadioButton rbtnDoctorado;
    public javax.swing.JRadioButton rbtnMaestria;
    public javax.swing.JRadioButton rbtnPrimaria;
    public javax.swing.JRadioButton rbtnSecundaria;
    public javax.swing.JRadioButton rbtnTecnico;
    public javax.swing.JRadioButton rbtnTituloUniversitario;
    public javax.swing.JTable tablaHabilidad;
    public javax.swing.JTextField txtAnuncio;
    public javax.swing.JTextField txtCargo;
    private javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtHabilidad;
    // End of variables declaration//GEN-END:variables
}
