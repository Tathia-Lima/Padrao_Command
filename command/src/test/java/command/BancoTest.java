package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest {

    Banco banco;
    Conta conta;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        conta = new Conta("Tathia Lima","569874-3", "6987", "Banco Itau", "Juiz de Fora");
    }

    @Test
    void deveAbrirConta() {
        Tarefa contaAbertura = new TarefaAbrirConta(conta);
        banco.executarTarefa(contaAbertura);

        assertEquals("Conta Aberta com Sucesso", conta.getSituacao());
    }

    @Test
    void deveFecharConta() {
        Tarefa contaFechamento = new TarefaFecharConta(conta);
        banco.executarTarefa(contaFechamento);

        assertEquals("Conta Fechada com Sucesso", conta.getSituacao());
    }

    @Test
    void deveCancelarFechamentoConta() {

        Tarefa contaAbertura = new TarefaAbrirConta(conta);
        Tarefa contaFechamento = new TarefaFecharConta(conta);

        banco.executarTarefa(contaAbertura);
        banco.executarTarefa(contaFechamento);

        banco.cancelarUltimaTarefa();

        assertEquals("Conta Aberta com Sucesso", conta.getSituacao());
    }
}