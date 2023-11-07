package sistemacontable.formularioprincipal;

public class RegistroUsuariosClass {

    String usuario;
    long fecha;
    long actividad;


    public RegistroUsuariosClass () {
    }

    public RegistroUsuariosClass (String usuario, long fecha, long actividad) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public String getUsuario () {
        return usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public long getFecha () {
        return fecha;
    }

    public void setFecha (long fecha) {
        this.fecha = fecha;
    }

    public long getActividad () {
        return actividad;
    }

    public void setActividad (long actividad) {
        this.actividad = actividad;
    }
}
