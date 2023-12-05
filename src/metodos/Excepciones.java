package metodos;
public class Excepciones{
    
    
    //Excepciones Buscar
    public String exceptosBUSCAR(String codigouniversitario, String DNI){
        if (codigouniversitario.equals("")&&DNI.equals("")){
            return "Ingrese el código del estudiante o su Nº Documento de identidad.";
        }else {
            if(codigouniversitario.equals("") && DNI.length()!=8){
            return "Ingrese un N° DNI válido";
            }else if (codigouniversitario.equals("") && DNI.length()==8){return "";
            }else if (codigouniversitario.length()<=10 && DNI.length()>0){
                return "Ingrese solo el código del egresado o su N° DNI";
            }else if (codigouniversitario.length()!=10){
                return "Ingrese un código de egresado válido";
            
            }
            }
      return "";            
}
    //Treaemos los metodos de datos
    public String ExcepcionesGuardar(String codigo, String apellidoPa, String apellidoMa, String nom, String Correo, String tel1, 
                                    int operador1, String tel2, int operador2, String tel3, int operador3, String añoEgreso, String semestreE,String tipodoc, 
                                    String numDoc, String estadoG, String resolG, String estadoT, String resolT) {
        if(codigo.equals("") && numDoc.equals("")){
        return "Porfavor ingrese un Codigo UCV o un N° de documento";}
        if(codigo.length()<10){
        return "Porfavor ingrese un Codigo UCV válido";}
        if(numDoc.length()<8){
        return "Porfavor ingrese un N° de documento válido";}
        if(nom.equals("")){
        return "Porfavor ingrese mínimo un nombre";}
        if(apellidoPa.equals("")){
        return "Porfavor ingrese un apellido paterno";}
        if(apellidoMa.equals("")){
        return "Porfavor ingrese un apellido materno";}
        if (!Correo.endsWith("@ucvvirtual.edu.pe")) {
            return "Por favor, registre un correo universitario UCV (@ucvvirtual.edu.pe)";}
        if(Integer.parseInt(añoEgreso)>2022){
        return "Porfavor ingrese un año de egreso existente";}
        if(semestreE.equals("")){
        return "Porfavor ingrese un semestre válido";}
        if(Integer.parseInt(semestreE)>2 || Integer.parseInt(semestreE)<1){
        return "Porfavor ingrese un semestre de egreso válido\n(1 o 2)";}
        //telefonos
        if(tel1.length()<9){
        return "Porfavor coloque un N° de teléfono válido en (1° Teléfono)";}
        if(tel2.length()<9 && tel2.length()>0){
        return "Porfavor registre un N° teléfono válido para (2° Teléfono)";}
        if(tel3.length()<9 && tel3.length()>0){
        return "Porfavor registre un N° teléfono válido para (3° Teléfono)";}
        if(tel2.length()==0 && operador2!=1){
        return "(2° Teléfono) Porfavor elimine el operador o escriba un número de teléfono";}
        if(tel3.length()==0 && operador3!=1){
        return "(3° Teléfono) Porfavor elimine el operador o escriba un número de teléfono";}
        if(tel1.length()==9 && operador1==1){
        return "Porfavor elija un operador para (1° Teléfono)";}
        if(tel2.length()==9 && operador2==1){
        return "Porfavor elija un operador para (2° Teléfono)";}
        if(tel3.length()==9 && operador3==1){
        return "Porfavor elija un operador para (3° Teléfono)";}
        if(estadoG.equals("Sí") && resolG.equals("")){
        return "Porfavor escriba la resolución de grado";}
        if(estadoT.equals("Sí") && resolT.equals("")){
        return "Porfavor escriba la resolución de Título";}
        return "";
    }
}
