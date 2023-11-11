
package Excel;
import datos.DatosEgresados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodos.Metodoss;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BD_Excel {
//    public static void crearArchivoExcel(){
//    Workbook libro = new XSSFWorkbook();
//    Sheet hoja = libro.createSheet("Java");
//    
//        try {
//            FileOutputStream archivo = new FileOutputStream(new File("Reporte.xlsx"));
//            libro.write(archivo);
//            archivo.close();
//            System.out.println("se creo");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error: "+e);
//        }
//    }
    
    /*public static void leerArchivoExcel() throws FileNotFoundException, IOException{
        FileInputStream archivo = new FileInputStream("C:\\Users\\Acer\\Desktop\\Deni\\proyecto ucv\\EGRESADOS.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        
        int numero_Filas= hoja.getLastRowNum();
        for (int i=0; i<=numero_Filas; i++){
            Row fila = hoja.getRow(i);
            int numero_Columnas= fila.getLastCellNum();
            
            for (int j=0; j<numero_Columnas; j++){
                Cell celda = fila.getCell(j);
                
                switch ((celda.getCellTypeEnum()).toString()){
                    
                    case "NUMERIC":
                             System.out.print(celda.getNumericCellValue());
                          break;
                    case "STRING":
                        System.out.print(celda.getStringCellValue());
                        break;
                    case "FORMULA":
                        System.out.print(celda.getCellFormula());
                        break;
                    default: System.out.print(celda.toString());break;
                }
            }
            System.out.println("");
        }
    }*/
    public void cargarDatos(String file) throws FileNotFoundException, IOException, SQLException{
        FileInputStream archivo = new FileInputStream(file);
        XSSFWorkbook libro= new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
                
        //Obtenemos el inicio de la tabla
        int numero_Filas= hoja.getLastRowNum();
        int fila_no_nula=0;
        for(int f=0; f<=numero_Filas;f++){
            Row inicio = hoja.getRow(f);
            if(inicio != null){
                //Agregamos una unidad para no contar el titulo de las celdas
                fila_no_nula=f+1;break;
            }
        }
        
        //guardamos los datos
        for(int i=fila_no_nula; i<=numero_Filas; i ++){
            Metodoss conexion= new Metodoss();
            Connection conectar = conexion.abrirconeccion();
            String sql = "INSERT INTO EGRESADOS (Codigo_de_estudiante, Nombre_de_IE, id_filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Operador_1, Num_telefono2, Operador_2, Num_telefono3, Operador_3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, id_area_trabajo) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement insertar = conectar.prepareStatement(sql);
            
            Row fila = hoja.getRow(i);
            //numero de inicio columna no nula
            int numero_columna= fila.getLastCellNum();

            int columna_no_nula=0;
            for(int c=0; c<=numero_columna;c++){
            Cell celda=fila.getCell(c);
            if(celda != null){
                columna_no_nula=c;break;
                }
            }
                        JOptionPane.showMessageDialog(null, columna_no_nula);
            for (int j=columna_no_nula; j<numero_columna;j++){
                Cell celda=fila.getCell(j);
                String dato_celda="";
                switch (celda.getCellTypeEnum()){
                    case NUMERIC: double valorNumerico = celda.getNumericCellValue();
                                  long valorEntero = (long) valorNumerico;
                                  dato_celda = String.valueOf(valorEntero);break;
                    case STRING: dato_celda=String.valueOf(celda.getStringCellValue());break;
                    case FORMULA: dato_celda=celda.getCellFormula();break;
                }
                
                insertar.setString(((j-columna_no_nula)+1),dato_celda);
                
            }
            insertar.executeUpdate();
        }
        JOptionPane.showMessageDialog(null, "Importación exitosa");
    }
    //BOTON IMPORTAR
    
    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException{
    //crearArchivoExcel();
    //leerArchivoExcel();
    
    }
}
