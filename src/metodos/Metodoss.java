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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.swing.DefaultComboBoxModel;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Metodoss{

    //Llamamos a la clase padre y las variables
    public Metodoss() {
        mProperties = new Properties();
    }
    
    // Declaramos la conexion a mysql
    Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cd.jdbc.Driver";
    private static final String user="root";
    private static final String pass="20251221";
    private static final String url="jdbc:mysql://localhost:3306/prueba1";
    private static PreparedStatement stmt = null;
    
    //Declaramos el correo a utilizar
    private static final String correoEgresados="stmegresadosucv@gmail.com";
    private static final String contraCorreo = "pyjc xcci pbyd migx";
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    
    
    public Connection abrirconeccion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            if(con!=null){
                System.out.println("Coneccion exitosa");
            }
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    return con;
    }
    
    //GUARDAR EGRESADIS EN DB
    public void guardarEgresado(DatosEgresados unEgresado) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO EGRESADOS (Codigo_de_estudiante, Nombre_de_IE, id_filial, Carrera, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Num_telefono, Operador_1, Num_telefono2, Operador_2, Num_telefono3, Operador_3, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo, id_area_trabajo, id_areas_especializacion) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);
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
            pstmt.setInt(25, unEgresado.getEspecializacion());
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Egresado guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            System.out.println(e.getMessage());
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
    
    //METODO BUSCAR POR CODIGO EGRESADO
    public void buscarPorCodigo(String codigo, String numeroDocIdenti, DatosEgresados datos) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        String query = "SELECT * FROM EGRESADOS WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?;";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, codigo);
        st.setString(2, numeroDocIdenti);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            datos.setCodigoUCV(rs.getString("Codigo_de_estudiante"));
            datos.setNombreIE(rs.getString("Nombre_de_IE"));
            datos.setFilial(rs.getInt("id_filial"));
            datos.setCarrera(rs.getString("Carrera"));
            datos.setApellidoP(rs.getString("Apellido_paterno"));
            datos.setApellidoM(rs.getString("Apellido_materno"));
            datos.setNombres(rs.getString("Nombres"));
            datos.setCorreo(rs.getString("Correo_electronico"));
            datos.setTele1(rs.getString("Num_telefono"));
            datos.setOperador1(rs.getInt("Operador_1"));
            datos.setTele2(rs.getString("Num_telefono2"));
            datos.setOperador2(rs.getInt("Operador_2"));
            datos.setTele3(rs.getString("Num_telefono3"));
            datos.setOperador3(rs.getInt("Operador_3"));
            datos.setAñoEgreso(rs.getString("Año_egreso"));
            datos.setSemestreEgreso(rs.getString("Semestre_egreso"));
            datos.setTipoDocIdenti(rs.getString("Tipo_documento_identidad"));
            datos.setNumDocIdenti(rs.getString("Numero_documento_identidad"));
            datos.setEstGrado(rs.getString("Tiene_Grado"));
            datos.setReGrado(rs.getString("Resolucion_Grado"));
            datos.setEstTitulo(rs.getString("Tiene_Titulo"));
            datos.setReTitulo(rs.getString("Resolucion_Titulo"));
            datos.setEstTrabajo(rs.getString("Estado_trabajo"));
            datos.setAreaTrabajo(rs.getInt("id_area_trabajo"));
            datos.setEspecializacion(rs.getInt("id_areas_especializacion"));
        } else {
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

            String query = "UPDATE EGRESADOS SET Codigo_de_estudiante = ?, Nombre_de_IE = ?, id_filial = ?, Carrera = ?, Apellido_paterno = ?, Apellido_materno = ?, Nombres = ?, Correo_electronico = ?, Num_telefono = ?, Operador_1 = ?, Num_telefono2 = ?,  Operador_2 = ?, Num_telefono3 = ?,  Operador_3 = ?, Año_egreso = ?, Semestre_egreso = ?, Tipo_documento_identidad = ?, Numero_documento_identidad = ?, Tiene_Grado = ?, Resolucion_Grado = ?, Tiene_Titulo = ?, Resolucion_Titulo = ?, Estado_trabajo = ?, id_area_trabajo = ?, id_areas_especializacion=? WHERE Codigo_de_estudiante = ? OR Numero_documento_identidad = ?"; 
            PreparedStatement preparedStmt = con.prepareStatement(query);

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
            preparedStmt.setInt(25, unEgresado.getEspecializacion());
            preparedStmt.setString(26, unEgresado.getCodigoUCV()); // La condición WHERE se basa en el Codigo_de_estudiante
            preparedStmt.setString(27, unEgresado.getNumDocIdenti()); // La condición WHERE para el Numero_documento_identidad

            preparedStmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Egresado editado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error al editar." + e.getMessage());
        }
    }
    
    //METODO PARA MOSTRAR en 
    public String[][] mostrarEgresados() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT id, Codigo_de_estudiante, id_filial, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico, Año_egreso, Semestre_egreso, Tipo_documento_identidad, Numero_documento_identidad, Tiene_Grado, Resolucion_Grado, Tiene_Titulo, Resolucion_Titulo, Estado_trabajo FROM EGRESADOS;";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            List<String[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[16]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 16; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                dataList.add(data);
            }
            con.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] dataArr = new String[dataList.size()][16];
            for (int i = 0; i < dataList.size(); i++) {
                dataArr[i] = dataList.get(i);
            }
            return dataArr;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error" + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    //METODO PARA MOSTRAR en 
    public String[][] mostrarEgresadosInvi(int perfil, int espe) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT Codigo_de_estudiante, Apellido_paterno, Apellido_materno, Nombres, Correo_electronico FROM EGRESADOS WHERE id_area_trabajo = ? and id_areas_especializacion = ?;";

            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, perfil);
            st.setInt(2, espe);
            
            ResultSet rs = st.executeQuery();

            List<String[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[5]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 5; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                dataList.add(data);
            }
            con.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] dataArr = new String[dataList.size()][5];
            for (int i = 0; i < dataList.size(); i++) {
                dataArr[i] = dataList.get(i);
            }
            return dataArr;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "No se encontraron egresados con ese perfil o especialización." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    //METODO PARA CARGAR COMBO OPERADOR
    public DefaultComboBoxModel<String> obtenerNombresOperadores() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_operador FROM Operadores";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombreOperador = rs.getString("Nombre_operador");
                model.addElement(nombreOperador);
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener nombres de operadores: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return model;
    }
    
    //METODO PARA CARGAR COMBO AREA DE TRABAJO
    public DefaultComboBoxModel<String> obtener_areas_trabajo() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_area FROM Areas_Trabajo";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre_area = rs.getString("Nombre_area");
                model.addElement(nombre_area);
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener nombres de areas de trabajo: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return model;
    }
    
    //Metodo para obtener el id de area de trabajo
    public int obtener_id_Area_trabajo(String nombre_area) {
        int id_area = 0; // Valor por defecto si no se encuentra el ID\
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_area_trabajo FROM Areas_Trabajo WHERE Nombre_area = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombre_area);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                id_area = rs.getInt("id_area_trabajo");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID del operador: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return id_area;
    }
    
    //metodo para obtener nombre del area
    public String obtener_nombre_area(int id_area){
        String nombre_area="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_area FROM Areas_Trabajo WHERE id_area_trabajo = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_area);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nombre_area = rs.getString("Nombre_area");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error el nombre del operador: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return nombre_area;
    }
    //METODO PARA OBTENER EL ID DEL COMBO
    public int obtenerIdOperador(String nombreOperador) {
        int idOperador = 0; // Valor por defecto si no se encuentra el ID\
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_operador FROM operadores WHERE Nombre_operador = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombreOperador);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idOperador = rs.getInt("id_operador");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID del operador: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return idOperador;
    }
    
    //METODO PARA OBTENER EL NOMBRE DEL OPERADOR SEGUN  SU ID
    public String obtenerNombreOPERADOR(int idOperador) {
        String nombreOperador = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_operador FROM operadores WHERE id_operador = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idOperador);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nombreOperador = rs.getString("Nombre_operador");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error el nombre del operador: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return nombreOperador;
    }
    
    //METODO PARA CARGAR COMBO FILIAL
    public DefaultComboBoxModel<String> obtenerNombresFiliales() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_filial FROM Filiales";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombreFilial = rs.getString("Nombre_filial");
                model.addElement(nombreFilial);
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener nombres de filiales: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return model;
    }
    //METODO PARA OBTENER EL ID DEL COMBO
    public int obtenerIdFilial(String nombreFilial) {
        int idFilial = 0; // Valor por defecto si no se encuentra el ID
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_filial FROM Filiales WHERE Nombre_filial = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombreFilial);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idFilial = rs.getInt("id_filial");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de la filial: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return idFilial;
    }
    //METODO PARA OBTENER EL NOMBRE DE LA FILIAL SEGUN  SU ID
    public String obtenerNombreFILIAL(int idFilial) {
        String nombreFilial = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_filial FROM Filiales WHERE id_filial  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idFilial);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nombreFilial = rs.getString("Nombre_filial");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error el nombre de la filial: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return nombreFilial;
    }
    // Obtener id especializacion
    public int obtener_id_especializacion(String nombre_especializacion) {
        int id_especializacion = 0; // Valor por defecto si no se encuentra el ID
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_area_trabajo FROM areas_especializacion WHERE Nombre_especializacion = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombre_especializacion);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                id_especializacion = rs.getInt("id_area_trabajo");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de la especializacion: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return id_especializacion;
    }
    //Obtener nombre especializacion
    public String obtener_nombre_especializacion(int id_especializacion) {
        String nombreespecializacion = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_especializacion FROM areas_especializacion WHERE id_area_trabajo  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_especializacion);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                nombreespecializacion = rs.getString("Nombre_especializacion");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error el nombre de la filial: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return nombreespecializacion;
    }
    //VERIFICAR CORREO
    public boolean verificarCorreo(String correo){
        if (correo.endsWith("@ucvvirtual.edu.pe")) {
            return true;
        } else {
            return false;
        }
    }
    //BUSCAR POR CORREO
    public boolean consultaCorreo(String correo){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String sql = "SELECT * FROM login WHERE CORREO_ELECTRONICO = ?";
            stmt = con.prepareStatement(sql);

            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            return false;
        }
        return false;
    }
    
    //GENERAR NUMEROS RANDOM
    public static String generarNumerosAlAzar() {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crear un array para almacenar los números al azar
        int[] numeros = new int[5];

        // Generar 5 números al azar y almacenarlos en el array
        for (int i = 0; i < 5; i++) {
            numeros[i] = random.nextInt(10); // Números aleatorios del 0 al 9
        }

        // Convertir el array de números a una cadena
        StringBuilder resultado = new StringBuilder();
        for (int numero : numeros) {
            resultado.append(numero);
        }

        return resultado.toString();
    }
    
    //ENVIAR CORREO NUEVA CONTRASENA
    public void enviarCorreoNuevaContra(String correo, String codigo){
        String emailTo = correo;
        String subject = "CAMBIO DE CONTRASEÑA";
        String content = "<h1>SI NO HAS INTENTADO CAMBIAR TU CONTRASEÑA IGNORA ESTE CORREO</h1><br>Tu código de verificación es: <b>" + codigo + "</b>";
        createEmail(emailTo, subject, content);
        sendEmail("Se ha enviado el código de verificación.");
    }
    
    //ENVIAR CORREO NUEVA CONTRASENA
    public void enviarCorreoVerifacion(String correo, String codigo){
        String emailTo = correo;
        String subject = "Correo de verificación";
        String content = "<h1>¡Bienvenido!</h1><br>Tu código de verificación es: <b>" + codigo + "</b>";
        createEmail(emailTo, subject, content);
        sendEmail("Se ha enviado el código de verificación.");
    }
    
    //METODO CREAR CORREO
    private void createEmail(String emailTo, String subject, String content){
        mProperties = new Properties();
        //Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");    
        mProperties.setProperty("mail.smtp.user", correoEgresados);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        mCorreo = new MimeMessage(mSession);
        try {
            mCorreo.setFrom(new InternetAddress(correoEgresados));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(Metodoss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Metodoss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //METODO ENVIAR CORREO
    private void sendEmail(String message){
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(correoEgresados, contraCorreo);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            JOptionPane.showMessageDialog(null, message, "INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);

            } catch (NoSuchProviderException ex) {
            Logger.getLogger(Metodoss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Metodoss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CambiarContra(String contra, String correo){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "UPDATE LOGIN SET CONTRASEÑA = ? WHERE CORREO_ELECTRONICO = ?"; 
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, contra);
            preparedStmt.setString(2, correo);
            preparedStmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Contraseña actualizad con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar la nueva contraseña." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //ENVIAR CORREO EGRESADOS
    public void enviarCorreoEgre(String correo, String mensaje, String Titulo){
        String emailTo = correo;
        String subject = Titulo;
        String content = mensaje;
        createEmail(emailTo, subject, content);
        sendEmail("Se ha enviado correo el o los correos.");
    }
    
    
    //GUARDAR PERFILES EN DB
    public void guardarPerfil(String perfil) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "INSERT INTO areas_trabajo (Nombre_area) VALUES (?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, perfil);

            preparedStmt.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Perfil guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //METODO PARA CARGAR COMBO OPERADOR
    public DefaultComboBoxModel<String> obtenerNombresPerfiles() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT Nombre_area FROM areas_trabajo;";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombrePerfil = rs.getString("Nombre_area");
                model.addElement(nombrePerfil);
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los perfiles: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return model;
    }
    
    //METODO PARA OBTENER EL ID DEL COMBO
    public int obtenerIdPerfil(String nombrePerfil) {
        int idPerfil = 0; // Valor por defecto si no se encuentra el ID\
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_area_trabajo FROM areas_trabajo WHERE Nombre_area = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombrePerfil);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idPerfil = rs.getInt("id_area_trabajo");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID del Perfil: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return idPerfil;
    }
    
    //METODO PARA OBTENER EL ID DEL COMBO
    public int obtenerIdEspe(String nombrePerfil) {
        int idPerfil = 0; // Valor por defecto si no se encuentra el ID\
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT id_area_trabajo FROM areas_especializacion WHERE Nombre_especializacion = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nombrePerfil);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idPerfil = rs.getInt("id_area_trabajo");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de la especialización: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        return idPerfil;
    }
    
    
    //GUARDAR ESPECIALIZACION EN DB
    public void guardarEspecializacion(String espe, int idperfil) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "INSERT INTO areas_especializacion (Nombre_especializacion,id_perfil) VALUES (?,?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, espe);
            preparedStmt.setInt(2, idperfil);

            preparedStmt.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Especialización guardado con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,  "Error al guardar." + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public Object[] buscarPorEspecial(int idEspecializacion) {
    Object[] resultado = null; // Array para almacenar el resultado

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        String query = "SELECT * FROM areas_especializacion WHERE id_area_trabajo = ?;";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, idEspecializacion);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            int idPerfil = rs.getInt("id_perfil");
            String nombreEspecializacion = rs.getString("Nombre_especializacion");

            resultado = new Object[]{idPerfil, nombreEspecializacion};
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la especialización.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar la especialización: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }

    return resultado;
}
    
    //buscar por id Perfil
    public String obtenerNombrePERFIL(int idPerfil) {
        String res = null; // Vector para almacenar los resultados

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT * FROM areas_trabajo WHERE id_area_trabajo = ?;";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, idPerfil);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                res = rs.getString("Nombre_area");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el perfil.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el perfil: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return res;
    }
    
    //Borrar Especial
    public void borrarEspecializacion(String especial) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        String query = "DELETE FROM areas_especializacion WHERE Nombre_especializacion=?;";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, especial);

        // Cambiar executeQuery por executeUpdate para operaciones de actualización (DELETE, UPDATE, INSERT)
        int rowsAffected = st.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Se borró la especialización con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la especialización para borrar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la especialización: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
}
    
    
    //METODO BUSCAR POR ID PERFIL
    public String buscarPorIDPerfil(String codigo) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        String perfil = "";
        String query = "SELECT * FROM areas_trabajo WHERE id_area_trabajo = ?;";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, codigo);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            perfil = rs.getString("Nombre_area");
            return perfil;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el Perfil", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
        return null;
}
    
    //Borrar Especial
    public void borrarPerfil(String codigo) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        // Primero, borra las especializaciones relacionadas
        String deleteEspecializacionesQuery = "DELETE FROM areas_especializacion WHERE id_perfil = ?";
        PreparedStatement deleteEspecializacionesSt = con.prepareStatement(deleteEspecializacionesQuery);
        deleteEspecializacionesSt.setString(1, codigo);

        int especializacionesRowsAffected = deleteEspecializacionesSt.executeUpdate();

        // Luego, borra el área de trabajo principal
        String deleteAreaTrabajoQuery = "DELETE FROM areas_trabajo WHERE id_area_trabajo = ?";
        PreparedStatement deleteAreaTrabajoSt = con.prepareStatement(deleteAreaTrabajoQuery);
        deleteAreaTrabajoSt.setString(1, codigo);

        int areaTrabajoRowsAffected = deleteAreaTrabajoSt.executeUpdate();

        if (areaTrabajoRowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Se borró el perfil y sus especializaciones con éxito.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el perfil para borrar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el perfil: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
    }
}
    
    //METODO SI EXISTE CODIGO
    public boolean buscarPerfil(String perfil) {
        boolean existe = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT * FROM areas_trabajo WHERE Nombre_area = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, perfil);;
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
    
    //METODO SI EXISTE CODIGO
    public boolean buscarEspecial(String especial) {
        boolean existe = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT * FROM areas_especializacion WHERE Nombre_especializacion = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, especial);
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
    
    public String hora(){
        Calendar Hora= Calendar.getInstance();
        int H, Min;
        String Hora_Actual;
        Min=Hora.get(Calendar.MINUTE);
        if(Min<10){
            Hora_Actual=Hora.get(Calendar.HOUR_OF_DAY)+":"+"0"+Min;
        }else{
            Hora_Actual=Hora.get(Calendar.HOUR_OF_DAY)+":"+Min;
        }
        return Hora_Actual;
    }
    public String fecha(){
        String fecha=String.valueOf(LocalDate.now());
        return fecha;
    }
    public int obtener_id_del_titulo(String Titulo){
        String[] parts = Titulo.split("\\s{2,}");
        String id = parts[1].substring(parts[1].indexOf(":") + 1).trim();
        int ID=Integer.parseInt(id);
        return ID;
    }
    
    //METODO SI EXISTE CODIGO
    public DefaultComboBoxModel<String> conseguirAniosCapas(String area, String especializacion) {
        DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

        try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                String query = "SELECT DISTINCT YEAR(STR_TO_DATE(FECHA, '%d/%m/%Y')) AS Anio FROM Capacitaciones WHERE AREA = ? AND ESPECIALIZACION = ?";
                try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setString(1, area);
                statement.setString(2, especializacion);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int year = resultSet.getInt("Anio");
                        String anio = ""+year;
                        modeloComboBox.addElement(anio);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los años: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return modeloComboBox;    
    }
    
    private String obtenerNombreMes(int numeroMes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Asegurarse de que el número del mes esté dentro de un rango válido
        if (numeroMes >= 1 && numeroMes <= 12) {
            return nombresMeses[numeroMes - 1];
        } else {
            return "Mes no válido";
        }
    }
    
    public int obtenerNumeroMes(String nombreMes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Buscar el nombre del mes en el arreglo y devolver su posición + 1 (considerando que los meses comienzan en 1)
        for (int i = 0; i < nombresMeses.length; i++) {
            if (nombresMeses[i].equalsIgnoreCase(nombreMes)) {
                return i + 1;
            }
        }

        // Si no se encuentra el nombre del mes, retornar -1 o algún valor que indique que no es válido
        return -1;
    }
    
    
    public DefaultComboBoxModel<String> conseguirMesesCapas(String area, String especializacion, String anioSeleccionado) {
        DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String query = "SELECT DISTINCT MONTH(STR_TO_DATE(FECHA, '%d/%m/%Y')) AS Mes " +
                           "FROM Capacitaciones " +
                           "WHERE AREA = ? AND ESPECIALIZACION = ? AND YEAR(STR_TO_DATE(FECHA, '%d/%m/%Y')) = ?";

            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setString(1, area);
                statement.setString(2, especializacion);
                statement.setString(3, anioSeleccionado);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int mesNumero = resultSet.getInt("Mes");
                        String nombreMes = obtenerNombreMes(mesNumero); // Método auxiliar para obtener el nombre del mes
                        modeloComboBox.addElement(nombreMes);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los meses: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return modeloComboBox;
    }
    public String obtener_titulo_capacitacion (int id_capacitacion){
    String res = null; // Vector para almacenar los resultados

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT * FROM Capacitaciones WHERE ID_CAPACITACION = ?;";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id_capacitacion);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                res = rs.getString("TITULO");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la capacitación", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el titulo de la capacitación " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        return res;
    }
    public String[] obtener_partes_titulo(String Titulo){
        String[] parts = Titulo.split("\\.");
        return parts;
    }
    
    public String[] obtenerDetallesCapacitacion(String perfil, String espe, String titulo) {
        String[] detalles = new String[7]; // Vector para almacenar los detalles de la capacitación

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT * FROM CAPACITACIONES WHERE AREA = ? AND ESPECIALIZACION = ? and TITULO = ?;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, perfil);
            st.setString(2, espe);
            st.setString(3, titulo);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                // Obtener los detalles de la capacitación
                detalles[0] = rs.getString("TITULO");
                detalles[1] = rs.getString("FECHA");
                detalles[2] = rs.getString("TURNO");
                detalles[3] = rs.getString("HORA");
                detalles[4] = rs.getString("MODALIDAD");
                detalles[5] = rs.getString("MONTO");
                detalles[6] = rs.getString("MENSAJE");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la capacitación", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la capacitación: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    public String[] CapaMayorAsist(String fechaInicio, String fechaFin) {
        String[] detalles = new String[7];

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT hc.ID_CAPACITACION AS ID_CAPACITACION, c.TITULO AS NOMBRE, c.MONTO AS MONTO, c.MODALIDAD AS MODALIDAD, COUNT(hc.CODIGO_EGRESADO) AS CANTIDAD_INVITACIONES, SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) AS CANTIDAD_ASISTENTES, ROUND((SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) / COUNT(*)) * 100, 2) AS PORCENTAJE_ASISTENCIAS FROM HISTORIAL_CAPACITACIONES hc INNER JOIN Capacitaciones c ON hc.ID_CAPACITACION = c.ID_CAPACITACION WHERE hc.FECHA_ENVIO BETWEEN ? AND ? GROUP BY hc.ID_CAPACITACION ORDER BY PORCENTAJE_ASISTENCIAS DESC LIMIT 1;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, fechaInicio);
            st.setString(2, fechaFin);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                detalles[0] = rs.getString("ID_CAPACITACION");
                detalles[1] = rs.getString("NOMBRE");
                detalles[2] = rs.getString("MONTO");
                detalles[3] = rs.getString("MODALIDAD");
                detalles[4] = rs.getString("CANTIDAD_INVITACIONES");
                detalles[5] = rs.getString("CANTIDAD_ASISTENTES");
                detalles[6] = rs.getString("PORCENTAJE_ASISTENCIAS");
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la capacitación: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    public String[] CapaMenorAsist(String fechaInicio, String fechaFin) {
        String[] detalles = new String[7];

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT hc.ID_CAPACITACION AS ID_CAPACITACION, c.TITULO AS NOMBRE, c.MONTO AS MONTO, c.MODALIDAD AS MODALIDAD, COUNT(hc.CODIGO_EGRESADO) AS CANTIDAD_INVITACIONES, SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) AS CANTIDAD_ASISTENTES, ROUND((SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) / COUNT(*)) * 100, 2) AS PORCENTAJE_ASISTENCIAS FROM HISTORIAL_CAPACITACIONES hc INNER JOIN Capacitaciones c ON hc.ID_CAPACITACION = c.ID_CAPACITACION WHERE hc.FECHA_ENVIO BETWEEN ? AND ? GROUP BY hc.ID_CAPACITACION ORDER BY PORCENTAJE_ASISTENCIAS ASC LIMIT 1;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, fechaInicio);
            st.setString(2, fechaFin);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                detalles[0] = rs.getString("ID_CAPACITACION");
                detalles[1] = rs.getString("NOMBRE");
                detalles[2] = rs.getString("MONTO");
                detalles[3] = rs.getString("MODALIDAD");
                detalles[4] = rs.getString("CANTIDAD_INVITACIONES");
                detalles[5] = rs.getString("CANTIDAD_ASISTENTES");
                detalles[6] = rs.getString("PORCENTAJE_ASISTENCIAS");
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la capacitación: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    public String[] CapaMayorAsistEspe(String fechaInicio, String fechaFin, String area, String espe) {
        String[] detalles = new String[7];

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT hc.ID_CAPACITACION AS ID_CAPACITACION, c.TITULO AS NOMBRE, c.MONTO AS MONTO, c.MODALIDAD AS MODALIDAD, COUNT(hc.CODIGO_EGRESADO) AS CANTIDAD_INVITACIONES, SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) AS CANTIDAD_ASISTENTES, ROUND((SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) / COUNT(*)) * 100, 2) AS PORCENTAJE_ASISTENCIAS FROM HISTORIAL_CAPACITACIONES hc INNER JOIN Capacitaciones c ON hc.ID_CAPACITACION = c.ID_CAPACITACION WHERE hc.FECHA_ENVIO BETWEEN ? AND ? AND c.AREA = ? AND c.ESPECIALIZACION = ? GROUP BY hc.ID_CAPACITACION ORDER BY PORCENTAJE_ASISTENCIAS DESC LIMIT 1;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, fechaInicio);
            st.setString(2, fechaFin);
            st.setString(3, area);
            st.setString(4, espe);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                detalles[0] = rs.getString("ID_CAPACITACION");
                detalles[1] = rs.getString("NOMBRE");
                detalles[2] = rs.getString("MONTO");
                detalles[3] = rs.getString("MODALIDAD");
                detalles[4] = rs.getString("CANTIDAD_INVITACIONES");
                detalles[5] = rs.getString("CANTIDAD_ASISTENTES");
                detalles[6] = rs.getString("PORCENTAJE_ASISTENCIAS");
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la capacitación: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    
    public String[] CapaMenorAsistEspe(String fechaInicio, String fechaFin, String area, String espe) {
        String[] detalles = new String[7];

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT hc.ID_CAPACITACION AS ID_CAPACITACION, c.TITULO AS NOMBRE, c.MONTO AS MONTO, c.MODALIDAD AS MODALIDAD, COUNT(hc.CODIGO_EGRESADO) AS CANTIDAD_INVITACIONES, SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) AS CANTIDAD_ASISTENTES, ROUND((SUM(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 ELSE 0 END) / COUNT(*)) * 100, 2) AS PORCENTAJE_ASISTENCIAS FROM HISTORIAL_CAPACITACIONES hc INNER JOIN Capacitaciones c ON hc.ID_CAPACITACION = c.ID_CAPACITACION WHERE hc.FECHA_ENVIO BETWEEN ? AND ? AND c.AREA = ? AND c.ESPECIALIZACION = ? GROUP BY hc.ID_CAPACITACION ORDER BY PORCENTAJE_ASISTENCIAS ASC LIMIT 1;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, fechaInicio);
            st.setString(2, fechaFin);
            st.setString(3, area);
            st.setString(4, espe);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                detalles[0] = rs.getString("ID_CAPACITACION");
                detalles[1] = rs.getString("NOMBRE");
                detalles[2] = rs.getString("MONTO");
                detalles[3] = rs.getString("MODALIDAD");
                detalles[4] = rs.getString("CANTIDAD_INVITACIONES");
                detalles[5] = rs.getString("CANTIDAD_ASISTENTES");
                detalles[6] = rs.getString("PORCENTAJE_ASISTENCIAS");
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la capacitación: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    public String[] ConsultaTotalEgre(String codEgre) {
        String[] detalles = new String[8]; // Actualizado para eliminar No_Asistencias

        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT CONCAT(e.Nombres, ' ', e.Apellido_paterno, ' ', e.Apellido_materno) AS Nombres, e.Num_telefono, e.Num_telefono2, e.Num_telefono3, COUNT(hc.ASISTENCIA) AS Total_Asistencias, ROUND(COUNT(CASE WHEN hc.ASISTENCIA = 'SI' THEN 1 END) / COUNT(*) * 100, 2) AS Porcentaje_Asistencias, ROUND(COUNT(CASE WHEN hc.COMPROMISO = 'SI' THEN 1 END) / COUNT(*) * 100, 2) AS Porcentaje_Comprometido_no_Asistido, COUNT(*) AS Numero_Invitaciones FROM EGRESADOS e LEFT JOIN HISTORIAL_CAPACITACIONES hc ON e.Codigo_de_estudiante = hc.CODIGO_EGRESADO WHERE e.Codigo_de_estudiante = ? GROUP BY e.id;";
            PreparedStatement st = conectar.prepareStatement(query);
            st.setString(1, codEgre);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                detalles[0] = rs.getString("Nombres");
                detalles[1] = rs.getString("Num_telefono");
                detalles[2] = rs.getString("Num_telefono2");
                detalles[3] = rs.getString("Num_telefono3");
                detalles[4] = rs.getString("Total_Asistencias");
                detalles[5] = rs.getString("Porcentaje_Asistencias");
                detalles[6] = rs.getString("Porcentaje_Comprometido_no_Asistido");
                detalles[7] = rs.getString("Numero_Invitaciones");
            }

            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del Egresado: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }

        return detalles;
    }
    
    
    
    public static String[] modificarDetalles(String[] detalles) {
        // Modificar la fecha
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd 'de' MMMM");

        try {
            Date fecha = formatoEntrada.parse(detalles[1]);
            detalles[1] = formatoSalida.format(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Modificar el monto
        detalles[5] = detalles[5].split("\\.")[0]; // Eliminar los decimales

        return detalles;
    }
    
    
    //MÉTODO PARA CONSULTA DE LOS COMPROMETIDOS PERO QUE NO FUERON
    public String[][] mostrar_C_noFueron() {
        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT DISTINCT CONCAT(e.Nombres, ' ', e.Apellido_paterno, ' ', e.Apellido_materno) AS nombre_completo, e.Num_telefono AS numero_1, e.Num_telefono2 AS numero_2, e.Num_telefono3 AS numero_3, hc.COMPROMISO, hc.ASISTENCIA FROM EGRESADOS e LEFT JOIN HISTORIAL_CAPACITACIONES hc ON e.Codigo_de_estudiante = hc.CODIGO_EGRESADO WHERE hc.COMPROMISO = 'SI' AND hc.ASISTENCIA = 'NO' ORDER BY (CASE WHEN hc.COMPROMISO = 'SI' AND hc.ASISTENCIA = 'NO' THEN 1 ELSE 0 END) DESC";

            PreparedStatement st = conectar.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            List<String[]> lista_egresados = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[6]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 6; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                lista_egresados.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_egresados = new String[lista_egresados.size()][6];
            for (int i = 0; i < lista_egresados.size(); i++) {
                matriz_egresados[i] = lista_egresados.get(i);
            }
            return matriz_egresados;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener egresados: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    //MOSTRAR EGRESADOS QUE NUNCA FUERON
    public String[][] Egre_nunca_fueron() {
        try {
            Connection conectar = abrirconeccion();
            String query = "SELECT CONCAT(Nombres, ' ', Apellido_paterno, ' ', Apellido_materno) AS nombre_completo, Num_telefono AS numero_1, Num_telefono2 AS numero_2, Num_telefono3 AS numero_3 FROM EGRESADOS INNER JOIN HISTORIAL_CAPACITACIONES ON EGRESADOS.Codigo_de_estudiante = HISTORIAL_CAPACITACIONES.CODIGO_EGRESADO WHERE HISTORIAL_CAPACITACIONES.COMPROMISO = 'no' AND HISTORIAL_CAPACITACIONES.ASISTENCIA = 'no' ORDER BY IFNULL(HISTORIAL_CAPACITACIONES.COMPROMISO, 0) DESC, IFNULL(HISTORIAL_CAPACITACIONES.ASISTENCIA, 0) ASC;";

            PreparedStatement st = conectar.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            List<String[]> lista_egresados = new ArrayList<>();
            while (rs.next()) {
                String[] data = new String[4]; // Ajusta el tamaño en función de las columnas que estás recuperando
                for (int j = 0; j < 4; j++) { // Ajusta el límite en función de las columnas que estás recuperando
                    data[j] = rs.getString(j + 1);
                }
                lista_egresados.add(data);
            }
            conectar.close();

            // Convertir la lista en una matriz de dos dimensiones
            String[][] matriz_egresados = new String[lista_egresados.size()][6];
            for (int i = 0; i < lista_egresados.size(); i++) {
                matriz_egresados[i] = lista_egresados.get(i);
            }
            return matriz_egresados;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener egresados: " + e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
}


