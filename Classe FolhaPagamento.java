package sistema.pagamento;

import java.util.List;

public class FolhaPagamento {
    public void calcularFolhaPagamento(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Salário de " + funcionario.getNome() + ": " + funcionario.calcularSalario());
        }
    }
}
