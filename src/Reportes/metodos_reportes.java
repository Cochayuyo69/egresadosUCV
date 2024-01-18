/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
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

/**
 *
 * @author Acer
 */
public class metodos_reportes {
    Metodoss metodos=new Metodoss();

//METODO PARA MOSTRAR capacitaciones creadas
    public String[][] mostrar_capacitaciones(String Area, String Especializacion) {
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT id, AREA, ESPECIALIZACION, TITULO, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE FROM Capacitaciones WHERE AREA = ? and ESPECIALIZACION = ?;";

            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, Area);
            st.setString(2, Especializacion);
            
            ResultSet rs = st.executeQuery();

            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[10]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 10; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                lista_capacitaciones.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_capacitaciones = new String[lista_capacitaciones.size()][10];
            for (int i = 0; i < lista_capacitaciones.size(); i++) {
                matriz_capacitaciones[i] = lista_capacitaciones.get(i);
            }
            return matriz_capacitaciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitciones con esa Area y Especialización." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
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
            String query = "SELECT id, AREA, ESPECIALIZACION, TITULO, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE FROM Capacitaciones";

            PreparedStatement st = conectar.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();

            List<String[]> lista_capacitaciones = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[10]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 10; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
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
            JOptionPane.showMessageDialog(null,  "No se encontraron capacitciones con esa Area y Especialización." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
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
}
