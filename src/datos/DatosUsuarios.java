package datos;

public class DatosUsuarios {
    String USUARIO;
    String CONTRASEÑA;
    String APELLIDOS_Y_NOMBRES;
    String CORREO_ELECTRONICO;

    public DatosUsuarios() {
    }
    
    public DatosUsuarios(String USUARIO, String CONTRASEÑA, String APELLIDOS_Y_NOMBRES, String CORREO_ELECTRONICO) {
        this.USUARIO = USUARIO;
        this.CONTRASEÑA = CONTRASEÑA;
        this.APELLIDOS_Y_NOMBRES = APELLIDOS_Y_NOMBRES;
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA = CONTRASEÑA;
    }

    public String getAPELLIDOS_Y_NOMBRES() {
        return APELLIDOS_Y_NOMBRES;
    }

    public void setAPELLIDOS_Y_NOMBRES(String APELLIDOS_Y_NOMBRES) {
        this.APELLIDOS_Y_NOMBRES = APELLIDOS_Y_NOMBRES;
    }

    public String getCORREO_ELECTRONICO() {
        return CORREO_ELECTRONICO;
    }

    public void setCORREO_ELECTRONICO(String CORREO_ELECTRONICO) {
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
    }
    
}
