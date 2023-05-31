package command;

public class Conta {

    private String contaCorrente;
    private String agencia;
    private String banco;
    private String cidade;
    private String nomeCliente;
    private String situacao;

    public Conta(String nomeCliente,String contaCorrente, String agencia, String banco, String cidade) {
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
        this.banco = banco;
        this.cidade = cidade;
        this.nomeCliente = nomeCliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirConta() {
        this.situacao = "Conta Aberta com Sucesso";
    }

    public void fecharConta() {
        this.situacao = "Conta Fechada com Sucesso";
    }
}