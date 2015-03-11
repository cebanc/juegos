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
public class Juego {
    private String titulo;
    private int año;
    private Amigo amigo;

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Juego() {
        this.titulo="Sin asignar";
        this.año=2015;
    }
    
    public Juego(String nombre) {
        this.titulo=nombre;
        this.año=2015;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return titulo + " (" + año + ')';
    }
    
}
