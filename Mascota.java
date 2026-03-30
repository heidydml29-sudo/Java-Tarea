/*  Ejercio 1
    Heidy Mendoza
    Enunciado: Crear una clase llamada Mascota en Java que contenga los atributos nombre, especie y edad. 
    Implementar un constructor para inicializar estos datos y un método mostrarInfo() 
    que imprima la información de la mascota. */

    public class Mascota {

    // Atributos de la clase
    String nombre;
    String especie;
    int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar la información
        public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("----------------------");

    }
}


