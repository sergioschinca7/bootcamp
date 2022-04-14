package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {


        funcion(1,2,3); // Llamar a la función en el main y darle valores.
        
        // Crear un objeto miCoche en el main y añadirle una puerta.
        
        Coche miCoche = new Coche(3); // el coche tiene 3 puertas
        // Mostrar el número de puertas que tiene el objeto.
        System.out.println("numero de puertas: " + miCoche.getNumeroPuertas());

        //Añado una puerta
        System.out.println("Añado una puerta: " + miCoche.puertas());


    } // fin main
    
    public static int funcion(int num1, int num2, int num3){
        
        return num1+num2+num3;
    }

} //fin class
