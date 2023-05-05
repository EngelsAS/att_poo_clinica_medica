package clinica_medica_att_pablo;

public class Recepcionista extends Pessoa {

	private Paciente paciente;
	private Medico medico;
	private Agenda[] listaAgendamento = new Agenda[10];
	
	public Recepcionista(String _nome, int _cpf, int _telefone, String _email, 
			Paciente paciente, Medico medico) {
		super(_nome,_cpf,_telefone,_email);
		
		this.paciente = paciente;
		this.medico = medico;
		
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Agenda[] getListaAgendamento() {
		return listaAgendamento;
	}
	
	public void displayListaAgendamento(Medico m) {
		System.out.println("Lista de agendamentos - Medico: "+m.getNome());
		for(int i = 0; i < listaAgendamento.length; i++) {
			if(listaAgendamento[i] != null) {
				System.out.println(listaAgendamento[i].getData()+"-"+listaAgendamento[i].getHora()+"h"); 
			}
			
		}
		System.out.println();
	}

	public void agendaConsulta(boolean solicitacao, Paciente p, Medico m, String data, int hora, int minutos) {
		if(solicitacao) {
			String horas = Integer.toString(hora) + ":" + Integer.toString(minutos);
			Agenda agenda = new Agenda(data,horas,p,m);
			
			int cond = 1;
			
			if(listaAgendamento[0] == null) {
				listaAgendamento[0] = agenda;
				System.out.println("Consulta agendada com sucesso");
				agenda.displayAgendamento();
				System.out.println("------------------------------");
			}
			else{
				for(int x = 0; x < listaAgendamento.length; x++) {
					
					if(listaAgendamento[x] != null && listaAgendamento[x].getData().equals(agenda.getData()) && listaAgendamento[x].getHora().equals(agenda.getHora())) {
						System.out.println("------------------------------");
						System.out.println("Esse horario nao esta disponivel");
						System.out.println("------------------------------");
						cond = 2;					
					}
					
				}
				
				if(cond == 1) {
					for(int i = 0; i < listaAgendamento.length; i++) {
						
						if(listaAgendamento[i] == null && cond == 1) {
							listaAgendamento[i] = agenda;
							cond = 2;
						}
						
					}
					System.out.println("Consulta agendada com sucesso");
					agenda.displayAgendamento();
					System.out.println("------------------------------");
					
				}
				
			}
			
		}else {
			System.out.println("O paciente nao solicitou nenhuma consulta");
		}
		
	}
	
	
}
