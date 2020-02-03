/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import datos.Actuacion;
import javax.swing.table.*;
/**
 *
 * @author Usuario
 */

public class ModeloTablaObras extends AbstractTableModel{
    private java.util.List<Actuacion> obras;

    public ModeloTablaObras(){
        this.obras = new java.util.ArrayList<>();
    }

    public int getColumnCount (){
        return 5;
    }

    public int getRowCount(){
        return obras.size();
    }

    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "Tipo"; break;
            case 2: nombre= "Género"; break;
            case 3: nombre= "Precio (Adulto)"; break;
            case 4: nombre= "Fecha y hora"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
            case 3: clase= java.lang.String.class; break;
            case 4: clase=java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= obras.get(row).getNombre(); break;
            case 1: resultado= obras.get(row).getTipo(); break;
            case 2: resultado=obras.get(row).getGenero();break;
            case 3: resultado= Double.toString(obras.get(row).getPrecio());break;
            case 4: resultado=obras.get(row).getFechahora();break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Actuacion> obras){
        this.obras=obras;
        fireTableDataChanged();
    }

    public Actuacion obtenerObra(int i){
        return this.obras.get(i);
    }

}
