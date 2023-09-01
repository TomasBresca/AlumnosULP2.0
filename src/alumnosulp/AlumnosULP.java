package alumnosulp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnosULP {

    public static void main(String[] args) {

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");
            
            /*String sql = "INSERT INTO alumno VALUES"
                    + "(null,4606199,'García','Matías','2002-03-28',true), "
                    + "(null,40405191, 'Díaz', 'Valentín', '2000-08-10',true), "
                    + "(null,39524918, 'Martínez', 'Juan', '1998-06-27',true) ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            int registros = ps.executeUpdate();
            System.out.println(registros);*/
            
             /*String sql = "INSERT INTO materia VALUES"
                     + "(null,'Matemática', 4, true),"
                     + "(null,'Inglés', 2, true),"
                     + "(null,'Laboratorio de Programación', 1, true),"
                     + "(null,'Economía', 3, true)";
             
             PreparedStatement ps = con.prepareStatement(sql);
             int registros = ps.executeUpdate();
             System.out.println(registros);*/
             
             /*String sql = "INSERT INTO inscripcion(idInscripto, nota, idAlumno, idMateria) VALUES"
                     + "(null, 8, 1, 3),"
                     + "(null, 9, 1, 4),"
                     + "(null, 6, 2, 1),"
                     + "(null, 10, 2, 2),"
                     + "(null, 5, 3, 4),"
                     + "(null, 8, 3, 2)";
             
             PreparedStatement ps = con.prepareStatement(sql);
             int registros = ps.executeUpdate();
             System.out.println(registros);*/
             
             /*String sql = "SELECT * FROM alumno JOIN inscripcion ON(alumno.idAlumno = inscripcion.idAlumno) WHERE nota > 8";
             
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             System.out.println("Los alumnos con notas mayores a 8 son:");
             
             while(rs.next()) {
                 System.out.println("ID Alumno :" + rs.getInt("idAlumno"));
                 System.out.println("DNI: " + rs.getInt("dni"));
                 System.out.println("Apellido: " + rs.getString("apellido"));
                 System.out.println("Nombre: " + rs.getString("nombre"));
                 System.out.println("Fecha de Nacimiento: " + rs.getDate("fechaNacimiento"));
                 System.out.println("Estado: " + rs.getBoolean("estado"));
                 System.out.println("-----------------------");
             }*/
             
             String sql = "DELETE from inscripcion WHERE idInscripto = 5";
             
             PreparedStatement ps = con.prepareStatement(sql);
             int registros = ps.executeUpdate();
             System.out.println(registros);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión");

        }

    }

}
