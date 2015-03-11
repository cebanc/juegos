/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludoteca;

/**
 *
 * @author papa
 */
public class Amigo {

private String nombre;
private int maxJuegos;

public Amigo(){
    nombre="Sin asignar";
    maxJuegos=1;
}

public String getNombre(){
    return nombre;
}

public int getMaxJuegos(){
    return maxJuegos;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public void setMaxJuegos(int maxJuegos){
    this.maxJuegos=maxJuegos;
}

@Override
public String toString(){
    return this.nombre + " (" + this.maxJuegos + ")";
}

}
