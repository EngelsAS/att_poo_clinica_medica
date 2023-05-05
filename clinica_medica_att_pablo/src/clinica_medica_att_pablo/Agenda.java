package clinica_medica_att_pablo;

public class Agenda {
	
	private String data;
	private String hora;
	private Paciente p;
	private Medico m;
	
	public Agenda(String data, String hora, Paciente p, Medico m) {
		this.data = data;
		this.hora = hora;
		this.p = p;
		this.m = m;
	}
	

	public void displayAgendamento() {
		System.out.println("Consulta marcada para a data: "+data+"\nHorario: "+hora+"h\nMedico responsavel: " +m.getNome()+"\nPaciente: "+p.getNome()+" - "+p.getTelefone());;
	}

	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
	}

	public Medico getM() {
		return m;
	}

	public void setM(Medico m) {
		this.m = m;
	}

	public Agenda() {
		
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(int hora, int minutos) {
		this.hora = Integer.toString(hora) + ":" + Integer.toString(minutos);
	}
	
}
