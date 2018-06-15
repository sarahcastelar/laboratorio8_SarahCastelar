/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_sarahcastelar;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pieza {
    
    private String nombre;
    private int tiempoEjecucion;
    private ArrayList <Pieza> piezasHijas = new ArrayList();

    public Pieza() {
    }

    public Pieza(String nombre, int tiempoEjecucion) {
        this.nombre = nombre;
        this.tiempoEjecucion = tiempoEjecucion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public ArrayList<Pieza> getPiezasHijas() {
        return piezasHijas;
    }

    public void setPiezasHijas(ArrayList<Pieza> piezasHijas) {
        this.piezasHijas = piezasHijas;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
    
}
