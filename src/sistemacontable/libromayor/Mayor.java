package sistemacontable.libromayor;

public class Mayor {
    private String codigo;
    private double deber;
    private double haber;

    String cuenta;

    public Mayor() {
    }

    public Mayor(String codigo, String cuenta) {
        this.codigo = codigo;
        this.cuenta = cuenta;
    }

    public Mayor(String codigo, double deber, double haber) {
        this.codigo = codigo;
        this.deber = deber;
        this.haber = haber;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDeber() {
        return deber;
    }

    public void setDeber(double deber) {
        this.deber = deber;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
}
