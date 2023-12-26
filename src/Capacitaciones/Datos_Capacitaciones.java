
package Capacitaciones;

public class Datos_Capacitaciones {
    String Area;
    String Especializacion;
    String Titulo;
    String Fecha;
    String Turno;
    String Hora;
    String Modalidad;
    String Mensaje;
    double Monto;
    
    //Constructor 
    public Datos_Capacitaciones(){};
    public Datos_Capacitaciones(String Area, String Titulo, String Fecha, String Turno, String Hora, String Modalidad, String Mensaje, double Monto) {
        this.Area = Area;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Turno = Turno;
        this.Hora = Hora;
        this.Modalidad = Modalidad;
        this.Mensaje = Mensaje;
        this.Monto = Monto;
    }
    
    //Getter and Setter

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }
    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}
