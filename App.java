/*  Ejercio 1
    Heidy Mendoza
    Enunciado: Crear una clase llamada Mascota en Java que contenga los atributos nombre, especie y edad. 
    Implementar un constructor para inicializar estos datos y un método mostrarInfo() 
    que imprima la información de la mascota. */

public class App {

    public static void main(String[] args) {

        // Crear dos objetos de tipo Mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);

        // Mostrar información de las mascotas
        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}