
package Capacitaciones;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class Metodos_capacitacion {
    Metodoss metodos=new Metodoss();
    //Consturtor

    public Metodos_capacitacion() {
    }
    
    
    //METODOS
    
    //Guardar capacitacion
    public void guardar_Capacitacion(Datos_Capacitaciones datos){
        try {
            Connection conectar=metodos.abrirconeccion();
            String insertar="INSERT INTO CAP_"+datos.getArea()+" (TITULO, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE)" + 
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt=conectar.prepareStatement(insertar);
            pstmt.setString(1, datos.getTitulo());
            pstmt.setString(2, datos.getFecha());
            pstmt.setString(3, datos.getTurno());
            pstmt.setString(4, datos.getHora());
            pstmt.setString(5, datos.getModalidad());
            pstmt.setDouble(6, datos.getMonto());
            pstmt.setString(7, datos.getMensaje());
            pstmt.executeUpdate();
            pstmt.close();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Capacitación guardada con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            System.out.println(e.getMessage());
        }
    }
    
    //Buscar capacitación
    
    public void buscar_capacitacion(String area_trabajo, String buscar_capacitacion, Datos_Capacitaciones datos){
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT * FROM CAP_"+area_trabajo+" WHERE TITULO = ?;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, buscar_capacitacion);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                datos.setTitulo(rs.getString("TITULO"));
                datos.setFecha(rs.getString("FECHA"));
                datos.setTurno(rs.getString("TURNO"));
                datos.setHora(rs.getString("HORA"));
                datos.setModalidad(rs.getString("MODALIDAD"));
                datos.setMonto(rs.getDouble("MONTO"));
                datos.setMensaje(rs.getString("MENSAJE"));
            } else {
            JOptionPane.showMessageDialog(null, "No se encontró la capacitación", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //Metodo para llenar combobox de horas segun sea el turno
    public DefaultComboBoxModel<String> obtenerhoras(String turno) {
    DefaultComboBoxModel<String> modelo_horas = new DefaultComboBoxModel<>();
    try {
        Connection conectar =metodos.abrirconeccion();
        String query = "SELECT Horas FROM HORAS_"+turno;
        PreparedStatement preparedStmt = conectar.prepareStatement(query);
        ResultSet resultado = preparedStmt.executeQuery();

        while (resultado.next()) {
            String horas = resultado.getString("Horas");
            modelo_horas.addElement(horas);
            System.out.println(horas);
        }
        preparedStmt.close();
        conectar.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener horas: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        System.out.println("Error al obtener horas: " + e.getMessage()); // Mensaje de depuración
    }
    return modelo_horas;
}
    
    //Metodo para llenar combobox DE CAPACITACIONES de cualquier area
    public DefaultComboBoxModel<String> obtenercapacitaciones(String area){
        DefaultComboBoxModel<String> modelo= new DefaultComboBoxModel<>();
        try {
                Connection conectar=metodos.abrirconeccion();
                String query ="SELECT TITULO FROM CAP_"+area; 
                PreparedStatement preparedStmt = conectar.prepareStatement(query);
                ResultSet resultado=preparedStmt.executeQuery();
                
                while(resultado.next()){
                    String titulo_capacitacion=resultado.getString("TITULO");
                    modelo.addElement(titulo_capacitacion);
                }
                preparedStmt.close();
                conectar.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener capacitaciones: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        return modelo;
    }
}
