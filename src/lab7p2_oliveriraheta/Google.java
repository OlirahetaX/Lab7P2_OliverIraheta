package lab7p2_oliveriraheta;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Google extends javax.swing.JFrame {

    public Google() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        cargarArchivos();
        llenarJtree1();
//        llenarJtree2();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_Crear = new javax.swing.JPopupMenu();
        mi_crearArchivo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mi_CrearCarpeta = new javax.swing.JMenuItem();
        jd_jtree = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_tree2 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        pm_miunidad = new javax.swing.JPopupMenu();
        mi_fav = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mi_eliminar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mi_descargar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();

        mi_crearArchivo.setBackground(new java.awt.Color(255, 255, 204));
        mi_crearArchivo.setText("Crear Archivo");
        mi_crearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearArchivoActionPerformed(evt);
            }
        });
        pm_Crear.add(mi_crearArchivo);
        pm_Crear.add(jSeparator1);

        mi_CrearCarpeta.setBackground(new java.awt.Color(255, 255, 204));
        mi_CrearCarpeta.setText("Crear Carpeta");
        mi_CrearCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_CrearCarpetaActionPerformed(evt);
            }
        });
        pm_Crear.add(mi_CrearCarpeta);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carpetas");
        jt_tree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(jt_tree2);

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_jtreeLayout = new javax.swing.GroupLayout(jd_jtree.getContentPane());
        jd_jtree.getContentPane().setLayout(jd_jtreeLayout);
        jd_jtreeLayout.setHorizontalGroup(
            jd_jtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jtreeLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jd_jtreeLayout.setVerticalGroup(
            jd_jtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jtreeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_jtreeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        mi_fav.setText("jMenuItem1");
        pm_miunidad.add(mi_fav);
        pm_miunidad.add(jSeparator3);

        mi_eliminar.setText("jMenuItem2");
        pm_miunidad.add(mi_eliminar);
        pm_miunidad.add(jSeparator2);

        mi_descargar.setText("Descargar");
        mi_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_descargarActionPerformed(evt);
            }
        });
        pm_miunidad.add(mi_descargar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jScrollPane1.setBorder(null);

        jList1.setBackground(new java.awt.Color(0, 204, 255));
        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MI UNIDAD", " ", "DESTACADOS", " ", "PAPELERA" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setBorder(null);

        jTree1.setBackground(new java.awt.Color(0, 204, 255));
        jTree1.setBorder(null);
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Escritorio");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setLargeModel(true);
        jTree1.setShowsRootHandles(true);
        jTree1.setToggleClickCount(100);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 51, 51));
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jProgressBar1);
        jProgressBar1.setBounds(20, 10, 558, 48);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(98, 98, 98))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.isMetaDown()) {
            pm_Crear.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void mi_crearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearArchivoActionPerformed
        q = true;
        name = "";
        extension = "";
        tamanio = 0;
        name = JOptionPane.showInputDialog("Nombre del archivo");
        String[] extensiones = {"oli", "nuila", "lab", "jaja", "vini"};
        JComboBox<String> cb = new JComboBox(extensiones);
        int opc = JOptionPane.showOptionDialog(null, cb, "Extension", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        if (opc >= 0) {
            extension = (String) cb.getSelectedItem();
        }
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tamanio del archivo"));
        if (JOptionPane.showInputDialog("Agregar a una carpeta s/n").equals("s")) {
            jd_jtree.pack();
            jd_jtree.setLocationRelativeTo(this);
            jd_jtree.setModal(true);
            llenarJtree2();
            jd_jtree.setVisible(true);

        } else {
            Archivo newArchivo = new Archivo(name, drive + LinkGenerar(10), extension, tamanio, "miUnidad");
            miunidad.add(newArchivo);
            escribirArchivo();
            cargarArchivos();
            llenarJtree1();
        }


    }//GEN-LAST:event_mi_crearArchivoActionPerformed

    private void mi_CrearCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_CrearCarpetaActionPerformed
        q = false;
        name = JOptionPane.showInputDialog("NOmbre de la Carpeta");
        if (JOptionPane.showInputDialog("Agregar a una carpeta s/n").equals("s")) {
            jd_jtree.pack();
            jd_jtree.setLocationRelativeTo(this);
            jd_jtree.setModal(true);
            llenarJtree2();
            jd_jtree.setVisible(true);
        } else {
            Carpeta newCarpeta = new Carpeta(name, drive + LinkGenerar(5), "miunidad");
            carpetas.add(newCarpeta);
            escribirArchivo();
            cargarArchivos();
            llenarJtree1();
        }

    }//GEN-LAST:event_mi_CrearCarpetaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultMutableTreeNode nodo_sele = (DefaultMutableTreeNode) jt_tree2.getLastSelectedPathComponent();

        if (q == true) {
            String Link = drive + ((Carpeta) nodo_sele.getUserObject()).getLink().substring(16) + LinkGenerar(10);
            Archivo newArchivo = new Archivo(name, Link, extension, tamanio, "miUnidad");
            for (Carpeta c : carpetas) {
                if (nodo_sele.getUserObject().equals(c)) {
                    c.getListaArchivos().add(newArchivo);
                }
            }
            System.out.println(newArchivo.getLink());
        } else {
            Carpeta newCarpeta = new Carpeta(name, drive + ((Carpeta) nodo_sele.getUserObject()).getLink().substring(16) + LinkGenerar(5), "miunidad");
            for (Carpeta c : carpetas) {
                if (nodo_sele.getUserObject().equals(c)) {
                    c.getListaCarpetas().add(newCarpeta);
                }
            }
        }
        jd_jtree.setVisible(false);
        escribirArchivo();
        cargarArchivos();
        llenarJtree1();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if (evt.isMetaDown()) {
            int row = jTree1.getClosestRowForLocation(evt.getX(), evt.getY());
            jTree1.setSelectionRow(row);
            Object v1 = jTree1.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            String link = "";
            if (nodo_seleccionado.getUserObject() instanceof Archivo) {
                link = ((Archivo) nodo_seleccionado.getUserObject()).getLink();
            }
            if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
                link = ((Carpeta) nodo_seleccionado.getUserObject()).getLink();
            }
            jProgressBar1.setStringPainted(true);
            jProgressBar1.setString(link);
            pm_miunidad.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void mi_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_descargarActionPerformed
        tam = 0;
        if (nodo_seleccionado.getUserObject() instanceof Archivo) {
            tam = ((Archivo) nodo_seleccionado.getUserObject()).getTamanio();
        } else if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
            tamanio(nodo_seleccionado.getUserObject());
        }

        hiloBar hilo1 = new hiloBar(jProgressBar1, tam);
        Thread proceso1 = new Thread(hilo1);
        proceso1.start();
    }//GEN-LAST:event_mi_descargarActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Google.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Google.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Google.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Google.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Google().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTree jTree1;
    private javax.swing.JDialog jd_jtree;
    private javax.swing.JTree jt_tree2;
    private javax.swing.JMenuItem mi_CrearCarpeta;
    private javax.swing.JMenuItem mi_crearArchivo;
    private javax.swing.JMenuItem mi_descargar;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_fav;
    private javax.swing.JPopupMenu pm_Crear;
    private javax.swing.JPopupMenu pm_miunidad;
    // End of variables declaration//GEN-END:variables
    ArrayList destacados = new ArrayList();
    ArrayList papelera = new ArrayList();
    ArrayList miunidad = new ArrayList();
    ArrayList<Carpeta> carpetas = new ArrayList();
    String drive = "drive.google.com/";
