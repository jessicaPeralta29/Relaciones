/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicio.ServicioBarajas;

/**
 *
 * @author jessica
 */
public class MainBaraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  ServicioBarajas sb = new ServicioBarajas();
        
        sb.muestraBaraja();
        
        sb.ordenaBaraja();
        
        sb.barajar();
        sb.muestraBaraja();
        //sb.muestraMonton();
        sb.darCartas(8);
        
        
//        sb.darCartas(5);
//        
//        sb.muestraMonton();
        
//        sb.creaMazo();
//        sb.muestraB();
    }
    
}
