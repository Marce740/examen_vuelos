

public abstract class Vuelos {

    private int id;
    private String nombre;
    private String origen;
    private String destino;
    private Fecha fecha;
    private int pasajeros;
    private double precio;

    public Vuelos(int id, String nombre, String origen, String destino, Fecha fecha, int pasajeros, double precio){
        this.id=id;
        this.nombre=nombre;
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
        this.pasajeros=pasajeros;
        this.precio=precio;
    }

    public Vuelos() {
        this.id=0;
        this.nombre="";
        this.origen="";
        this.destino="";
        this.fecha= new Fecha();
        this.pasajeros= 0;
        this.precio=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sc = new StringBuilder();
        sc.append("id:");
        sc.append(id);
        sc.append("origen:");
        sc.append(origen);
        sc.append(" destino:");
        sc.append(destino);
        sc.append(" fecha:");
        sc.append(fecha);
        sc.append(" pasajeros:");
        sc.append(pasajeros);
        sc.append(" precio:");
        sc.append(precio);
        return sc.toString();
    }


   public abstract double diferenciaPrecio();

}

