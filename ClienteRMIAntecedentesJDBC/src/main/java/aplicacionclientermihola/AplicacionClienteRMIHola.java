/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionclientermihola;

import gui.GUIMenu;
import java.rmi.Naming;
import model.IServiciosAntecedentesPenales;

/**
 *
 * @author Estudiantes
 */
public class AplicacionClienteRMIHola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            IServiciosAntecedentesPenales model = (IServiciosAntecedentesPenales)Naming.lookup("//192.168.16.13/ServidorAntecedentes");
            GUIMenu gui = new GUIMenu(model);
            gui.show();
        }catch(Exception e){
            System.out.println("Error! : " + e);
        }
    }
}
