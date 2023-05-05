package clinica_medica_att_pablo;

public class Main {

	public static void main(String[] args) {
		
		Paciente p = new Paciente("Engels",12543, 999999, "exemplo@gmail.com", 5700110);
		Medico m = new Medico("Humberto",12543, 999999, "exemplo@gmail.com", "nutrição", 446);
		Recepcionista r = new Recepcionista("Camila", 12543, 999999, "exemplo@gmail.com", p, m);
		
		Paciente p2 = new Paciente("Andre",12543, 999999, "exemplo@gmail.com", 5700110);
		Medico m2 = new Medico("João",12543, 999999, "exemplo@gmail.com", "nutrição", 447);
		
		Paciente p3 = new Paciente("Carlos",12543, 999999, "exemplo@gmail.com", 5700110);
		Medico m3 = new Medico("Kauã",12543, 999999, "exemplo@gmail.com", "nutrição", 448);
		
		r.agendaConsulta(p.solicitaConsulta(), p, m, "02/06/2023", 8, 0);
		r.agendaConsulta(p2.solicitaConsulta(), p2, m2, "12/06/2023", 9, 27);
		r.agendaConsulta(p3.solicitaConsulta(), p3, m3, "12/06/2023", 10, 27);
		r.agendaConsulta(p3.solicitaConsulta(), p3, m3, "12/06/2023", 10, 27);
		
		m.realizaConsulta(p);
		m.prescreveDiagnostico(p);
		m.solicitarExames(p);
		
		m.prescreveDiagnostico(p3);
		m.solicitarExames(p2);
		
		r.displayListaAgendamento(m);
	}

}
