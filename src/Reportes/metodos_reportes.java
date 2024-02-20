
package Reportes;

import Capacitaciones.Datos_Capacitaciones;
import Capacitaciones.Metodos_capacitacion;
import java.io.FileOutputStream;
import java.sql.Connection;
import datos.DatosEgresados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import metodos.Metodoss;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class metodos_reportes {
    Metodoss metodos=new Metodoss();
    Metodos_capacitacion ejecutar = new Metodos_capacitacion();
    DatosEgresados datos= new DatosEgresados();
//METODO PARA MOSTRAR capacitaciones creadas
    public String[][] mostrar_capacitaciones(String Area, String Especializacion) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT ID_CAPACITACION, TITULO, AREA, ESPECIALIZACION, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE FROM Capacitaciones WHERE AREA = ? and ESPECIALIZACION = ?;";

            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, Area);
            st.setString(2, Especializacion);
            
            ResultSet rs = st.executeQuery();

            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[9]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 9; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    if(j==0){
                        data[j] = rs.getString(1)+". "+rs.getString(2);
                    }else{
                        data[j] = rs.getString(j+2);
                    }
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][9];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitciones con esa Area y Especialización." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    //MOSTRAR CAPACITACIONES POR ANIO Y MES
     public String[][] mostrarCapacitacionesFecha(String area, String especializacion, String anio, String mes) {
        try {
            Connection conectar = metodos.abrirconeccion();
            
            String meselegido = "" + metodos.obtenerNumeroMes(mes);
            
            // Consulta SQL con condiciones para años y meses
            String query = "SELECT ID_CAPACITACION, AREA, ESPECIALIZACION, TITULO, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE " +
                           "FROM Capacitaciones " +
                           "WHERE AREA = ? AND ESPECIALIZACION = ? " +
                           "AND YEAR(STR_TO_DATE(FECHA, '%d/%m/%Y')) = ? " +
                           "AND MONTH(STR_TO_DATE(FECHA, '%d/%m/%Y')) = ?";

            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, area);
            st.setString(2, especializacion);
            st.setString(3, anio);
            st.setString(4, meselegido);

            ResultSet rs = st.executeQuery();

            List<String[]> listaCapacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[10]; // Ajusta el tamaño según las columnas que estás recuperando
                for (int j = 0; j < 10; j++) { // Ajusta el límite según las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                listaCapacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matrizCapacitaciones = new String[listaCapacitaciones.size()][10];
            for (int i = 0; i < listaCapacitaciones.size(); i++) {
                matrizCapacitaciones[i] = listaCapacitaciones.get(i);
            }
            return matrizCapacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontraron capacitaciones con esa área y especialización en el año y mes especificados. " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    //Mostrar centro de labores
    public String[][] mostrar_centros_de_labores(String Area) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT id_area_trabajo, id_perfil, Nombre_especializacion FROM areas_especializacion WHERE id_perfil = ?;";

            PreparedStatement st = conectar.prepareStatement(query);
            st.setInt(1, metodos.obtener_id_Area_trabajo(Area));
            
            ResultSet rs = st.executeQuery();

            List<String[]> lista_centro_labores = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[3]; // Ajusta el tamaño en función de las columnas que estás recuperando
                
                data[0] = rs.getString(1);
                data[1] = metodos.obtenerNombrePERFIL(rs.getInt(2));
                data[2] = rs.getString(3);
                
                lista_centro_labores.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_centro_labores = new String[lista_centro_labores.size()][3];
            for (int i = 0; i < lista_centro_labores.size(); i++) {
                matriz_centro_labores[i] = lista_centro_labores.get(i);
            }
            return matriz_centro_labores;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron centros de labores con esa Area." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    //Motrar todas las capacitaciones
    public String[][] Capacitaciones() {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT ID_CAPACITACION, TITULO, AREA, ESPECIALIZACION, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE FROM Capacitaciones";

            PreparedStatement st = conectar.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();

            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[9]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 9; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    if(j==0){
                        data[j] = rs.getString(1)+". "+rs.getString(2);
                    }else{
                        data[j] = rs.getString(j+2);
                    }
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][9];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitciones con esa Area y Especialización." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    //METODO PARA MOSTRAR capacitaciones de un egresado
    public String[][] mostrar_capacitaciones_egresado(String Codigo) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT ID_HISTORIAL, AREA, ESPECIALIZACION, ID_CAPACITACION, FECHA_ENVIO, HORA_ENVIO, COMPROMISO, ASISTENCIA FROM HISTORIAL_CAPACITACIONES WHERE CODIGO_EGRESADO = ?;";

            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, Codigo);
            ResultSet rs = st.executeQuery();
            
            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[8]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 8; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    if(j==3){
                        data[j]=rs.getString(j+1)+". "+metodos.obtener_titulo_capacitacion(Integer.parseInt(rs.getString(j+1)));
                    }else {
                        data[j] = rs.getString(j + 1);
                    }
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][8];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitaciones del egresado" + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public void exportar_Excel(Object[] Primera_fila, String[][] datos, String rutaArchivo) {
        try (
            Workbook libro = new XSSFWorkbook()) {
            Sheet hoja = libro.createSheet("Capacitaciones");
            Row primera_fila = hoja.createRow(0);
            for (int j = 0; j < Primera_fila.length; j++) {
                    
                Cell celda = primera_fila.createCell(j);
                celda.setCellValue(Primera_fila[j].toString());
                }

            for (int i = 0; i < datos.length; i++) {
                Row fila = hoja.createRow(i+1);

                for (int j = 0; j < datos[i].length; j++) {
                    Cell celda = fila.createCell(j);
                    celda.setCellValue(datos[i][j]);
                }
            }

            try (
                FileOutputStream archivo = new FileOutputStream(rutaArchivo)) {
                libro.write(archivo);
                System.out.println("Archivo Excel creado exitosamente en: " + rutaArchivo);
                JOptionPane.showMessageDialog(null,"Exportación a Excel exitosa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //metodo de filechooser
    public String obtenerRutaArchivo() {
        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar como");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx"));
            
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                return fileChooser.getSelectedFile().getAbsolutePath()+".xlsx";
            } else {
                return null;
            }
    }
    public String[][] Buscar_capacitacion_por_fecha(String Fecha_inicio, String Fecha_fin) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT ID_CAPACITACION, TITULO, AREA, ESPECIALIZACION, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE FROM Capacitaciones WHERE FECHA BETWEEN '"+Fecha_inicio+"' AND '"+Fecha_fin+"';";
            PreparedStatement st = conectar.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[9]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 9; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                   if(j==0){
                        data[j] = rs.getString(1)+". "+rs.getString(2);
                    }else{
                        data[j] = rs.getString(j+2);
                    }
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][9];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitaciones del egresado" + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public String[][] Buscar_CAPACITACION_EGRESADOS_por_fecha(String Fecha_inicio, String Fecha_fin) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT ID_HISTORIAL, AREA, ESPECIALIZACION, ID_CAPACITACION, FECHA_ENVIO, HORA_ENVIO FROM HISTORIAL_CAPACITACIONES WHERE FECHA_ENVIO BETWEEN '"+Fecha_inicio+"' AND '"+Fecha_fin+"';";
            PreparedStatement st = conectar.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[6]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 6; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    if(j==3){
                        data[j]=metodos.obtener_titulo_capacitacion(Integer.parseInt(rs.getString(j+1)));
                    }else {
                        data[j] = rs.getString(j + 1);
                    }
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][6];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitaciones del egresado" + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public String[][] buscar_asistencias_por_capacitacion(String area, String especializacion, String id_titulo){
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT CODIGO_EGRESADO, COMPROMISO, ASISTENCIA FROM HISTORIAL_CAPACITACIONES WHERE AREA = ? AND ESPECIALIZACION=? AND ID_CAPACITACION=?;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, area);
            st.setString(2, especializacion);
            st.setString(3, id_titulo);
            ResultSet rs = st.executeQuery();
            List<String[]> lista_capacitaciones = new ArrayList<>();
            
            while (rs.next()) {
                String[] data = new String[6]; // Ajusta el tamaño en función de las columnas que estás recuperando
                metodos.buscarPorCodigo(rs.getString(1), null, datos);
                data[0]= datos.getCodigoUCV();
                data[1]= datos.getApellidoP();
                data[2]= datos.getApellidoM();
                data[3]= datos.getNombres();
                data[4]= rs.getString(2);
                data[5]= rs.getString(3);
                lista_capacitaciones.add(data);
            }
            
            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_Asistencias = new String[lista_capacitaciones.size()][6];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_Asistencias[i] = lista_capacitaciones.get(i);
            } 
            return matriz_Asistencias;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron asistencias de la capacitación" + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }
        return null;
    }
}
