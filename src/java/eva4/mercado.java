/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eva4;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.log4j.Logger;


public class mercado extends javax.swing.JFrame {
     String productos[] ={"Lapiceros Boliball", "Borrador Duo Negro", "Cuadernos A4 Navarrete", "Pinceles Creativo", "Temperas Faber Castell x7", "Marcadores Vinifan x5"};
        double precios[] = {4.50, 3.20, 5.50, 2.20, 10.50, 3.30};
        double precio=0;
        int cantidad=0;
        
    DefaultTableModel modelo = new DefaultTableModel();
    public mercado() {
        
        initComponents();
        @SuppressWarnings("unchecked")
        DefaultComboBoxModel box1 = new DefaultComboBoxModel(productos);
        CBXPRO.setModel(box1);
        modelo.addColumn("Productos");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        actualizarTabla();

        LOG.info("Productos: Lapiceros s/4.50, borrador duo S/3.20, Cuaderno A4 S/5.50, Pinceles S/2.20, Temperas faber castel S/10.50, Marcadores duo S/3.30");
    }

    private final static
            Logger LOG = Log.getLogger(mercado.class);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblprecio = new javax.swing.JLabel();
        lblimporte = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblprodu = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        CBXPRO = new javax.swing.JComboBox<>();
        spncant = new javax.swing.JSpinner();
        labeltotal = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        labelll = new javax.swing.JLabel();
        labelllll = new javax.swing.JLabel();
        labelsub = new javax.swing.JLabel();
        labeligv = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblprecio.setBackground(new java.awt.Color(255, 255, 255));
        lblprecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprecio.setText("S/ 0.00");

        lblimporte.setBackground(new java.awt.Color(255, 255, 255));
        lblimporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblimporte.setText("S/ 0.00");

        jLabel1.setText("Productos : ");

        jLabel2.setText("Cantidad :");

        tblprodu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblprodu);

        jLabel3.setText("Precio x Und: ");

        jLabel4.setText("Importe :");

        btnagregar.setText("Agregar ");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        CBXPRO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXPRO.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CBXPRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXPROActionPerformed(evt);
            }
        });

        spncant.setModel(new javax.swing.SpinnerNumberModel(1, null, 10, 1));
        spncant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spncantStateChanged(evt);
            }
        });

        labeltotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labeltotal.setText("S/ 0.00");

        label.setText("SUBTOTAL");

        labelll.setText("IGV");

        labelllll.setText("TOTAL");

        labelsub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelsub.setForeground(new java.awt.Color(51, 51, 51));
        labelsub.setText("S/ 0.00");

        labeligv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labeligv.setText("S/ 0.00");

        jButton1.setText("Ver Catalogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Distribuidora Navarrete SA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBXPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spncant, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblimporte)
                    .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(26, 26, 26)
                        .addComponent(labelsub)
                        .addGap(172, 172, 172)
                        .addComponent(labelll)
                        .addGap(39, 39, 39)
                        .addComponent(labeligv)
                        .addGap(111, 111, 111)
                        .addComponent(labelllll)
                        .addGap(44, 44, 44)
                        .addComponent(labeltotal)
                        .addGap(232, 232, 232))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXPRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblprecio)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spncant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(lblimporte)
                    .addComponent(btnagregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltotal)
                    .addComponent(labelllll)
                    .addComponent(labeligv)
                    .addComponent(labelll)
                    .addComponent(labelsub)
                    .addComponent(label))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXPROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXPROActionPerformed

    calcularPrecio();

        // TODO add your handling code here:
    }//GEN-LAST:event_CBXPROActionPerformed

    private void spncantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spncantStateChanged
      calcularPrecio();
        
// TODO add your handling code here:
    }//GEN-LAST:event_spncantStateChanged
 ArrayList<ventas>listaventas=new ArrayList<ventas>();
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
ventas ventas=new ventas ();
ventas.setId(CBXPRO.getSelectedIndex());
ventas.setDesc(CBXPRO.getSelectedItem().toString());
ventas.setCant(cantidad);
ventas.setPrecio(precio);
ventas.setImporte(precio*cantidad);
if(!searchVentas(ventas)){
    listaventas.add(ventas);
    
}
          

borrarVentas();
actualizarTabla();




        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        Desktop.getDesktop().browse(new URI("http://localhost:8080/WebApplication1/productos.jsp"));
    } catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public boolean searchVentas(ventas nueva){
        for (ventas v : listaventas){
            if(v.getId()==nueva.getId()){
                int newcantidad=v.getCant()+nueva.getCant();
                v.setCant(newcantidad);
                v.setImporte(v.getPrecio()*newcantidad);
                return true;
            }
        }
        return false;
    }
    
    
    public void borrarVentas(){
        precio=0;
        cantidad=1;
        CBXPRO.setSelectedIndex(1);
        spncant.setValue(1);
        calcularPrecio();

    }
    
    
    
    
    public void calcularPrecio(){
        precio = precios[CBXPRO.getSelectedIndex()];
        cantidad=Integer.parseInt(spncant.getValue().toString());  
        lblprecio.setText(amonedas(precio));
        lblimporte.setText(amonedas(precio*cantidad));
    }
    
    
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        double subtotal=0;
        for (ventas v : listaventas){
            Object X[]= new Object [4];
            X[0]=v.getDesc();
            X[1]=amonedas(v.getPrecio());
            X[2]=v.getCant();
            X[3]=amonedas(v.getImporte());
            subtotal+=v.getImporte();
            modelo.addRow(X);  
        }
        double igv=subtotal*0.18;
        double total=subtotal+igv;
        labelsub.setText(amonedas(subtotal));
        labeligv.setText(amonedas(igv));
        labeltotal.setText(amonedas(total));
        tblprodu.setModel(modelo);
    }
    
    public String amonedas(double precio){
        return "S/ " +Math.round(precio*100.0)/100.0;   
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
            java.util.logging.Logger.getLogger(mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBXPRO;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labeligv;
    private javax.swing.JLabel labelll;
    private javax.swing.JLabel labelllll;
    private javax.swing.JLabel labelsub;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel lblimporte;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JSpinner spncant;
    private javax.swing.JTable tblprodu;
    // End of variables declaration//GEN-END:variables
}
