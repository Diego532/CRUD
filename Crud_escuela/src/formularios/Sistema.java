

package formularios;

import conexionSQL.conexionSQL; // paquete donde se encuentra la coenxion con la base de datos
import java.sql.Connection; // se importa para crar una variable que s einicialice con el metodo de conexion antes creado
import java.sql.PreparedStatement; // se importa para guardar dato
import java.sql.Statement; // se importa para mostrar dato 
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends javax.swing.JFrame {

    //Se instancia el objeto conexion
    conexionSQL cc = new conexionSQL();  // se crea una variable d etipo conexionSQL importando el paquete y la clase en donde se encuentran
    Connection conector = cc.conexion(); // luego se crea una variable de tipo Connection, que tenga el metodo de conexion de conexionSQL
    
    
    
    
    
    public Sistema() {
        initComponents();
        
        this.setLocationRelativeTo(null); // se coloca para el programa aparezca en el centro de la pantalla
        this.getContentPane().setBackground(getBackground()); // s ele da color al background
        mostrarDatos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        buttonNuevo = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre: ");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido: ");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materia:");

        cbMateria.setBackground(new java.awt.Color(255, 255, 255));
        cbMateria.setForeground(new java.awt.Color(255, 255, 255));
        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calculo ", "Estadistica", "Redes I", "Base de datos I", "Arquitectura de la PC" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Calificacion:");

        txtCalificacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estatus:");

        cbEstatus.setBackground(new java.awt.Color(255, 255, 255));
        cbEstatus.setForeground(new java.awt.Color(255, 255, 255));
        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Reprobado" }));

        buttonNuevo.setText("Nuevo");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        buttonActualizar.setText("Actualizar");
        buttonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbEstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCalificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonNuevo)
                        .addGap(38, 38, 38)
                        .addComponent(buttonGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(buttonEliminar)
                        .addGap(47, 47, 47)
                        .addComponent(buttonActualizar)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuevo)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonEliminar)
                    .addComponent(buttonActualizar))
                .addGap(75, 75, 75))
        );

        tablaAlumnos.setBackground(new java.awt.Color(204, 204, 204));
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jLabel6.setText("Busqueda: ");

        txtBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        insertarDatos();
        limpiarCampos();
        mostrarDatos();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    //////////////////////// Evento de CLick del Mouse //////////////////////////
    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        
        int filaSeleccionada = tablaAlumnos.rowAtPoint(evt.getPoint());
        
        txtNombre.setText(tablaAlumnos.getValueAt(filaSeleccionada, 1).toString());
        txtApellido.setText(tablaAlumnos.getValueAt(filaSeleccionada,2).toString());
        cbMateria.setSelectedItem(tablaAlumnos.getValueAt(filaSeleccionada, 3).toString());
        txtCalificacion.setText(tablaAlumnos.getValueAt(filaSeleccionada,4).toString());
        cbEstatus.setSelectedItem(tablaAlumnos.getValueAt(filaSeleccionada,5).toString());
                
        
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void buttonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarActionPerformed
        actualizarRegistro();
        limpiarCampos();
        mostrarDatos();
    }//GEN-LAST:event_buttonActualizarActionPerformed

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        eliminarRegistro();
        mostrarDatos();
        limpiarCampos();
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        filtrarDatos(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaActionPerformed
    
    public void limpiarCampos()
    {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCalificacion.setText("");
        cbMateria.setSelectedItem(null); //Para colocar un combox en blanco
        cbEstatus.setSelectedItem(null);
    }
    
    
    
   
    public void insertarDatos()
    {
        try{
            String SQL = "insert into alumnos (Nombre,Apellido,Materia,calificacion,estatus) values (?,?,?,?,?)";
            PreparedStatement pst = conector.prepareStatement(SQL);
            
            ///////////////////// Asi se trabajan los text fild //////////////
            pst.setString(1,txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            ///////////////////// Asi se trabajan los combobox ///////////////
            int seleccion = cbMateria.getSelectedIndex();
            pst.setString(3,cbMateria.getItemAt(seleccion)); 
            //////////////////////Asi se trabaja el text fild cuando es un double////////////////////
            pst.setDouble(4, Double.parseDouble(txtCalificacion.getText())); //como la calificacion es un double, se debe tomar el texto y transformarlo a double
            
            seleccion = cbEstatus.getSelectedIndex();
            pst.setString(5, cbEstatus.getItemAt(seleccion));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");   
            
        }catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Registro Fallido" + e.getMessage());
        }
        
           
    }
    
    
    
    public void actualizarRegistro()
    {
        try{
            //sentencia SQL para actualizar, se colocan las columnas y el id seleccionado
            String SQL = "update alumnos set Nombre =?, Apellido =?, Materia =?, Calificacion =?, estatus =? where idalumno =?";
            
            int filaSeleccionada = tablaAlumnos.getSelectedRow();
            String registro = (String)tablaAlumnos.getValueAt(filaSeleccionada, 0);
           
            // una vatiable para preparar los datos
            PreparedStatement pst = conector.prepareStatement(SQL);
            
            //Ingresamos los parametros 
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            
            int seleccionado = cbMateria.getSelectedIndex();
            pst.setString(3, cbMateria.getItemAt(seleccionado));
            
            pst.setDouble(4, Double.parseDouble(txtCalificacion.getText()));
            
            seleccionado = cbEstatus.getSelectedIndex();
            pst.setString(5, cbEstatus.getItemAt(seleccionado));
          
          pst.setString(6, registro);
          pst.execute();
          
          JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Actualizacion fallida" + e.getMessage());  
        }
    }
    
   
    public void eliminarRegistro()
    {
        int filaseleccionada = tablaAlumnos.getSelectedRow();
        
        try{
            //Sentencia SQL
            String SQL = "delete from alumnos where idalumno=" + tablaAlumnos.getValueAt(filaseleccionada, 0);
            Statement st = conector.createStatement();
            
            // Ejecutar la consulta 
            int n = st.executeUpdate(SQL);
            
            if (n >=0)
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Eliminar Registro"+ e.getMessage());
        }    
    }
       
     
        
    public void mostrarDatos()
    {
        String[] titulos = {"ID Alumno", "Nombre", "Apellido", "Materia","Calificacion" ,"Estatus"};
        String[] registro = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String SQL = "Select * from alumnos"; //se coloca la sentencia SQL
        
        try {
            Statement st = conector.createStatement();
            ResultSet show = st.executeQuery(SQL);
            while (show.next()){ // coloco el metodo next para que recorra todos los valores de mi tabla alumnos
                registro[0] = show.getString("idalumno");
                registro[1] = show.getString("Nombre");
                registro[2] = show.getString("Apellido");
                registro[3] = show.getString("Materia");
                registro[4] = show.getString("Calificacion");
                registro[5] = show.getString("estatus");
                
                modelo.addRow(registro);
            }
            
            tablaAlumnos.setModel(modelo);
            
        }catch(Exception e){ 
            
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e.getMessage());
        
        }
        
    }
    
    public void filtrarDatos(String valor)
    {
        String[] titulos = {"ID Alumno", "Nombre", "Apellido", "Materia","Calificacion" ,"Estatus"};
        String[] registro = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        
        String SQL = "Select * from alumnos where nombre like '%"+valor+"%'"; //se coloca la sentencia SQL
        
        try {
            Statement st = conector.createStatement();
            ResultSet show = st.executeQuery(SQL);
            while (show.next()){ // coloco el metodo next para que recorra todos los valores de mi tabla alumnos
                registro[0] = show.getString("idalumno");
                registro[1] = show.getString("Nombre");
                registro[2] = show.getString("Apellido");
                registro[3] = show.getString("Materia");
                registro[4] = show.getString("Calificacion");
                registro[5] = show.getString("estatus");
                
                modelo.addRow(registro);
            }
            
            tablaAlumnos.setModel(modelo);
            
        }catch(Exception e){ 
            
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e.getMessage());
        
        }
        
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
