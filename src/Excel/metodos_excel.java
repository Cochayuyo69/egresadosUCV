
package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodos.Metodoss;
import org.apache.poi.ss.usermodel.Cell;
import static org.apache.poi.ss.usermodel.CellType.FORMULA;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class metodos_excel {
    Metodoss metodo= new Metodoss();
    //mETODO SI EXISTE 
    public boolean existe(String Egresado) {
    boolean existe = false;
    try {
        Connection conectar = metodo.abrirconeccion();

        String buscar = "SELECT COUNT(*) FROM EGRESADOS WHERE Codigo_de_estudiante = ?";
        PreparedStatement st = conectar.prepareStatement(buscar);
        st.setString(1, Egresado);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            existe = (count > 0); // Si count es mayor que 0, el código existe en la base de datos
        }

        conectar.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
    return existe;
}

    //por si el egresado ya existe
    public void editar(String documento, int fila_cargar) throws FileNotFoundException, IOException, SQLException{
        FileInputStream archivo = new FileInputStream(documento);
        XSSFWorkbook libro= new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        try {
            Connection conectar=metodo.abrirconeccion();
            String query = "UPDATE EGRESADOS SET Codigo_de_estudiante = ?, Nombre_de_IE = ?, id_filial = ?, Carrera = ?, Apellido_paterno = ?, Apellido_materno = ?, Nombres = ?, Correo_electronico = ?, Num_telefono = ?, Operador_1 = ?, Num_telefono2 = ?,  Operador_2 = ?, Num_telefono3 = ?,  Operador_3 = ?, Año_egreso = ?, Semestre_egreso = ?, Tipo_documento_identidad = ?, Numero_documento_identidad = ?, Tiene_Grado = ?, Resolucion_Grado = ?, Tiene_Titulo = ?, Resolucion_Titulo = ?, Estado_trabajo = ?, id_area_trabajo = ? WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?"; 
            PreparedStatement actualizar = conectar.prepareStatement(query);
            Row fila = hoja.getRow(fila_cargar);
            //numero de inicio columna no nula
            int numero_columna= fila.getLastCellNum();
            int columna_no_nula=0;
            for(int c=0; c<=numero_columna;c++){
            Cell celda=fila.getCell(c);
            if(celda != null){
                columna_no_nula=c;break;
                }
            }
            //Guardamos los datos
            for (int j=columna_no_nula; j<numero_columna;j++){
                Cell celda=fila.getCell(j);
                String dato_celda="";
                //Consulta de nombre de operadores
                String consulta_Operadores = "SELECT Nombre_operador FROM Operadores";
                PreparedStatement operadores = conectar.prepareStatement(consulta_Operadores);
                ResultSet rs_operadores = operadores.executeQuery();
                //Consulta areas de trabajo
                String consulta_Areas_trabajo="SELECT Nombre_area FROM Areas_Trabajo";
                PreparedStatement areas_trabajo=conectar.prepareStatement(consulta_Areas_trabajo);
                ResultSet rs_areas = areas_trabajo.executeQuery();
                //Consulta filial
                String consulta_filial="SELECT Nombre_filial FROM Filiales";
                PreparedStatement filial = conectar.prepareStatement(consulta_filial);
                ResultSet rs_filial = filial.executeQuery();
                //segun el dato de la celda
                switch (celda.getCellTypeEnum()){
                    case NUMERIC: double valorNumerico = celda.getNumericCellValue();
                                  long valorEntero = (long) valorNumerico;
                                  dato_celda = String.valueOf(valorEntero);break;
                    case STRING: {
                        while (rs_filial.next()){
                        String nombreFilial = rs_filial.getString("Nombre_filial");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombreFilial)){
                            dato_celda=String.valueOf(metodo.obtenerIdFilial(nombreFilial));break;}
                        }
                        //
                        while (rs_operadores.next()){
                        String nombreOperador = rs_operadores.getString("Nombre_operador");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombreOperador)){
                            dato_celda=String.valueOf(metodo.obtenerIdOperador(nombreOperador));break;}
                        }
                        
                        while (rs_areas.next()){
                        String nombrearea = rs_areas.getString("Nombre_area");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombrearea)){
                            dato_celda=String.valueOf(metodo.obtener_id_Area_trabajo(nombrearea));break;}
                        }
                    
                        if(dato_celda.equals("")){
                        dato_celda=String.valueOf(celda.getStringCellValue());}
                    }break;
                    case FORMULA: dato_celda=celda.getCellFormula();break;
                }
                actualizar.setString(((j-columna_no_nula)+1),dato_celda);    
            }
            actualizar.executeUpdate();
            conectar.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error al editar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }   
    }
    //Si no existe
    public void Guardar(String documento,int fila_cargar) throws FileNotFoundException, IOException{
        FileInputStream archivo = new FileInputStream(documento);
        XSSFWorkbook libro= new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        try {
            Connection conectar=metodo.abrirconeccion();
            String sql = "INSERT INTO EGRESADOS (Codigo_de_estudiante, Nombre_de_IE, id_filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Operador_1, Num_telefono2, Operador_2, Num_telefono3, Operador_3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, id_area_trabajo) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement insertar = conectar.prepareStatement(sql);
            Row fila = hoja.getRow(fila_cargar);
            //numero de inicio columna no nula
            int numero_columna= fila.getLastCellNum();
            int columna_no_nula=0;
            for(int c=0; c<=numero_columna;c++){
            Cell celda=fila.getCell(c);
            if(celda != null){
                columna_no_nula=c;break;
                }
            }
            //Guardamos los datos
            for (int j=columna_no_nula; j<numero_columna;j++){
                Cell celda=fila.getCell(j);
                String dato_celda="";                
                //Consulta de nombre de operadores
                String consulta_Operadores = "SELECT Nombre_operador FROM Operadores";
                PreparedStatement operadores = conectar.prepareStatement(consulta_Operadores);
                ResultSet rs_operadores = operadores.executeQuery();
                //Consulta areas de trabajo
                String consulta_Areas_trabajo="SELECT Nombre_area FROM Areas_Trabajo";
                PreparedStatement areas_trabajo=conectar.prepareStatement(consulta_Areas_trabajo);
                ResultSet rs_areas = areas_trabajo.executeQuery();
                //Consulta filial
                String consulta_filial="SELECT Nombre_filial FROM Filiales";
                PreparedStatement filial = conectar.prepareStatement(consulta_filial);
                ResultSet rs_filial = filial.executeQuery();
                //segun el dato de la celda
                switch (celda.getCellTypeEnum()){
                    case NUMERIC: double valorNumerico = celda.getNumericCellValue();
                                  long valorEntero = (long) valorNumerico;
                                  dato_celda = String.valueOf(valorEntero);break;
                    case STRING: {
                        while (rs_filial.next()){
                        String nombreFilial = rs_filial.getString("Nombre_filial");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombreFilial)){
                            dato_celda=String.valueOf(metodo.obtenerIdFilial(nombreFilial));break;}
                        }
                        //
                        while (rs_operadores.next()){
                        String nombreOperador = rs_operadores.getString("Nombre_operador");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombreOperador)){
                            dato_celda=String.valueOf(metodo.obtenerIdOperador(nombreOperador));break;}
                        }
                        
                        while (rs_areas.next()){
                        String nombrearea = rs_areas.getString("Nombre_area");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombrearea)){
                            dato_celda=String.valueOf(metodo.obtener_id_Area_trabajo(nombrearea));break;}
                        }
                    
                        if(dato_celda.equals("")){
                        dato_celda=String.valueOf(celda.getStringCellValue());}
                    }break;
                    case FORMULA: dato_celda=celda.getCellFormula();break;
                }
                insertar.setString(((j-columna_no_nula)+1),dato_celda);    
            }
            insertar.executeUpdate();
            conectar.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error al editar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }   
    }
}
