package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

//	public Connection get_connection(){		
//		Connection singletonConn = null;
//
//        if (singletonConn == null) {
//            try {
//
//                String host = "jdbc:mysql://localhost:3306/mensajes_app";
//                String uName = "root";
//                String uPass = "18deenero";
//
//                singletonConn = DriverManager.getConnection(host, uName, uPass);
//
//                // if (connection != null) {
//                //     System.out.printf("Successfully connected to the db...\n");
//                // }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//                //TODO: handle exception
//            }
//        }
//        return singletonConn;	
//	}
	
	//Implementacion patrón Singleton
	private static Connection myConnection;
    public static Connection get_connection(){
        if(myConnection == null) {
            try {
                myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "18deenero");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return myConnection;
    }

}
