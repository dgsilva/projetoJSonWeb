package entity;

public class Aluno {
	
	private Integer id;
	private String nome;
	private String disciplina;
	private Double nota1;
	private Double nota2;
	private transient Double media=0.; //Transaient - > q não vai gravar 
	private String situacao;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer id, String nome, String disciplina, Double nota1, Double nota2) {
		super();
		this.id = id;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", situacao=" + situacao + "]";
	}
	
	
	public Aluno gerarMedia() {
		this.media = (this.nota1+this.nota2)/2;
		return this;
	}
	
	
	public Aluno gerarSituacao() {
		
		if(this.media>=7) {
			this.situacao="Aprovado";
		}else {
			this.situacao="Reprovado";
		}
		return this;
	}
	
	

}
