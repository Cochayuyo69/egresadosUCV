
package Excel;

import datos.DatosEgresados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodos.Metodoss;

public class metodos_excel{
    Metodoss metodo= new Metodoss(){};

    //por si el egresado ya existe
    public void editar(DatosEgresados unEgresado){
        try {
            Connection conectar=metodo.abrirconeccion();

            String query = "UPDATE EGRESADOS SET Codigo_de_estudiante = ?, Nombre_de_IE = ?, id_filial = ?, Carrera = ?, Apellido_paterno = ?, Apellido_materno = ?, Nombres = ?, Correo_electronico = ?, Num_telefono = ?, Operador_1 = ?, Num_telefono2 = ?,  Operador_2 = ?, Num_telefono3 = ?,  Operador_3 = ?, Año_egreso = ?, Semestre_egreso = ?, Tipo_documento_identidad = ?, Numero_documento_identidad = ?, Tiene_Grado = ?, Resolucion_Grado = ?, Tiene_Titulo = ?, Resolucion_Titulo = ?, Estado_trabajo = ?, id_area_trabajo = ? WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?"; 
            PreparedStatement preparedStmt = conectar.prepareStatement(query);

            preparedStmt.setString(1, unEgresado.getCodigoUCV());
            preparedStmt.setString(2, unEgresado.getNombreIE());
            preparedStmt.setInt(3, unEgresado.getFilial()); // Asegúrate de obtener el ID de la filial en lugar de su nombre
            preparedStmt.setString(4, unEgresado.getCarrera());
            preparedStmt.setString(5, unEgresado.getApellidoP());
            preparedStmt.setString(6, unEgresado.getApellidoM());
            preparedStmt.setString(7, unEgresado.getNombres());
            preparedStmt.setString(8, unEgresado.getCorreo());
            preparedStmt.setString(9, unEgresado.getTele1());
            preparedStmt.setInt(10, unEgresado.getOperador1());
            preparedStmt.setString(11, unEgresado.getTele2());
            preparedStmt.setInt(12, unEgresado.getOperador2());
            preparedStmt.setString(13, unEgresado.getTele3());
            preparedStmt.setInt(14, unEgresado.getOperador3());
            preparedStmt.setString(15, unEgresado.getAñoEgreso());
            preparedStmt.setString(16, unEgresado.getSemestreEgreso());
            preparedStmt.setString(17, unEgresado.getTipoDocIdenti());
            preparedStmt.setString(18, unEgresado.getNumDocIdenti());
            preparedStmt.setString(19, unEgresado.getEstGrado());
            preparedStmt.setString(20, unEgresado.getReGrado());
            preparedStmt.setString(21, unEgresado.getEstTitulo());
            preparedStmt.setString(22, unEgresado.getReTitulo());
            preparedStmt.setString(23, unEgresado.getEstTrabajo());
            preparedStmt.setInt(24, unEgresado.getAreaTrabajo()); // Asegúrate de obtener el ID del área de trabajo en lugar de su nombre
            preparedStmt.setString(25, unEgresado.getCodigoUCV()); // La condición WHERE se basa en el Codigo_de_estudiante
            preparedStmt.setString(26, unEgresado.getNumDocIdenti()); // La condición WHERE para el Numero_documento_identidad

            preparedStmt.executeUpdate();
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error al editar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    //Si no existe
    public void guardarEgresado(DatosEgresados unEgresado) {
        JOptionPane.showMessageDialog(null, unEgresado.getEstGrado());
        try {
            Connection conectar=metodo.abrirconeccion();

            String sql = "INSERT INTO EGRESADOS (Codigo_de_estudiante, Nombre_de_IE, id_filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Operador_1, Num_telefono2, Operador_2, Num_telefono3, Operador_3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, id_area_trabajo) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conectar.prepareStatement(sql);
            pstmt.setString(1, unEgresado.getCodigoUCV());
            pstmt.setString(2, unEgresado.getNombreIE());
            pstmt.setInt(3, unEgresado.getFilial());
            pstmt.setString(4, unEgresado.getCarrera());
            pstmt.setString(5, unEgresado.getApellidoP());
            pstmt.setString(6, unEgresado.getApellidoM());
            pstmt.setString(7, unEgresado.getNombres());
            pstmt.setString(8, unEgresado.getCorreo());
            pstmt.setString(9, unEgresado.getTele1());
            pstmt.setInt(10, unEgresado.getOperador1());
            pstmt.setString(11, unEgresado.getTele2());
            pstmt.setInt(12, unEgresado.getOperador2());
            pstmt.setString(13, unEgresado.getTele3());
            pstmt.setInt(14, unEgresado.getOperador3());
            pstmt.setString(15, unEgresado.getAñoEgreso());
            pstmt.setString(16, unEgresado.getSemestreEgreso());
            pstmt.setString(17, unEgresado.getTipoDocIdenti());
            pstmt.setString(18, unEgresado.getNumDocIdenti());
            pstmt.setString(19, unEgresado.getEstGrado());
            pstmt.setString(20, unEgresado.getReGrado());
            pstmt.setString(21, unEgresado.getEstTitulo());
            pstmt.setString(22, unEgresado.getReTitulo());
            pstmt.setString(23, unEgresado.getEstTrabajo());
            pstmt.setInt(24, unEgresado.getAreaTrabajo());

            pstmt.executeUpdate();
            pstmt.close();
            conectar.close();
//            JOptionPane.showMessageDialog(null, "Egresado guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            System.out.println(e.getMessage());
        }
    }
}
//