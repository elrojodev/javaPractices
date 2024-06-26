package supermarket.hipermaxi;

public class Cliente extends Persona{

    private String nombre;

    private int edad;

    private int carnetIdentidad;

    public Cliente(String nombre, int edad, int carnetIdentidad) {
        super(nombre, carnetIdentidad);
        this.nombre = nombre;
        this.edad = edad;
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }


    public void setCarnetIdentidad(int carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }
    @Override
    public String toString() {
        return super.toString() + ", Edad: " + edad;
    }
}
