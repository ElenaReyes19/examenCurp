/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curp;

import controlador.Controlador;

/**
 *
 * @author HPADMIN
 */
public class CURP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador=new Controlador();
        controlador.generarCURP();
    }
    
}
