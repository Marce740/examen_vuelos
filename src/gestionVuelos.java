import java.util.Scanner;

public class GestionVuelos {

    private Vuelos[] vuelos;

    public GestionVuelos(){
        vuelos = new Vuelos[3];
        for(int i = 0; i< vuelos.length;i++){
            if(i == 0){
                vuelos[0] = null;
            }
            else if(i == vuelos.length-1){
                vuelos[i] = null;
            }
            else if(i%2==0 && vuelos[i] == null ){
                vuelos[i] = new Nacionales();
            }
            else if (i%2 != 0 && vuelos[i] == null) {
                vuelos[i]= new Internacionales();
            }

        }
    }

    public GestionVuelos(int x){
        vuelos = new Vuelos[x];
        for(int i = 0; i< vuelos.length;i++){
            if(i == 0){
                vuelos[0] = null;
            }
            else if(i%2==0 && vuelos[i] == null){
                vuelos[i] = new Nacionales();
            }
            else if (i%2 != 0 && vuelos[i] == null) {
                vuelos[i]= new Internacionales();
            }
            else if(i == vuelos.length-1){
                vuelos[i] = null;
            }
        }
    }

    public void mostrarVuelos(){
        for(int i = 0; i< vuelos.length; i++){
            System.out.println(vuelos[i]);
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

    public int hayHueco(){
        int pos = -1;
        for(int i = 0; i<vuelos.length && pos ==-1 ; i++){
            if (vuelos[i] == null){
                pos = i;
            }
        }
        return pos;
    }

    public void addVuelo(Vuelos vuelo){
        int pos = hayHueco();
        if (pos != -1){
            vuelos[pos] = vuelo;
        }

    }


    public Vuelos altaVuelo(){

        Vuelos vueloNuevo = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1 para internacionales o 2 para Nacionales");
        int opcion = sc.nextInt();
        System.out.println("Introduce el id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Introduce el origen:");
        String origen = sc.nextLine();
        System.out.println("Introduce el destino:");
        String destino = sc.nextLine();
        System.out.println("Introduce el dia del vuelo:");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes del vuelo:");
        int mes = sc.nextInt();
        System.out.println("Introduce el año del vuelo");
        int anio = sc.nextInt();
        System.out.println("Introduce el # de pasajeros");
        int pasajeros = sc.nextInt();
        System.out.println("Introduce el precio");
        double precio = sc.nextDouble();

        switch(opcion){
            case 1: //Internacionales
                System.out.println("Introduce numero de escalas");
                int escala = sc.nextInt();
                System.out.println("Introduce en qué paises hará escalas:");
                String paisesEscala = sc.nextLine();
                vueloNuevo = new Internacionales(id, nombre, origen, destino, new Fecha(dia, mes, anio),pasajeros,precio,escala,paisesEscala);
                break;

            case 2: //Nacionales
                vueloNuevo = new Nacionales(id, nombre, origen, destino, new Fecha(dia, mes, anio), pasajeros, precio);
            default:
                System.out.println("Introduce una opcion valida");

        }

        return vueloNuevo;
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





}
