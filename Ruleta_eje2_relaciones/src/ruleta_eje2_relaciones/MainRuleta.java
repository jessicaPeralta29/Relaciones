/*


 */
package ruleta_eje2_relaciones;

import ruleta_eje2_relaciones.servicio.Juego;

public class MainRuleta {

    public static void main(String[] args) {

        Juego rs = new Juego();

        rs.llenarJuego();
        rs.ronda();

    }

}
