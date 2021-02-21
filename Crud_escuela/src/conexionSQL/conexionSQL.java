//Aqui es donde vamos a revisar nuestra conexion 
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion()
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root",""); //Enlace a la base de datos 
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa"); // esto s ehace para si la conexion es exitosa muestre un mensjae en pantalla
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de Conexion" + e.getMessage());
        }
        
        return conectar;
    }
    
}
