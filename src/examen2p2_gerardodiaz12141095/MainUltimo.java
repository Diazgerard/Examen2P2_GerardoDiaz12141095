/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author gerar
 */
public class MainUltimo extends javax.swing.JFrame {
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
     int numero;
    /**
     * Creates new form MainUltimo
     */
    public MainUltimo() {
        initComponents();
        
        b = new bitacora(pg_hiloCancion);
        ac = new administrarCancion(numero, pg_hiloCancion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_guardarCancion = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreCancion = new javax.swing.JTextField();
        scroll_tree1 = new javax.swing.JScrollPane();
        jt_cancion1 = new javax.swing.JTree();
        jb_guarda = new javax.swing.JButton();
        pg_hiloCancion = new javax.swing.JProgressBar();
        jl_cancion = new javax.swing.JLabel();
        scroll_tree = new javax.swing.JScrollPane();
        jt_cancion = new javax.swing.JTree();
        scroll_ta = new javax.swing.JScrollPane();
        ta_escribirCancion = new javax.swing.JTextArea();
        panel = new javax.swing.JPanel();
        jb_grabarCancion = new javax.swing.JButton();
        jb_guardarCancion = new javax.swing.JButton();
        jb_ReproduccionCancion = new javax.swing.JButton();
        jb_PausarCancion = new javax.swing.JButton();

        jLabel1.setText("Nombre Cancion");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Canciones");
        jt_cancion1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_cancion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_cancion1MouseClicked(evt);
            }
        });
        scroll_tree1.setViewportView(jt_cancion1);

        jb_guarda.setText("Guardar Cancion ");
        jb_guarda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_guardarCancionLayout = new javax.swing.GroupLayout(jd_guardarCancion.getContentPane());
        jd_guardarCancion.getContentPane().setLayout(jd_guardarCancionLayout);
        jd_guardarCancionLayout.setHorizontalGroup(
            jd_guardarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                .addGroup(jd_guardarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tf_nombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jb_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scroll_tree1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jd_guardarCancionLayout.setVerticalGroup(
            jd_guardarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                .addGroup(jd_guardarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jd_guardarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(jb_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_guardarCancionLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(scroll_tree1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pg_hiloCancion.setToolTipText("P");
        pg_hiloCancion.setString(Integer.toString(pg_hiloCancion.getValue())+" Minutos");
        pg_hiloCancion.setStringPainted(true);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Canciones");
        jt_cancion.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_cancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_cancionMouseClicked(evt);
            }
        });
        scroll_tree.setViewportView(jt_cancion);

        ta_escribirCancion.setColumns(20);
        ta_escribirCancion.setRows(5);
        ta_escribirCancion.setEnabled(false);
        scroll_ta.setViewportView(ta_escribirCancion);

        panel.setLayout(new java.awt.GridLayout(1, 0));

        jb_grabarCancion.setText("Grabar Cancion");
        jb_grabarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_grabarCancionMouseClicked(evt);
            }
        });
        panel.add(jb_grabarCancion);

        jb_guardarCancion.setText("Guardar Cancion");
        jb_guardarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarCancionMouseClicked(evt);
            }
        });
        panel.add(jb_guardarCancion);

        jb_ReproduccionCancion.setText("Reproduccion Cancion  ");
        jb_ReproduccionCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ReproduccionCancionMouseClicked(evt);
            }
        });
        panel.add(jb_ReproduccionCancion);

        jb_PausarCancion.setText("Pausar Cancion");
        jb_PausarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_PausarCancionMouseClicked(evt);
            }
        });
        panel.add(jb_PausarCancion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scroll_tree, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                                    .addComponent(scroll_ta))))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addComponent(pg_hiloCancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pg_hiloCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_tree)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroll_ta, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_cancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_cancionMouseClicked
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_jt_cancionMouseClicked

    private void jb_grabarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_grabarCancionMouseClicked
        // TODO add your handling code here:
        ta_escribirCancion.setEnabled(true);
        ac.setAvanzar(true);
        b.setAvanzar(true);
         
        boolean avanzar = true;
        
        while(ta_escribirCancion.isEnabled()){
            int numero = 1 + r.nextInt(100);
        }
       
        
    }//GEN-LAST:event_jb_grabarCancionMouseClicked

    private void jb_guardarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarCancionMouseClicked
        // TODO add your handling code here:
        
        jd_guardarCancion.setModal(true);
        jd_guardarCancion.pack();
        jd_guardarCancion.setLocationRelativeTo(this);
        jd_guardarCancion.setVisible(true);

        
    }//GEN-LAST:event_jb_guardarCancionMouseClicked

    private void jb_ReproduccionCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ReproduccionCancionMouseClicked
        // TODO add your handling code here:
       
        
        
        
    }//GEN-LAST:event_jb_ReproduccionCancionMouseClicked

    private void jb_PausarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_PausarCancionMouseClicked
        // TODO add your handling code here:
        ac.setAvanzar(false);
        b.setAvanzar(false);
        ta_escribirCancion.setEnabled(false);
        
    }//GEN-LAST:event_jb_PausarCancionMouseClicked

    private void jt_cancion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_cancion1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cancion1MouseClicked

    private void jb_guardaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardaMouseClicked
        // TODO add your handling code here:
        try {
            String nombre = tf_nombreCancion.getText();
            Cancion c = new Cancion(nombre);
            cancion.add(c);

            DefaultTreeModel modelo = (DefaultTreeModel) jt_cancion.getModel();
            DefaultMutableTreeNode can = new DefaultMutableTreeNode(c);
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jt_cancion1.getLastSelectedPathComponent();
            
            node.add(can);
            modelo.reload();

            adminCancion ap = new adminCancion("./Cancion.txt");
            ap.cargarArchivo();
            ap.setAlumno(c);
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Cancion guardado exitosamente");
            tf_nombreCancion.setText("");
            jt_cancion1.setModel(modelo);
            jd_guardarCancion.dispose();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione una Cancion");
        }
    }//GEN-LAST:event_jb_guardaMouseClicked

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
            java.util.logging.Logger.getLogger(MainUltimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUltimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUltimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUltimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUltimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_PausarCancion;
    private javax.swing.JButton jb_ReproduccionCancion;
    private javax.swing.JButton jb_grabarCancion;
    private javax.swing.JButton jb_guarda;
    private javax.swing.JButton jb_guardarCancion;
    private javax.swing.JDialog jd_guardarCancion;
    private javax.swing.JLabel jl_cancion;
    private javax.swing.JTree jt_cancion;
    private javax.swing.JTree jt_cancion1;
    private javax.swing.JPanel panel;
    public javax.swing.JProgressBar pg_hiloCancion;
    private javax.swing.JScrollPane scroll_ta;
    private javax.swing.JScrollPane scroll_tree;
    private javax.swing.JScrollPane scroll_tree1;
    private javax.swing.JTextArea ta_escribirCancion;
    private javax.swing.JTextField tf_nombreCancion;
    // End of variables declaration//GEN-END:variables

    ArrayList <Cancion> cancion = new ArrayList();
    
    administrarCancion ac;
    bitacora b;
}
