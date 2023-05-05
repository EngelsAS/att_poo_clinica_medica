package clinica_medica_att_pablo;

public class Medico extends Pessoa {
	
	private String especialidade;
	private int cod_matricula; 
	
	public Medico(String _nome, int _cpf, int _telefone, String _email, String especialidade, int cod_matricula) {
		super(_nome,_cpf,_telefone,_email);
		this.especialidade = especialidade;	
		this.cod_matricula = cod_matricula;
	}
	
	public int getCodMatricula() {
		return cod_matricula;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		System.out.println(especialidade);
		return especialidade;
	}
	
	public void realizaConsulta(Paciente p) {
		
			System.out.println("Consulta com o paciente "+p.getNome()+" realizada");
			p.setConsultaRealizada(this.nome + Integer.toString(this.cod_matricula));
	
		
	}
	
	public void prescreveDiagnostico(Paciente p) {
		if(p.getConsultaRealizada().equals(this.nome + Integer.toString(this.cod_matricula))) {
			System.out.println("------------------------------");
			System.out.println("Diagnostico prescrito");
			System.out.println("------------------------------");
		}else {
			System.out.println("------------------------------");
			System.out.println("A consulta do paciente "+p.getNome()+" ainda nao foi realizada");
			System.out.println("------------------------------");
		}
	}
	
	public void solicitarExames(Paciente p) {
		if(p.getConsultaRealizada().equals(this.nome + Integer.toString(this.cod_matricula))) {
			System.out.println("------------------------------");
			System.out.println("Exames solicitados");
			System.out.println("------------------------------");
		}else {
			System.out.println("------------------------------");
			System.out.println("A consulta do paciente "+p.getNome()+" ainda nao foi realizada");
			System.out.println("------------------------------");
		}
	}

}
