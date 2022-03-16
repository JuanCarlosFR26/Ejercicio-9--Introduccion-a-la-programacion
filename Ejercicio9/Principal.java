package Ejercicio9;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(25,"Juan", 600600600, 250000);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);


        Trabajador trabajador1 = new Trabajador(30, "Manuel", 601601601, 2200);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);
    }
}
