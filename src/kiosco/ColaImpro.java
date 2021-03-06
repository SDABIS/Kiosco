/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosco;

import datos.Cola;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ColaImpro extends javax.swing.JPanel {

    private String nombre;
    private Ventana v;
    private ApuntarseImpro padre;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ventana getV() {
        return v;
    }

    public void setV(Ventana v) {
        this.v = v;
    }

    public ApuntarseImpro getPadre() {
        return padre;
    }

    public void setPadre(ApuntarseImpro padre) {
        this.padre = padre;
    }
    
    /**
     * Creates new form ColaImpro
     */
    public ColaImpro(String nombre, ApuntarseImpro padre) {
        initComponents();
        this.nombre = nombre;
        this.padre = padre;
        
        lbNombre.setText(nombre);
        lbSiguiente.setVisible(false);
        lbCola.setVisible(false);
        panelCola.setVisible(false);
        imprimirCola();
    }
    
    public void imprimirCola() {
        ArrayList<String> cola = Cola.getCola();
        if(cola.size() == 0) {
            lbSiguiente.setVisible(true);
        }
        else {
            lbCola.setVisible(true);
            panelCola.setVisible(true);
            String textoCola = "<html>";
            int i;
            for(i = 0; i<cola.size(); i++) {
                textoCola += (i + 1) + ". " + cola.get(i) + "<br>";
            }
            textoCola += (i + 1) + ". Tu (" + nombre + ")</html>"; 
            lbElementosCola.setText(textoCola);
            
        }
        cola.add(nombre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnPortada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbSiguiente = new javax.swing.JLabel();
        lbCola = new javax.swing.JLabel();
        panelCola = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbElementosCola = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("¡TE HAS APUNTADO A LA IMPROVISACIÓN!");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        btnPortada.setBackground(new java.awt.Color(255, 100, 0));
        btnPortada.setText("Portada");
        btnPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortadaActionPerformed(evt);
            }
        });
        add(btnPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));

        jLabel1.setText("Te has apuntado con el siguiente nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lbNombre.setText("(NOMBRE)");
        add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        lbSiguiente.setForeground(new java.awt.Color(0, 0, 255));
        lbSiguiente.setText("¡Eres el siguiente en actuar! Prepárate, te llamarán al escenario en 15 minutos.");
        add(lbSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lbCola.setText("Este es el estado de la cola:");
        add(lbCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        panelCola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbElementosCola.setText("(ELEMENTOS)");
        jScrollPane1.setViewportView(lbElementosCola);

        panelCola.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 140));

        add(panelCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortadaActionPerformed
        this.v.getContentPane().setVisible(false);
        padre.getPadre().getPadre().setVisible(true);
        v.setContentPane(padre.getPadre().getPadre());
    }//GEN-LAST:event_btnPortadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPortada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCola;
    private javax.swing.JLabel lbElementosCola;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSiguiente;
    private javax.swing.JPanel panelCola;
    // End of variables declaration//GEN-END:variables
}
