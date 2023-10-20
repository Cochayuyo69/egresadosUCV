
package datos;

public class Datos {
    private String codigoUCV;
    private String Apellidos;
    private String correo;
    private String nacionalidad;
    private int tel;
    private String labura;
    //Constructores 
    public Datos() {
    }
    public Datos(String codigoUCV, String Apellidos, String correo, String nacionalidad, int tel, String labura) {
        this.codigoUCV = codigoUCV;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.tel = tel;
        this.labura=labura;
    }
    //getter and setter

    public String getCodigoUCV() {
        return codigoUCV;
    }

    public void setCodigoUCV(String codigoUCV) {
        this.codigoUCV = codigoUCV;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getLabura() {
        return labura;
    }

    public void setLabura(String labura) {
        this.labura = labura;
    }
    
}
