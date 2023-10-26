
package datos;

public class Datos {
    //Tiene Grado	Resolución Grado	Tiene Título	Resolución Título
    private String codigoUCV;
    private String NombreIE = "UNIVERSIDAD CÉSAR VALLEJO";
    private String filial;
    private String Carrera = "INGENIERIA DE SISTEMAS";
    private String estTrabajo;
    private String areaTrabajo;
    private String apellidoP;
    private String apellidoM;
    private String nombres;
    private String correo;
    private String tele1, tele2, tele3;
    private String añoEgreso;
    private String semestreEgreso;
    private String tipoDocIdenti;
    private String numDocIdenti;
    private String estGrado;
    private String reGrado;
    private String estTitulo;
    private String reTitulo;
    //Constructores 
    public Datos(){
        
    }
    
    public Datos(String codigoUCV, String filial, String estTrabajo, String areaTrabajo, String apellidoP, String apellidoM, String nombres, String correo, String tele1, String tele2, String tele3, String añoEgreso, String semestreEgreso, String tipoDocIdenti, String numDocIdenti, String estGrado, String reGrado, String estTitulo, String reTitulo) {
        this.codigoUCV = codigoUCV;
        this.filial = filial;
        this.estTrabajo = estTrabajo;
        this.areaTrabajo = areaTrabajo;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nombres = nombres;
        this.correo = correo;
        this.tele1 = tele1;
        this.tele2 = tele2;
        this.tele3 = tele3;
        this.añoEgreso = añoEgreso;
        this.semestreEgreso = semestreEgreso;
        this.tipoDocIdenti = tipoDocIdenti;
        this.numDocIdenti = numDocIdenti;
        this.estGrado = estGrado;
        this.reGrado = reGrado;
        this.estTitulo = estTitulo;
        this.reTitulo = reTitulo;
    }

    public String getNombreIE() {
        return NombreIE;
    }

    public void setNombreIE(String NombreIE) {
        this.NombreIE = NombreIE;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCodigoUCV() {
        return codigoUCV;
    }

    public void setCodigoUCV(String codigoUCV) {
        this.codigoUCV = codigoUCV;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getEstTrabajo() {
        return estTrabajo;
    }

    public void setEstTrabajo(String estTrabajo) {
        this.estTrabajo = estTrabajo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTele1() {
        return tele1;
    }

    public void setTele1(String tele1) {
        this.tele1 = tele1;
    }

    public String getTele2() {
        return tele2;
    }

    public void setTele2(String tele2) {
        this.tele2 = tele2;
    }

    public String getTele3() {
        return tele3;
    }

    public void setTele3(String tele3) {
        this.tele3 = tele3;
    }

    public String getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(String añoEgreso) {
        this.añoEgreso = añoEgreso;
    }

    public String getSemestreEgreso() {
        return semestreEgreso;
    }

    public void setSemestreEgreso(String semestreEgreso) {
        this.semestreEgreso = semestreEgreso;
    }

    public String getTipoDocIdenti() {
        return tipoDocIdenti;
    }

    public void setTipoDocIdenti(String tipoDocIdenti) {
        this.tipoDocIdenti = tipoDocIdenti;
    }

    public String getNumDocIdenti() {
        return numDocIdenti;
    }

    public void setNumDocIdenti(String numDocIdenti) {
        this.numDocIdenti = numDocIdenti;
    }

    public String getEstGrado() {
        return estGrado;
    }

    public void setEstGrado(String estGrado) {
        this.estGrado = estGrado;
    }

    public String getReGrado() {
        return reGrado;
    }

    public void setReGrado(String reGrado) {
        this.reGrado = reGrado;
    }

    public String getEstTitulo() {
        return estTitulo;
    }

    public void setEstTitulo(String estTitulo) {
        this.estTitulo = estTitulo;
    }

    public String getReTitulo() {
        return reTitulo;
    }

    public void setReTitulo(String reTitulo) {
        this.reTitulo = reTitulo;
    }
}
