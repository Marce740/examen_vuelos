import java.util.Arrays;

public class Nacionales extends Vuelos {

    public Nacionales(int id, String nombre, String origen, String destino, Fecha fecha, int pasajeros, double precio){
        super();
    }

    public Nacionales() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nacionales:");
        sb.append(super.toString());
        return sb.toString();

    }


    public double diferenciaPrecio(double precio, int mes){

        if (mes == 6 ){
            precio = 0.20*precio + precio;
        } else if (mes == 7) {
            precio = 0.30*precio + precio;
        }

        return precio;
    }
}
