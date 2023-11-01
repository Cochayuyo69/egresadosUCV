package metodos;
import datos.DatosEgresados;
public class Excepciones extends DatosEgresados{
    //Excepciones Buscar
    public String exceptosBUSCAR(String codigouniversitario, String DNI){
        if (codigouniversitario.equals("")&&DNI.equals("")){
            return "Ingrese el código del estudiante o su Nº Documento de identidad.";
        }else {
            if(codigouniversitario.equals("") && DNI.length()!=8){
            return "Ingrese un N° DNI válido";
            }else if (codigouniversitario.equals("") && DNI.length()==8){return "";
            }else if (codigouniversitario.length()!=10){
                return "Ingrese un código de egresado válido";
            }else if (codigouniversitario.length()==10 && DNI.length()!=0){
                return "Ingrese solo el código del egresado o su N° DNI";
            }else if (codigouniversitario.length()==10 && DNI.length()==8){
                return "Ingrese solo el código del egresado o su N° DNI";
            }
            }
      return "";            
}
}
