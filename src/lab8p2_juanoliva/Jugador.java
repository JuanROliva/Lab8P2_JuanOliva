package lab8p2_juanoliva;
public class Jugador {
    private String nombre;
    private int velocidad;

    public Jugador() {
    }

    public Jugador(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
