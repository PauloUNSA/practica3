public class Persona {//implements Comparable {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getPriority() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre+"-"+edad+" años";
    }
}
