/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import gui.Cambiable;
import java.util.ArrayList;
import logica.estuctural.Ciudadano;

/**
 *
 * @author richa
 */
public class Observer {
    
    private static Observer observer;
    private Ciudadano ultimoCiudadano;
    private ArrayList<Cambiable> ventanaEstado;


    private Observer(){
        ventanaEstado = new ArrayList<Cambiable>();
    }

    public static Observer getInstance()
    {
        if(observer==null)
            observer = new Observer();
        return observer;
    }
    public void registrarVentaniUwU(Cambiable gui){ventanaEstado.add(gui);}

    public Ciudadano getUltimoCiudadano(){return ultimoCiudadano;}

    public void setUltimoCiudadano(Ciudadano ciudadano){
        this.ultimoCiudadano = ciudadano;
        cambioEstado();
    }

    public void cambioEstado() {
        for(Cambiable gui: ventanaEstado){
            gui.cambio();
        }
    }
}
