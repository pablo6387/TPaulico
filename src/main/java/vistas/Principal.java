/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import entidades.Categoria;
import entidades.Empleado;
import entidades.Empresa;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Principal extends javax.swing.JFrame {

    private ArrayList<Empresa> empresas;
    public Principal() {
        initComponents();
        cargarComboBox();
        empresas = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pEmpleados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        tfSueldo = new javax.swing.JTextField();
        cbEmpresa = new javax.swing.JComboBox<>();
        pEmpresas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfRazon = new javax.swing.JTextField();
        tfCuit = new javax.swing.JTextField();
        jbCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        pEmpleados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Documento");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Categoria");

        jLabel7.setText("Sueldo");

        jLabel8.setText("Empresa");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbMostrar.setText("Mostar Empleados");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategoria.setSelectedIndex(-1);

        javax.swing.GroupLayout pEmpleadosLayout = new javax.swing.GroupLayout(pEmpleados);
        pEmpleados.setLayout(pEmpleadosLayout);
        pEmpleadosLayout.setHorizontalGroup(
            pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmpleadosLayout.createSequentialGroup()
                        .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(cbCategoria, 0, 150, Short.MAX_VALUE)
                            .addComponent(tfSueldo)
                            .addComponent(cbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDni))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pEmpleadosLayout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jbMostrar)
                        .addGap(14, 14, 14))))
        );
        pEmpleadosLayout.setVerticalGroup(
            pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbMostrar))
                .addGap(17, 17, 17))
        );

        pEmpresas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Razon social");

        jLabel10.setText("CUIT");

        jbCrear.setText("Crear Empresa");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmpresasLayout = new javax.swing.GroupLayout(pEmpresas);
        pEmpresas.setLayout(pEmpresasLayout);
        pEmpresasLayout.setHorizontalGroup(
            pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCrear)
                    .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfRazon, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(tfCuit)))
                .addGap(21, 21, 21))
        );
        pEmpresasLayout.setVerticalGroup(
            pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpresasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jbCrear)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jLabel1.setText("Ingreso de datos");

        jLabel2.setText("Ingreso de datos");

        jMenu1.setText("Empleado");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Empresa");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sueldo");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        if (camposVaciosEmpresas()){
            JOptionPane.showMessageDialog(this,"Debe completar todos los campos");
        }else{
            try{
                String razonSocial = tfRazon.getText();
                int cuit = Integer.parseInt(tfCuit.getText());
                Empresa emp = new Empresa(razonSocial,cuit);
                if (empresas.add(emp)){
                    JOptionPane.showMessageDialog(this,"Empresa creada con exito");
                    cbEmpresa.addItem(razonSocial);
                    cbEmpresa.setSelectedIndex(-1);
                    
                }
                limpiarCamposEmpresa();
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(this,"Debe ingresar un CUIT Valido");
                tfCuit.requestFocus();
            }
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (camposVaciosEmpleados()){
            JOptionPane.showMessageDialog(this,"Debe completar todos los campos");
        }else{
            try{
                int DNI = Integer.parseInt(tfDni.getText());
                String nombre = tfNombre.getText();
                String apellido = tfApellido.getText();
                String cate = cbCategoria.getSelectedItem().toString();
                double sueldo = Double.parseDouble(tfSueldo.getText());
                String empr = cbEmpresa.getSelectedItem().toString();
                        
                for(Empresa e:empresas){
                    if (e.getRazonSocial().equals(empr)){
                        Empleado e1 = new Empleado(DNI, nombre + " " + apellido, cate, sueldo,e);
                        e.agregarEmpleados(e1);
                        JOptionPane.showMessageDialog(this,"Empleado Guardado con exito");
                    }
                }
                limpiarCamposEmpleado();
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(this,"Dato invalido en DNI o Sueldo");
                
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        if (cbEmpresa.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Debe elegir una empresa");
        }else{
            for(Empresa e:empresas){
                if(e.getRazonSocial().equals(cbEmpresa.getSelectedItem().toString())){
                    e.mostrarEmpleados();
                }
            }
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JPanel pEmpleados;
    private javax.swing.JPanel pEmpresas;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCuit;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRazon;
    private javax.swing.JTextField tfSueldo;
    // End of variables declaration//GEN-END:variables

private boolean camposVaciosEmpresas(){
    return (tfRazon.getText().isEmpty() || tfCuit.getText().isEmpty());
}

private void cargarComboBox(){
    cbCategoria.setModel(new DefaultComboBoxModel(Categoria.values()));
    cbCategoria.setSelectedIndex(-1);
    
}

private boolean camposVaciosEmpleados(){
    return (tfDni.getText().isEmpty() || tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || cbCategoria.getSelectedIndex()== -1 || tfSueldo.getText().isEmpty() || cbEmpresa.getSelectedIndex()== -1);
}

private void limpiarCamposEmpresa(){
    tfRazon.setText(null);
    tfCuit.setText(null);
}

private void limpiarCamposEmpleado(){
    tfDni.setText(null);
    tfNombre.setText(null);
    tfApellido.setText(null);
    cbCategoria.setSelectedIndex(-1);
    cbEmpresa.setSelectedIndex(-1);
    tfSueldo.setText(null);
}

}
