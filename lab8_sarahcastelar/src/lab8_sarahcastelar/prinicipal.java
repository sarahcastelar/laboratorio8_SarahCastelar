package lab8_sarahcastelar;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class prinicipal extends javax.swing.JFrame {
ArrayList <Carro> listaCarros = new ArrayList();
    
    public prinicipal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_tabla = new javax.swing.JDialog();
        cb_carros = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pop = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jb_crearCarro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombrePieza = new javax.swing.JTextField();
        cb_carro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jb_crearPieza = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_tipo = new javax.swing.JTextField();
        tf_tiempo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_arbol = new javax.swing.JTree();
        jb_tabla = new javax.swing.JButton();
        jb_ensamblar = new javax.swing.JButton();

        cb_carros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_carrosMouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jd_tablaLayout = new javax.swing.GroupLayout(jd_tabla.getContentPane());
        jd_tabla.getContentPane().setLayout(jd_tablaLayout);
        jd_tablaLayout.setHorizontalGroup(
            jd_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_tablaLayout.createSequentialGroup()
                .addGroup(jd_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_tablaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_tablaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jd_tablaLayout.setVerticalGroup(
            jd_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_tablaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        pop.add(eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese nombre carro");

        jb_crearCarro.setText("Crear Carro");
        jb_crearCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCarroMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pieza");

        jLabel3.setText("Nombre");

        jLabel4.setText("Ingrese Ubicacion");

        jb_crearPieza.setText("Crear Pieza");
        jb_crearPieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearPiezaMouseClicked(evt);
            }
        });

        jLabel5.setText("Tipo");

        jLabel6.setText("Tiempo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jb_crearCarro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_nombrePieza)
                                            .addComponent(tf_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(cb_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jb_crearPieza))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_crearCarro))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_crearPieza))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel1);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Audi");
        jt_arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_arbol);

        jb_tabla.setText("Actualizar Tabla");
        jb_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tablaMouseClicked(evt);
            }
        });

        jb_ensamblar.setText("Ensamblar Carro");
        jb_ensamblar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ensamblarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jb_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jb_ensamblar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ensamblar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbol", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCarroMouseClicked
        // TODO add your handling code here:
        String nombre = tf_nombre.getText();
        Carro x = new Carro(nombre);
        listaCarros.add(x);
        
        //agregar al combobox
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_carro.getModel();
        m.addElement(x);
        cb_carro.setModel(m);
        
        
    }//GEN-LAST:event_jb_crearCarroMouseClicked

    private void jb_crearPiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearPiezaMouseClicked
        // TODO add your handling code here:
        String nombre = tf_nombrePieza.getText();
        int tiempo = Integer.parseInt(tf_tiempo.getText());
        String tipo = tf_tipo.getText();
        
            for (int i = 0; i < listaCarros.size(); i++) {
                //ver si se agrega a un carro
                if ( String.valueOf(cb_carro.getSelectedItem()).equals( listaCarros.get(i).toString()  ) ) {
                    ((Carro) listaCarros.get(i)).getListaPiezas().add(new Pieza(nombre, tiempo, tipo));
                }  
            }
            
            
            for (int i = 0; i < listaCarros.size(); i++) {
                for (int j = 0; j < ((Carro)listaCarros.get(i)).getListaPiezas().size(); j++) {
                    String pieza = ((Carro)listaCarros.get(i)).getListaPiezas().get(j).toString();
                    //ver si se agrega a una pieza 
                    if (String.valueOf(cb_carro.getSelectedItem()).equals(pieza)) {
                        ((Carro) listaCarros.get(i)).getListaPiezas().get(j).getPiezasHijas().add(new Pieza(nombre,tiempo,tipo));
                    }
                }
            }
        //agregar al combobox cuando 
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_carro.getModel();
        m.addElement(new Pieza(nombre,tiempo,tipo));
        cb_carro.setModel(m);
        
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) cb_carros.getModel();
        m2.addElement(new Pieza(nombre,tiempo,tipo));
        cb_carros.setModel(m2);
        tf_nombre.setText("");
        
        tf_nombrePieza.setText("");
        tf_tiempo.setText("");
        tf_tipo.setText("");
        
        
    }//GEN-LAST:event_jb_crearPiezaMouseClicked

    private void jb_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tablaMouseClicked
        // TODO add your handling code here:
        ArrayList temp = new ArrayList();
        DefaultTreeModel modeloArbol = (DefaultTreeModel)jt_arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
        int c = -1;
        
        for (int i = 0; i < listaCarros.size(); i++) {
            Object nombreCarro = listaCarros.get(i);//agarra el nombre del carro
            DefaultMutableTreeNode nodoCarro = new DefaultMutableTreeNode(nombreCarro);
            
            if (listaCarros.get(i).getListaPiezas().size() >=1) {//si carro tiene Piezas.. ver si tiene piezaHijos
                
                if (listaCarros.get(i).getListaPiezas().get(i).getPiezasHijas().size()>=1) {
                    //si la pieza tiene hijas recorre for que las guarde de nodo
                    for (int j = 0; j < listaCarros.get(i).getListaPiezas().get(i).getPiezasHijas().size(); j++) {
                        Object nombrePiezaHija = listaCarros.get(i).getListaPiezas().get(i).getPiezasHijas().get(j);
                        DefaultMutableTreeNode nodoPieza = new DefaultMutableTreeNode(nombrePiezaHija);
                        nodoCarro.add(nodoPieza);
                        c = 2;
                    }
                    
                    if (c==2) {
                        raiz.add(nodoCarro);
                    }
                    
                }else{//si el carro tiene pieza pero la pieza no tiene piezas hijas
                    Object nombrePieza = listaCarros.get(i).getListaPiezas().get(i);//agarro nombre pieza
                    DefaultMutableTreeNode nodoPieza = new DefaultMutableTreeNode(nombrePieza);
                    nodoCarro.add(nodoPieza);
                    raiz.add(nodoCarro);
                }
            }else{//si el carro no tiene piezas
                raiz.add(nodoCarro);
            }
        }
        modeloArbol.reload();
    }//GEN-LAST:event_jb_tablaMouseClicked

    private void jb_ensamblarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ensamblarMouseClicked
        // TODO add your handling code here:
        jd_tabla.pack();
        jd_tabla.setLocationRelativeTo(this);
        jd_tabla.setModal(true);
        jd_tabla.setVisible(true);
        
        
    }//GEN-LAST:event_jb_ensamblarMouseClicked

    private void cb_carrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_carrosMouseClicked
        // TODO add your handling code here:
        if (cb_carros.getSelectedIndex()>=0) {
            Carro c = new Carro(tabla);//proceso
            Thread proceso = new Thread(c);
            proceso.start();
        }
    }//GEN-LAST:event_cb_carrosMouseClicked

    private void jt_arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_arbolMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = jt_arbol.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_arbol.setSelectionRow(row);
            Object v1 = jt_arbol.getSelectionPath().getLastPathComponent();
            n_sel = (DefaultMutableTreeNode) v1;
            pop.show(evt.getComponent(),evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jt_arbolMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar"+"?","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            DefaultTreeModel m = (DefaultTreeModel)jt_arbol.getModel();
            m.removeNodeFromParent(n_sel);
            m.reload();
        }
    }//GEN-LAST:event_eliminarActionPerformed

    
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
            java.util.logging.Logger.getLogger(prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prinicipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_carro;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_crearCarro;
    private javax.swing.JButton jb_crearPieza;
    private javax.swing.JButton jb_ensamblar;
    private javax.swing.JButton jb_tabla;
    private javax.swing.JDialog jd_tabla;
    private javax.swing.JTree jt_arbol;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrePieza;
    private javax.swing.JTextField tf_tiempo;
    private javax.swing.JTextField tf_tipo;
    // End of variables declaration//GEN-END:variables
private DefaultMutableTreeNode n_sel;
private Pieza p_sel;

}
