public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia,int mes, int year){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dia);
        sb.append("/");
        sb.append(mes);
        sb.append("/");
        sb.append(year);
        return sb.toString();
    }
}
