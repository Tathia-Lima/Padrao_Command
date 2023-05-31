package command;

public class TarefaAbrirConta implements Tarefa {

    private Conta conta;

    public TarefaAbrirConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.abrirConta();
    }

    public void cancelar() {
        this.conta.fecharConta();
    }
}