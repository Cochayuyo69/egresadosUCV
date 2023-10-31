package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import datos.DatosUsuarios;
import javax.swing.JOptionPane;
import datos.DatosEgresados;


public class Metodoss{
//Llamamos a la clase padre y las variables
    
    // Declaramos la conexion a mysql
    Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cd.jdbc.Driver";
    private static final String user="root";
    private static final String pass="20251221";
    private static final String url="jdbc:mysql://localhost:3306/bdegresados";
    private static PreparedStatement stmt = null;
    
    
    //GUARDAR EGRESADIS EN DB
    public void guardarEgresado(DatosEgresados unEgresado) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "INSERT INTO egresados (Codigo_de_estudiante, Nombre_de_IE, Filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Num_telefono2, Num_telefono3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, Area_trabajo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            if (unEgresado.getCodigoUCV() != null && !unEgresado.getCodigoUCV().isEmpty()) {
                preparedStmt.setString(1, unEgresado.getCodigoUCV());
            } else {
                preparedStmt.setNull(1, java.sql.Types.VARCHAR);
            }
            preparedStmt.setString(2, unEgresado.getNombreIE());
            preparedStmt.setString(3, unEgresado.getFilial());
            preparedStmt.setString(4, unEgresado.getCarrera());
            preparedStmt.setString(5, unEgresado.getApellidoP());
            preparedStmt.setString(6, unEgresado.getApellidoM());
            preparedStmt.setString(7, unEgresado.getNombres());
            preparedStmt.setString(8, unEgresado.getCorreo());
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getTele1() != null && !unEgresado.getTele1().isEmpty()) {
                preparedStmt.setString(9, unEgresado.getTele1());
            } else {
                preparedStmt.setNull(9, java.sql.Types.VARCHAR);
            }
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getTele2() != null && !unEgresado.getTele2().isEmpty()) {
                preparedStmt.setString(10, unEgresado.getTele2());
            } else {
                preparedStmt.setNull(10, java.sql.Types.VARCHAR);
            }
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getTele3() != null && !unEgresado.getTele3().isEmpty()) {
                preparedStmt.setString(11, unEgresado.getTele3());
            } else {
                preparedStmt.setNull(11, java.sql.Types.VARCHAR);
            }
            preparedStmt.setString(12, unEgresado.getAñoEgreso());
            preparedStmt.setString(13, unEgresado.getSemestreEgreso());
            preparedStmt.setString(14, unEgresado.getTipoDocIdenti());
            preparedStmt.setString(15, unEgresado.getNumDocIdenti());
            preparedStmt.setString(16, unEgresado.getEstGrado());
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getReGrado() != null && !unEgresado.getReGrado().isEmpty()) {
                preparedStmt.setString(17, unEgresado.getReGrado());
            } else {
                preparedStmt.setNull(17, java.sql.Types.VARCHAR);
            }
            preparedStmt.setString(18, unEgresado.getEstTitulo());
            // Verifica si el campo de RETITULO está vacío o no
            if (unEgresado.getReTitulo() != null && !unEgresado.getReTitulo().isEmpty()) {
                preparedStmt.setString(19, unEgresado.getReTitulo());
            } else {
                preparedStmt.setNull(19, java.sql.Types.VARCHAR);
            }
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getEstTrabajo() != null && !unEgresado.getEstTrabajo().isEmpty()) {
                preparedStmt.setString(20, unEgresado.getEstTrabajo());
            } else {
                preparedStmt.setNull(20, java.sql.Types.VARCHAR);
            }
            // Verifica si el campo de área de trabajo está vacío o no
            if (unEgresado.getAreaTrabajo() != null && !unEgresado.getAreaTrabajo().isEmpty()) {
                preparedStmt.setString(21, unEgresado.getAreaTrabajo());
            } else {
                preparedStmt.setNull(21, java.sql.Types.VARCHAR);
            }

            preparedStmt.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Egresado guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //GUARDAR USUARIOS EN DB
    public void guardarUsuario(DatosUsuarios Usuario) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "INSERT INTO login (USUARIO,CONTRASEÑA,APELLIDOS_Y_NOMBRES,CORREO_ELECTRONICO) VALUES (?, ?, ?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, Usuario.getUSUARIO());
            preparedStmt.setString(2, Usuario.getCONTRASEÑA());
            preparedStmt.setString(3, Usuario.getAPELLIDOS_Y_NOMBRES());
            preparedStmt.setString(4, Usuario.getCORREO_ELECTRONICO());

            preparedStmt.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Usuario guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //CONSULTA USUARIO Y CONTRASEÑA
    public String consultaUsuario(String usuario, String contra){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String sql = "SELECT * FROM login WHERE USUARIO = ? AND CONTRASEÑA = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, contra);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return "CORRECTOS";
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            return "ERROR";
        }
        return "ERROR";
    }
    
    //METODO BUSCAR POR CODIGO
    public void buscarPorCodigo(String codigo, String numeroDocIdenti,DatosEgresados datos) {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        
        String query = "select*from EGRESADOS WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?";
        PreparedStatement st;
        st = con.prepareStatement(query);
        st.setString(1, codigo);
        st.setString(2,numeroDocIdenti);
        ResultSet rs = st.executeQuery();
        
        if(rs.next()){
            datos.setCodigoUCV(rs.getString(2));
            datos.setNombreIE(rs.getString(3));
            datos.setFilial(rs.getString(4));
            datos.setCarrera(rs.getString(5));
            datos.setApellidoP(rs.getString(6));
            datos.setApellidoM(rs.getString(7));
            datos.setNombres(rs.getString(8));
            datos.setCorreo(rs.getString(9));
            datos.setTele1(rs.getString(10));
            datos.setTele2(rs.getString(11));
            datos.setTele3(rs.getString(12));
            datos.setAñoEgreso(rs.getString(13));
            datos.setSemestreEgreso(rs.getString(14));
            datos.setTipoDocIdenti(rs.getString(15));
            datos.setNumDocIdenti(rs.getString(16));
            datos.setEstGrado(rs.getString(17));
            datos.setReGrado(rs.getString(18));
            datos.setEstTitulo(rs.getString(19));
            datos.setReTitulo(rs.getString(20));
            datos.setEstTrabajo(rs.getString(21));
            datos.setAreaTrabajo(rs.getString(22));
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró al egresado", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //METODO SI EXISTE CODIGO
    public boolean buscarsiExiste(String codigo, String numDocIdenti) {
    boolean existe = false;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        String query = "SELECT * FROM EGRESADOS WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, codigo);
        st.setString(2, numDocIdenti);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            existe = true; // Si hay una fila en el resultado, significa que el código existe en la base de datos
        }
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
    return existe;
}
    
    //METODO EDITAR DB
    public void editar(DatosEgresados unEgresado){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "UPDATE egresados SET Codigo_de_estudiante = ?, Nombre_de_IE = ?, Filial = ?, Carrera = ?, Apellido_paterno = ?, Apellido_materno = ?, Nombres = ?, Correo_electronico = ?, Num_telefono = ?, Num_telefono2 = ?, Num_telefono3 = ?, Año_egreso = ?, Semestre_egreso = ?, Tipo_documento_identidad = ?, Numero_documento_identidad = ?, Tiene_Grado = ?, Resolucion_Grado = ?, Tiene_Titulo = ?, Resolucion_Titulo = ?, Estado_trabajo = ?, Area_trabajo = ? WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?"; 
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, unEgresado.getCodigoUCV());
            preparedStmt.setString(2, unEgresado.getNombreIE());
            preparedStmt.setString(3, unEgresado.getFilial());
            preparedStmt.setString(4, unEgresado.getCarrera());
            preparedStmt.setString(5, unEgresado.getApellidoP());
            preparedStmt.setString(6, unEgresado.getApellidoM());
            preparedStmt.setString(7, unEgresado.getNombres());
            preparedStmt.setString(8, unEgresado.getCorreo());
            preparedStmt.setString(9, unEgresado.getTele1());
            preparedStmt.setString(10, unEgresado.getTele2());
            preparedStmt.setString(11, unEgresado.getTele3());
            preparedStmt.setString(12, unEgresado.getAñoEgreso());
            preparedStmt.setString(13, unEgresado.getSemestreEgreso());
            preparedStmt.setString(14, unEgresado.getTipoDocIdenti());
            preparedStmt.setString(15, unEgresado.getNumDocIdenti());
            preparedStmt.setString(16, unEgresado.getEstGrado());
            preparedStmt.setString(17, unEgresado.getReGrado());
            preparedStmt.setString(18, unEgresado.getEstTitulo());
            preparedStmt.setString(19, unEgresado.getReTitulo());
            preparedStmt.setString(20, unEgresado.getEstTrabajo());
            preparedStmt.setString(21, unEgresado.getAreaTrabajo());
            preparedStmt.setString(22, unEgresado.getCodigoUCV()); // La condición WHERE se basa en el Codigo_de_estudiante
            preparedStmt.setString(23, unEgresado.getNumDocIdenti()); // La condición WHERE para el Numero_documento_identidad

            preparedStmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Egresado editado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error al editar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //METODO PARA MOSTRAR DB
    public void mostrarPorCodigo(String codigo, String numeroDocIdenti,DatosEgresados datos){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        
        String query = "select*from EGRESADOS WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?";
        PreparedStatement st;
        st = con.prepareStatement(query);
        st.setString(1, codigo);
        st.setString(2,numeroDocIdenti);
        ResultSet rs = st.executeQuery();
        
        if(rs.next()){
            datos.setCodigoUCV(rs.getString(2));
            datos.setNombreIE(rs.getString(3));
            datos.setFilial(rs.getString(4));
            datos.setCarrera(rs.getString(5));
            datos.setApellidoP(rs.getString(6));
            datos.setApellidoM(rs.getString(7));
            datos.setNombres(rs.getString(8));
            datos.setCorreo(rs.getString(9));
            datos.setTele1(rs.getString(10));
            datos.setTele2(rs.getString(11));
            datos.setTele3(rs.getString(12));
            datos.setAñoEgreso(rs.getString(13));
            datos.setSemestreEgreso(rs.getString(14));
            datos.setTipoDocIdenti(rs.getString(15));
            datos.setNumDocIdenti(rs.getString(16));
            datos.setEstGrado(rs.getString(17));
            datos.setReGrado(rs.getString(18));
            datos.setEstTitulo(rs.getString(19));
            datos.setReTitulo(rs.getString(20));
            datos.setEstTrabajo(rs.getString(21));
            datos.setAreaTrabajo(rs.getString(22));
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró al egresado", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //METODO PARA MOSTRAR DB
    public String [][] mostrar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT ID, Codigo_de_estudiante, Filial, Apellido_paterno, Apellido_materno, Nombres, " +
                    "Correo_electronico, Num_telefono, Num_telefono2, Num_telefono3, Año_egreso, Semestre_egreso, " +
                    "Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, " +
                    "Tiene_Titulo, Resolucion_Titulo, Estado_trabajo " +
                    "FROM EGRESADOS";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            List<String[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[19]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 19; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                dataList.add(data);
            }
            con.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] dataArr = new String[dataList.size()][19];
            for (int i = 0; i < dataList.size(); i++) {
                dataArr[i] = dataList.get(i);
            }
            return dataArr;
        } catch (Exception e) {
            System.err.println("Error! ");
            System.err.println(e.getMessage());
        }
    return null;
    }
}

