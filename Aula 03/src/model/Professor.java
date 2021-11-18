package model;

public class Professor extends Usuario{
	private int codigo;
	private String materia;
	
	public Professor(String login, String senha, String nome, String cpf, int codigo, String materia) {
		super(login, senha, nome, cpf);
		this.codigo = codigo;
		this.materia = materia;
	}
	
	public void atribuirNota(Aluno aluno, float nota, int va) {
		Aluno user = BaseDados.buscar(aluno);
		if(va > 0 && va <= 4) {
			if(user.getNotas().size() < 4) {
				user.getNotas().add(nota);		
			}
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getMateria() {
		return materia;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
