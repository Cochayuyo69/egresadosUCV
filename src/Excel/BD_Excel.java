
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    Metodoss conexion= new Metodoss();
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
    //Importar
    public void importar(String file) throws FileNotFoundException, IOException, SQLException{
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
                            dato_celda=String.valueOf(conexion.obtenerIdFilial(nombreFilial));break;}
                        }
                        //
                        while (rs_operadores.next()){
                        String nombreOperador = rs_operadores.getString("Nombre_operador");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombreOperador)){
                            dato_celda=String.valueOf(conexion.obtenerIdOperador(nombreOperador));break;}
                        }
                        
                        while (rs_areas.next()){
                        String nombrearea = rs_areas.getString("Nombre_area");
                        if(celda.getStringCellValue().equalsIgnoreCase(nombrearea)){
                            dato_celda=String.valueOf(conexion.obtener_id_Area_trabajo(nombrearea));break;}
                        }
                    
                        if(dato_celda.equals("")){
                        dato_celda=String.valueOf(celda.getStringCellValue());}
                    }break;
                    case FORMULA: dato_celda=celda.getCellFormula();break;
                }
            
                insertar.setString(((j-columna_no_nula)+1),dato_celda);
                
            }
            insertar.executeUpdate();
        }
        JOptionPane.showMessageDialog(null, "Importación exitosa");
    }
    //BOTON EXPORTAR
    public void exportar(){
        try {
            // Crear la conexión
            Connection con =conexion.abrirconeccion();

            // Crear una consulta SQL para obtener todos los datos de la tabla
            String sql = "SELECT * FROM egresados";
            PreparedStatement stmt = con.prepareStatement(sql);

            // Ejecutar la consulta
            ResultSet resultSet = stmt.executeQuery();

            // Crear un nuevo libro de Excel
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Egresados");

            // Crear la primera fila para los encabezados
            Row headerRow = sheet.createRow(0);
            //contador para sacar el titulo de operador
            int Operador_1=-999;
            int Operador_2=-999;
            int Operador_3=-999;
            int id_Operador;
            String nombreOPE;
            for (int i = 2; i <= resultSet.getMetaData().getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i - 2);
                String nombre_columna=resultSet.getMetaData().getColumnName(i);
                cell.setCellValue(nombre_columna);
                switch (nombre_columna){
                    case "Operador_1" -> Operador_1=i;
                    case "Operador_2" -> Operador_2=i;
                    case "Operador_3" -> Operador_3=i;
                }
            }

            // Llenar el resto de las filas con datos
            int filaNum = 1;
            while (resultSet.next()) {
   
            Row fila = sheet.createRow(filaNum++);
   
            for (int a = 2; a <= resultSet.getMetaData().getColumnCount(); a++) {
                Cell cell = fila.createCell(a - 2);
                if(a==Operador_1){
                    id_Operador=resultSet.getInt(a);
                    nombreOPE=conexion.obtenerNombreOPERADOR(id_Operador);
                    cell.setCellValue(nombreOPE);
                }else if(a==Operador_2){
                    id_Operador=resultSet.getInt(a);
                    nombreOPE=conexion.obtenerNombreOPERADOR(id_Operador);
                    cell.setCellValue(nombreOPE);
                }else if(a==Operador_3){
                    id_Operador=resultSet.getInt(a);
                    nombreOPE=conexion.obtenerNombreOPERADOR(id_Operador);
                    cell.setCellValue(nombreOPE);
                }else{
                cell.setCellValue(resultSet.getString(a));
                }
             }
            }

            // Utilizar un JFileChooser para que el usuario elija la ubicación y el nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar como");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx"));
            
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String rutaDelArchivo = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";

                // Guardar el libro en el archivo especificado
                try (FileOutputStream fileOut = new FileOutputStream(rutaDelArchivo)) {
                    workbook.write(fileOut);
                }

                JOptionPane.showMessageDialog(null,"Exportación a Excel exitosa");
            } else {
                JOptionPane.showMessageDialog(null,"Exportación cancelada por el usuario.");
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException{
    //crearArchivoExcel();
    //leerArchivoExcel();
    
    }
}
