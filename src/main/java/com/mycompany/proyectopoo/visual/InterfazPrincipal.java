package com.mycompany.proyectopoo.visual;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class InterfazPrincipal extends javax.swing.JFrame{
    
    private DefaultTableModel model = new DefaultTableModel();
    
    // Constructor

    public InterfazPrincipal() {
        initComponents();
        this.setVisible(true);
        this.setSize(880, 570);
        this.setLocationRelativeTo(null);
        btnSeries.setEnabled(false);
    }

    // Get y Set

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
    
    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JTable getTablaVista() {
        return tablaVista;
    }

    public JButton getBtnPeliculas() {
        return btnPeliculas;
    }

    public JButton getBtnSeries() {
        return btnSeries;
    }

    public void setLabelCategoria(String categoria) {
        this.labelCategoria.setText(categoria);
    }

    public void setLabelDuracion(String duracion) {
        this.labelDuracion.setText(duracion);
    }

    public void setLabelEpisodios(String episodios) {
        this.labelEpisodios.setText(episodios);
    }

    public JLabel getLabelIcon() {
        return labelIcon;
    }
    
    public void setLabelTemporadas(String temporadas) {
        this.labelTemporadas.setText(temporadas);
    }

    public void setLabelTitulo(String titulo) {
        this.labelTitulo.setText(titulo);
    }

    public void setLabelDescripcion(String areaTxtDescripcion) {
        this.labelDescripcion.setText(areaTxtDescripcion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelEpisodios = new javax.swing.JLabel();
        labelTemporadas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelDescripcion = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVista = new javax.swing.JTable();
        btnPeliculas = new javax.swing.JButton();
        btnSeries = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 36, 64));

        labelTitulo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Titulo");

        labelIcon.setForeground(new java.awt.Color(255, 255, 255));
        labelIcon.setOpaque(true);

        labelCategoria.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        labelCategoria.setText("categoria");

        labelDuracion.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(255, 255, 255));
        labelDuracion.setText("Duracion");

        labelEpisodios.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        labelEpisodios.setForeground(new java.awt.Color(255, 255, 255));
        labelEpisodios.setText("Episodios");

        labelTemporadas.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        labelTemporadas.setForeground(new java.awt.Color(255, 255, 255));
        labelTemporadas.setText("Temporada");

        labelDescripcion.setEditable(false);
        labelDescripcion.setBackground(new java.awt.Color(37, 36, 64));
        labelDescripcion.setColumns(20);
        labelDescripcion.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setLineWrap(true);
        labelDescripcion.setRows(5);
        labelDescripcion.setText("Descripcion");
        labelDescripcion.setWrapStyleWord(true);
        labelDescripcion.setBorder(null);
        labelDescripcion.setFocusable(false);
        jScrollPane2.setViewportView(labelDescripcion);

        btnNuevo.setBackground(new java.awt.Color(37, 36, 64));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnNuevo.setForeground(java.awt.Color.white);
        btnNuevo.setText("+");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNuevo.setOpaque(true);

        btnEliminar.setBackground(new java.awt.Color(37, 36, 64));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEliminar.setForeground(java.awt.Color.white);
        btnEliminar.setText(" - ");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEpisodios)
                    .addComponent(labelTemporadas))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategoria)
                            .addComponent(labelDuracion))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnEliminar)))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jPanel2.setBackground(new java.awt.Color(45, 44, 85));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaVista.setToolTipText("");
        tablaVista.setRequestFocusEnabled(false);
        tablaVista.setShowGrid(false);
        jScrollPane1.setViewportView(tablaVista);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 653, 126));

        btnPeliculas.setBackground(new java.awt.Color(187, 190, 239));
        btnPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPeliculas.setText("Peliculas");
        jPanel2.add(btnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, 42));

        btnSeries.setBackground(new java.awt.Color(187, 190, 239));
        btnSeries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeries.setText("Series");
        jPanel2.add(btnSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 105, 39));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 870, 320));

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnSeries;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JTextArea labelDescripcion;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelEpisodios;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTemporadas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaVista;
    // End of variables declaration//GEN-END:variables
}
