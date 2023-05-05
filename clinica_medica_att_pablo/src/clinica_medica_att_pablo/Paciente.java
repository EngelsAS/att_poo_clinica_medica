package clinica_medica_att_pablo;

public class Paciente extends Pessoa {
	
	private int cep;
	private boolean solicitacao = false;
	private String consultaRealizada = "";
	
	public Paciente(String _nome, int _cpf, int _telefone, String _email, int cep) {
		super(_nome,_cpf,_telefone,_email);
		this.cep = cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public int getCep() {
		return cep;
	}
	
	public boolean solicitaConsulta() {
		solicitacao = true;
		return solicitacao;
	}
	
	public void setConsultaRealizada(String IdMedico) {
		this.consultaRealizada = IdMedico;
	}
	
	public String getConsultaRealizada() {
		return consultaRealizada;
	}
}
