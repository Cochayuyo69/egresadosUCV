package datos;

public class DatosEgresados {
    //Tiene Grado	Resolución Grado	Tiene Título	Resolución Título
    private String codigoUCV;
    private String NombreIE = "UNIVERSIDAD CÉSAR VALLEJO";
    private int filial;
    private String Carrera = "INGENIERIA DE SISTEMAS";
    private String estTrabajo;
    private int areaTrabajo;
    private String apellidoP;
    private String apellidoM;
    private String nombres;
    private String correo;
    private String tele1, tele2, tele3;
    private int Operador1, Operador2, Operador3;
    private String añoEgreso;
    private String semestreEgreso;
    private String tipoDocIdenti;
    private String numDocIdenti;
    private String estGrado;
    private String reGrado;
    private String estTitulo;
    private String reTitulo;
    //Constructores 
    public DatosEgresados(){
        
    }

    public DatosEgresados(String codigoUCV, int filial, String estTrabajo, int areaTrabajo, String apellidoP, String apellidoM, String nombres, String correo, String tele1, String tele2, String tele3, int Operador1, int Operador2, int Operador3, String añoEgreso, String semestreEgreso, String tipoDocIdenti, String numDocIdenti, String estGrado, String reGrado, String estTitulo, String reTitulo) {
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
        this.Operador1 = Operador1;
        this.Operador2 = Operador2;
        this.Operador3 = Operador3;
        this.añoEgreso = añoEgreso;
        this.semestreEgreso = semestreEgreso;
        this.tipoDocIdenti = tipoDocIdenti;
        this.numDocIdenti = numDocIdenti;
        this.estGrado = estGrado;
        this.reGrado = reGrado;
        this.estTitulo = estTitulo;
        this.reTitulo = reTitulo;
    }

    public String getCodigoUCV() {
        return codigoUCV;
    }

    public void setCodigoUCV(String codigoUCV) {
        this.codigoUCV = codigoUCV;
    }

    public String getNombreIE() {
        return NombreIE;
    }

    public void setNombreIE(String NombreIE) {
        this.NombreIE = NombreIE;
    }

    public Integer getFilial() {
        if (filial == 0) {
            return null;
        } else {
            return filial;
        }
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getEstTrabajo() {
        return estTrabajo;
    }

    public void setEstTrabajo(String estTrabajo) {
        this.estTrabajo = estTrabajo;
    }

    public int getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(int areaTrabajo) {
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

    public int getOperador1() {
        return Operador1;
    }

    public void setOperador1(int Operador1) {
        this.Operador1 = Operador1;
    }

    public int getOperador2() {
        return Operador2;
    }

    public void setOperador2(int Operador2) {
        this.Operador2 = Operador2;
    }

    public int getOperador3() {
        return Operador3;
    }

    public void setOperador3(int Operador3) {
        this.Operador3 = Operador3;
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
