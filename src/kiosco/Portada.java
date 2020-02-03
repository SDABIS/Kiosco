/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosco;

import datos.Actuacion;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Portada extends javax.swing.JPanel {

    private Ventana v;
    private ArrayList<Actuacion> actuaciones;

    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }
    
    
    
    public Portada(ArrayList<Actuacion> actuaciones) {
        initComponents();
        this.actuaciones = actuaciones;
        
        colocarEtiquetas();
    }
    
    public void colocarEtiquetas() {
        FechahoraTortuga.setText(actuaciones.get(0).getFechahora());
        FechahoraBella.setText(actuaciones.get(1).getFechahora());
        FechahoraFundacion.setText(actuaciones.get(2).getFechahora());
        
        precioTortuga.setText(Double.toString(actuaciones.get(0).getPrecio()) + " €");
        precioBella.setText(Double.toString(actuaciones.get(1).getPrecio()) + " €");
        precioFundacion.setText(Double.toString(actuaciones.get(2).getPrecio()) + " €");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTodas = new javax.swing.JButton();
        panelTortuga = new javax.swing.JPanel();
        lbTortuga = new javax.swing.JLabel();
        imgTortuga = new javax.swing.JLabel();
        FechahoraTortuga = new javax.swing.JLabel();
        precioTortuga = new javax.swing.JLabel();
        panelBella = new javax.swing.JPanel();
        imgBella = new javax.swing.JLabel();
        lbBella = new javax.swing.JLabel();
        FechahoraBella = new javax.swing.JLabel();
        precioBella = new javax.swing.JLabel();
        panelFundacion = new javax.swing.JPanel();
        imgFundacion = new javax.swing.JLabel();
        lbFundacion = new javax.swing.JLabel();
        FechahoraFundacion = new javax.swing.JLabel();
        precioFundacion = new javax.swing.JLabel();
        panelImpro = new javax.swing.JPanel();
        imgImpro = new javax.swing.JLabel();
        lbImpro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Estas son las obras destacadas de la semana:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        btnTodas.setBackground(new java.awt.Color(100, 100, 220));
        btnTodas.setText("Ver todas");
        btnTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasActionPerformed(evt);
            }
        });
        add(btnTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 330, -1));

        panelTortuga.setBackground(new java.awt.Color(180, 180, 180));
        panelTortuga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTortuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTortugaMouseClicked(evt);
            }
        });
        panelTortuga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTortuga.setBackground(new java.awt.Color(0, 0, 255));
        lbTortuga.setForeground(new java.awt.Color(0, 0, 255));
        lbTortuga.setText("Tortuga");
        lbTortuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTortugaMouseClicked(evt);
            }
        });
        panelTortuga.add(lbTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        imgTortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fundacion-caja-castellon-tortuga.jpg"))); // NOI18N
        imgTortuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTortugaMouseClicked(evt);
            }
        });
        panelTortuga.add(imgTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        FechahoraTortuga.setText("(FECHAHORA)");
        panelTortuga.add(FechahoraTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        precioTortuga.setText("(PRECIO)");
        panelTortuga.add(precioTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        add(panelTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 290));

        panelBella.setBackground(new java.awt.Color(180, 180, 180));
        panelBella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBellaMouseClicked(evt);
            }
        });
        panelBella.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bellabestia.jpg"))); // NOI18N
        imgBella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBellaMouseClicked(evt);
            }
        });
        panelBella.add(imgBella, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 180));

        lbBella.setBackground(new java.awt.Color(0, 0, 255));
        lbBella.setForeground(new java.awt.Color(0, 0, 255));
        lbBella.setText("La bella y la bestia");
        lbBella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBellaMouseClicked(evt);
            }
        });
        panelBella.add(lbBella, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        FechahoraBella.setText("(FECHAHORA)");
        panelBella.add(FechahoraBella, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        precioBella.setText("(PRECIO)");
        panelBella.add(precioBella, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        add(panelBella, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, 290));

        panelFundacion.setBackground(new java.awt.Color(180, 180, 180));
        panelFundacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFundacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFundacionMouseClicked(evt);
            }
        });
        panelFundacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgFundacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/La_fundacion.jpg"))); // NOI18N
        imgFundacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgFundacionMouseClicked(evt);
            }
        });
        panelFundacion.add(imgFundacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbFundacion.setBackground(new java.awt.Color(0, 0, 255));
        lbFundacion.setForeground(new java.awt.Color(0, 0, 255));
        lbFundacion.setText("La Fundación");
        lbFundacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFundacionMouseClicked(evt);
            }
        });
        panelFundacion.add(lbFundacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        FechahoraFundacion.setText("(FECHAHORA)");
        panelFundacion.add(FechahoraFundacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        precioFundacion.setText("(PRECIO)");
        panelFundacion.add(precioFundacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        add(panelFundacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, 290));

        panelImpro.setBackground(new java.awt.Color(180, 180, 180));
        panelImpro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelImproMouseClicked(evt);
            }
        });
        panelImpro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgImpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impro.jpg"))); // NOI18N
        imgImpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgImproMouseClicked(evt);
            }
        });
        panelImpro.add(imgImpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbImpro.setBackground(new java.awt.Color(0, 0, 255));
        lbImpro.setForeground(new java.awt.Color(0, 0, 255));
        lbImpro.setText("Improvisación");
        lbImpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImproMouseClicked(evt);
            }
        });
        panelImpro.add(lbImpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("ACTUACIÓN ESPECIAL");
        panelImpro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("¡PUEDES PARTICIPAR!");
        panelImpro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        add(panelImpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasActionPerformed
        this.v.getContentPane().setVisible(false);
        Obras pl =new Obras(this, actuaciones);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_btnTodasActionPerformed

    private void lbTortugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTortugaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(0));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_lbTortugaMouseClicked

    private void imgTortugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTortugaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(0));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_imgTortugaMouseClicked

    private void imgBellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBellaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(1));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_imgBellaMouseClicked

    private void lbBellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBellaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(1));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_lbBellaMouseClicked

    private void imgFundacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFundacionMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(2));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_imgFundacionMouseClicked

    private void lbFundacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFundacionMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(2));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_lbFundacionMouseClicked

    private void imgImproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgImproMouseClicked
        this.v.getContentPane().setVisible(false);
        Impro pl =new Impro(this);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_imgImproMouseClicked

    private void lbImproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImproMouseClicked
        this.v.getContentPane().setVisible(false);
        Impro pl =new Impro(this);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_lbImproMouseClicked

    private void panelTortugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTortugaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(0));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_panelTortugaMouseClicked

    private void panelFundacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFundacionMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(2));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_panelFundacionMouseClicked

    private void panelImproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelImproMouseClicked
        this.v.getContentPane().setVisible(false);
        Impro pl =new Impro(this);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_panelImproMouseClicked

    private void panelBellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBellaMouseClicked
        this.v.getContentPane().setVisible(false);
        Espectaculo pl =new Espectaculo(this, actuaciones.get(1));
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_panelBellaMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechahoraBella;
    private javax.swing.JLabel FechahoraFundacion;
    private javax.swing.JLabel FechahoraTortuga;
    private javax.swing.JButton btnTodas;
    private javax.swing.JLabel imgBella;
    private javax.swing.JLabel imgFundacion;
    private javax.swing.JLabel imgImpro;
    private javax.swing.JLabel imgTortuga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbBella;
    private javax.swing.JLabel lbFundacion;
    private javax.swing.JLabel lbImpro;
    private javax.swing.JLabel lbTortuga;
    private javax.swing.JPanel panelBella;
    private javax.swing.JPanel panelFundacion;
    private javax.swing.JPanel panelImpro;
    private javax.swing.JPanel panelTortuga;
    private javax.swing.JLabel precioBella;
    private javax.swing.JLabel precioFundacion;
    private javax.swing.JLabel precioTortuga;
    // End of variables declaration//GEN-END:variables

}
