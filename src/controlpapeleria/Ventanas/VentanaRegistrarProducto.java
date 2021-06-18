package controlpapeleria.Ventanas;

import controlpapeleria.Catalogo;
import controlpapeleria.ControlArchivos;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class VentanaRegistrarProducto extends javax.swing.JFrame {
    String tipoProducto;
    String producto;
    String idProducto;
    String nombreProducto;
    float precioUnitario;
    String descripcionProducto;
    
    public VentanaRegistrarProducto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ComboTipoProducto = new javax.swing.JComboBox<>();
        ComboProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tb_IDProducto = new javax.swing.JTextField();
        tb_NombreProducto = new javax.swing.JTextField();
        tb_PrecioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Descripicon = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR PRODUCTOS");

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelar_Click(evt);
            }
        });

        ComboTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de producto", "Escritura", "Adhesivos", "Arte", "Papeles", "Regalos", "General" }));
        ComboTipoProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTipoProductoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Seleccione el producto:");

        tb_IDProducto.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        tb_IDProducto.setText("Ingrese el ID del producto");
        tb_IDProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_IDProductoMouseClicked(evt);
            }
        });

        tb_NombreProducto.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        tb_NombreProducto.setText("Ingrese el nombre del producto");
        tb_NombreProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NombreProductoMouseClicked(evt);
            }
        });

        tb_PrecioUnitario.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        tb_PrecioUnitario.setText("Ingrese el precio unitario");
        tb_PrecioUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_PrecioUnitarioMouseClicked(evt);
            }
        });

        ta_Descripicon.setColumns(20);
        ta_Descripicon.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        ta_Descripicon.setRows(5);
        ta_Descripicon.setText("Ingrese descripción...");
        ta_Descripicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta_DescripiconMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ta_Descripicon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(33, 33, 33)
                        .addComponent(BotonGuardar)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(ComboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboTipoProducto, 0, 260, Short.MAX_VALUE)
                            .addComponent(tb_IDProducto)
                            .addComponent(tb_NombreProducto)
                            .addComponent(tb_PrecioUnitario)
                            .addComponent(jScrollPane1))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(ComboTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tb_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tb_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tb_PrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCancelar_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelar_Click
        VentanaCatalogo ventanaCatalogo = new VentanaCatalogo();
        ventanaCatalogo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCancelar_Click

    private void ComboTipoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTipoProductoItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.ComboTipoProducto.getSelectedIndex()>0){
                String tipoProducto = ComboTipoProducto.getSelectedItem().toString();
                if(tipoProducto.equalsIgnoreCase("Escritura")){
                    ComboProductos.removeAllItems();
                    this.CargarEscritura();
                }else if(tipoProducto.equalsIgnoreCase("Adhesivos")){
                    ComboProductos.removeAllItems();
                    this.CargarAdhesivos();
                }else if(tipoProducto.equalsIgnoreCase("Arte")){
                    ComboProductos.removeAllItems();
                    this.CargarArte();
                }else if(tipoProducto.equalsIgnoreCase("Papeles")){
                    ComboProductos.removeAllItems();
                    this.CargarPapeles();
                }else if(tipoProducto.equalsIgnoreCase("Regalos")){
                    ComboProductos.removeAllItems();
                    this.CargarRegalos();
                }else if(tipoProducto.equalsIgnoreCase("General")){
                    ComboProductos.removeAllItems();
                    this.CargarGeneral();
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoProductoItemStateChanged

    private void tb_IDProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_IDProductoMouseClicked
        this.tb_IDProducto.selectAll();
    }//GEN-LAST:event_tb_IDProductoMouseClicked

    private void tb_NombreProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NombreProductoMouseClicked
        this.tb_NombreProducto.selectAll();
    }//GEN-LAST:event_tb_NombreProductoMouseClicked

    private void tb_PrecioUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_PrecioUnitarioMouseClicked
        this.tb_PrecioUnitario.selectAll();
    }//GEN-LAST:event_tb_PrecioUnitarioMouseClicked

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if(this.tb_IDProducto.getText().equals("Ingrese el ID del producto") || this.tb_NombreProducto.getText().equals("Ingrese el nombre del producto") 
                || this.tb_PrecioUnitario.getText().equals("Ingrese el precio unitario")|| this.ComboProductos.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Faltan campos");
        }else{
            this.tipoProducto = this.ComboTipoProducto.getSelectedItem().toString();
            this.producto = this.ComboProductos.getSelectedItem().toString();
            this.nombreProducto = this.tb_NombreProducto.getText();
            this.idProducto = this.tb_IDProducto.getText();
            this.precioUnitario = Float.parseFloat(this.tb_PrecioUnitario.getText());
            this.descripcionProducto = this.ta_Descripicon.getText();
            Catalogo productoGuardar = new Catalogo();
            productoGuardar.setTipo(tipoProducto);
            productoGuardar.setID(idProducto);
            productoGuardar.setDescripcion(descripcionProducto);
            productoGuardar.setNombre(nombreProducto);
            productoGuardar.setPrecioUnitario(precioUnitario);
            ControlArchivos controlador = new ControlArchivos();
            if(controlador.GuardarProducto(productoGuardar)==1){
                JOptionPane.showMessageDialog(null, "Producto registrado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Error de registro");
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void ta_DescripiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta_DescripiconMouseClicked
        this.ta_Descripicon.selectAll();
    }//GEN-LAST:event_ta_DescripiconMouseClicked

    public void CargarEscritura(){
        ComboProductos.addItem("Lapiz");
        ComboProductos.addItem("Boligrafo");
        ComboProductos.addItem("Cuaderno");
        ComboProductos.addItem("Goma/Sacapuntas");
        ComboProductos.addItem("Marcador");
        ComboProductos.addItem("Resaltador");
        
    }
    
    public void CargarAdhesivos(){
        ComboProductos.addItem("Resistol");
        ComboProductos.addItem("Lapiz adhesivo");
        ComboProductos.addItem("Cinta adhesiva");
        ComboProductos.addItem("Silicon");
    }
    
    public void CargarArte(){
        ComboProductos.addItem("Colores");
        ComboProductos.addItem("Crayolas");
        ComboProductos.addItem("Pinturas vinilicas");
        ComboProductos.addItem("Acuarelas");
        ComboProductos.addItem("Pinceles");
    }
    
    public void CargarPapeles(){
        ComboProductos.addItem("Papel bong");
        ComboProductos.addItem("Papel crepe");
        ComboProductos.addItem("Papel china");
        ComboProductos.addItem("Papel lustre");
        ComboProductos.addItem("Papel contact");
        ComboProductos.addItem("Papel cascaron");
        ComboProductos.addItem("Cartulina");
        ComboProductos.addItem("Papel celofán");
    }
    
    public void CargarRegalos(){
        ComboProductos.addItem("Papel de regalo");
        ComboProductos.addItem("Caja de regalo");
        ComboProductos.addItem("Bolsa de regalo");
        ComboProductos.addItem("Moño");
    }
    
    public void CargarGeneral(){
        ComboProductos.addItem("Folders");
        ComboProductos.addItem("Tijeras");
        ComboProductos.addItem("Globos");
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
            java.util.logging.Logger.getLogger(VentanaRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JComboBox<String> ComboProductos;
    private javax.swing.JComboBox<String> ComboTipoProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea ta_Descripicon;
    private javax.swing.JTextField tb_IDProducto;
    private javax.swing.JTextField tb_NombreProducto;
    private javax.swing.JTextField tb_PrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
