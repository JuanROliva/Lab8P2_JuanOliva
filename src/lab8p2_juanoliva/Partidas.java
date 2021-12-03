package lab8p2_juanoliva;

import java.util.ArrayList;
import java.util.Date;

public class Partidas {
    private String nombre;
    private Date fechaCreacion;
    private ArrayList<Estrella> estrallas = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private int distanciaRecorrida;

    public Partidas() {
    }

    public Partidas(String nombre, Date fechaCreacion, int distanciaRecorrida) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Estrella> getEstrallas() {
        return estrallas;
    }

    public void setEstrallas(ArrayList<Estrella> estrallas) {
        this.estrallas = estrallas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
