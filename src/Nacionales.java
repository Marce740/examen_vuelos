import java.util.Arrays;

public class Nacionales extends Vuelos {

    public Nacionales(int id, String nombre, String origen, String destino, Fecha fecha, int pasajeros, double precio){
        super(id,nombre,origen,destino,fecha,pasajeros,precio);
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


    public double diferenciaPrecio(){

        double precio = getPrecio();

        if (getFecha().getMes() == 6 ){
            precio = 0.20 * precio + precio;
            setPrecio(precio);
        } else if (getFecha().getMes() == 7) {
            precio = 0.30 * precio + precio;
            setPrecio(precio);
        }

        return precio;
    }
}
