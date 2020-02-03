/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import datos.Actuacion;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Timer;
import kiosco.Espectaculo;
import kiosco.Kiosco;
import kiosco.Ventana;

/**
 *
 * @author Usuario
 */
public class IntroducirDatos extends javax.swing.JPanel {

    private Ventana v;
    private ConfirmarPago padre;
    private Espectaculo ventanaEspectaculo;
    private Actuacion a;
    private double precio;
    private int totalEntradas;
    private String zona;

    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }

    public ConfirmarPago getPadre() {
        return padre;
    }

    public void setPadre(ConfirmarPago padre) {
        this.padre = padre;
    }

    public Espectaculo getVentanaEspectaculo() {
        return ventanaEspectaculo;
    }

    public void setVentanaEspectaculo(Espectaculo ventanaEspectaculo) {
        this.ventanaEspectaculo = ventanaEspectaculo;
    }

    public Actuacion getA() {
        return a;
    }

    public void setA(Actuacion a) {
        this.a = a;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public IntroducirDatos(Ventana v, ConfirmarPago padre, Espectaculo ventanaEspectaculo, Actuacion a, double precio, int totalEntradas, String zona) {
        initComponents();
        
        this.v = v;
        this.padre = padre;
        this.ventanaEspectaculo = ventanaEspectaculo;
        this.a = a;
        this.precio = precio;
        this.totalEntradas = totalEntradas;
        this.zona = zona;
        
        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource(a.getImagen())));
        lbPrecio.setText(Kiosco.round(precio, 2) + " €");
        lbError.setVisible(false);
        lbProcesando.setVisible(false);
    }
    public IntroducirDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        imgEspectaculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPin = new javax.swing.JTextField();
        lbError = new javax.swing.JLabel();
        lbProcesando = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(255, 100, 0));
        btnCancelar.setText("Cancelar compra");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 30));

        btnAtras.setBackground(new java.awt.Color(255, 200, 100));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 30));

        imgEspectaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fundacion-caja-castellon-tortuga.jpg"))); // NOI18N
        add(imgEspectaculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("INTRODUCIR PIN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(100, 255, 100));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 550, -1));

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Escribe aquí tu PIN:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbPrecio.setText("(PRECIO)");
        jPanel1.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel4.setText("El precio de tus entradas es: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 22, -1, -1));

        txtPin.setText("PIN");
        txtPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPinMouseClicked(evt);
            }
        });
        txtPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinActionPerformed(evt);
            }
        });
        jPanel1.add(txtPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 420, 150));

        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setText("Introduce un PIN válido (deben ser 4 dígitos)");
        add(lbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        lbProcesando.setForeground(new java.awt.Color(0, 255, 0));
        lbProcesando.setText("Procesando pago, por favor, espera unos segundos...");
        add(lbProcesando, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        Pattern pattern = Pattern.compile("[0-9]{4}");
        String texto = txtPin.getText();
        Matcher m = pattern.matcher(texto);
        if (!m.matches()) {
            lbError.setVisible(true);
        }
        else {
            
            lbProcesando.setVisible(true);
            lbError.setVisible(false);
            Timer timer = new Timer(2000, e -> {
                this.v.getContentPane().setVisible(false);
                Random aleatorio = new Random(System.currentTimeMillis());
                int intAleatorio = aleatorio.nextInt(100);
                if(intAleatorio < 80) {
                    Confirmacion pl =new Confirmacion(ventanaEspectaculo, a, v, totalEntradas, zona);
                    pl.setVisible(true);
                    pl.setV(this.v);
                    this.v.setContentPane(pl);
                }
                else {
                    Error pl =new Error(ventanaEspectaculo, a, v);
                    pl.setVisible(true);
                    pl.setV(this.v);
                    this.v.setContentPane(pl);
                }
            });
            
            timer.setRepeats(false);
            timer.start();
            
            
            System.out.println("aaaaaa");
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinActionPerformed

    private void txtPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPinMouseClicked
        if(txtPin.getText().equals("PIN")) {
            txtPin.setText("");
        }
    }//GEN-LAST:event_txtPinMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel imgEspectaculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbProcesando;
    private javax.swing.JTextField txtPin;
    // End of variables declaration//GEN-END:variables
}
