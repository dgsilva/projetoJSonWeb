package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	Connection con; //BD
	PreparedStatement stmt; //Tabela
	ResultSet rs; //Consulta
	
	 public void open() throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDDOISNT",
		    "root", "coti"); //ABRE O BANCO DO MYSQL
	 }

	  public void close() throws Exception{
		  con.close(); //Fecha O BANCO DE DADOS ...
	  }
	 
	 
	  
	
	
	
}
