package sistemacontable.librodiario;

import java.util.List;

public class Partida {

    private int idPartida;
    private String fecha;
    private String descripcion;

    private List<LibroDiarioClass> listaCuentas;

    public Partida () {
    }

    public Partida (int idPartida, String fecha, String descripcion) {
        this.idPartida = idPartida;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Partida (int idPartida, String fecha, String descripcion, List<LibroDiarioClass> listaCuentas) {
        this.idPartida = idPartida;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.listaCuentas = listaCuentas;
    }

    public int getIdPartida () {
        return idPartida;
    }

    public void setIdPartida (int idPartida) {
        this.idPartida = idPartida;
    }

    public String getFecha () {
        return fecha;
    }

    public void setFecha (String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public List<LibroDiarioClass> getListaCuentas () {
        return listaCuentas;
    }

    public void setListaCuentas (List<LibroDiarioClass> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @Override
    public String toString () {
        return "Partida{" +
                "idPartida=" + idPartida +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
