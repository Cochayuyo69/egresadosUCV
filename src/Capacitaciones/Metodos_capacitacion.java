
package Capacitaciones;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class Metodos_capacitacion {
    Metodoss metodos=new Metodoss();
    

    public Metodos_capacitacion() {
    }
    
    
    //METODOS
    
    //Guardar capacitacion
    public void guardar_Capacitacion(Datos_Capacitaciones datos){
        try {
            Connection conectar=metodos.abrirconeccion();
            String insertar="INSERT INTO Capacitaciones (TITULO, FECHA, TURNO, HORA, MODALIDAD, MONTO, MENSAJE, AREA, ESPECIALIZACION)" + 
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt=conectar.prepareStatement(insertar);
            pstmt.setString(1, datos.getTitulo());
            pstmt.setString(2, datos.getFecha());
            pstmt.setString(3, datos.getTurno());
            pstmt.setString(4, datos.getHora());
            pstmt.setString(5, datos.getModalidad());
            pstmt.setDouble(6, datos.getMonto());
            pstmt.setString(7, datos.getMensaje());
            pstmt.setString(8, datos.getArea());
            pstmt.setString(9, datos.getEspecializacion());
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
    
    public void buscar_capacitacion(String area_trabajo, String especializacion,int Id, Datos_Capacitaciones datos){
        try {
            Connection conectar=metodos.abrirconeccion();
            String query = "SELECT * FROM Capacitaciones WHERE AREA=? AND ESPECIALIZACION=? AND ID_CAPACITACION = ?;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, area_trabajo);
            st.setString(2, especializacion);
            st.setInt(3, Id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                datos.setId(rs.getString("ID_CAPACITACION"));
                datos.setTitulo(rs.getString("TITULO"));
                datos.setFecha(rs.getString("FECHA"));
                datos.setTurno(rs.getString("TURNO"));
                datos.setHora(rs.getString("HORA"));
                datos.setModalidad(rs.getString("MODALIDAD"));
                datos.setMonto(rs.getDouble("MONTO"));
                datos.setMensaje(rs.getString("MENSAJE"));
                conectar.close();
            } else {
            JOptionPane.showMessageDialog(null, "No se encontró la capacitación", 
                    "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), 
                    "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
        }
    }
    //ELIMINAR CAPACITACION
    
    public void eliminar_capacitacion(int ID_capacitacion){
        try {
            Connection conectar=metodos.abrirconeccion();
            String sql = "DELETE FROM Capacitaciones WHERE id = ?";
            PreparedStatement statement = conectar.prepareStatement(sql);
            statement.setInt(1, ID_capacitacion);
            statement.executeUpdate();
            statement.close();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Capacitación eliminada correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la capacitación", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Editar capacitacion 
    public void editar_capacitacion(Datos_Capacitaciones Objeto_datos){
        try {
            Connection conectar=metodos.abrirconeccion();
            String sql = "UPDATE Capacitaciones SET Fecha=?, Turno=?, Hora=?, Modalidad=?, Monto=?, Mensaje=?, Titulo=? WHERE AREA=? AND ESPECIALIZACION=? AND id=?";
            PreparedStatement statement = conectar.prepareStatement(sql);
            // Establecer los valores de los parámetros
            statement.setString(1, Objeto_datos.getFecha());
            statement.setString(2, Objeto_datos.getTurno());
            statement.setString(3, Objeto_datos.getHora());
            statement.setString(4, Objeto_datos.getModalidad());
            statement.setDouble(5, Objeto_datos.getMonto());
            statement.setString(6, Objeto_datos.getMensaje());
            statement.setString(7, Objeto_datos.getTitulo()); 
            statement.setString(8, Objeto_datos.getArea());// Utilizamos el area como condición
            statement.setString(9, Objeto_datos.getEspecializacion());// Utilizamos especializacion como condición
            statement.setString(10, Objeto_datos.getId());// Utilizamos especializacion como condición
            statement.executeUpdate();
            statement.close();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Capacitación editada correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Capacitación no editada correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e);
        }
    }
    
    //Excepciones
    public String excepciones(Datos_Capacitaciones DATA){
        if (DATA.getTitulo().equals("")){
            return "Ingrese una titulo para la capacitación";
        }else if(DATA.getFecha().equals("")){
            return "Ingrese una fecha para la capacitación";
        } else if (DATA.getMensaje().equals("")){
            return "Ingrese una mensaje para la capacitación";
        } else if (DATA.getMonto()==null){
            return "Si la capacitación es de pago ingrese un monto válido";
        }
        return "";
                
    }
    //Metodo para llenar combobox DE CAPACITACIONES de cualquier area
    public DefaultComboBoxModel<String> obtener_especializaciones(int id_area){
        DefaultComboBoxModel<String> modelo= new DefaultComboBoxModel<>();
        try {
                Connection conectar=metodos.abrirconeccion();
                String query ="SELECT * FROM areas_especializacion WHERE id_perfil = ?;"; 
                PreparedStatement preparedStmt = conectar.prepareStatement(query);
                preparedStmt.setInt(1, id_area);
                ResultSet resultado=preparedStmt.executeQuery();
                
                while(resultado.next()){
                    String titulo_especializacion=resultado.getString("Nombre_especializacion");
                    modelo.addElement(titulo_especializacion);
                }
                preparedStmt.close();
                conectar.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener especializaciones: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        return modelo;
    }
    
     public DefaultComboBoxModel<String> obtener_Titulos(String Area, String Especializacion){
        DefaultComboBoxModel<String> modelo= new DefaultComboBoxModel<>();
        try {
                Connection conectar=metodos.abrirconeccion();
                String query ="SELECT * FROM Capacitaciones WHERE AREA=? AND ESPECIALIZACION=?"; 
                PreparedStatement preparedStmt = conectar.prepareStatement(query);
                preparedStmt.setString(1, Area);
                preparedStmt.setString(2, Especializacion);
                ResultSet resultado=preparedStmt.executeQuery();

                while(resultado.next()){
                    String titulo_capacitacion=resultado.getString("ID_CAPACITACION")+". "+resultado.getString("TITULO");
                    modelo.addElement(titulo_capacitacion);
                }
                preparedStmt.close();
                conectar.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener especializaciones: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        return modelo;
    }
    public void guardar_en_historial (String Codigo,String Area, String Especializacion, int id_capacitacion){
        String Hora=metodos.hora();
        String Fecha=metodos.fecha();
        try {
            Connection conectar=metodos.abrirconeccion();
            //Obtener las capacitaciones ya guardadas
            String sqlinsertar ="INSERT INTO HISTORIAL_CAPACITACIONES (CODIGO_EGRESADO, AREA, ESPECIALIZACION, ID_CAPACITACION, FECHA_ENVIO, HORA_ENVIO)" + 
                    "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmtSeleccionar = conectar.prepareStatement(sqlinsertar);
            stmtSeleccionar.setString(1, Codigo);
            stmtSeleccionar.setString(2, Area);
            stmtSeleccionar.setString(3, Especializacion);
            stmtSeleccionar.setInt(4, id_capacitacion);
            stmtSeleccionar.setString(5, Fecha);
            stmtSeleccionar.setString(6, Hora);
            
            stmtSeleccionar.executeUpdate();
            stmtSeleccionar.close();
            conectar.close();
            
            System.out.println("Capacitación del egresado agregada correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Capacitación del egresado no agregada correctamente al historial", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e);
        }
    }
    //Obtener titulo de capacitacion por id
    public void buscar_capacitacion_por_id(Datos_Capacitaciones DATOS, String ID) {
    try {
        Connection conectar=metodos.abrirconeccion();
        String query = "SELECT * FROM Capacitaciones WHERE id = ?;";
        PreparedStatement st = conectar.prepareStatement(query);
        st.setString(1, ID);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            DATOS.setArea(rs.getString("AREA"));
            DATOS.setEspecializacion(rs.getString("ESPECIALIZACION"));
            DATOS.setTitulo(rs.getString("TITULO"));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la capacitación", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        conectar.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
    }
}