//    static String linksPadres;
    admArchivo aa = new admArchivo("./Archivos.uy");
    String name;
    String extension;
    int tamanio;
    boolean q;//archivo/carpeta
    DefaultMutableTreeNode nodo_seleccionado;
    int tam;

    private void tamanio(Object o) {
        for (int i = 0; i < ((Carpeta) o).getListaCarpetas().size(); i++) {
            //System.out.println(i);    
            tamanio(((Carpeta) o).getListaCarpetas().get(i));

        }
        for (int i = 0; i < ((Carpeta) o).getListaArchivos().size(); i++) {
            System.out.println(i);
            tam += ((Carpeta) o).getListaArchivos().get(i).getTamanio();
        }

    }

    private String LinkGenerar(int cant) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(cant);

        for (int i = 0; i < cant; i++) {
            int numRandom = random.nextInt(caracteres.length());
            char caracterRandom = caracteres.charAt(numRandom);
            sb.append(caracterRandom);
        }

        return sb.toString() + "";
    }

    private void cargarArchivos() {

        aa.cargarArchivo();
        for (Archivo la : aa.getListaArchivos()) {
            if (la.getLugar().equals("papelera")) {
                papelera.add(la);
            }
            if (la.getLugar().equals("destacados")) {
                destacados.add(la);
            }
            miunidad.add(la);

        }

        admCarpeta ac = new admCarpeta("./Carpetas.ay");
        ac.cargarArchivo();
        carpetas = ac.getListaCarpeta();
    }

    private void escribirArchivo() {
        aa = new admArchivo("./Archivos.uy");
        aa.setListaArchivos(miunidad);
        aa.escribirArchivo();

        admCarpeta ac = new admCarpeta("./Carpetas.ay");
        ac.setListaCarpeta(carpetas);
        ac.escribirArchivo();
    }

    private void llenarJtree1() {
        DefaultTreeModel modelo = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        raiz.removeAllChildren();
        for (Carpeta carpeta : carpetas) {
            raiz.add(recuCarpeta(carpeta, true));
        }
        for (Archivo la : aa.getListaArchivos()) {
            raiz.add(new DefaultMutableTreeNode(la));
        }
        modelo.reload();
    }

    private DefaultMutableTreeNode recuCarpeta(Carpeta c, boolean x) {
        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(c);

        for (Carpeta d : c.getListaCarpetas()) {
            nodo.add(recuCarpeta(d, x));
        }

        if (x) {
            for (Archivo la : c.getListaArchivos()) {
                nodo.add(new DefaultMutableTreeNode(la));
            }
        }

        return nodo;
    }

    private void llenarJtree2() {
        DefaultTreeModel modelo = (DefaultTreeModel) jt_tree2.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        raiz.removeAllChildren();
        for (Carpeta carpeta : carpetas) {
            raiz.add(recuCarpeta(carpeta, false));
        }
        modelo.reload();

    }

}
