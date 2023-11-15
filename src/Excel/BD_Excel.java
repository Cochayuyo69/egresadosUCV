
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
    metodos_excel metodo = new metodos_excel();
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
                fila_no_nula=f+1 ;break;
            }
        }
        //guardamos los datos
        for(int i=fila_no_nula; i<=numero_Filas; i ++){
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
            Cell celda=fila.getCell(columna_no_nula);
            String codigo_egresado=String.valueOf(celda);
            //verificamos si existe
            boolean existe=conexion.buscarsiExiste(codigo_egresado, "");
            //guardamos si existe
            if(existe){
                metodo.editar(file, i);
            }else{
                metodo.Guardar(file, i);
            }
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
