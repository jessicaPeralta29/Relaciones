package entdades;

import enumeradores.Palo;
import java.util.HashSet;
import java.util.Set;

public class Baraja {

    /**
     * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y
     * un palo (espadas, bastos, oros y copas). Esta clase debe contener un
     * método toString() que retorne el número de carta y el palo. La baraja
     * estará compuesta por un conjunto de cartas, 40 exactamente
     */
    
 private int numero;
    private Set<Carta> baraja;

    public Baraja(Set<Carta> baraja) {
        this.baraja = new HashSet();
        //cuatro vueltas(POR CADA PALO)
       
        for (int i = 0; i < 4; i++) {
           //Vuelta por cada carta 
            for (int j = 1; j < 13; j++) {
             //excluir 8 y 9
                if (j!=8&&j!=9) {
                   
                     {//AGREGO UNA CARTA DE CADA PALO POR VUELTA
                    this.baraja.add(new Carta(j, Palo.BASTO));
                    this.baraja.add(new Carta(j, Palo.COPA));
                    this.baraja.add(new Carta(j, Palo.ESPADA));
                    this.baraja.add(new Carta(j, Palo.ORO));
                }
            }
            
            }
            
        }
        
    }

    public Baraja() {
    }
    
    public Baraja(int numero, Set<Carta> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Set<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(Set<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "carta{"+ "numero: " + numero + "Palo" + baraja + '}';
    }
 

}


