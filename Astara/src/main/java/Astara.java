import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Astara {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String jdbcUrl = "jdbc:sqlserver://10.125.18.17:1433;databaseName=FTPASTARA";
        String username = "rmonsalve";
        String password = "Vigia2023*";
        String fileName = "C:\\Users\\rafael.monsalve\\Documents\\Astara\\INPUT\\ENTDIR_CO_20230721171152.txt"; // Reemplaza con el nombre de tu archivo
        String fileName2 = "C:\\Users\\rafael.monsalve\\Documents\\Astara\\INPUT\\ENTDIR_CO_20230721171152(2).txt",
                CODENTIDAD,
                CODDIRECCION,
                ESTADO,
                CODCLIENTE,
                CAMPA,
                TIPOVIA,
                DESCDIRECCION,
                NUMEROVIA,
                EXTENSIONDIRECCION,
                LOCALIDAD,
                CODIGOPOSTAL,
                PROVINCIA,
                TLFCONTACTO,
                FECHACREACIONSIL,
                FECHAMODIFICACIONSIL;
        int lineNumberToStart =5;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            for (int i = 1; i < lineNumberToStart; i++) {
                br.readLine();
            }
            while ((line = br.readLine()) != null) {
                //System.out.println(br.readLine());


                CODENTIDAD = line.substring(1, 11);
                CODDIRECCION = line.substring(11, 19);
                ESTADO = line.substring(19, 21);
                CODCLIENTE = line.substring(21, 23);
                CAMPA = line.substring(24, 81);
                TIPOVIA = line.substring(111,130);
                DESCDIRECCION=line.substring(130,161);
                NUMEROVIA=line.substring(211,215);
                EXTENSIONDIRECCION=line.substring(210,240);
                LOCALIDAD=line.substring(215,290);
                CODIGOPOSTAL=line.substring(280,297);
                PROVINCIA=line.substring(298,347);
                //TLFCONTACTO=line.substring(348,362);
                //FECHACREACIONSIL=line.substring(363,370);
                //FECHAMODIFICACIONSIL=line.substring(371,379);
                System.out.println(

                                  CODENTIDAD + "|"
                                + CODDIRECCION + "|"
                                + ESTADO + "|"
                                + CODCLIENTE + "|"
                                + CAMPA + "|"
                                + TIPOVIA + "|"
                                +DESCDIRECCION+"|"
                                +NUMEROVIA+"|"
                                +EXTENSIONDIRECCION+"|"
                                +LOCALIDAD+"|"
                                +CODIGOPOSTAL+"|"
                                +PROVINCIA
                                //+TLFCONTACTO+"|"
                                //+TLFCONTACTO+"|"
                               // +FECHACREACIONSIL+"|"
                               // +FECHAMODIFICACIONSIL
                        );
            }
            ;
            //try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // String insertQuery = "INSERT INTO dbo.EntidadesYDireccionesDeLaMarca (Estado,CodCliente,Campa) VALUES ('"+ESTADO+"','"+CODCLIENTE+"',"+CAMPA+"')";
            //  PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            // preparedStatement.executeUpdate();
            // System.out.println("Dato insertado en la base de datos.");
            // }catch (SQLException e) {
            //  e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

    

