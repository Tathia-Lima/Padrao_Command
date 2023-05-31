package command;

public class TarefaFecharConta implements Tarefa {

    private Conta conta;

    public TarefaFecharConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.fecharConta();
    }

    public void cancelar() {
        this.conta.abrirConta();
    }
}
