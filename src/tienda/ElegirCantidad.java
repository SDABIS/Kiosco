/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import datos.Actuacion;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter;
import kiosco.Espectaculo;
import kiosco.Ventana;
import static java.lang.Math.round;
import kiosco.Kiosco;

/**
 *
 * @author Usuario
 */
public class ElegirCantidad extends javax.swing.JPanel {

    private Ventana v;
    private ElegirZona padre;
    private Espectaculo ventanaEspectaculo;
    private Actuacion a;
    private double precioAdulto;
    private double precioNino;
    private double precioEspecial;
    private double precioTotal;
    private int entradasMax;
    private int entradasAdulto;
    private int entradasNino;
    private int entradasEspecial;
    private int totalEntradas;
    private String zona;
    

    public ElegirCantidad(ElegirZona padre, Espectaculo VentanaEspectaculo, Actuacion a, double precio, int entradasMaximas, String zona) {
        initComponents();
        
        this.padre = padre;
        this.ventanaEspectaculo = VentanaEspectaculo;
        this.a = a;
        this.precioAdulto = precio;
        this.zona = zona;
        
        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource(a.getImagen())));
        
        precioNino = precioAdulto/2;
        precioEspecial = precioAdulto/2;
        precioTotal = 0;
        lbPrecioAdulto.setText(precioAdulto + " €");
        lbPrecioNino.setText(precioNino + " €");
        lbPrecioEspecial.setText(precioEspecial + " €");
        lbPrecioTotal.setText(Kiosco.round(precioTotal, 2) + " €");
        lbCero.setVisible(false);
        totalEntradas = 0;
        
        entradasAdulto = 0;
        entradasNino = 0;
        entradasEspecial = 0;
        
        if (entradasMaximas < 10) {
            this.entradasMax = entradasMaximas;
        } 
        else this.entradasMax = 10;
        
        lbInfo.setText("Elige un máximo de 10 entradas, pero sin superar el límite de entradas disponibles (" + entradasMaximas + ")");
        lbLimite.setVisible(false);

        JComponent comp = spAdulto.getEditor();
        JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
        DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
        formatter.setCommitsOnValidEdit(true);
        spAdulto.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = (Integer) spAdulto.getValue();
                if(num < 0) spAdulto.setValue(0);
                else if ((totalEntradas + (num - entradasAdulto)) > entradasMax){
                    spAdulto.setValue(entradasAdulto);
                    lbLimite.setVisible(true);
                }
                else {
                    totalEntradas = totalEntradas + num - entradasAdulto;
                    precioTotal += (num - entradasAdulto) * precioAdulto;
                    entradasAdulto = num;
                    lbLimite.setVisible(false);
                    lbCero.setVisible(false);
                    
                }
            lbPrecioTotal.setText(Kiosco.round(precioTotal, 2) + " €");
            }
        });
        
        JComponent comp1 = spNino.getEditor();
        JFormattedTextField field1 = (JFormattedTextField) comp1.getComponent(0);
        DefaultFormatter formatter1 = (DefaultFormatter) field1.getFormatter();
        formatter1.setCommitsOnValidEdit(true);
        spNino.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = (Integer) spNino.getValue();
                if(num < 0) spNino.setValue(0);
                else if ((totalEntradas + (num - entradasNino)) > entradasMax){
                    spNino.setValue(entradasNino);
                    lbLimite.setVisible(true);
                }
                else {
                    totalEntradas = totalEntradas + num - entradasNino;
                    precioTotal += (num - entradasNino) * precioNino;
                    entradasNino = num;
                    lbLimite.setVisible(false);
                    lbCero.setVisible(false);
                }
                lbPrecioTotal.setText(Kiosco.round(precioTotal, 2) + " €");
            }
        });
        
        JComponent comp2 = spEspecial.getEditor();
        JFormattedTextField field2 = (JFormattedTextField) comp2.getComponent(0);
        DefaultFormatter formatter2 = (DefaultFormatter) field2.getFormatter();
        formatter2.setCommitsOnValidEdit(true);
        spEspecial.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = (Integer) spEspecial.getValue();
                if(num < 0) spEspecial.setValue(0);
                else if ((totalEntradas + (num - entradasEspecial)) > entradasMax){
                    spEspecial.setValue(entradasEspecial);
                    lbLimite.setVisible(true);
                }
                else {
                    totalEntradas = totalEntradas + num - entradasEspecial;
                    precioTotal += (num - entradasEspecial) * precioEspecial;
                    entradasEspecial = num;
                    lbLimite.setVisible(false);
                    lbCero.setVisible(false);
                }
                lbPrecioTotal.setText(Kiosco.round(precioTotal, 2) + " €");
            }
        });
    }
    
    
    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }

    public Espectaculo getVentanaEspectaculo() {
        return ventanaEspectaculo;
    }

    public void setVentanaEspectaculo(Espectaculo VentanaEspectaculo) {
        this.ventanaEspectaculo = VentanaEspectaculo;
    }

    public Actuacion getA() {
        return a;
    }

    public void setA(Actuacion a) {
        this.a = a;
    }

    public double getPrecioAdulto() {
        return precioAdulto;
    }

    public void setPrecioAdulto(double precio) {
        this.precioAdulto = precio;
    }

    public JLabel getImgEspectaculo() {
        return imgEspectaculo;
    }

    public void setImgEspectaculo(JLabel imgEspectaculo) {
        this.imgEspectaculo = imgEspectaculo;
    }
    
    
    
    /**
     * Creates new form ElegirCantidad
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        imgEspectaculo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEspecial = new javax.swing.JComboBox<>();
        spEspecial = new javax.swing.JSpinner();
        spAdulto = new javax.swing.JSpinner();
        spNino = new javax.swing.JSpinner();
        lbPrecioEspecial = new javax.swing.JLabel();
        lbPrecioAdulto = new javax.swing.JLabel();
        lbPrecioNino = new javax.swing.JLabel();
        lbPrecioTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbCero = new javax.swing.JLabel();
        lbInfo2 = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        lbLimite = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setBackground(new java.awt.Color(100, 255, 100));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 550, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 100, 0));
        btnCancelar.setText("Cancelar compra");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("ELIGE CANTIDAD DE ENTRADAS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fundacion-caja-castellon-tortuga.jpg"))); // NOI18N
        add(imgEspectaculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnAtras.setBackground(new java.awt.Color(255, 200, 100));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 30));

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Especial:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Adulto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setText("Niño (Menor de 12 años):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        comboEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor de 65 años", "Víctima de terrorismo", "Víctima de violencia de género", "Discapacidad" }));
        comboEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspecialActionPerformed(evt);
            }
        });
        jPanel1.add(comboEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, -1));
        jPanel1.add(spEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, -1));

        spAdulto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spAdultoMouseClicked(evt);
            }
        });
        jPanel1.add(spAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, -1));
        jPanel1.add(spNino, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, -1));

        lbPrecioEspecial.setText("(PRECIO)");
        jPanel1.add(lbPrecioEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        lbPrecioAdulto.setText("(PRECIO)");
        jPanel1.add(lbPrecioAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        lbPrecioNino.setText("(PRECIO)");
        jPanel1.add(lbPrecioNino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 440, 140));

        lbPrecioTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPrecioTotal.setForeground(new java.awt.Color(0, 0, 255));
        lbPrecioTotal.setText("(PRECIO)");
        add(lbPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("TOTAL:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        lbCero.setForeground(new java.awt.Color(255, 0, 0));
        lbCero.setText("No puedas comprar 0 entradas.");
        add(lbCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        lbInfo2.setText("Nota: si seleccionas una entrada especial o de niño, deberás acreditarlo al mostrar entradas. ");
        add(lbInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        lbInfo.setText("Elige un máximo de 10 entradas, pero sin superar el límite de entradas disponibles ((CANTIDAD))");
        add(lbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        lbLimite.setForeground(new java.awt.Color(255, 0, 0));
        lbLimite.setText("¡Has superado el límite de entradas!");
        add(lbLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if(totalEntradas == 0) {
            lbCero.setVisible(true);
            return;
        }
        
        this.v.getContentPane().setVisible(false);
        CodigoDescuento pl =new CodigoDescuento(v, this, ventanaEspectaculo, a, precioTotal, totalEntradas, zona);
        pl.setVisible(true);
        pl.setV(this.v);
        this.v.setContentPane(pl);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.v.getContentPane().setVisible(false);
        ventanaEspectaculo.getPadre().setVisible(true);
        v.setContentPane(ventanaEspectaculo.getPadre());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       
        this.v.getContentPane().setVisible(false);
        padre.setVisible(true);
        v.setContentPane(padre);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void comboEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspecialActionPerformed
        
        double precioEspecialAnterior = precioEspecial;
        switch(comboEspecial.getSelectedIndex()) {
            case 0:
                precioEspecial = precioAdulto/2;
                break;
            case 1:
                precioEspecial = precioAdulto*0.2;
                break;
            case 2:
                precioEspecial = 0;
                break;
            case 3: precioEspecial = precioAdulto * 0.25;
        }
        
        lbPrecioEspecial.setText(precioEspecial + " €");
        precioTotal = precioTotal + (precioEspecial * entradasEspecial) - (precioEspecialAnterior * entradasEspecial);
        lbPrecioTotal.setText(Kiosco.round(precioTotal, 2) + " €");
    }//GEN-LAST:event_comboEspecialActionPerformed

    private void spAdultoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spAdultoMouseClicked
        
    }//GEN-LAST:event_spAdultoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> comboEspecial;
    private javax.swing.JLabel imgEspectaculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCero;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbInfo2;
    private javax.swing.JLabel lbLimite;
    private javax.swing.JLabel lbPrecioAdulto;
    private javax.swing.JLabel lbPrecioEspecial;
    private javax.swing.JLabel lbPrecioNino;
    private javax.swing.JLabel lbPrecioTotal;
    private javax.swing.JSpinner spAdulto;
    private javax.swing.JSpinner spEspecial;
    private javax.swing.JSpinner spNino;
    // End of variables declaration//GEN-END:variables
}
