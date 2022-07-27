public class Main {

    public static void main(String[] args) {


        // Llamando la función para sumar 3 números
        int total_suma = suma(2, 3, 4);
        System.out.println(total_suma);

        // Crear instancia de un coche y añadir una puerta
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println(miCoche.puertas);

    }

    // Función para sumar 3 números
    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class Coche {
    public  int puertas = 0;

    public void addPuerta() {
        this.puertas++;
    }

}