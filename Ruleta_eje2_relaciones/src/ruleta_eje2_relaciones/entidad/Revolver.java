/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
 */
package ruleta_eje2_relaciones.entidad;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    /**
     * 
     *llenarRevolver(): le pone los valores de posición actual y de posición
     * del agua. Los valores son aleatorios.
     * @param posicionActual
     * @param posicionAgua
     */
    
  
 public Revolver(int posicionActual, int posicionAgua) {
        this. posicionActual =  posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    public Revolver(){
        this.posicionActual =(int) (Math.random() * 6 + 1);
        this.posicionAgua = (int) (Math.random() * 6 + 1);////entre 1 y 6 en realidad es entre 0 y 7 sin incluir el 7
    }
    


    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

/**
     * devuelve true si la posición del agua coincide con la posición actual
     *
     * @return true o false
     */
    public boolean mojar() {
        return posicionAgua == posicionActual;

    }
    /**
     * cambia a la siguiente posición del tambor
     */
    public void siguienteChorro() {

        if (posicionActual == 6) {
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }
    @Override
    public String toString() {
        return "\nRevolver:" + "\nPosicion Actual del Tambor: " + posicionActual+ " Posicion del Proyectil: " + posicionAgua;

    } 

}
