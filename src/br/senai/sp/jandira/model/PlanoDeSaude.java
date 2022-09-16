package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	
	 //As variáveis colocadas diretamente na classe são atributos da/o classe/objeto.
		private String operadora;
		private String tipoDoPlano;
		
	    //Métodos de acesso 
		public void setOperadora(String operadora) {
			//this(este) o atributo(operadora) desta classe recebe a operadora que está vindo lá de fora.
			//quando quiser me referir ao atributo.
			this.operadora = operadora;               
		}
		
		public String getOperadora() {
			return this.operadora;
		}
		
		public void setTipoDoPlano(String tipoDoPlano) {
			this.tipoDoPlano = tipoDoPlano;
		}
		
		public String getTipoDoPlano() {
			return this.tipoDoPlano;
		}
		
		public String getDadosDoPlano() {
			return "Plano: " + this.operadora + ", " + this.tipoDoPlano ;
		}
}
