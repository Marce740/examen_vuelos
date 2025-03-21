public class Internacionales extends Vuelos {

    private int escala;
    private String paisesEscala;

    public Internacionales(int id, String nombre, String origen, String destino, Fecha fecha, int pasajeros, double precio, int escala, String paisesEscala){
        super(id,nombre,origen,destino,fecha,pasajeros,precio);
        this.escala = escala;
        this.paisesEscala = paisesEscala;
    }

    public Internacionales(){
        super();
        this.escala= 0;
        this.paisesEscala = "";
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Internacionales:");
      sb.append(super.toString());
      sb.append("# escalas:");
      sb.append(escala);
      sb.append("paises:");
      sb.append(paisesEscala);
      return sb.toString();
    }

    public double diferenciaPrecio(){

        double precioReal = 0;

        if(getFecha().getMes() == 6 || getFecha().getMes() == 7){
            precioReal = 0.25 * getPrecio() + getPrecio();
        }

        return precioReal;
    }

    /* el descuento de escalas lo tnego que poner con el descuento de arriba
    public double dctoEscalas(double precio, int escala){
        if (escala>1)
            for (int i = 0; i<escala; i++){
                precio = precio - 0.2 * precio;
            }
        return precio;

    }

     */
}
