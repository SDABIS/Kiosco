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
public class Kiosco {

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Actuacion> actuaciones = new ArrayList<>();
        
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga.jpg", "Tortuga", "Teatro", "Infantil", "Una obra para niños sobre la importancia de la amistad.", "25/10/2019 17:00", 150, 200, 50, 5));
        actuaciones.add(new Actuacion("/Imagenes/bellabestia.jpg", "La Bella y la Bestia", "Musical", "Drama", "Musical basado en la famosa película de Disney.", "21/11/2019 22:00", 8, 112, 21, 10));
        actuaciones.add(new Actuacion("/Imagenes/La_fundacion.jpg", "La Fundación", "Teatro", "Drama", "Interpretación de la obra teatral de Buero Vallejo.", "28/11/2019 17:00", 100, 12, 3, 8));
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga", "Charla sobre la Segunda Guerra Mundial", "Charla", "Educativo", "Charla sobre las implicaciones de este conflicto.", "11/12/2019 17:00", 120, 79, 31, 2));
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga", "Filarmónica de Londres", "Concierto", "Cultural", "Este colectivo musical interpretarán piezas clásicas.", "28/10/2019 17:00", 100, 12, 3, 8));
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga", "Monólogo de Juan Rodríguez", "Monólogo", "Comedia", "El famoso cómico comenta asuntos de actualidad.", "28/11/2019 17:00", 91, 19, 10, 15));
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga", "La Fundación", "Teatro", "Drama", "Interpretación de la obra teatral de Buero Vallejo.", "28/11/2019 17:00", 100, 12, 3, 8));
        actuaciones.add(new Actuacion("/Imagenes/fundacion-caja-castellon-tortuga", "La Fundación", "Teatro", "Drama", "Interpretación de la obra teatral de Buero Vallejo.", "28/11/2019 17:00", 100, 12, 3, 8));
        
        
        Bienvenido panelB =new Bienvenido(actuaciones);
        Ventana v = new Ventana();
        panelB.setV(v);
        v.setContentPane(panelB);
        v.setVisible(true);
        
        
    }
    
}
