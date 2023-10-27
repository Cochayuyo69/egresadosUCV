
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import datos.DatosEgresados;
import datos.DatosUsuarios;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdegresados", "root", "20251221");

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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdegresados", "root", "20251221");

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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdegresados", "root", "20251221");

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
    public void buscarPorCodigo(String codigo) {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdegresados", "root", "20251221");
        String sql="";
        
        String[] datos= new String[21];
        
        } catch (Exception e) {
        }
    }
    //para el botón guardar
    public void CompararCodigo(String codigo){
    
    }
    
    //PARA EL LOGIN
    public static boolean verificarCredenciales(String usuario, String contra) {
        boolean autenticado = false;
        try {
            FileReader fr = new FileReader("Usuarios.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 2 && partes[0].equals(usuario) && partes[1].equals(contra)) {
                    autenticado = true;
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de la excepción durante la lectura del archivo.
        }
        return autenticado;
    }
    
    public void conector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Nos conectamos a la bd
            con=DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion " + e);
        }
    }
}

