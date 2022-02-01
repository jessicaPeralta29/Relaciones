package ruleta_eje2_relaciones.servicio;

import java.util.ArrayList;
import java.util.Scanner;
import ruleta_eje2_relaciones.entidad.Jugador;
import ruleta_eje2_relaciones.entidad.Revolver;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
public class Juego {

    Revolver colt;

    ArrayList<Jugador> listaJugador;
    Scanner leer;
    

    public Juego() {
        this.colt = new Revolver();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaJugador = new ArrayList();
    }


    public void llenarJuego() {
        int cantJugadores;
        System.out.println("Cuantos jugadores ?");
        do {
            cantJugadores = leer.nextInt();
            if (cantJugadores > 7 || cantJugadores <= 0) {
                cantJugadores = 6;
                System.out.println("Solo pueden jugar 6");
                System.out.println("Ingrese la cantidad de jugadores nuevamente");
            }
        } while (cantJugadores > 7 || cantJugadores <= 0);

        

        for (int i = 0; i < cantJugadores; i++) {
            Jugador gamer = new Jugador();
            System.out.println("Ingrese el nombre del Jugador");
            gamer.setNombre(leer.next().toUpperCase());
            gamer.setID(i + 1);
            listaJugador.add(gamer);
        }
    }
    /**
     * cada ronda consiste en un jugador que se apunta con el revolver y aprieta
     * el gatillo. Sí el revolver tira el jugador se muere se termina el juego,
     * y los otros se rien sino se muere, se pasa al siguiente jugador hasta que
     * uno se muera. Si o si alguien se tiene que morir. Al final del juego, se
     * debe mostrar que jugador se Murio.
     */
    public void ronda() {
        boolean bandera = false;
        int cont = 1;
        Jugador gamer = new Jugador();

        do {

            for (Jugador aux : listaJugador) {
                System.out.println("**** RONDA " + cont + "******");
                cont++;
                gamer = aux;
                colt.siguienteChorro();
                if (colt.mojar()) {
                    gamer.setMojado(true);
                    bandera = true;
                    System.out.println(gamer.toString());
                    break;
                }
            }

        } while (!bandera);

    }
    public void rondados() {
//        int cont = 1;
//        Jugador j = new Jugador();
//        boolean bandera = false;
//        do {
//            for (Jugador aux : jugadores) {
//                System.out.println("RONDA "+cont);
//                cont++;
//                j = aux;
//                colt.siguienteTiro();
//                if (colt.muerto()) {
//                    j.setMuerto(true);
//                    bandera = true;
//                    System.out.println(j.toString());
//                    break;
//                }
//            }
//        } while (!bandera);
//
//    }
    }


}
//     public void armaMesa(int cantJugadores) {
//
//        if (cantJugadores > 6 || cantJugadores <= 0) {
//            cantJugadores = 6;
//        }
//
//        for (int i = 0; i < cantJugadores; i++) {
//            Jugador gamer = new Jugador();
//            gamer.setID(i + 1);
//            gamer.setMojado(false);
//           listaJugador.add(gamer);
//        }
//
//    }
