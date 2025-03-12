import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tester {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //1. Constructor array

        gestionVuelos vuelos = new gestionVuelos();

        System.out.println("Introduce numero para el array vuelos:");

        int x = lector.nextInt();
        lector.nextLine();
        vuelos.setGestionVuelos(x);

        //2. Mostrar la info de los vuelos:
        vuelos.mostrarVuelos();



        //4. DAR DE ALTA UN VUELO

        vuelos.menuAlta();
        vuelos.mostrarVuelos();


        //3. Dar de baja el vuelo por id:
        System.out.println("Introduce id para dar de baja el vuelo:");
        int idba = lector.nextInt();
        lector.nextLine();
        vuelos.bajaVuelo(idba);



        //5. Mostrar listado de vuelos cuyo origen, destino y precio este dentro del rango proporcionado




        //6. Modificar el precio base de un vuelo, con el id
        System.out.println("Introduce id para borrar:");
        int idb = lector.nextInt();
        lector.nextLine();

        System.out.println("Introduce nuevo precio: ");
        double precion= lector.nextDouble();
        lector.nextLine();

        vuelos.modificarPrecio(idb, precion);

        //7.  Actualizar un vuelo indicando que hace escala, y añadiendo en que pais o paises la hacen




        //8. Eliminar vuelos con origen y destino determinado, pidiendo confirmacion




    }
}