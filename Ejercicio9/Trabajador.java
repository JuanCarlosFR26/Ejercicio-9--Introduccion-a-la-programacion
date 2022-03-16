package Ejercicio9;

public class Trabajador extends Persona {

    float salario;


    public Trabajador() {

    }

    public Trabajador(int edad, String nombre, int telefono, float salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
}
