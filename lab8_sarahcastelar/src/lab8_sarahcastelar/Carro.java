/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_sarahcastelar;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Carro extends Thread {
    
    private String nombre;
    private ArrayList <Pieza> listaPiezas = new ArrayList();
    private JTable tabla;
    private boolean vive;
    private boolean avanzar;

    
    public Carro(JTable tabla) {
        this.tabla = tabla;
        vive = true;
        avanzar = true;
    }
    
    public Carro(String nombre) {
        this.nombre = nombre;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pieza> getListaPiezas() {
        return listaPiezas;
    }

    public void setListaPiezas(ArrayList<Pieza> listaPiezas) {
        this.listaPiezas = listaPiezas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    int c = 0;
    public void run(){
        //que la tabla se va actualizando
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        while(vive){
            if (avanzar) {
                if (!listaPiezas.isEmpty()) {
                for (int i = 0; i < listaPiezas.size() - 1; i++) {
                    String row[] = {
                        listaPiezas.get(i).getNombre(),
                        listaPiezas.get(i).getTipo(),
                        String.valueOf(listaPiezas.get(i).getTiempoEjecucion())
                    };
                    m.addRow(row);
                }
                tabla.setModel(m);
            } 
                
            }
            
            
            
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
    
    
}