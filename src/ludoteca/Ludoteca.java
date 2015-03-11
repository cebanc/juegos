/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludoteca;

import java.util.ArrayList;

/**
 *
 * @author papa
 */
public class Ludoteca {
    private String nombre;
    private ArrayList<Amigo> amigos;
    private ArrayList<Juego> juegos;
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public Ludoteca(String nombre) {
        this.nombre = nombre;
        amigos=new ArrayList<>();
        juegos=new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirAmigo(Amigo amigo){
        amigos.add(amigo);
    }
    public void añadirJuego(Juego juego){
        juegos.add(juego);
    }
    
     public boolean borrarAmigo(Amigo amigo){
         boolean borrado = false;
         if (this.getListaJuegosAmigo(amigo).size()==0){
             amigos.remove(amigo);
             borrado=true;
        }
        return borrado;
    }

    public boolean borrarJuego(Juego juego){
        boolean borrado = false;
        if (juego.getAmigo()==null) {
            juegos.remove(juego);
            borrado=true;
        }
        return borrado;
    }
    
    public boolean prestarJuego(Amigo amigo, Juego juego){
        int tomados=this.getListaJuegosAmigo(amigo).size();
                
        if (juego.getAmigo()== null && tomados < amigo.getMaxJuegos()) {
            juego.setAmigo(amigo);
            return true;
        } else 
            return false;                
    }
    
    public boolean devolverJuego(Juego juego){
        if (juego.getAmigo()!= null) {
            juego.setAmigo(null);
            return true;
        } else 
            return false;
    }      
    public ArrayList<Juego> getListaJuegosDisponibles(){
        ArrayList<Juego> temporal = new ArrayList<>();
        for (Juego j : this.getJuegos()) {
            if (j.getAmigo()==null)
                temporal.add(j);
        }
        return temporal; 
    }
    
    public ArrayList<Juego> getListaJuegosPrestados(){
        ArrayList<Juego> temporal = new ArrayList<>();
        for (Juego j : this.getJuegos()) {
            if (j.getAmigo()!=null)
                temporal.add(j);
        }
        return temporal; 
    }
        
    public ArrayList<Juego> getListaJuegosAmigo(Amigo amigo){
        ArrayList<Juego> temporal = new ArrayList<>();
        for (Juego j : this.getJuegos()) {
            if (j.getAmigo()!=null && j.getAmigo().getNombre()==amigo.getNombre())
                temporal.add(j);
        }
        return temporal; 
    }
    @Override
    public String toString(){
        return "Amigos: " + amigos.size() + ", juegos: " + juegos.size();
    }

}
