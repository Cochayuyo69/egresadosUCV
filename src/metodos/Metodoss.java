
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import datos.Datos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
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
    //Creamos un vector
    Vector vPrincipal= new Vector();
    
    //Guardar los datos en el Vector creado
    public void guardar(datos.Datos unEgresado){
        vPrincipal.addElement(unEgresado);
        
    }
    
    //Guardar en un archivo txt
    public void guardarArchivo(Datos datos){
    try {
        File archivoOriginal = new File("Datos Egresados.txt");
        File archivoTemporal = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
        PrintWriter pw = new PrintWriter(new FileWriter(archivoTemporal));

        String linea;
        boolean codigoEncontrado = false;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("\\|");

            if (partes.length > 0 && partes[0].equals(datos.getCodigoUCV())) {
                // Reemplazar la línea con los nuevos datos
                pw.println(datos.getCodigoUCV() + "|" +
                           datos.getApellidos() + "|" +
                           datos.getCorreo() + "|" +
                           datos.getNacionalidad() + "|" +
                           datos.getTel() + "|" +
                           datos.getLabura());
                codigoEncontrado = true;
            } else {
                // Mantener las líneas existentes
                pw.println(linea);
            }
        }

        // Si el código no se encontró, agregar una nueva línea
        if (!codigoEncontrado) {
            pw.println(datos.getCodigoUCV() + "|" +
                       datos.getApellidos() + "|" +
                       datos.getCorreo() + "|" +
                       datos.getNacionalidad() + "|" +
                       datos.getTel() + "|" +
                       datos.getLabura());
        }

        br.close();
        pw.close();

        // Renombrar el archivo temporal al original
        archivoOriginal.delete();
        archivoTemporal.renameTo(archivoOriginal);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al guardar/editar el archivo", "Error", JOptionPane.WARNING_MESSAGE);
    }

    }
    //METODO BUSCAR POR CODIGO
    public Datos buscarPorCodigo(String codigo) {
        try {
            FileReader fr = new FileReader("Datos Egresados.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");

                if (partes.length > 0 && partes[0].equals(codigo)) {
                    br.close();
                    Datos datosEncontrados = new Datos();
                    datosEncontrados.setCodigoUCV(partes[0]);
                    datosEncontrados.setApellidos(partes[1]);
                    datosEncontrados.setCorreo(partes[2]);
                    datosEncontrados.setNacionalidad(partes[3]);
                    datosEncontrados.setTel(Integer.parseInt(partes[4]));
                    datosEncontrados.setLabura(partes[5]);
                    return datosEncontrados;
                }
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.WARNING_MESSAGE);        
        }
        return null; // Si no se encuentra el código UCV
    }
    //para el botón guardar
    public void CompararCodigo(String codigo){
        try {
            FileReader fr = new FileReader("Datos Egresados.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length > 0 && partes[0].equals(codigo)) {
                    br.close();
                    JOptionPane.showMessageDialog(null, "El código de estudiante ingresado ya existe en el sistema.", "Error", JOptionPane.WARNING_MESSAGE);    
                }
            }
            br.close();
        } catch (Exception e) {
        }
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
            System.out.println("Error de conexion" + e);
        }
    }
}

