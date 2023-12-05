
package Excel;
import Mensajes.Importacion_Exitosa;
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
public class BD_Excel{
    DatosEgresados datos= new DatosEgresados();
    Metodoss conexion= new Metodoss();
    metodos_excel metodo = new metodos_excel() {};
    DataFormatter dataFormatter = new DataFormatter();
    
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
        //contador de ediciones
        int editados=0;
        int guardados=0;
        Connection conectar=conexion.abrirconeccion();
        //Consulta filial
                String consulta_filial="SELECT Nombre_filial FROM Filiales";
                PreparedStatement filial = conectar.prepareStatement(consulta_filial);
                ResultSet rs_filial = filial.executeQuery();
                
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
            for(int c=0; c<numero_columna;c++){
            Cell celda=fila.getCell(c);
            if(celda != null){
                columna_no_nula=c;break;
                }
            }
            //CELDA DEL CODIGO
            String CodigoUCV=String.valueOf(fila.getCell(columna_no_nula));
            datos.setCodigoUCV(CodigoUCV);
            //CELDA DEL NOMBRE DE LA INTITUCION
            datos.setNombreIE(String.valueOf(fila.getCell(columna_no_nula+1)));
            //Celda nombre filial
            Cell celda_filial=fila.getCell((columna_no_nula+2));
            String nombreFilial=celda_filial.getStringCellValue();
            int dato_filial=conexion.obtenerIdFilial(nombreFilial);
            
            datos.setFilial(dato_filial);
            //Celda carrera
            datos.setCarrera(String.valueOf(fila.getCell(columna_no_nula+3)));
            //Celda apellido paterno
            datos.setApellidoP(String.valueOf(fila.getCell(columna_no_nula+4)));
            //Celda apellido materno
            datos.setApellidoM(String.valueOf(fila.getCell(columna_no_nula+5)));
            //Celda nombres
            datos.setNombres(String.valueOf(fila.getCell(columna_no_nula+6)));
            //celda correo
            datos.setCorreo(String.valueOf(fila.getCell(columna_no_nula+7)));
            //celda n°1 telefono
            String celda_telefono1 = dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 8));
            datos.setTele1(celda_telefono1);
            //celda operador 1
            datos.setOperador1(conexion.obtenerIdOperador(String.valueOf(fila.getCell(columna_no_nula+9))));
            //celda N° telefono 2
            String celda_telefono2 = dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 10));
            datos.setTele2(celda_telefono2);
            //celda operador 2
            datos.setOperador2(conexion.obtenerIdOperador(String.valueOf(fila.getCell(columna_no_nula+11))));
            //celda telefono 3
            String celda_telefono3 = dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 12));
            datos.setTele3(celda_telefono3);
            //celda operador 3
            datos.setOperador3(conexion.obtenerIdOperador(String.valueOf(fila.getCell(columna_no_nula+13))));
            //celda año egreso 
            String celda_añoEgreso = dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 14));
            datos.setAñoEgreso(celda_añoEgreso);
            //celda semestre egreso
            String celda_semestreEgreso= dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 15));
            datos.setSemestreEgreso(celda_semestreEgreso);
            //celda tipo de documento
            datos.setTipoDocIdenti(String.valueOf(fila.getCell(columna_no_nula+16)));
            //Celda numero documento
            String celda_numeroDoc= dataFormatter.formatCellValue(fila.getCell(columna_no_nula + 17));
            datos.setNumDocIdenti(celda_numeroDoc);
            //celda tiene grado
            Cell celda_estado_grado=fila.getCell(columna_no_nula+18);
            String estado_grado=String.valueOf(celda_estado_grado);
            datos.setEstGrado(estado_grado);
            
            //celda resolucion de grado
            datos.setReGrado(String.valueOf(fila.getCell(columna_no_nula+19)));
            //celda estado de titulo
            datos.setEstTitulo(String.valueOf(fila.getCell(columna_no_nula+20)));
            //celda resolucion de titulo
            datos.setReTitulo(String.valueOf(fila.getCell(columna_no_nula+21)));
            //celda estadod e trabajo
            datos.setEstTrabajo(String.valueOf(fila.getCell(columna_no_nula+22)));
            //celda area de trabajo
            datos.setAreaTrabajo(conexion.obtener_id_Area_trabajo(String.valueOf(fila.getCell(columna_no_nula+23))));
            
            //Buscamos si el egresado existe
            boolean existe = conexion.buscarsiExiste(CodigoUCV, celda_numeroDoc);
            if (existe){
                metodo.editar(datos);
                editados++;
            }
            else{
                metodo.guardarEgresado(datos);
                guardados++;
            }
        
    }
        Importacion_Exitosa importado = new Importacion_Exitosa();
        importado.setVisible(true);
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
            //contador para sacar el titulo de operador, idTrabajo, idFilial
            int id_Operador;
            int filial;
            int area_trabajo;
            int Operador_1=-999;
            int Operador_2=-999;
            int Operador_3=-999;
            int id_filial=-999;
            int id_trabajo=-999;
            String nombreOPE;
            String nombre_filial;
            String nombre_area;
            for (int i = 2; i <= resultSet.getMetaData().getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i - 2);
                String nombre_columna=resultSet.getMetaData().getColumnName(i);
                cell.setCellValue(nombre_columna);
                switch (nombre_columna){
                    case "Operador_1" -> Operador_1=i;
                    case "Operador_2" -> Operador_2=i;
                    case "Operador_3" -> Operador_3=i;
                    case "id_filial" -> id_filial=i;
                    case "id_area_trabajo" -> id_trabajo=i;
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
                }else if(a==id_filial){
                    filial=resultSet.getInt(a);
                    nombre_filial=conexion.obtenerNombreFILIAL(filial);
                    cell.setCellValue(nombre_filial);
                }else if(a==id_trabajo){
                    area_trabajo=resultSet.getInt(a);
                    nombre_area=conexion.obtener_nombre_area(area_trabajo);
                    cell.setCellValue(nombre_area);
                }else{cell.setCellValue(resultSet.getString(a));}
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
    
}
