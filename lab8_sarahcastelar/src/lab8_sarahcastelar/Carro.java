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
public class Carro {
    
    private String nombre;
    private ArrayList <Pieza> listaPiezas = new ArrayList();

    

    public Carro(String nombre) {
        this.nombre = nombre;
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
    
    
    
}
