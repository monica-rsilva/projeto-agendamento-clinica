package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDAO {

    public static void main(String[] args) {
        
        String[] linha0 = {"Cotia", "Itapevi","Jandira"};
        String[] linha1 = {"Barueri", "Carapicuiba","Osasco"};
        String[] linha2 = {"Pirapora", "Itu","Valinhos"};
        String[] linha3 = {"São Roque", "Presidente Prudente","Pindamonhangaba"};
        
        String[][] linhas = {linha0,linha1,linha2,linha3};
        
        System.out.println(linhas[2][2]);
        
//        ____________________________________________________________________
        String [][] frutas = 
        {
            {"Banana", "Pera","Maça"},
            {"Melancia","Uva","Abacate"},
            {"Ameixa","Pêssego","Nectarina"}
        };
        
        String [][][] letras = 
        {
//            linha 0
            {  
                {"a", "b","c","cc"},
                {"d","e","f","ff"},
                {"d","e","f","ff"},
                {"d","e","f","ff"},
            },
//            linha 1
            {
                {"g","h","i"},
                {"j","k","l"}
            },
//            linha 2
            {
                {"m","n","o"},
                {"p","q","r"}
            }
        };
        
        System.out.println(letras[1][1][1]);
        
        
        System.out.println(frutas[0][1]);
        System.out.println(frutas[2][2]);

        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
        PlanoDeSaude plano5 = new PlanoDeSaude();

        System.out.println(PlanoDeSaude.getContador());

        System.out.println(plano1.getCodigo());
        System.out.println(plano5.getCodigo());

        PlanoDeSaudeDAO.gravar(plano1);
        PlanoDeSaudeDAO.gravar(plano4);
        PlanoDeSaudeDAO.gravar(plano3);
        PlanoDeSaudeDAO.gravar(plano2);
        PlanoDeSaudeDAO.gravar(plano5);

        System.out.println("________________________________________________________");
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("Código " + p.getCodigo());
            System.out.println("Operadora " + p.getOperadora());
            System.out.println("________________________________________________________");
        }
        
        int [][] b = new int [4] [5];
        b [0] [0] = 8;
        b [3] [2] = 54;
                
        int [][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {0,11,12}
        };
        
        System.out.println(a[3][2]);
        
        PlanoDeSaudeDAO.excluir(101);
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("Código " + p.getCodigo());
            System.out.println("Operadora " + p.getOperadora());
        }
        
//		_______________________________________________________________________________
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
//		
//		System.out.println("----------------------------------------");
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
            }

}
