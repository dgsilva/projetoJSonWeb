package rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Aluno;
import persistence.AlunoDao;

@WebServlet("/ControllerRest")
public class ControllerRest extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   			throws ServletException, IOException {
	 try {
		 List<Aluno> resp = new AlunoDao().findAll();
		 response.getWriter().print(new Gson().toJson(resp));
	 }catch(Exception ex) {
		 ex.printStackTrace();
		 response.getWriter().print(ex.getMessage());
	 }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
