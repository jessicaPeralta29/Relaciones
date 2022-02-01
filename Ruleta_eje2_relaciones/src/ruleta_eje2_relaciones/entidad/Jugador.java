/*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.

 */
package ruleta_eje2_relaciones.entidad;

import java.util.Objects;

public class Jugador {

    private int ID;
    private boolean mojado;
    private String nombre; //Juan Jugador 1

    public Jugador() {
    }

    public Jugador(int ID, boolean mojado, String nombre) {
        this.ID = ID;
        this.mojado = mojado;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public boolean isMojado() {
        return mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    
    
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ID;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
  
    @Override
    public String toString() {
        String alma = "VIVO";
        if (mojado) {
            alma = "MUERTO";
        }
        return nombre + " Jugador " + ID + " " + alma;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
