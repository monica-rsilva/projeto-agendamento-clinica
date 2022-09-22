package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;
import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AppClinica {

	public static void main(String[] args) {

//		Criar um plano de saúde 

		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Prata");
		
		
//		Criando o objeto já passando o nome da operadora 	
		PlanoDeSaude plano3 = new PlanoDeSaude("Amil");
		

//		Criando um endereço 

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elton Silva");
		endereco.setNumero("905");
		endereco.setCidade("Jandira");
		endereco.setBairro("Centro");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setTipo("");
		endereco.setComplemento("Instituição de Ensino");
		endereco.setPontoReferencia("Em frente a prefeitura");
		endereco.setCep("06600-025");

//  	Criando um paciente 

		Paciente paciente = new Paciente();
		paciente.setNome("Patricia Dos Santos");
		paciente.setEmail("pat@uol.com.br");
		paciente.setCpf("123.456.789-00");
		paciente.setRg("123.456-99");
		paciente.setTelefone("(11)98745-6523");
		paciente.setTipoSanguineo("O+");
		paciente.setGenero(Genero.FEMININO);
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(plano);

//		Criar uma especialidade médica 

		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologista");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("otorrinorologista");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clinico Geral");

//		Criando um médico 

		Medico medico1 = new Medico();
		medico1.setNome("Marcos Perreira");
		medico1.setCrm("4562-9");
		medico1.setSexo("Masculino");
		medico1.setDataNasciemnto(LocalDate.of(1990, 6, 8)); // 08/06/1990

//		Criar a lista de Especialidades do Dr.Marcos 
		Especialidade[] especialidadesMedico1 = { especialidade1, especialidade3 };

		medico1.setEspecialidade(especialidadesMedico1);

//		Criar outro médico 

		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setCrm("3214-5");
		medico2.setSexo("Feminino");
		medico2.setDataNasciemnto(LocalDate.of(1984, 11, 27)); // 27/11/1984

		Especialidade[] especialidadesMedico2 = { especialidade2 };

		medico2.setEspecialidade(especialidadesMedico2);

//		Criar uma agenda 
//		A paciente patricia ligou na clinica para agendar uma consulta 
//		com um clinico geral para 22/09/2022 às 14h20

		Agenda agenda = new Agenda();
		agenda.setPaciente(paciente);
		agenda.setEspecialidade(especialidade3);
		agenda.setMedico(medico1);
		agenda.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda.setHoraDaConsulta(LocalTime.of(14, 20));
		agenda.setObservacoes("Paciente reclamando de dor nas costas.");
		agenda.setCompareceu(false);

//		Imprimir dados do agendamento
//		Nome do Paciente:
//		Nome do Médico: 
//		Especialidade:
//		Dia e hora da consulta:

		System.out.println("Nome do paciente: " + agenda.getPaciente().getNome());
		System.out.println("Nome do médico: " + agenda.getMedico().getNome());
		System.out.println("Especialidade: " + agenda.getEspecialidade().getNome());
		System.out.println("Dia e hora: " + agenda.getDataDaConsulta() + " - " + agenda.getHoraDaConsulta());
		System.out.println("Plano de saúde: " + agenda.getPaciente().getPlanoDeSaude().getDadosDoPlano());
	}

}
