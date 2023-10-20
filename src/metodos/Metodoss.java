
package metodos;

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
        JOptionPane.showMessageDialog(null, "Error al guardar/editar el archivo");
    }

    }
    //METODO BUSCAR POR CODIGO
    public String buscarPorCodigo(String codigo) {
    try {
        FileReader fr = new FileReader("Datos Egresados.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("\\|");

            if (partes.length > 0 && partes[0].equals(codigo)) {
                br.close();
                return linea;
            }
        }
        br.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo");
    }

    return null; // Si no se encuentra el código UCV
}

    
}

