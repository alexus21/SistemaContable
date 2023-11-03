package sistemacontable.librodiario;

public class LibroDiarioClass {

    private String cuenta;
    private int codigo;
    private double deber;
    private double haber;
    private int idPartida;


    public LibroDiarioClass () {
    }

    public LibroDiarioClass (String cuenta, int codigo, double deber, double haber, int idPartida) {
        this.cuenta = cuenta;
        this.codigo = codigo;
        this.deber = deber;
        this.haber = haber;
        this.idPartida = idPartida;
    }

    public String getCuenta () {
        return cuenta;
    }

    public void setCuenta (String cuenta) {
        this.cuenta = cuenta;
    }

    public int getCodigo () {
        return codigo;
    }

    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public double getDeber () {
        return deber;
    }

    public void setDeber (double deber) {
        this.deber = deber;
    }

    public double getHaber () {
        return haber;
    }

    public void setHaber (double haber) {
        this.haber = haber;
    }

    public int getIdPartida () {
        return idPartida;
    }

    public void setIdPartida (int idPartida) {
        this.idPartida = idPartida;
    }

    @Override
    public String toString () {
        return "LibroDiarioClass{" +
                "cuenta='" + cuenta + '\'' +
                ", codigo=" + codigo +
                ", deber=" + deber +
                ", haber=" + haber +
                ", idPartida=" + idPartida +
                '}';
    }
}
