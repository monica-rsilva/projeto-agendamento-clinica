package br.senai.sp.jandira.testes;

import java.util.ArrayList;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) { //args -> arguments
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		planos.add(plano1);
		planos.add(plano3);
		
		int i = 0;
		
		while(i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		System.out.println("Saiu do looping!!");
		
		//Looping FOR 
		//for(contador;condição;acumulador) {
		//	
		//}
		System.out.println("-------------UTILIZANDO FOR----------------");
		for (int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		System.out.println("---------FOR EACH - PARA CADA -------------");
		//Iteração -> repetição. iteração em listas - ArrayList<>
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		//Criar 3 especialidades, guardar as especialidades em um arraylist
		// e exibir o nome das especialidades usando for each. 
		
		Especialidade especialidade1 = new Especialidade ();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração");
		
		
		Especialidade especialidade2 = new Especialidade ();
		especialidade2.setNome("Otorrino");
		especialidade2.setDescricao("Cuida do ouvido");
		
		
		Especialidade especialidade3 = new Especialidade ();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao("Cuida dos ossos e músculos");
		
		Especialidade especialidade4 = new Especialidade ();
		especialidade4.setNome("Oftalmo");
		especialidade4.setDescricao("Cuida dos olhos");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(especialidade1);
		especialidades.add(especialidade2);
		especialidades.add(especialidade3);
		
		for(Especialidade e : especialidades ) {
			System.out.printf("%s --> %s\n", e.getNome(), e.getDescricao());
		}
		
		System.out.println(Especialidade.getContador());
//		System.out.println(especialidade2.getQuantidade());
//		System.out.println(especialidade3.getQuantidade());
		
		
		
		
//		----------------------------------------------------------------------------------------------------------
		
		// Camada de dados 
		// DAO - Data Access OBject 
		//MODEL---DAO  
		
		//Persistência -> CRUD - create,read,update,delete
		
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
		
//		Vetor com 3 planos de saúde 
		
//		PlanoDeSaude plano1 = new PlanoDeSaude(); // () -> método construtor da classe. Ele é usado no momento da criação da classe. 
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//	
//		PlanoDeSaude[] planos = {
//				plano1,
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "ouro")};
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
		
//		utilização de ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("Jandira");
//		cidades.add("São Paulo");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuiba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size()); //para saber o tamanho do array 
//		
//		ArrayList<PlanoDeSaude> planos2= new ArrayList<>();
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//		
//		planos2.add(planoNovo);
//		Adicionar o tipo do plano no plano Notredame
//		planos2.get(0).setTipoDoPlano("Basic");
//		
//		
//		System.out.println(planos2.get(4).getDadosDoPlano());
//		System.out.println(planos2.get(0).getDadosDoPlano());
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precoList = new ArrayList<>();
//		precoList.add(5.9);
//		
	}

}


