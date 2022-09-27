package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;

public class TesteDaoXpto {

	public static void main(String[] args) {
		
		//chamando o método main de outra classe.
		TesteDAO.main(args);
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		System.out.println(PlanoDeSaudeDAO.listarTodos().size());

	}

}

