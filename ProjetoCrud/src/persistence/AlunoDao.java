package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class AlunoDao extends Dao {

	public void create(Aluno a)throws Exception{
     open();
     stmt = con.prepareStatement("insert into aluno values(null,?,?,?,?,?)");
     stmt.setString(1, a.getNome());
     stmt.setString(2, a.getDisciplina());
     stmt.setDouble(3, a.getNota1());
     stmt.setDouble(4, a.getNota2());
     stmt.setString(5, a.getSituacao());
     stmt.execute();
     close();
	}
	//Eu consigo faz
	public List<Aluno>findAll()throws Exception{
		open();
		List<Aluno>lista=new ArrayList<Aluno>();
		stmt= con.prepareStatement("select * from aluno");
		rs = stmt.executeQuery();
		while(rs.next()) {
			Aluno a = new Aluno();
			a.setId(rs.getInt(1));
			a.setNome(rs.getString(2));
			a.setDisciplina(rs.getString(3));
			a.setNota1(rs.getDouble(4));
			a.setNota2(rs.getDouble(5));
			a.setSituacao(rs.getString(6));
			lista.add(a);
		}
		close();
		return lista;
	}
	
	public static void main(String[] args) {
		try {
			AlunoDao ad = new AlunoDao();
			System.out.println(ad.findAll());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
