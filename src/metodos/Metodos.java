
package metodos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Metodos {
    Vector vPricipal= new Vector();
    
    //Guardar los datos en el Vector creado
    public void guardar(datos.Datos unEgresado){
        vPricipal.addElement(unEgresado);
    }
    
    //Guardar en un archivo txt
    public void guardarArchivo(datos.Datos datos){
        try {
            FileWriter fw= new FileWriter("Datos Egresados.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.print(datos.getCodigoUCV());
            pw.print("|"+datos.getApellidos());
            pw.print("|"+datos.getCorreo());
            pw.print("|"+datos.getNacionalidad());
            pw.println("|"+datos.getTel());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato incorrecto");
        }
    }
}
