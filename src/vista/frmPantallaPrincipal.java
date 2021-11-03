
package vista;

import accesoDatos.clsAnuncioAD;
import clases.clsAnuncio;
import clases.clsUsuario;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmPantallaPrincipal extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    private clsUsuario usuario;

    /**
     * Creates new form frmPantallaPrincipal
     */
    public frmPantallaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        itemVerMas = new javax.swing.JMenuItem();
        itemVerPostulantes = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnCrearAnuncio = new javax.swing.JButton();
        btnPostular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMiInformacion = new javax.swing.JMenuItem();
        intemCerrarSesion = new javax.swing.JMenuItem();

        itemVerMas.setText("Ver mas");
        itemVerMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerMasActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemVerMas);

        itemVerPostulantes.setText("Ver postulantes");
        itemVerPostulantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerPostulantesActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemVerPostulantes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emplea EPICI");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Anuncios"));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Cargo", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            tablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnCrearAnuncio.setText("Crear anuncio");
        btnCrearAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAnuncioActionPerformed(evt);
            }
        });

        btnPostular.setText("Postular");
        btnPostular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearAnuncio)
                .addGap(18, 18, 18)
                .addComponent(btnPostular)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCrearAnuncio)
                    .addComponent(btnPostular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Sesion");

        itemMiInformacion.setText("Mi información");
        itemMiInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMiInformacionActionPerformed(evt);
            }
        });
        jMenu1.add(itemMiInformacion);

        intemCerrarSesion.setText("Cerrar sesión");
        intemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(intemCerrarSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void intemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intemCerrarSesionActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir de la sesión?", "Cerrar sesión",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            frmIniciarSesion ventana = new frmIniciarSesion();
            ventana.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_intemCerrarSesionActionPerformed

    private void itemMiInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMiInformacionActionPerformed
        if (usuario.getTipo().equals("Empresa")) {
            dlgInformacionEmpresa ventEmpresa = new dlgInformacionEmpresa(this, rootPaneCheckingEnabled);
            ventEmpresa.setUsuario(usuario);
            ventEmpresa.cargarDatos();
            ventEmpresa.setVisible(true);
        } else if (usuario.getTipo().equals("Postulante")) {
            dlgInformacionPostulante ventPostulante = new dlgInformacionPostulante(this, rootPaneCheckingEnabled);
            ventPostulante.setUsuario(usuario);
            ventPostulante.cargarDatos();
            ventPostulante.setVisible(true);
        }
    }//GEN-LAST:event_itemMiInformacionActionPerformed

    private void itemVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerMasActionPerformed
        int fila = tablaDatos.getSelectedRow();
        dlgVerMas vtnVerMas = new dlgVerMas(this, rootPaneCheckingEnabled);
        vtnVerMas.setFila(fila + 1);
        vtnVerMas.setUsuario(usuario);
        vtnVerMas.cargarDatos();
        vtnVerMas.setVisible(true);
    }//GEN-LAST:event_itemVerMasActionPerformed

    private void itemVerPostulantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerPostulantesActionPerformed
        int fila = tablaDatos.getSelectedRow();
        dlgVerPostulantes vntVerPostulantes = new dlgVerPostulantes(this, rootPaneCheckingEnabled);
        vntVerPostulantes.setFila(fila + 1);
        vntVerPostulantes.setUsuario(usuario);
        vntVerPostulantes.cargarDatos();
        vntVerPostulantes.setVisible(true);
    }//GEN-LAST:event_itemVerPostulantesActionPerformed

    private void btnCrearAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAnuncioActionPerformed
        dlgCrearAnuncio vnt = new dlgCrearAnuncio(this, rootPaneCheckingEnabled);
        vnt.setUsuario(usuario);
        vnt.setVisible(true);
        if(vnt.getCreeAnuncio() == 1){
            cargarListaAnuncioEmpresa();
            System.out.println("liste");
        }
    }//GEN-LAST:event_btnCrearAnuncioActionPerformed

    private void btnPostularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostularActionPerformed
        int fila = tablaDatos.getSelectedRow();
        dlgPostular vnt = new dlgPostular(this, rootPaneCheckingEnabled);
        vnt.setUsuario(usuario);
        vnt.setFila(fila + 1);
        vnt.cargarDatos();
        vnt.setVisible(true);
    }//GEN-LAST:event_btnPostularActionPerformed

    private void limpiarTabla(){
        for (int i = tablaDatos.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void cargarListaAnuncioEmpresa(){
        clsAnuncioAD anuncioAD = new clsAnuncioAD();
        
        try {
            ArrayList<clsAnuncio> anuncios = anuncioAD.anuncios(usuario);
            limpiarTabla();
            modelo = (DefaultTableModel)tablaDatos.getModel();
            Object[] obj = new Object[3];
            int i = 1;
            for (clsAnuncio anuncio : anuncios) {
                obj[0] = i;
                obj[1] = anuncio.getCargo();
                obj[2] = anuncio.getDescripcion();
                modelo.addRow(obj);
                i++;
            }
            tablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    
    public void cargarListaAnunciosPostulante(){
        clsAnuncioAD anuncioAD = new clsAnuncioAD();
        String titulos[] = {"Nun", "Cargo", "Descripción", "Empresa"};
        modelo.setColumnIdentifiers(titulos);
        try {
            ArrayList<String[]> anuncios = anuncioAD.todosLosAnuncios();
            modelo.setNumRows(0);
            int i = 1;
            for (String[] strings : anuncios) {
                String fila[] = {i + "", strings[0], strings[1], strings[2]};
                modelo.addRow(fila);
                i++;
            }
            tablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void seleccionBotones() {
        if (usuario.getTipo().equals("Empresa")) {
            btnPostular.setVisible(false);
            cargarListaAnuncioEmpresa();
        } else if (usuario.getTipo().equals("Postulante")) {
            btnCrearAnuncio.setVisible(false);
            cargarListaAnunciosPostulante();
            itemVerPostulantes.setVisible(false);
        }
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAnuncio;
    private javax.swing.JButton btnPostular;
    private javax.swing.JMenuItem intemCerrarSesion;
    private javax.swing.JMenuItem itemMiInformacion;
    private javax.swing.JMenuItem itemVerMas;
    private javax.swing.JMenuItem itemVerPostulantes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
