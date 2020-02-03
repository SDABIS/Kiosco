/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Currency;

/**
 *
 * @author Usuario
 */
public class Actuacion {
    private String imagen;
    private String nombre;
    private String tipo;
    private String genero;
    private String descripcion;
    private String fechahora;
    private int disponiblePatio;
    private int disponiblePalco;
    private int disponibleVR;
    private int disponibleTotal;
    private double precio;

    public Actuacion(String imagen, String nombre, String tipo, String genero, String descripcion, String fechahora, int disponiblePatio, int disponiblePalco, int disponibleVR, double precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.fechahora = fechahora;
        this.disponiblePatio = disponiblePatio;
        this.disponiblePalco = disponiblePalco;
        this.disponibleVR = disponibleVR;
        this.precio = precio;
        this.disponibleTotal = disponiblePatio + disponiblePalco + disponibleVR;
    }

    public int getDisponibleTotal() {
        return disponibleTotal;
    }

    public void setDisponibleTotal(int disponibleTotal) {
        this.disponibleTotal = disponibleTotal;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public int getDisponiblePatio() {
        return disponiblePatio;
    }

    public void setDisponiblePatio(int disponiblePatio) {
        this.disponiblePatio = disponiblePatio;
    }

    public int getDisponiblePalco() {
        return disponiblePalco;
    }

    public void setDisponiblePalco(int disponiblePalco) {
        this.disponiblePalco = disponiblePalco;
    }

    public int getDisponibleVR() {
        return disponibleVR;
    }

    public void setDisponibleVR(int disponibleVR) {
        this.disponibleVR = disponibleVR;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
