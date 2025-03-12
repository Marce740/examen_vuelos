import java.util.Scanner;

public class gestionVuelos {

    private Vuelos[] vuelos;

    private Vuelos vuelo;

    public gestionVuelos(){
        vuelos = new Vuelos[3];
        for(int i = 0; i< vuelos.length;i++){
            if(i%2==0 && vuelos[i] == null){
                vuelos[i] = new Nacionales();
            }
            else if (vuelos[i] ==null) {
                vuelos[i]= new Internacionales();
            }
        }
    }

    public void mostrarVuelos(){
        for(int i = 0; i< vuelos.length; i++){
            System.out.println(vuelos[i]);
        }
    }

    public void setGestionVuelos(int x){
        vuelos = new Vuelos[x];
        for(int i = 0; i< vuelos.length;i++){
            if(i%2==0 && vuelos[i] == null){
                vuelos[i] = new Nacionales();
            }
            else if (vuelos[i] ==null) {
                vuelos[i]= new Internacionales();
            }
        }
    }

    public boolean bajaVuelo(int id){

        for(int i = 0; i<vuelos.length;i++){
            if(vuelos[i].getId() == id && vuelos[i]!=null){
                vuelos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void menuAlta(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce datos para el nuevo vuelo, 1: si es internacional, 2: si es nacional, cualquier otro numero es exit");
        int a = lector.nextInt();
        lector.nextLine();
        if(a == 1){
            System.out.println("Introduce id:");
            int id = lector.nextInt();
            lector.nextLine();
            System.out.println("Introduce nombre de aerolinea:");
            String nombre = lector.nextLine();

            System.out.println("Introduce origen del vuelo:");
            String origen = lector.nextLine();

            System.out.println("Introduce destino del vuelo: ");
            String destino = lector.nextLine();

            System.out.println("Introduce por orden fecha: dia, mes, año, con enter de por medio");
            int dia = lector.nextInt();
            lector.nextLine();
            int mes = lector.nextInt();
            lector.nextLine();
            int year = lector.nextInt();
            lector.nextLine();
            Fecha fecha = new Fecha(dia, mes, year);

            System.out.println("Introduce numero de pasajeros:");
            int pasajeros = lector.nextInt();
            lector.nextLine();
            System.out.println("Introduce precio base:");
            double precio = lector.nextDouble();
            lector.nextLine();

            System.out.println("Introduce cantidad de escalas:");
            int escalas = lector.nextInt();
            lector.nextLine();

            System.out.println("Introduce los paises de escala, separado por comas");
            String paises = lector.nextLine();

            Internacionales inter = new Internacionales(id, nombre, origen, destino, fecha, pasajeros, precio, escalas, paises);



        }
        if(a == 2){
            System.out.println("Introduce id:");
            int id = lector.nextInt();
            lector.nextLine();
            System.out.println("Introduce nombre de aerolinea:");
            String nombre = lector.nextLine();

            System.out.println("Introduce origen del vuelo:");
            String origen = lector.nextLine();

            System.out.println("Introduce destino del vuelo: ");
            String destino = lector.nextLine();

            System.out.println("Introduce por orden fecha: dia, mes, año, con enter de por medio");
            int dia = lector.nextInt();
            lector.nextLine();
            int mes = lector.nextInt();
            lector.nextLine();
            int year = lector.nextInt();
            lector.nextLine();
            Fecha fecha = new Fecha(dia, mes, year);

            System.out.println("Introduce numero de pasajeros:");
            int pasajeros = lector.nextInt();
            lector.nextLine();
            System.out.println("Introduce precio base:");
            double precio = lector.nextDouble();
            lector.nextLine();

            Nacionales nac = new Nacionales(id, nombre, origen, destino, fecha, pasajeros, precio);

        }
    }


    public boolean altaVuelo(){

        for(int i = 0; i<vuelos.length;i++){
            if(i%2==0 && vuelos[i]==null){
                vuelos[i] = new Nacionales();
                return true;
            }
        }
        return false;
    }


    public boolean modificarPrecio(int id, double precio){

        for(int i = 0; i< vuelos.length; i++){
            if(vuelos[i].getId() == id && vuelos[i]!=null){
                vuelos[i].setPrecio(precio);
                return true;
            }
        }
        return false;
    }

    /*
    public boolean modificarVueloInt(int id, int escala, String pais){
        for(int i = 0; i< vuelos.length; i++){
            if(vuelos[i].getId() == id && vuelos[i]!=null && vuelo instanceof Internacionales){
                vuelos[i].getEscala() ==
                return true;
            }
        }
        return false;
    }

     */



}
