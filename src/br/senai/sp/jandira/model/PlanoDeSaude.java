package br.senai.sp.jandira.model;

public class PlanoDeSaude {

    // As variáveis colocadas diretamente na classe são atributos da/o
    // classe/objeto.
    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDoPlano;

    //construtores da classe 
    //sempre público, não tem retorno, e terá o nome da classe -> chamado construtor padrão ou default 
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        atualizarCodigo();
    }

    public PlanoDeSaude(String operadora, String tipoDoPlano) {
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        atualizarCodigo();
    }

    public PlanoDeSaude() {
        atualizarCodigo();
    }

    public PlanoDeSaude(Integer codigo, String operadora, String tipoDoPlano) {
        this.codigo = codigo;
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        this.contador = this.codigo;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    // Métodos de acesso
    public Integer getCodigo() {
        return codigo;
    }

    public void setOperadora(String operadora) {
        // this(este) o atributo(operadora) desta classe recebe a operadora que está
        // vindo lá de fora.
        // quando quiser me referir ao atributo.
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
        return this.operadora + ", " + this.tipoDoPlano;
    }

    public static int getContador() {
        return contador;
    }

    public String getPlanoDeSaudeSeparadoPorPontoEVirgula() {

        return this.codigo + ";" + this.operadora + ";" + this.tipoDoPlano;
    }
}
