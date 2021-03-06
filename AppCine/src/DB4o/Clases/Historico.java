package DB4o.Clases;

public class Historico {

    private String fechaEmision;
    private String horario;
    private Sala sala;
    private Empleado empleado;
    private Pelicula pelicula;

    public Historico() {

    }

    public Historico(String fechaEmision, String horario, Sala sala, Empleado empleado, Pelicula pelicula) {

        this.fechaEmision = fechaEmision;
        this.horario = horario;
        this.sala = sala;
        this.empleado = empleado;
        this.pelicula = pelicula;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}
