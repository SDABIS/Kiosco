/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosco;

import datos.Actuacion;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Impro extends javax.swing.JPanel {

    private Ventana v;
    private javax.swing.JPanel padre;
    private Actuacion a;

    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }
    public Impro(javax.swing.JPanel padre) {
        initComponents();
        this.padre = padre;
        this.a = new Actuacion("/Imagenes/impro.jpg", "La Fundación", "Especial", "Improvisación", "<html>¡Apúntate, y tendrás el escenario<br> durante 5 a 15 minutos para lo que tú quieras!</html>", "Todos los domingos, a partir de las 17:00", 0, 0, 0, 0);
        
        colocarEtiquetas();
    }
    
    public void colocarEtiquetas() {
        lbNombre.setText(a.getNombre());
        lbTipo.setText(a.getTipo());
        lbGenero.setText(a.getGenero());
        lbDescripcion.setText(a.getDescripcion());
        lbFechahora.setText(a.getFechahora());
        
        lbAforo.setText("Libre");
        lbPrecio.setText("Gratis");
        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource(a.getImagen())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgEspectaculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnApuntarse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        lbFechahora = new javax.swing.JLabel();
        lbAforo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impro.jpg"))); // NOI18N
        add(imgEspectaculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("IMPROVISACIÓN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        btnAtras.setBackground(new java.awt.Color(255, 200, 100));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));

        btnApuntarse.setBackground(new java.awt.Color(100, 255, 100));
        btnApuntarse.setText("APUNTARSE A LA IMPROVISACIÓN");
        btnApuntarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApuntarseActionPerformed(evt);
            }
        });
        add(btnApuntarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 500, -1));

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Precio (Adulto):");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setText("Tipo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel13.setText("Descripción:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel14.setText("Fecha y hora:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel15.setText("Aforo disponible:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel16.setText("Género:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lbPrecio.setText("(PRECIO)");
        jPanel1.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lbNombre.setText("(NOMBRE)");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lbTipo.setText("(TIPO)");
        jPanel1.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lbGenero.setText("(GENERO)");
        jPanel1.add(lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lbDescripcion.setText("(DESCRIPCION)");
        jPanel1.add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        lbFechahora.setText("(FECHAHORA)");
        jPanel1.add(lbFechahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lbAforo.setText("(AFORO)");
        jPanel1.add(lbAforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 500, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.v.getContentPane().setVisible(false);
        padre.setVisible(true);
        v.setContentPane(padre);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApuntarseActionPerformed
        this.v.getContentPane().setVisible(false);
        ApuntarseImpro pl =new ApuntarseImpro(this);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_btnApuntarseActionPerformed

    public JPanel getPadre() {
        return padre;
    }

    public void setPadre(JPanel padre) {
        this.padre = padre;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApuntarse;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel imgEspectaculo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAforo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbFechahora;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTipo;
    // End of variables declaration//GEN-END:variables
}
